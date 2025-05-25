package project;

public class Customer {
    private String id;
    private String name;
    
    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void selectMenu(Kiosk kiosk) {
        System.out.println("고객: 메뉴 선택 화면 요청");
        kiosk.displayMenuItems();
    }
    
    public void selectMenuItem(Kiosk kiosk, String menuItem) {
        System.out.println("고객: " + menuItem + " 선택");
        kiosk.displayOptions(menuItem);
    }
    
    public void selectOptions(Kiosk kiosk, String size, String temperature) {
        System.out.println("고객: 사이즈 " + size + ", 온도 " + temperature + " 선택");
        kiosk.addToCart(size, temperature);
    }
    
    public void requestPayment(Kiosk kiosk) {
        System.out.println("고객: 결제 요청");
        kiosk.processPayment();
    }
    
    public void providePaymentMethod(Kiosk kiosk, String paymentMethod) {
        System.out.println("고객: " + paymentMethod + " 결제 수단 제시");
        kiosk.sendPaymentInfo(paymentMethod);
    }
}
