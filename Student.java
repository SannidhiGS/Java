public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {   // constructor
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}
