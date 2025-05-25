package project;
//메인 클래스 - 전체 시스템 테스트
public class CoffeeKioskSystem {
 public static void main(String[] args) {
     // 시스템 구성요소 초기화
     BaristaApp baristaApp = new BaristaApp();
     OrderSystem orderSystem = new OrderSystem(baristaApp);
     PaymentGateway paymentGateway = new PaymentGateway();
     Kiosk kiosk = new Kiosk(orderSystem, paymentGateway);
     Customer customer = new Customer("C001", "홍길동");
     
     // 시퀀스 다이어그램의 흐름에 따라 시스템 실행
     customer.selectMenu(kiosk);
     customer.selectMenuItem(kiosk, "아메리카노");
     customer.selectOptions(kiosk, "Grande", "ICE");
     customer.requestPayment(kiosk);
     customer.providePaymentMethod(kiosk, "신용카드");
 }
}
