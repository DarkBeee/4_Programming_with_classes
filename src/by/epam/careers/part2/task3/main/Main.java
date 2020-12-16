package by.epam.careers.part2.task3.main;

import by.epam.careers.part2.task3.entity.City;
import by.epam.careers.part2.task3.entity.Country;
import by.epam.careers.part2.task3.entity.District;
import by.epam.careers.part2.task3.entity.Region;
import by.epam.careers.part2.task3.view.CountryView;

/**Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/
public class Main {
    public static void main(String[] args) {
        CountryView view = CountryView.getInstance();

        Region minskRegion = new Region("Минская область",
                new City("Минск",2_020_600),1_471_240,39_849.00);
        Region vitebskRegion = new Region("Витебская область",
                new City("Витебск", 364_800),1_135_731,40_051.34);
        Region grodnoRegion = new Region("Гродненская область",
                new City("Гродно", 356_900),1_025_800,25_126.98);
        Region gomelRegion = new Region("Гомельская область",
                new City("Гомель", 510_300),1_388_512,40_371.36);
        Region mogilevRegion = new Region("Могилёвская область",
                new City("Могилёв", 357_100),1_024_751,29_067.62);
        Region brestRegion = new Region("Брестская область",
                new City("Брест", 339_700),1_348_115,32_786.44);

        District slutskDistrict = new District("Слуцкий район",
                new City("Слуцк", 61_818));
        District saligorskDisrict = new District("Солигорский район",
                new City("Солигорск", 106_627));
        District orshaDistrict = new District("Оршанский район",
                new City("Орша", 108_100));
        minskRegion.addDistrict(slutskDistrict, saligorskDisrict);
        vitebskRegion.addDistrict(orshaDistrict);

        Country belarus = new Country("Республика Беларусь",
                minskRegion.getRegionCenter(), 207_600, 9_413_446,
                minskRegion, vitebskRegion, gomelRegion, grodnoRegion, brestRegion, mogilevRegion);

        view.printCapital(belarus);
        view.printRegion(belarus);
        view.printAreaCountry(belarus);
        view.printRegionCenter(belarus);
    }
}