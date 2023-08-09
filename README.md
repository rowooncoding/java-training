# java-training

java 챕터별 연습문제를 업로드 하는 레포지토리입니다

> 저작권 : CO.RE.20.20.02.02

## 변수와 자료형
### 1. 할당과 연산 해보기
x 변수에 10.1을 할당하고, y 변수에 2를 할당한 다음 두 변수 값을 곱하여 정수 출력

### 2. 시간 포멧
Scanner 통해서 초 값을 입력받고 입력받은 초를 시,분,초로 포멧하여 출력하는 프로그램 만들기

---

## 조건문
### 3. 키오스크 1
- 목록에 있는 음료를 입력하면 음료 가격 출력
  - 딸기 요거트 : 4500
  - 밀크티 3500
  - 카페라떼 3500
  - 아메리카노 2000
- 목록에 없는 음료 입력되면 메뉴가 없습니다 출력
- 음료 가격이 출력되면 입금 금액 출력
  - 입금 금액이 출력된 음료가격보다 크면 잔돈 출력
  - 입금 금액이 출력된 음료 가격보다 작으면 금액이 부족합니다 출력
<img width="613" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/4462cde7-7e89-45a1-933d-d80cd127c835">

### 4. 가위바위보
- 1 : 가위 , 2 : 바위 , 3 : 보 번호에 해당하는 값을 두개 넣으면 가위바위보 진행
- 첫번째 입력은 유저 a
- 두번째 입력은 유저 b
- if 문 사용하여 유저 승부결정
<img width="763" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/3aa9898f-7a26-4c3e-a2ee-0f9ccaeaee94">

---

## 반복문
### 5. 구구단
- for 문 이용하여 19단 만들기
- 곱해지는 경우가 홀수인 경우 출력
- 출력 결과
<img width="577" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/679f4925-1f73-477c-8783-03b76eb5a60e">

### 6. 로또
- 6개의 0~46의 랜덤한 숫자를 5회 뽑는 로또번호 만들기
- 중첨 for 문 이용
- 랜덤한 숫자 뽑기
<img width="686" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/9c20713c-761c-457f-b933-a1dffda26de5">


### 7. 키오스크 2
- 프로그램이 시작되면 음료와 개수 입력
  - 딸기 요거트 : 4500
  - 밀크티 3500
  - 카페라떼 3500
  - 아메리카노 2000
- 목록에 있는 음료일시 음료가격에 개수를 곱한 총 가격 출력
- 총가격이 출력되면 입금 금액 입력
  - 입금 금액이 총 가격보다 크면 잔돈 출력 하고 개수만큼 반복
  - 입금 금액이 총 가격보다 적으면 잔액이 부족합니다 출력
- 1~3 과정은 반복
- 1 에서 종료가 입력 될 시 프로그램 종료
- 1에서 메뉴에 없는 메뉴 입력시 다시 a과정으로 돌아가기
<img width="534" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/ed140557-6cdc-4297-8346-448cfe73f941">

---

## 클래스
### 8. 클래스를 활용한 키오스크
a. 키오스크 클래스
  - Kiosk 클래스 정의
    - static 변수 key
    - 재고개수(정수) 필드 생성
  - 생성자 정의
    - 정수형으로 재고 개수가 인자로 입력되어 필드로 보관(생성자)
  - isInventory 메소드 생성
    - boolean타입 반환, 구매개수 인자로 받음
    - 재고 개수가 구매개수보다 많으면 true 아니면 false 반환
  - subInventory 메소드 생성
    - 반환값이 없으며 구매개수를 인자로 받음
    - 재고개수에서 구매개수를 빼서 재고개수 수정
  - initOrder 메소드 생성
     - Order 타입 반환, 메뉴 개수 인자로 받음
     - 음료 목록에 따라 가격 설ㅈ어
     - 정상 메뉴일시 정의한 메소드 활용하여 재고개수 업데이트 하고 해당 메뉴,개수,가격으로 Order 인스턴스 생성하여 반환

b. 주문 클래스
  - Order 클래스 정의
    - 메뉴, 개수, 주문금액 필드 생성
  - 생성자 정의
    - 메뉴, 개수, 메뉴가격이 인자로 입력
    - 메뉴와 개수는 필드에 할당
    - 메뉴가격과 메소드를 통해 주문금액 할당
  - setOrderPrice 메소드 생성
    - 반환이 없고 메뉴가격을 인자로 받음
    - 메뉴가격에 개수 곱하여 주문금액에 할당
  - runOrder 메소드 생성
    - boolean을 반호나하고 입금금액을 인자로 입력받음
    - 입금금액이 주문금액보다 크면 잔돈 출력하고 true 반환, 아니면 금액부족 출력 후 false 반환
  - setOrderPrice 메소드 생성
    - 주문 금액 반환
a. 실행 메인 클래스
<img width="893" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/4e3df505-7e92-4365-a196-742e34e8b027">

---

