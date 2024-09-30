# 재능 교환 플랫폼 "Talearnt!"
인터넷 강의로 혼자 배우고, 복습하는 것 지겨우셨다구요?😥  
남을 알려주는 것보다 훌륭한 학습 방법🧐은 없다는 것을 알고 계실 거예요!  
자신이 가진 탁월한 재능을 다른 사람에게 제공하고😘, 다른 사람의 우수한 재능을 받아보세요!😍  
자신의 제자이자 스승인 대상을 만들어 재능을 교환하고 더 나은 커리어와 미래를 향해 갑니다🧲  


## CODE Convention 📄
코딩할 때 이것은 꼭 지켜요!  
😊중복되는 코드는 클래스 및 메소드로 분리시켜 중복을 방지해요!  
[SOLID 원칙을 지켜요](https://www.nextree.co.kr/p6960/)

<details>
  <summary>네이밍 규칙이 어렵다면!</summary>
  
  - **Interface**
    - 명사형 또는 ~able/~ible로 끝나는 형용사형으로 이름을 지어요
    - 대문자 시작 - Pascal Case
    - 하나의 클래스만 구현할 예정이라면 인터페이스를 생성하지 않아요
    - 구현할 여러 클래스의 책임을 따져서 만들어요
  
  - **Class**
    - 명사만 가능해요
    - 대문자 시작 - Pascal Case
    - DTO일 경우 불변성을 지키기 위해 Builder 패턴을 사용해요
    - Entity는 상태 변화를 최소화하고, 필요할 경우 Lombok 등의 도구로 Getter, Setter를 자동 생성하도록 해요
    - 상속보단 합성으로 만들어요
    - 클래스가 책임이 많아지지 않도록 SRP(Single Responsibility Principle - SOLID 원칙 중 하나)를 적용해요
    - 상수 목록을 만들 경우 Enum Class로 만들어요

  - **Method**
    - 동사로 시작하고, 명확한 동작을 표현해요. ex) `addUser()`, `changeUserName()`
    - Boolean 값을 반환하는 메소드는 `is`, `has`로 시작해요
    - Camel Case
    - 하나의 메소드에는 하나의 기능만 하도록 만들어요
    - 메소드의 길이가 길어질 경우, 적절히 분리하여 재사용성을 높이고 가독성을 유지해요

  - **Variable**
    - 명사로 만들어요
    - Camel Case
    - JDK 1.8 이상의 경우, `java.time` 패키지의 `LocalDate`, `LocalDateTime`을 사용해요
    - 상수를 정의할 때는 모두 대문자로 작성하고, 단어 간에는 언더스코어(_)로 구분해요. ex) `MAX_VALUE`, `DEFAULT_TIMEOUT`
</details>

## GIT Convention 📃
😊 [GITHUB Flow](https://inpa.tistory.com/entry/GIT-%E2%9A%A1%EF%B8%8F-github-flow-git-flow-%F0%9F%93%88-%EB%B8%8C%EB%9E%9C%EC%B9%98-%EC%A0%84%EB%9E%B5) 브랜치 전략을 따릅니다.   

<details>
  <summary>📑양식📑 및 작성 예제</summary>
  양식)  
  type : Subject  
    
  body :  
    
  footer :  #이슈번호  
    
  예제)  
  feat : Add 데이터 전송을 위한 Login DTO   
     
  Json 형태로 편하게 받기 위한 DTO Class 추가  
     
  Fixes : #21  
  Related to : #17, #23
  
</details>
<details>
  <summary>type에 뭘 넣을지 모르겠다면!</summary>
  
  - **feat** : 새로운 기능 추가
  - **fix** : 버그 수정
  - **docs** : 문서 수정
  - **style** : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
  - **refactor** : 코드 리펙토링
  - **test** : 테스트 코드, 리펙토링 테스트 코드 추가
  - **chore** : 빌드 업무 수정, 패키지 매니저 수정

</details>
<details>
  <summary>Subject에 뭘 넣을지 모르겠다면!</summary>

  - **Add** : 추가
  - **Remove** : 삭제
  - **Simplify** : 단순화
  - **Update** : 보완
  - **Implement** : 구현
  - **Prevent** : 방지
  - **Move** : 이동
  - **Rename** : 이름 변경

</details>
<details>
  <summary>footer에 뭘 넣을지 모르겠다면!</summary>

  - **Fixes**: 이슈 수정 중 (아직 해결되지 않은 경우)
  - **Resolves**: 이슈를 해결했을 때 사용
  - **Ref**: 참고할 이슈가 있을 때 사용
  - **Related to**: 해당 커밋에 관련된 이슈 번호 (아직 해결되지 않은 경우)

</details>
