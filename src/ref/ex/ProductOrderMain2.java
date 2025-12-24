package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명: ");
            String productName = sc.nextLine();

            System.out.println("가격: ");
            int price = sc.nextInt();

            System.out.println("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

            productOrders[i] = createOrder(productName, price, quantity);
        }

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(productOrders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(productOrders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
    }


    // ProductOrder 생성하고 매개 변수로 초기값 설정
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();

        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    // 배열을 받아서 배열에 들어있는 전체 ProductOrder의 상품명, 가격, 수량을 출력
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    // 배열을 받아서 배열에 들어 있는 전체 ProductOrder의 총 결제 금액을 계산하고 계산 결과를 반환
    static int getTotalAmount(ProductOrder[] orders) {
        int result = 0;
        for (ProductOrder order : orders) {
            result += order.price * order.quantity;
        }

        return result;
    }
}
