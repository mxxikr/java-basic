package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); // Student 인스턴스 생성
        // 객체 값 대입
        student1.name = "학생1"; // student1 객체의 name 멤버 변수에 값 대입
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열 선언
//        Student[] students = new Student[]{student1, student2};
        Student[] students = {student1, student2}; // 생성과 선언 동시

        // for문 적용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:"  + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; // 반복 요소를 변수에 담음
            System.out.println("이름:"  + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        // 향상 된 for문
        for (Student s : students) {
            System.out.println("이름:"  + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}