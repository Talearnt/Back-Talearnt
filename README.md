# 재능 교환 플랫폼 "TRADE UP!"
인터넷 강의로 혼자 배우고, 복습하는 것 지겨우셨다구요?  
강의에서는 왜 이렇게 되는 지, 질문하고 싶지만 답변이 느리고 확인이 어려워 진행이 힘들었다구요?  
자신이 가진 탁월한 재능을 다른 사람에게 제공하고, 다른 사람의 우수한 재능을 받아보세요!  
자신의 제자이자 스승인 대상을 만들어 재능을 교환하고 더 나은 커리어와 미래를 향해 갑니다.  
즐겁고, 신나게!  
함께 쌓아가는 재능!  

## CODE Convention 📄
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
     
  body : Json 형태로 편하게 받기 위한 DTO Class 추가  
     
  footer : #21 
</details>
<details>
  <summary>type에 들어갈 내용</summary>
  
  - **feat** : 새로운 기능 추가
  - **fix** : 버그 수정
  - **docs** : 문서 수정
  - **style** : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
  - **refactor** : 코드 리펙토링
  - **test** : 테스트 코드, 리펙토링 테스트 코드 추가
  - **chore** : 빌드 업무 수정, 패키지 매니저 수정

</details>
<details>
  <summary>Subject에 들어갈 내용</summary>

  - **Add** : 추가
  - **Remove** : 삭제
  - **Simplify** : 단순화
  - **Update** : 보완
  - **Implement** : 구현
  - **Prevent** : 방지
  - **Move** : 이동
  - **Rename** : 이름 변경

</details>
