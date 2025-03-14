# Level 6
## 요구사항: 장바구니 및 구매하기 기능을 추가하기
- 장바구니 생성 및 관리
- - 선택한 메뉴 장바구니에 추가
  - 메뉴, 수량, 가격 정보 저장 / 항목 동적 추가 및 조회
  - 잘못된 선택 시 예외 처리(유효하지 않은 메뉴 번호 입력)
- 장바구니 출력 및 금액 계산
- - 결제 시도 전, 장바구니에 담긴 모든 메뉴와 총 금액 출력
  - 예) 각 메뉴의 이름, 가격, 수량, 총 금액 합계
- 장바구니 담기
- - 메뉴 선택 시 장바구니 추가 여부 질문 -> 입력에 따라 "추가" / "취소" 처리
  - 메뉴는 한 번에 1개만 담을 수 있음
- 주문
- - 장바구니에 담긴 모든 항목 출력
  - 합산하여 총 금액 계산, "주문하기" 시 장바구니 초기화
      
## 설계

<MenuItem>
1. 속성
  - String name;
  - int price;
  - String description;
  - int quantity = 0; // 메뉴 인스턴스 신규 생성 시 값을 0으로 할당함
  
2. 생성자
     
3. 기능
  - 게터 / 세터
  - String printMenuItem() return this.name + this.price + this.description} // 중간 구분자 포함
  - void addQuantity() {
    this.quantity++;} // 장바구니 담을 때 addQuantity해서 추가 -> menuItem 개수 초기화 필요함! 로직 추가할 것!
  
<Menu>
1. 속성 -> 카테고리 이름, 메뉴리스트
  - List<MenuItem> categoryList;
  - String categoryName;

3. 기능 ->
   - 게터 / 세터
   - String getCategoryName() {return this.categoryName;}
   - List<MenuItem> getCategoryList() {return this.categoryList};
   - void printMenuItems() {for (MenuItem menuItem : this.categoryList) {sout(menuItem.printMenuItem())}

<Cart>
1. 속성
- HashMap<MenuItem, Integer> cartItem;

2. 생성자
- Cart() {
this.cartItem = new HashMap<MenuItem, Integer>();}

3. 기능
- addCartItem ... 장바구니 추가하기
- - addQuantity
- printCartItems ...
- - printMenuItem

<Kiosk>
1. 속성
  - List<Menu> categoryList;
  - Cart cart;
    
2. 생성자
      
3. 기능
  - 게터/ 세터
  
  - void printCategoryList ... 카테고리 리스트 출력
  - - <Menu>.getCategoryName
  
  - void switchMenuItem ... 메뉴 선택 시 동작
  - - <MenuItem>.printMenuItem (메뉴 이름 출력)
    - <Cart>.addCartItem (장바구니 추가)
  
  - void switchMenu ... 카테고리 선택 시 동작
  - - <Menu>.printMenuItems ... 카테고리 내 메뉴 리스트 출력
    - this.switchMenuItem ... 메뉴 선택 시 동작
  
  - void switchMenuWithOrder ... 장바구니가 있을 때 카테고리 출력 / 선택 동작
  - - <Menu>.printMenuItems ... 카테고리 내 메뉴 리스트 출력
    - this.switchMenuItem ... 메뉴 선택 시 동작
    - <Cart>.PrintCartItem ... 카트 내 메뉴 리스트 출력 / 결제 or 취소
    
  - start() ... kiosk 메서드 사용해 키오스크 동작.
    - Scanner 생성 / categoryInput 초기화
    - while (categoryInput != 0) {
      printCategoryList;
      if (this.cart.cartItems.isEmpty()) {
      switchMenu(categoryInput)
      } else {
      swichMenuWithOrder(categoryInput)
      }
      }


<Main>
1. MenuItem 생성 (세터)
2. Menu 클래스 생성(카테고리 이름 설정) 및 MenuItem 추가 (세터)
3. Kiosk 클래스 생성 및 Menu 클래스 추가 (세터)
4. Kiosk start() 메서드 사용
