import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter movie name\n");
        String name = scan1.nextLine();
        System.out.print("Enter year when movie was released\n");
        int year = scan1.nextInt();
        System.out.print("Enter movie rate\n");
        double rate = scan1.nextDouble();

        Movie Movie1 = new Movie(name, year, rate);
        System.out.printf("Movie1: name: %s,  year: %d, rate: %.1f\n", Movie1.getName(), Movie1.getYear(), Movie1.getRate());
        System.out.print("--------------------------------------------------------\n");


        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter movie name\n");
        name = scan2.nextLine();
        System.out.print("Enter year when movie was released\n");
        year = scan2.nextInt();

        Movie Movie2 = new Movie(name, year);
        System.out.printf("Movie2: name: %s,  year: %d\n", Movie2.getName(), Movie2.getYear());
        System.out.print("--------------------------------------------------------\n");
        Movie Movie3 = new Movie();
        System.out.printf("Movie3: rate: %s\n", Movie3.getRate());
        System.out.print("--------------------------------------------------------\n");

        System.out.print("Enter info about movie to set this parameters\n");
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter movie name\n");
        name = scan3.nextLine();
        System.out.print("Enter year when movie was released\n");
        year = scan3.nextInt();
        System.out.print("Enter movie rate\n");
        rate = scan3.nextDouble();

        Movie1.setName(name);
        Movie1.setYear(year);
        Movie1.setRate(rate);
        System.out.printf("Movie1: name: %s,  year: %d, rate: %.1f\n", Movie1.getName(), Movie1.getYear(), Movie1.getRate());
        System.out.print("--------------------------------------------------------\n");

        Scanner scan4 = new Scanner(System.in);
        System.out.print("Enter movie name\n");
        name = scan4.nextLine();
        System.out.print("Enter year when movie was released\n");
        year = scan4.nextInt();

        Movie2.setName(name);
        Movie2.setYear(year);
        System.out.printf("Movie2  name: %s,  year: %d\n", Movie2.getName(), Movie2.getYear());
        System.out.print("--------------------------------------------------------\n");


        Scanner scan5 = new Scanner(System.in);
        System.out.print("Enter movie rate\n");
        rate = scan5.nextDouble();
        Movie3.setRate(rate);
        System.out.printf("Movie3: rate: %s\n\n", Movie3.getRate());
        System.out.print("--------------------------------------------------------\n");


        movieInfo(Movie2.getName(), Movie2.getYear());
        movieInfo(Movie1.getName(), Movie1.getYear(), 326);
        System.out.print("--------------------------------------------------------\n");

        System.out.print("Enter movie name to show this name\n\n");
        Scanner scan8 = new Scanner(System.in);
        System.out.print("Enter movie name\n");
        name = scan8.nextLine();
        writeMovieName(name);

        System.out.print("Enter movie name to show budget of this movie\n\n");
        Scanner scan9 = new Scanner(System.in);
        System.out.print("Enter movie name\n");
        name = scan9.nextLine();
        System.out.print("Enter budget\n");
        int budget = scan9.nextInt();
        writeMovieBudget(name, budget);
    };

    //г)
    public static void writeMovieName(String name) {
        System.out.printf("Movie - %s\n", name);
    }

    public static void writeMovieBudget(String name, int budget) {
        writeMovieName(name);
        System.out.printf("Budget - %d$\n", budget);
    }

    //д перевантажений метод
    public static void movieInfo(String name, int year) {
        String resultInfo = String.format("Movie: %s, year: %d\n", name, year);
        System.out.print(resultInfo+"\n");
    }

    public static void movieInfo(String name, int year, int amountOfActors) {
        String resultInfo = String.format("Movie: %s, year: %d, amount Of Actors: %d\n", name, year, amountOfActors);
        System.out.print(resultInfo+"\n");
    }
}
