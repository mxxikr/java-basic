package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data(); // 새로운 객체 생성해 참조 값을 할당
        System.out.println("2. data = " + data);

        data = null; // 더 이상 Data 인스턴스 참조 하지않음
        System.out.println("3. data = " + data);
    }
}
