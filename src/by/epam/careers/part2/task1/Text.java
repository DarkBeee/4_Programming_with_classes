package by.epam.careers.part2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Text {
    private String heading;
    private ArrayList<Sentence> text;

    {
        text = new ArrayList<Sentence>();
    }

    public Text() {
    }

    public Text(String heading) {
        this.heading = heading;
    }

    public String getHeading() {
        return heading;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setText(ArrayList<Sentence> sentence) {
        this.text = sentence;
    }

    public void addSentence(Sentence ... sentence) {
        this.text.addAll(Arrays.asList(sentence));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(heading, text1.heading) &&
                Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heading, text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "heading='" + heading + '\'' +
                ", text=" + text +
                '}';
    }
}
