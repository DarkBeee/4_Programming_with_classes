package by.epam.careers.part1.task6;

import java.util.Objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours > 23 || hours < 0) {
            this.hours = 0;
        }
        else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            this.minutes = 0;
        }
        else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            this.seconds = 0;
        }
        else {
            this.seconds = seconds;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Время: " + hours +
                "ч " + minutes + "мин " + seconds + "сек";
    }
}
