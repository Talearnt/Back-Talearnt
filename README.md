# 재능 교환 플랫폼 "Talearnt!"
인터넷 강의로 혼자 배우고, 복습하는 것 지겨우셨다구요?😥  
남을 알려주는 것보다 훌륭한 학습 방법🧐은 없다는 것을 알고 계실 거예요!  
자신이 가진 탁월한 재능을 다른 사람에게 제공하고😘, 다른 사람의 우수한 재능을 받아보세요!😍  
자신의 제자이자 스승인 대상을 만들어 재능을 교환하고 더 나은 커리어와 미래를 향해 갑니다🧲  

## Tech Stack (❁´◡`❁)
FE : React, Typescript  
BE : Java-17, Spring boot, Swagger, Spring Security, ModelMapper, JPA, Query DSL  
DevOps : AWS(S3,EC2,RDS), Azure Database(Devlop전용), Docker, Jenkins, Gradle, Git, Jira  

```
  BE팀이 개발할 때 중점적으로 생각한 부분은 반복적인 코드를 최소화하여 효율적인 코드 관리입니다.
  이렇게 진행한 이유는 코드를 효율적으로 관리하면, 유지보수 및 확장성이 좋아지기 떄문입니다.
    
  그래서 우리 BE팀은 이렇게 코드를 작성했습니다😁
  - 같이 일하는 동료가 내 코드를 보고 쉽게 이해할 수 있을 것 인가?
  - 일관성 있는 코드인가?
  - 의존성이 너무 심하여 확장에 문제가 있는 것은 아닌가?
  - SOLID 법칙을 최대한 지켰는가?
```

<details>
 <summary>BE가 이러한 기술 스택을 선택한 이유📣 </summary>

  - **JAVA-17**
    - 다른 버전에 비해 오랫동안 지원함 (~2029년)
    - 빠른 발전으로 인해 다음 기술에 대한 호환성이 높을 것으로 추정
  - **Spring boot**
    - 프로젝트 생성이 편리하고, 쉽게 의존성을 추가할 수 있음
    - 다들 Spring boot 씀
  - **Swagger**
    - REST API를 우리의 코드에 맞춰 자동으로 생성하기에 코드 변경이 일어나도 빠르게 반영이 일어남
    - 프론트 엔드와 소통하는 것에 있어서 Notion보다 편리하게 관리 가능함
  - **Spring Security**
    - JWT 인증
    - 보안 관련한 기능을 비교적 쉽게 적용할 수 있음
  - **ModelMapper**
    - DTO Builder 패턴 사용
    - DTO <-> Entity 변환 과정 반복 코드 감소
  - **JPA**
    - 반복적인 CRUD 쿼리를 제거할 수 있음
    - 유지 보수에 좋음
  - **QueryDSL**
    - JPA로 해결이 어렵거나 불가능한 경우 혹은 코드가 너무 지저분할 정도로 분기가 많을 경우 사용
    - Java로 만들어 컴파일 단계에서 확인 가능
</details>

<details>
 <summary>DevOps 기술 스택을 선택한 이유📣 </summary>

  - **AWS (S3, EC2, RDS)**
    - 같은 클라우드 환경으로 비용 관리 편리
    - AWS 관련한 많은 자료
    - 서비스 안정성
    - S3
      - 정적인 파일 전용 ex) 이미지 파일, 문서, FE Project등
    - EC2
      - BE Project 업로드
    - RDS
      - 실제 운영 데이터 베이스
  
  - **Azure Database (개발 전용)**
    - 같은 DB 공유 시 개발 속도 향상
      - 더미 데이터
      - 테이블 구조 변경
      - 같은 환경 DB에서 개발

  - **Docker**
    - 개발 환경 및 배포 환경 일관성
    - 빠르게 배포 가능

  - **Jenkins**
    - CI/CD 파이프라인 자동화
    - 코드 -> 배포 까지 일관성 유지

  - **Gradle**
    - 빠른 빌드 속도
    - 쉽게 의존성 추가 및 관리 편리

  - **Git(Github)**
    - 버전 관리 편리 (이력 추적)
    - 코드 리뷰 가능
    - Jenkins 배포 파이프라인 연결 가능

  - **Jira**
    - 프로젝트 추적 관리 편리 
    - Github Commit Message로 Jira에서 코드 이슈 관리 가능
</details>



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
    - `java.time` 패키지의 `LocalDate`, `LocalDateTime`을 사용해요
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
