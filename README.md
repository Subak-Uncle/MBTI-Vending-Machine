# MBTI 자판기

## 프로젝트 소개
- 12개의 질문으로 사용자의 MBTI 성향 파악.
- 16 종류의 결과값 도출.

## 요구사항
- 질문마다 jsp 페이지 생성 구현
- "주의 집중(외향/내향)", "인식 기능(감각/직관)", "판단 기능(사고/감정)", "생활 양식(판단/인식)" 네 분야의 답변 수집
  - 각 분야마다 3가지 2지 선다형 질문으로 사용자의 성향 파악
  - 질문에서 3가지 질문에서 과반수 이상의 답변으로 각 분야의 MBTI 결정
  - 질문을 Radio Button으로 구현
  - 2지 선다 중 미선택 시 알림 처리
  - 이분법으로 MBTI 성향을 판단
    - 예를 들어, "주의 집중" 판단 시 "I/E" 중 "I"성향의 답변만을 저장 및 비교 후 MBTI 결정
  - SessionStorage에 답변을 저장 후 다음 페이지로 전달
- 네 분야 별 MBTI를 조합하여 한 문자열로 결과 출력
- 로그인 정보와 MBTI 결과를 TXT에 저장
  - txt 파일 제작 및 불러오기 기능 구현
  - UserDto, MbtiDto를 통해 DB(txt파일)에 데이터 저장 및 조회
- 입력된 로그인 정보와 DB에 저장된 정보를 비교
  - 일치하지 않을 시 예외처리 후 알람 메세지 출력 구현
- 결과 페이지 출력
  - "이름" 과 "MBTI" 결과를 사용자에게 보여줌
  - MBTI 결과에 대한 분석
    - MBTI 특징(후순위) 
    - MBTI 조합표

## 제약사항
- MVC 패턴 적용
  - View
    - src/main/webapp/WEB-INF/view 디렉터리 생성
    - index.jsp에서 MBTI '테스트 시작' 버튼 구현
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
  - value로는 아이디, 이름, Password가 들어갈 것  
- 메소드 이름은 반드시 명령문 형태로 작성
- 테스트 메소드 기능 검증하도록 작성
  - 전체 테스트 실행 시 에러 발생하는지 확인
  - 단위 테스트 실행하며 기능 구현
- 개인 구현은 반드시 브랜치를 생성 후 구현할 것
  (브랜치 이름은 신규인 경우 feature/기능명 형태로 작성할 것)
- 모든 개인 작업이 끝난 후 PR 생성
- PR에 모든 팀원이 코드 리뷰할 것
- 마지막 리뷰어는 Merge 수행

## Code Contributors
[![Alt text](https://avatars.githubusercontent.com/u/88484476?v=4)](https://github.com/Dylan-SonJungin)


## 패키지 구조
<img width="314" alt="사진" src="https://github.com/MTVS-Server/servlet-calculator/assets/134986842/ff64372d-d28f-46a9-965f-2d177320f698">
