package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; // data에 null이 들어가 있어 참조할 주소가 존재하지 않음

        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
