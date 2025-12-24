package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90); // 메서드 호출 후 결과 반환

        Student student2 = createStudent("학생2", 16, 80);

        // 객체 값 사용
        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) { // 전달한 학생 객체의 필드에 값을 설정함
        Student student = new Student();

        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudent(Student student) { // 전달한 학생 객체의 필드 값을 읽어 출력
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
