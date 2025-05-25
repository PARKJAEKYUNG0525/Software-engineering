package project;

//결제 시스템 클래스
public class PaymentGateway {
public void requestPayment(int amount) {
   System.out.println("결제시스템: " + amount + "원 결제 승인 요청");
}

public boolean processPayment(String paymentMethod, int amount) {
   System.out.println("결제시스템: " + paymentMethod + "로 " + amount + "원 결제 처리 중");
   // 실제로는 결제 API 호출 등의 로직이 들어갈 것임
   boolean success = Math.random() > 0.1; // 90% 확률로 성공
   System.out.println("결제시스템: 결제 " + (success ? "승인" : "거절"));
   return success;
}
}

