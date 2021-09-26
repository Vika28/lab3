package student.com;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scan1 = new Scanner(System.in);
        String group = scan1.nextLine();
        String name = scan1.nextLine();
        int age = scan1.nextInt();

        // тип_даних = ім"я_змінної(обєкту) = new Конструктор;
        Student student1 = new Student(group, age, name);

        Scanner scan2 = new Scanner(System.in);
        group = scan2.nextLine();
        name = scan2.nextLine();
        age = scan2.nextInt();

        Student student2 = new Student(group, age, name);

        student1.getID();
        student2.getID();

        scan1.close();
        scan2.close();

        Scanner scan3 = new Scanner(System.in);
        int age1 = scan3.nextInt();
    }
}
