public class Movie {
    private String name;
    private int year;
    private double rate;
    //е
    Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }
    //є
    Movie(String name, int year, double rate) {

        this(name, year);//з
        this.rate = rate;
    }
    //ж
    Movie() {
        this.rate = 0.1;
    }
    //і
    void setName(String movieName) {
        name = movieName;
    }
    void setYear (int movieYear) {
        year = movieYear;
    }
    void setRate(double movieRate) {
        rate = movieRate;
    }
    String getName() {
        return name;
    }
    int getYear() {
        return year;
    }
    double getRate() {
        return rate;
    }
}
