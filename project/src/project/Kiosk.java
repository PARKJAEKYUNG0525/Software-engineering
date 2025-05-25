package project;

public class Kiosk {
    private OrderSystem orderSystem;
    private PaymentGateway paymentGateway;
    private String currentMenuItem;
    private String currentSize;
    private String currentTemperature;
    
    public Kiosk(OrderSystem orderSystem, PaymentGateway paymentGateway) {
        this.orderSystem = orderSystem;
        this.paymentGateway = paymentGateway;
    }
    
    public void displayMenuItems() {
        System.out.println("키오스크: 메뉴 항목 표시 (아메리카노, 라떼, 카푸치노)");
    }
    
    public void displayOptions(String menuItem) {
        this.currentMenuItem = menuItem;
        System.out.println("키오스크: " + menuItem + "의 옵션 선택 화면 표시");
    }
    
    public void addToCart(String size, String temperature) {
        this.currentSize = size;
        this.currentTemperature = temperature;
        System.out.println("키오스크: 장바구니에 " + currentSize + " " + 
                          currentTemperature + " " + currentMenuItem + " 추가");
    }
    
    public void processPayment() {
        System.out.println("키오스크: 결제 처리 시작");
        paymentGateway.requestPayment(calculateTotal());
    }
    
    private int calculateTotal() {
        // 간단한 가격 계산 로직
        int basePrice = 4000; // 기본 가격
        if (currentMenuItem.equals("라떼") || currentMenuItem.equals("카푸치노")) {
            basePrice += 1000;
        }
        if (currentSize.equals("Grande")) {
            basePrice += 500;
        } else if (currentSize.equals("Venti")) {
            basePrice += 1000;
        }
        return basePrice;
    }
    
    public void sendPaymentInfo(String paymentMethod) {
        System.out.println("키오스크: " + paymentMethod + " 결제 정보 전송");
        boolean result = paymentGateway.processPayment(paymentMethod, calculateTotal());
        handlePaymentResult(result);
    }
    
    private void handlePaymentResult(boolean success) {
        if (success) {
            System.out.println("키오스크: 결제 성공, 주문 정보 전송");
            OrderDetail orderDetail = new OrderDetail(currentMenuItem, currentSize, currentTemperature);
            int orderNumber = orderSystem.placeOrder(orderDetail);
            System.out.println("키오스크: 주문 완료. 대기번호: " + orderNumber);
        } else {
            System.out.println("키오스크: 결제 실패. 다시 시도해주세요.");
        }
    }
}