package class1.ref;

/**
 * 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달됨
 * 이 경우, 메서드 내부에서 매개변수(파라미터)의 값을 변경해도, 호출자의 변수 값에는 영향이 없음ㄴ
 */
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        // 기본형은 값 자체가 복사되어 전달되므로
        // 메서드 내부에서 x의 값을 변경해도 원본 변수 a에는 영향을 주지 않음
        x = 20;
    }
}
