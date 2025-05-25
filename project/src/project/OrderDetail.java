package project;

//주문 상세 정보 클래스
public class OrderDetail {
private String menuItem;
private String size;
private String temperature;

public OrderDetail(String menuItem, String size, String temperature) {
   this.menuItem = menuItem;
   this.size = size;
   this.temperature = temperature;
}

public String getMenuItem() {
   return menuItem;
}

public String getSize() {
   return size;
}

public String getTemperature() {
   return temperature;
}
}