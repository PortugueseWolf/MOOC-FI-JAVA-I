package literacy;

public class Country implements Comparable<Country> {
    private String name;
    private int year;
    private String sex;
    private double literacy;

    public Country (String name, int year, String sex, double literacy) {
        String[] sexFixed = sex.split(" ");
        
        this.name = name;
        this.year = year;
        this.sex = sexFixed[0];
        this.literacy = literacy;
    }

    public double getLiteracy() {
        return literacy;
    }

    public String toString() {
        return name + " (" + year + "), " + sex + ", " + literacy;
    }

    @Override
    public int compareTo(Country country) {
        if (this.literacy == country.getLiteracy()) {
            return 0;
        }

        if (this.literacy > country.getLiteracy()) {
            return 1;
        }
        return -1;
    }
}
