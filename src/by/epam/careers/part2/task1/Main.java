package by.epam.careers.part2.task1;

/**Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/
public class Main {
    public static void main(String[] args) {
        TextView view = TextView.getInstance();

        Text text = new Text("Заголовок");
        Sentence sentence1 = new Sentence(new Word("Создать"), new Word("объект"),
                new Word("класса"), new Word("Текст,"), new Word("используя"),
                new Word("класс"), new Word("Предложение,"), new Word("Слово."));
        text.getText().add(sentence1);
        view.print(text);
        Sentence sentence2 = new Sentence(new Word("Методы:"), new Word("дополнить"),
                new Word("текст,"), new Word("вывести"), new Word("на"), new Word("консоль"),
                new Word("текст,"), new Word("заголовок"), new Word("текста."));
        text.addSentence(sentence2);
        view.print(text);

    }
}
