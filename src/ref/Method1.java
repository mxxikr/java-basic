package ref;

import ref.Student;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student(); // Student 인스턴스 생성
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        // 객체 값 사용
        printStudent(student1);
        printStudent(student2);
    }

    // 메서드 내부에서 전달 된 참조값을 통해 객체의 값을 변경
    static void initStudent(Student student, String name, int age, int grade) { // 전달한 학생 객체의 필드에 값을 설정함
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) { // 전달한 학생 객체의 필드 값을 읽어 출력
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
