public class Movie {
    private String name;
    private int year;
    private double rate;

    Movie(String name, int year, double rate) {
        this.name = name;
        this.year = year;
        this.rate = rate;
        System.out.printf("Movie %s was released in %d with rate: %s\n\n", name, year, rate); //треба this???
    }
    Movie(String name, int year) {
        this.name = name;
        this.year = year;
        this.rate = rate;
        System.out.printf("Movie %s was released in %d\n\n", name, year); //треба this???
    }
    Movie() {
        this.name = "No name";
        System.out.printf("Movie %s\n\n", name); //треба this???
    }

    void setName(String movieName) { // Задати ім’я фільму
        name = movieName;
    }
    void setYear (int movieYear) { // Задати рік виходу
        year = movieYear;
    }
    void setRate(double movieRate) { // Задати рейтинг фільму
        rate = movieRate;
    }
    String getName() { // Отримати ім’я фільму
        return name;
    }
    int getYear() { // Отримати рік виходу фільму
        return year;
    }
    double getRate() { // Отримати рейтинг фільму
        return rate;
    }
}
