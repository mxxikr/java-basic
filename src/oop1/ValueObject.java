package oop1;

/**
 * 클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있음
 */
public class ValueObject {
    int value;

    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
