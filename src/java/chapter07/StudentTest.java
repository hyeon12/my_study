package chapter07;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student(1001, "lee");
        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);

        Student kim = new Student(1002, "kim");
        kim.addSubject("국어", 50);
        kim.addSubject("수학", 70);
        kim.addSubject("영어", 80);

        lee.showStudentInfo();
        System.out.println("-----------------");
        kim.showStudentInfo();
    }
}
