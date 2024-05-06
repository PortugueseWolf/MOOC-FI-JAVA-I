package regular;

public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches("[a|e|o|i|u]*")) {
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string) {
        if (string.matches("[0-1]{1}[0-9]{1}" + ":" + "[0-5]{1}[0-9]{1}" + ":" + "[0-5]{1}[0-9]{1}") ||
            string.matches("[2]{1}[0-3]{1}" + ":" + "[0-5]{1}[0-9]{1}" + ":" + "[0-5]{1}[0-9]{1}")) {
            return true;
        }
        return false;
    }
}
