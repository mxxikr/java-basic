package class1.ref;

/**
 * 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달됨
 * 이 경우, 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경됨
 */
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        // 참조형은 참조값(메모리 주소) 자체가 복사되어 전달됨
        // 따라서 메서드 내부에서 dataX의 멤버 변수 value를 변경하면 원본 객체 dataA의 value도 변경됨
        dataX.value = 20;
    }
}
