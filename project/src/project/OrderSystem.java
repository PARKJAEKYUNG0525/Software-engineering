package project;

//주문 시스템 클래스
public class OrderSystem {
private BaristaApp baristaApp;
private int orderCounter = 100;

public OrderSystem(BaristaApp baristaApp) {
   this.baristaApp = baristaApp;
}

public int placeOrder(OrderDetail orderDetail) {
   orderCounter++;
   System.out.println("주문시스템: 주문 접수 (번호: " + orderCounter + ")");
   baristaApp.receiveOrder(orderCounter, orderDetail);
   return orderCounter;
}
}