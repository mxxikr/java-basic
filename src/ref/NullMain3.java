package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // BigData 인스턴스 생성 되면서 멤버 변수 초기화
        System.out.println("bigData.count = " + bigData.count); // count 변수는 기본형이므로 0으로 초기화
        System.out.println("bigData.data = " + bigData.data); // data 변수는 참조형이므로 null로 초기화

        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
