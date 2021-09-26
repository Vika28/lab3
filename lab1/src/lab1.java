import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class lab1 {
    public static void main(String[] args) throws IOException {
        //task1
        String[] nameArr = new String[7];
        int[] yearArr = new int[7];
        Boolean[] watchArr = new Boolean [7];
        double[] rateArr = new double[7];
        long[] commentsArr = new long[7];
        char[] genreArr = new char[7];
        short[] budgetArr = new short[7];

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        Scanner scan6 = new Scanner(System.in);
        Scanner scan7 = new Scanner(System.in);
        for (int i = 0; i < nameArr.length; i++) {
            System.out.printf("Enter info about %d movie\n", i+1);
            System.out.print("Enter name\n");
            nameArr[i] = scan1.nextLine();
            System.out.print("Enter year\n");
            yearArr[i] = scan2.nextInt();
            System.out.print("Do you watch movie(true or false)?\n");
            watchArr[i] = scan3.nextBoolean();
            System.out.print("Enter movie rate\n");
            rateArr[i] = scan4.nextDouble();
            System.out.print("Enter amounts of comment\n");
            commentsArr[i] = scan5.nextLong();
            System.out.print("Enter movie genre(D-drama, A-adventure, T-thriller, F-fantasy)\n");
            genreArr[i] = scan6.nextLine().charAt(0);
            System.out.print("Enter movie budget(mil$)\n");
            budgetArr[i] = scan7.nextShort();
        }
        String line = "|---------------------------------------------------------------------------------------------------|\n";
        System.out.print(line);
        System.out.print("|\t\tName\t\t\t|\tYear\t|\tWatch\t|\tRate\t|\tComments\t| Genre |\tBudget(mil)\t|\n");
        System.out.print(line);
        System.out.printf("|\t\t%s\t\t|\t%d\t|\t%b\t|\t%.1f\t\t|\t%d\t\t\t|\t%c\t|\t\t%d\t\t|\n", nameArr[0], yearArr[0], watchArr[0], rateArr[0], commentsArr[0], genreArr[0], budgetArr[0]);
        System.out.printf("|\t\t%s\t\t|\t%d\t|\t%b\t|\t%.1f\t\t|\t%d\t\t\t|\t%c\t|\t\t%d\t\t|\n", nameArr[1], yearArr[1], watchArr[1], rateArr[1], commentsArr[1], genreArr[1], budgetArr[1]);
        System.out.printf("|\t\t%s\t\t\t|\t%d\t|\t%b\t|\t%.1f\t\t|\t%d\t\t\t|\t%c\t|\t\t%d\t\t|\n", nameArr[2], yearArr[2], watchArr[2], rateArr[2], commentsArr[2], genreArr[2], budgetArr[2]);
        System.out.printf("|\t\t%s\t\t\t|\t%d\t|\t%b\t|\t%.1f\t\t|\t%d\t\t\t|\t%c\t|\t\t%d\t\t|\n", nameArr[3], yearArr[3], watchArr[3], rateArr[3], commentsArr[3], genreArr[3], budgetArr[3]);
        System.out.printf("|\t\t%s\t|\t%d\t|\t%b\t|\t%.1f\t\t|\t%d\t\t\t|\t%c\t|\t\t%d\t\t|\n", nameArr[4], yearArr[4], watchArr[4], rateArr[4], commentsArr[4], genreArr[4], budgetArr[4]);
        System.out.printf("|\t\t%s\t\t|\t%d\t|\t%b\t|\t%.1f\t\t|\t%d\t\t\t|\t%c\t|\t\t%d\t\t|\n", nameArr[5], yearArr[5], watchArr[5], rateArr[5], commentsArr[5], genreArr[5], budgetArr[5]);
        System.out.printf("|\t\t%s\t\t|\t%d\t|\t%b\t|\t%.1f\t\t|\t%d\t\t\t|\t%c\t|\t\t%d\t\t|\n", nameArr[6], yearArr[6], watchArr[6], rateArr[6], commentsArr[6], genreArr[6], budgetArr[6]);
        System.out.print(line);



//        //task2
//        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
//
////        String str1 = "I like Java !!!";
////        String str2 = "Я вивчаю Java";
//        System.out.print("Enter first string for checking\n");
//        String str1 = reader.readLine();
//        System.out.print("Enter second string for checking\n");
//        String str2 = reader.readLine();
//
//        //a
//        char lastSymbolStr1 = str1.charAt(str1.length() - 1);
//        char lastSymbolStr2 = str2.charAt(str2.length() - 1);
//        System.out.println(String.format("останній символ рядка \"%s\": %s\n", str1, lastSymbolStr1));
//        System.out.println(String.format("останній символ рядка \"%s\": %s\n", str2, lastSymbolStr2));
//
//        //b
//        Boolean checkEndStr1 = str1.endsWith("!!!");
//        Boolean checkEndStr2 = str2.endsWith("!!!");
//        System.out.println(String.format("Перевірити, чи закінчується рядок \"%s\" підрядком \"!!!\": %b", str1, checkEndStr1));
//        System.out.println(String.format("Перевірити, чи закінчується рядок \"%s\" підрядком \"!!!\": %b\n", str2, checkEndStr2));
//
//        //c
//        Boolean checkStartStr1 = str1.startsWith("I like");
//        Boolean checkStartStr2 = str2.startsWith("I like");
//        System.out.println(String.format("Перевірити, чи починається рядок \"%s\" підрядком \"I like\": %b", str1, checkStartStr1));
//        System.out.println(String.format("Перевірити, чи починається рядок \"%s\" підрядком \"I like\": %b\n", str2, checkStartStr2));
//
//        //d
//        Boolean checkContainStr1 = str1.contains("Java");
//        Boolean checkContainStr2 = str2.contains("Java");
//        System.out.println(String.format("Перевірити, чи містить рядок \"%s\" підрядок \"Java\": %b", str1, checkContainStr1));
//        System.out.println(String.format("Перевірити, чи містить рядок \"%s\" підрядок \"Java\": %b\n", str2, checkContainStr2));
//
//        //e
//        String replaceInStr1 = str1.replace('a', 'o');
//        String replaceInStr2 = str2.replace('a', 'o');
//        System.out.println(String.format("Замінити всі символи \"а\" на \"о\" %s", replaceInStr1));
//        System.out.println(String.format("Замінити всі символи \"а\" на \"о\" %s\n", replaceInStr2));
//
//        //f
//
//        String firstPartStr1 = str1.substring(0,6);
//        String secondPartStr1 = str1.substring(11,15);
//        System.out.println(firstPartStr1 + secondPartStr1);
//        String firstPartStr2 = str2.substring(0,8);
//        System.out.println(firstPartStr2);


    }
}
