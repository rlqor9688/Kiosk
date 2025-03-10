# Level 2 구현
## 요구사항
- 햄버거 메뉴를 MenuItem 클래스와 List로 관리
- MenuItem 클래스는 이름, 가격, 설명 필드를 가짐
- Main 함수에서 MenuItem 클래스를 활용해 햄버거 메뉴 출력
- MenuItem 객체 생성을 통해 이름, 가격, 설명을 세팅
- List를 선언하여 여러 menuItem을 추가
- 반복문을 활용해 menuItem을 탐색하면서 하나씩 접근
  
## 설계 & 구현
```
<MenuItem 클래스>
String name;
String price;
String description;

MenuItem(String name, String price, String description) {
this.name = name;
this.price = price;
this.description = description;

<Main 클래스>
List<MenuItem> menuItems = new ArrayList<>();
menuItems.add(버거1, 가격, 설명);
menuItems.add(버거2, 가격, 설명);
menuItems.add(버거3, 가격, 설명);
menuItems.add(버거4, 가격, 설명);
for (MenuItem menu : menuItems) {
System.out.println(menu.name + menu.price + menu.description);
}
System.out.println("0: 종료")
Scanner sc = new Scanner(System.in);
int input =55;
while (input !=0) {
switch (input) {
case 1:
System.out.println(menuItems.get(0).name + menuItems.get(0).price + menuItems.get(0).description + "\n");
break;
...
case 0:
System.out.println("프로그램을 종료합니다");
break;
default:
System.out.println("잘못된 입력입니다. 다시 입력해주세요. \n");
}
}
```
