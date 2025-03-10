# Level 3
## 요구사항
- main 함수에서 관리하던 전체 순서 제어를 Kiosk 클래스로 관리
- Kiosk 클래스 생성
- - 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리
  - MenuItem을 관리하는 리스트가 필드로 존재
  - main 함수에서 관리하던 입력과 반복문 -> start 함수를 만들어 관리
  - List<MenuItem> menuItems는 Kiosk 클래스 생성자로 값 할당
  - - Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줌
      
## 설계
Class MenuItem(이름, 가격, 설명)
-> Class Kiosk(List<MenuItem> / 생성자로 속성값 할당/ start로 주문 수행)
-> Class Main(kiosk 클래스 생성, 메서드 실행)

<MenuItem>: 기존과 동일
<Kiosk>:
1. 속성: List<MenuItem> menuItems;
2. 생성자: Kiosk() {
        this.menuItems = Arrays.asList(
                new MenuItem("1. ShackBurger   |", " W 6.9 |", " 토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("2. SmokeShack   |", " W 8.9 |", " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
                new MenuItem("3. Cheeseburger   |", " W 6.9 |", " 토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
                new MenuItem("4. Hamburger   |", " W 5.4 |", " 비프패티를 기반으로 야채가 들어간 기본버거")
        );
    }
3. 기능: start() -> 기존 main 함수에서 하던 메뉴 보여주기, 입력 받고 출력하기
<Main>: Kiosk 클래스 생성, Kiosk의 start 메서드 활용.
