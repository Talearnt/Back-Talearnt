# 부모님께 효도하는 앱 "GRAND LIFE"
주변의 요양원 및 실버 타운의 정보를 한 눈에 파악하고, 부모님께 더 좋은 노후를 보장하실 수 있는 Grand Life 어플리케이션.  

## Convention
코딩할 때 이것은 꼭 지켜요!
😊중복되는 코드는 클래스 및 메소드로 분리시켜 중복을 방지해요!

- Interface
  - 명사, 형용사만 가능해요
  - 대문자 시작 - Pascal Case
  - 하나의 클래스만 구현할 예정이라면 만들지 않도록 해요
  - 구현할 여러 클래스의 책임을 따져서 만들어요.
- Class
  - 명사만 가능해요
  - 대문자 시작 - Pascal Case
  - [SOLID 원칙을 지켜요](https://www.nextree.co.kr/p6960/)
  - DTO일 경우 불변성을 지키기 위해 Builder 패턴을 사용해요
  - Entity일 경우는 Getter, Setter를 사용해요
  - 상속보단 합성으로 만들어요
- Method
  - 동사 + 명사로 만들어요 ex) addUser(), changeUserName() 등등...
  - Camel Case
  - 하나의 메소드에는 하나의 기능만 하도록 만들어요
- Variable
  - 명사로 만들어요
  - Camel Case
  - Date 타입은 Time 패키지에 있는 LocalDate 등을 사용해요
