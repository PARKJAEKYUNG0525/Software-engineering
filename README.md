#소프트웨어공학개인과제
-컴퓨터공학과 / 20221377 /박재경-
src/project

커피 주문 키오스크 시스템 모듈 평가
1. 응집도(Cohesion) 평가
1.1 기능적 응집도(Functional Cohesion)
Customer 클래스: 고객의 행동에 관련된 메서드만 포함하고 있어 높은 기능적 응집도를 보임
Kiosk 클래스: 키오스크의 UI 표시와 사용자 입력 처리, 주문 처리 등 다양한 책임을 갖고 있어 중간 수준의 응집도
OrderSystem 클래스: 주문 관리에 집중된 높은 응집도
PaymentGateway 클래스: 결제 처리에만 집중된 높은 응집도
BaristaApp 클래스: 음료 제조 관리에 집중된 높은 응집도
OrderDetail 클래스: 주문 정보 저장에 집중된 높은 응집도
1.2 순차적 응집도(Sequential Cohesion)
전반적인 시스템 흐름이 시퀀스 다이어그램의 흐름과 일치하며, 각 단계가 순차적으로 잘 연결되어 있음
특히 CoffeeKioskSystem 클래스의 main 메서드는 전체 시스템의 작동 순서를 명확하게 보여줌
1.3 정보적 응집도(Informational Cohesion)
OrderDetail 클래스: 주문 정보에 대한 데이터를 캡슐화하여 높은 정보적 응집도를 가짐

2. 결합도(Coupling) 평가
2.1 자료 결합도(Data Coupling)
클래스 간 상호작용이 주로 메서드 매개변수를 통해 이루어져 낮은 결합도 유지
Customer와 Kiosk 사이의 상호작용은 메서드 호출과 매개변수를 통해서만 이루어짐
2.2 스탬프 결합도(Stamp Coupling)
OrderDetail 객체가 여러 클래스 간에 전달되므로 스탬프 결합도가 존재함
(OrderDetail은 불변 객체로 설계되어 부작용 위험이 낮음)
2.3 제어 결합도(Control Coupling)
Kiosk의 handlePaymentResult 메서드는 결제 결과에 따라 다른 동작을 수행하므로 제어 결합도가 존재
이는 시스템의 특성상 필요한 부분이며, 조건부 로직이 명확하게 구현되어 있음
외부 결합도(External Coupling)
실제 구현에서는 외부 결제 API나 데이터베이스 연동이 필요하겠지만, 현재 샘플 코드에서는 최소화되어 있음

1. **Customer**: 고객 정보와 행동을 담당하는 클래스
2. **Kiosk**: 메뉴 표시, 주문 처리, 결제 요청 등을 담당하는 클래스
3. **OrderSystem**: 주문 정보를 관리하고 바리스타에게 전달하는 클래스
4. **PaymentGateway**: 결제 처리를 담당하는 클래스
5. **BaristaApp**: 음료 제조 관리 및 알림을 담당하는 클래스
6. **OrderDetail**: 주문 상세 정보를 저장하는 클래스
7. **CoffeeKioskSystem**: 전체 시스템을 시연하는 메인 클래스

### 주요 기능

- 메뉴 선택 및 옵션 설정
- 장바구니 관리
- 결제 처리 (성공/실패 시나리오 포함)
- 주문 접수 및 번호 발급
- 음료 제조 상태 관리 및 알림



