package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name; // 인스턴스 멤버 변수가 매개변수의 값 사용
        this.age = age;
        this.grade = grade;
    }
}