## 상속
### 9. 상속을 호라용한 키오스크 클래스
<img width="1273" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/8afde9da-03d7-47c6-8695-2d46b8d83572">
a. 키오스크 재고 입력
- 키오스크 인스턴스 생성
b. 주문 방식 입력
- 1:배달, 2: 포장, 3: 방문
c. 메뉴와 개수 입력
- 메뉴 목록은 이전과 동일
d. 주문 방식에 따라 주문 인스턴스 생성
- Kiosk 인스턴스의 메소드 사용
e. 메뉴가 정상적이고 재고가 충분하다면 총 금액 출력
f. 금액을 입력받고 주문 방식에 따라 추가 정보 입력
- 배달: 주소입력
- 포장 : 포장시간 입력
- 방문 : 주문 번호 입력
g. 추가정보 입력되면 각 주문에 따른 완료 문장 출력
h. Kiosk의 재고를 구매 개수만큼 차감
i. b ~ i 반복 (종료, 메뉴 없을때, 재고 없을 때, 금액 부족할때 경우도 고려)
<img width="1438" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/3ca3ea52-96df-45d1-8068-3e607bae90f0">

### 인터페이스를 활용한 키오스크
a. 키오스크 재고 입력
- 키오스크 인스턴스 생성
b. 주문 방식 입력
- 1:배달, 2: 포장, 3: 방문
c. 메뉴와 개수 입력
- 메뉴 목록은 이전과 동일
d. 주문 방식에 따라 주문 인스턴스 생성
- Kiosk 인스턴스의 메소드 사용
- this 와 setter 활용해 주문 인스턴스에 인터페이스 할당
e. 메뉴가 정상적이고 재고가 충분하다면 총 금액 출력
f. 금액을 입력받고 주문 방식에 따라 추가 정보 입력
g. 추가정보 입력되면 각 주문에 따른 완료 문장 출력
- 완료문장 전체를 Kiosk 오버라이딩 메소드에서 출력 (Order 메소드에서 하지말것)
h. Kiosk의 재고를 구매 개수만큼 차감
- Kiosk 오버라이딩 메소드에서 완료문장 출력 후 내부 메소드 이용하여 차감
i. b ~ i 반복 (종료, 메뉴 없을때, 재고 없을 때, 금액 부족할때 경우도 고려)
<img width="1372" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/b1ce5485-80c5-4e53-a718-a94aaacdc1d8">

---

### 11. 클래스를 이용한 키오스크
a. 실습 10 과정에 if null 처리를 예외 처리로 수정
- 컴파일상 오류체크가 이루어져야 하는 KioskException 클래스 정의
- 재고가 없을 시 KioskException에 101 코드값 입력 되어 예외 발생
- 메뉴가 없을 시 KioskException에 102 코드값 입력되어 예외 발생
- 메인 메소드에서 예외처리 통해 다음과 같이 code 값 출력
<img width="835" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/6335b109-7d21-4674-967b-1596970563d3">

---

### 12. 간단한 카드게임 만들기
a. 카드 게임이 시작되면 플레이어와 컴퓨터에 각각 랜덤하게 1~10의 값을 가지는 4장의 카드 분배
- 크기가 4인 정수배열 두개
b. 플레이어의 4장의 카드를 보여주고 2장 카드 선택
- 2개의 카드 순서 입력
c. 선택한 두장의 카드 합과 컴퓨터의 4장의 카드중 가장 높은 값 2장의 합과 비교합니다
- 컴퓨터의 카드합은 정렬을 이용하지 않고 두번의 for문 사용
d. 카드합의 비교에 따라 다음과 같이 출력
- 같으면 동점
- 플레이어가 높으면 플레이어 승리
- 컴퓨터가 높으면 컴퓨터 승리

---

### 13. 키오스크에서 배열 활용
<img width="1398" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/20a92a35-8e9f-4632-83d1-566d03cc8cb9">
<img width="813" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/d178051a-9643-495a-bbfb-cfdd53fc5331">

### 14. 2차원 배열을 활용한 사다리 게임 만들기
<img width="1391" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/bcacd8f1-fe5e-4b46-806f-0bbb7fd3e1c6">
<img width="1436" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/22ae436b-d3b6-4149-bbbc-8bc4de064732">

### 15. 키오스크에서 리스트 활용
<img width="1239" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/c805c2ac-b52c-468f-8332-806f567b9165">

### 16. 키오스크에 주문 대기열 추가
<img width="1302" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/1a893e71-cd09-4810-9831-f3c601a8fd10">

### 17. 간단한 숫자 테트리스 만들어보기
<img width="1238" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/5d17ce98-0553-4718-b43a-93cabe7b8f8d">
<img width="1414" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/05cbc9a5-4bd9-4de4-94eb-909358b44a60">

### 18. 로또 번호 뽑기
<img width="1360" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/d23c16a9-e2d4-4222-87df-f530e909882c">

### 19. 키오스크 실습에 맵구조 추가
<img width="1321" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/b0531fdc-baa7-48b7-9f16-0901ea58d9c9">
<img width="785" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/a7db9c9c-b491-4eee-912e-6030dbed6991">

### 20. 키오스크 실습에 맵구조 추가
<img width="1361" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/ee91af6c-ff01-4712-8e7b-27de894146ad">
<img width="1355" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/6a1c89dc-d11f-4228-b86b-2c8f8243049e">
<img width="1377" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/c296fc54-6efc-453d-b39c-230fb25a26cf">
<img width="1424" alt="image" src="https://github.com/rowooncoding/java-training/assets/114975279/a7627cd6-7523-462d-abcc-7d7e6fe6a1c9">

















