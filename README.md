# MBTI 자판기

## 프로젝트 소개
- 12개의 질문으로 사용자의 MBTI 성향 파악.
- 16 종류의 결과값 도출.

## 요구사항
- 질문마다 jsp 페이지 생성 구현
- "주의 집중(외향/내향)", "인식 기능(감각/직관)", "판단 기능(사고/감정)", "생활 양식(판단/인식)" 네 분야의 답변 수집
  - 각 분야마다 3가지 질문, 2지 선다형으로 사용자의 성향 파악
  - 질문을 Radio Button으로 구현
  - 답변 미선택 시 알림 처리
  - 이분법으로 MBTI 성향을 판단
    - 예를 들어, "주의 집중" 판단 시 "I/E" 중 "I"성향의 답변만을 저장 및 비교 후 MBTI 결정
    - 과반수 이상의 답변으로 각 분야의 MBTI 결정
- 네 분야 별 MBTI를 조합하여 한 문자열로 결과 출력
- 로그인 정보를 TXT에 저장
  - txt 파일 제작 및 불러오기 기능 구현
  - UserDto를 통해 DB(txt파일)에 데이터 저장 및 조회
- 입력된 로그인 정보와 DB에 저장된 정보를 비교
  - 일치하지 않을 시 예외처리 후 에러 페이지 처리
- 결과 페이지 출력
  - "MBTI" 결과를 사용자에게 보여줌

## 제약사항
- MVC 패턴 적용
  - View
    - src/main/webapp/WEB-INF/view 디렉터리 생성
    - index.jsp에서 자동으로 mainHome으로 이동
    - mainHome.jsp에서 MBTI '테스트 시작' 버튼 구현
    - 시작 버튼 클릭 시 'login.jsp'로 이동 구현
    - 로그인 완료 후 'question1.jsp'로 이동 및 질문 구현
    - 모든 질문 완료 시 'result.jsp'로 이동
    - result.jsp에서 결과 출력
  - Controller
    - com.ohgiraffers.controller 패키지 생성
    - LoginController.java에서 사용자에게 입력 받은 로그인 정보를 Dto에 전달
    - 각 질문에 따른 답변을 AnswerController.java에서 MbtiModel.java로 전달
    - ResultController.java에서 결과값을 view에 전달
  - Model
    - com.ohgiraffers.model 패키지 생성
    - 질문의 답변을 MbtiModel.java에서 결과 값을 이분법으로 MBTI 성향을 저장
  - Dto
    - com.ohgiraffers.dto 패키지 생성
    - txt 파일에 로그인 정보, MBTI 결과 쓰기 및 저장
    - txt 파일 불러오기 및 읽기
    - 로그인 정보와 txt 파일에 있는 정보와 비교 구현
- SessionStorage엔 "login"을 키 값으로 저장
  - value로는 아이디,Password가 들어갈 것  
- 메소드 이름은 반드시 명령문 형태로 작성
- 테스트 메소드 기능 검증하도록 작성
  - 전체 테스트 실행 시 에러 발생하는지 확인
  - 단위 테스트 실행하며 기능 구현
- 개인 구현은 반드시 브랜치를 생성 후 구현할 것
  (브랜치 이름은 신규인 경우 feature/기능명 형태로 작성할 것)
- 모든 개인 작업이 끝난 후 PR 생성
- 마지막 리뷰어는 Merge 수행

<!-- ## Code Contributors
[<img src="https://avatars.githubusercontent.com/u/88484476?v=4" alt="Alt text" style="zoom:25%;" />](https://github.com/Dylan-SonJungin)
[<img src="https://avatars.githubusercontent.com/u/98208452?v=4" alt="만제" style="zoom: 25%;" />](https://github.com/fakerdeft)
[<img src="https://avatars.githubusercontent.com/u/115992753?v=4" alt="프로필" style="zoom:25%;" />](https://github.com/Subak-Uncle)
[<img src="https://avatars.githubusercontent.com/u/134986842?v=4" alt="hc" style="zoom:25%;" />](https://github.com/ahnichan)
[<img src="https://avatars.githubusercontent.com/u/19159759?v=4" alt="지원" style="zoom:25%;" />](https://github.com/jiwon11) -->

## 패키지 구조
<img width="278" alt="스크린샷 2023-06-12 084541" src="https://github.com/MTVS-Server/finalProject/assets/88484476/fd5695f3-81f8-4d02-a492-73d3290ea75b">


## 순서도

<img width="882" alt="스크린샷 2023-06-11 220045" src="https://github.com/MTVS-Server/finalProject/assets/88484476/3db2e48e-4e52-412d-92de-69a461d745d1">

## 화면 구성
<img width="1071" alt="image" src="https://github.com/MTVS-Server/finalProject/assets/115992753/2f8f8eb9-1b50-4e15-a76f-170535bf1bb1">
<img width="1069" alt="image" src="https://github.com/MTVS-Server/finalProject/assets/115992753/4c06674b-d74d-4f2d-bcc1-01f04f63135a">
<img width="1070" alt="image" src="https://github.com/MTVS-Server/finalProject/assets/115992753/5f13992f-39f4-4735-a02a-682b5cf4c2ad">
<img width="1070" alt="image" src="https://github.com/MTVS-Server/finalProject/assets/115992753/ad550478-cd61-4982-a53c-2cf2982766e7">



