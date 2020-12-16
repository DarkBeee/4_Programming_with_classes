package by.epam.careers.part2.task1;

public class TextView {
    private static TextView instance;

    private TextView() {
    }

    public static TextView getInstance() {
        if (instance == null) {
            instance = new TextView();
        }
        return instance;
    }
    public void print(Text text) {
        System.out.println(text.getHeading());
        for (Sentence sentence : text.getText()) {
            for (Word word : sentence.getSentence())
            System.out.print(word);
        }
        System.out.println();
    }
}
