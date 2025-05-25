package project;

//바리스타 앱 클래스
public class BaristaApp {
public void receiveOrder(int orderNumber, OrderDetail orderDetail) {
   System.out.println("바리스타앱: 주문 #" + orderNumber + " 접수됨");
   prepareOrder(orderNumber, orderDetail);
}

private void prepareOrder(int orderNumber, OrderDetail orderDetail) {
   System.out.println("바리스타앱: 주문 #" + orderNumber + " 제조 시작 - " + 
                     orderDetail.getSize() + " " + 
                     orderDetail.getTemperature() + " " + 
                     orderDetail.getMenuItem());
   
   // 음료 제조 시뮬레이션 (실제로는 바리스타가 처리)
   System.out.println("바리스타앱: 주문 #" + orderNumber + " 제조 완료");
   notifyCustomer(orderNumber);
}

private void notifyCustomer(int orderNumber) {
   System.out.println("바리스타앱: 고객에게 주문 #" + orderNumber + " 제조 완료 알림");
}
}
