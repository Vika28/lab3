package student.com;

public class Student {
    private static int ID=0;
    private String group;
    private int age;
    private String name;

    Student() {

    }

    Student(String group, int age, String name) {
        this.group = group;
        this.age = age;
        this.name = name;
        System.out.printf("group %s age%d name %s\n", group, age, name);

    }

    public void cry() {
        System.out.println("Student cry");
    }
    public int walk() {
        int x = 5;
        System.out.println("Student walks");
        return x;
    }
    public int getID() {
        System.out.printf("number %s\n",ID);
        ID++;
        return ID;

    }
}
