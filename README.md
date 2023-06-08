# MBTI 자판기

## 프로젝트 소개
- 16개의 질문으로 사용자의 MBTI 성향 파악.
- 16 종류의 결과값 도출.

## 요구사항
- "주의집중", "정보 수집", "결정 내리기", "생활 양식" 네 분야의 답변 수집
  - 2지 선다형 질문으로 사용자의 성향 파악.
  - 
- 네 분야 별 MBTI를 조합하여 한 문자열로 결과 출력.


- 나누기의 경우 나눌 수 가 0인 경우 IllegalArgumentException이 발생하도록 구현
- 성공 시 결과 페이지 출력 구현
- 서버 내부 기능 구현 실패 시 500 에러 발생 구현
- Servlet 연동 실패 시 404 에러 발생 구현 
- 모든 입력값에서 예외 발생 시 예외 처리 구현
  - 400 status code 출력 
  - 예외 메세지 출력

## 제약사항
- MVC 패턴 적용
  - View
    - src/main/webapp/WEB-INF/view 디렉터리 생성
    - index.jsp에서 user에게 연산자, 피연산자 입력
    - result.jsp에서 계산 결과 출력
  - Controller
    - com.ohgiraffers.controller 패키지 생성
    - CalcController.java에서 user에게 입력 받은 연산자, 피연산자 데이터 model에 전달
    - ResultController.java에서 계산 결과값을 view에 전달
  - Model
    - com.ohgiraffers.model 패키지 생성
    - 각 사칙연산(+, -, *, /)에 대해 연산 메소드 기능 구현
- 메소드 이름은 반드시 명령문 형태로 작성
- 테스트 메소드 기능 검증하도록 작성
  - 전체 테스트 실행 시 에러 발생하는지 확인
  - 단위 테스트 실행하며 기능 구현
- 개인 구현은 반드시 브랜치를 생성 후 구현할 것
  (브랜치 이름은 신규인 경우 feature/기능명 형태로 작성할 것)
- 모든 개인 작업이 끝난 후 PR 생성
- PR에 모든 팀원이 코드 리뷰할 것
- 마지막 리뷰어는 Merge 수행


## 패키지 구조
<img width="314" alt="사진" src="https://github.com/MTVS-Server/servlet-calculator/assets/134986842/ff64372d-d28f-46a9-965f-2d177320f698">
