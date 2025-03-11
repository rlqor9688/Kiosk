# Level 3
## 요구사항
- `Menu` 클래스 생성
 - 설명 : MenuItem 클래스를 관리하는 클래스
   예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함
 - `List<MenuItem>` 은 `Kiosk` 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경
 - 여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 `카테고리 이름` 필드를 가짐
 - 메뉴 카테고리 이름을 반환하는 메서드가 구현
      
## 설계

<MenuItem>
1. 속성
  - String name;
  - String price;
  - String description;
  
2. 생성자
   - MenuItem(String name, String price, String description);
     
3. 기능
  - void printMenuItem() {System.out.println(this.name + this.price + this.description)}
  
<Menu>
1. 속성 -> 카테고리 이름, 메뉴리스트
  - List<MenuItem> menuItemList;
  - String categoryname;

2. 생성자 -> 카테고리 이름 입력, 메뉴리스트 자동 생성
   - Menu(String categoryName) {
     this.categoryName = categoryName;
     this.menuItemList = new ArrayList<MenuItem>;

3. 기능 ->
   - String getCategoryName() {return this.categoryName;}
   - List<MenuItem> getMenuItemList() {return this.menuItemList};
   - void printMenuItems() {for (MenuItem menuItem : this.menuItemList) {menuItem.printMenuItem()}

<Kiosk>
1. 속성
  - List<Menu> menuList;
    
2. 생성자
  - Kiosk() {this.menuList = new ArrayList<Menu>()};
      
3. 기능
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
1. MenuItem 생성
2. Menu 클래스 생성(카테고리 이름 설정) 및 MenuItem 추가
3. Kiosk 클래스 생성 및 Menu 클래스 추가
4. Kiosk start() 메서드 사용
