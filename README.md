# Level 5
## 요구사항: 캡슐화 적용하기
- `MenuItem`, `Menu` 그리고 `Kiosk` 클래스의 필드에 직접 접근하지 못하도록 설정합니다.
-  Getter와 Setter 메서드를 사용해 데이터를 관리합니다.
      
## 설계

<MenuItem>
1. 속성
  - String name;
  - String price;
  - String description;
  
2. 생성자
     
3. 기능
  - 게터 / 세터
  - void printMenuItem() {System.out.println(this.name + this.price + this.description)}
  
  
<Menu>
1. 속성 -> 카테고리 이름, 메뉴리스트
  - List<MenuItem> menuItemList;
  - String categoryname;


3. 기능 ->
   - 게터 / 세터
   - String getCategoryName() {return this.categoryName;}
   - List<MenuItem> getMenuItemList() {return this.menuItemList};
   - void printMenuItems() {for (MenuItem menuItem : this.menuItemList) {menuItem.printMenuItem()}

<Kiosk>
1. 속성
  - List<Menu> menuList;
    
2. 생성자
      
3. 기능
  - 게터/ 세터
  - void printMenuList() {for (Menu menu: this.menuList) {System.out.println(menu.getCategoryName())}}
  - start() {
    Scanner sc = new Scanner(System.in);
    int categoryInput = 55;

    while (categoryInput !=0) {
      printMenuList();
      Sout("카테고리 번호를 입력해주세요.")
      int categoryInput = sc.nextInt();
      switch (categoryInput) {
        case1: // 햄버거 리스트 프린트 + 스캐너로 menuInput 받기 / Switch문으로 번호에 해당하는 메뉴 출력 / 0-4 이외의 값 입력 시 메뉴가 없다고 출력
          switch: 해당하는 메뉴 출력용. 0 누르면 뒤로가기.
        case2: // 음료- 메뉴가 없으면 메뉴가 없다고 출력.
        case3: // 사이드- 메뉴가 없으면 메뉴가 없다고 출력.
        case0: 종료

<Main>
1. MenuItem 생성 (세터)
2. Menu 클래스 생성(카테고리 이름 설정) 및 MenuItem 추가 (세터)
3. Kiosk 클래스 생성 및 Menu 클래스 추가 (세터)
4. Kiosk start() 메서드 사용
