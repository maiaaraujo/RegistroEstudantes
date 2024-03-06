public class Main {
    public static void main(String[] args) {
       
        Student student1 = new Student();

        student1.name = "João";
        student1.age = 20;
        student1.grade = 8.5;

        System.out.println("Nome: " + student1.name);
        System.out.println("Idade: " + student1.age);
        System.out.println("Nota: " + student1.grade);
    }
}
