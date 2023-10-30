package exceptions;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (!(0 <= hour && hour < 24 && 0 <= minute && minute < 60 && 0 <= second && second < 60)) {
            throw new IllegalArgumentException("Недопустимое значение времени");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void addHours(int hours){
        int newHour = this.hour + hours;
        if (newHour < 0 || newHour >= 24){
            throw new IllegalArgumentException("Недопустимое значение часов");
        }
        this.hour = newHour;
    }
    public void addMinutes(int minutes){
        int newMinute = this.minute + minutes;
        if (newMinute < 0 || newMinute >= 60){
            throw new IllegalArgumentException("Недопустимое значение минут");
        }
        this.minute = newMinute;
    }
    public void addSeconds(int seconds){
        int newSecond = this.second + seconds;
        if (newSecond < 0 || newSecond >= 60){
            throw new IllegalArgumentException("Недопустимое значение секунд");
        }
        this.second = newSecond;
    }
}
