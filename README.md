# java-was-2023

Java Web Application Server 2023

## 프로젝트 정보

이 프로젝트는 우아한 테크코스 박재성님의 허가를 받아 https://github.com/woowacourse/jwp-was
를 참고하여 작성되었습니다.

## 기능 요구 사항

### step - 1

- [X] 특정 uri 로 접속했을 때, 해당 파일을 request 한다.
- [X] http request 내용을 읽고 logger 를 통해 확인한다.
- [X] 자바의 concurrent 패키지를 사용하도록 변경한다.

### step - 2

- [X] 응답 메시지를 관리하는 클래스를 구현한다.
- [X] GET 메소드를 통해 파라미터를 받는다.
    - [X] Path를 파싱해 파라미터와 분리한다.
- [X] 주어진 파라미터를 User 클래스에 담는다.
- [X] User 도메인에 담긴 객체를 DB에 넣는 기능을 구현한다.

### step - 3

- [X] 컨텐츠 확장자에 따라 파싱한다.
- [X] MIME 클래스로 관리한다.
- [X] 예외처리 및 리팩토링한다.
    - [X] 유저의 생성 로직의 예외를 구현.

### Step - 4

- [ ] 회원 가입 방식을 POST 방식으로 변경한다.
    - [ ] UserController POST 매핑으로 변경.
    - [ ] POST 방식으로 변경하기 위한 HTML 수정.
    - [ ] 데이터 파싱 로직 변경.
- [ ] 리다이렉션 기능을 구현한다.
    - [ ] 회원 가입을 완료하면 메인 페이지로 리다이렉션 한다.

## 학습 내용

- 코드 분석 및 동작
  과정 - https://github.com/ddingmin/be-was/wiki/%EC%BD%94%EB%93%9C-%EB%B6%84%EC%84%9D-%EB%B0%8F-%EB%8F%99%EC%9E%91-%EA%B3%BC%EC%A0%95
- HTTP
  메시지 - https://github.com/ddingmin/be-was/wiki/HTTP-Request,-Response-%EB%A9%94%EC%8B%9C%EC%A7%80-%EA%B5%AC%EC%A1%B0
- 자바의 스레드 - https://github.com/ddingmin/be-was/wiki/%EC%9E%90%EB%B0%94%EC%9D%98-%EC%8A%A4%EB%A0%88%EB%93%9C
- 자바의 concurrent 패키지 -
- 불변 객체 - https://github.com/ddingmin/be-was/wiki/%EB%B6%88%EB%B3%80-%EA%B0%9D%EC%B2%B4-(Immutable-Object)