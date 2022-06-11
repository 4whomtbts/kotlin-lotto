# 2단계 - 로또(자동)

## 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

## TODO
- [x] 로또를 구매하기 위한 구입 금액이 존재한다.
  - [x] 구매 금액은 0이상의 정수여야 한다.
  - [x] 로또의 가격은 1장당 1_000원이다.
  - [x] 금액을 1000원으로 나눠서 구매 가능한 로또 티켓의 수를 구할 수 있다.
- [x] 로또 번호는 1~45 사이의 숫자이다.
  - [x] 로또 번호가 1~45 사이의 숫자가 아니라면 예외가 발생한다.
- [x] 로또 티켓은 6자리 숫자를 가진다.
  - [x] 6자리의 숫자가 아닌 경우 예외가 발생한다.
  - [x] 6자리 숫자는 중복을 허용하지 않는다.
- [x] 당첨번호를 맞춘맞큼 등수와 상금이 부여된다.
  - 3개 일치 -> 4등 5_000원
  - 4개 일치 -> 3등 50_000원
  - 5개 일치 -> 2등 1_500_000원
  - 6개 일치 -> 1등 2_000_000_000원
- [x] 구매한 로또 개수만큼 자동으로 티켓을 만들어줄 수 있다.
- [x] 구매 금액을 입력받는다.
  - [x] 구매 금액 입력 시 로또를 몇개 구매했는지 출력해준다. 
  - [x] 구매 금액 입력값은 빈 값이 될 수 없다.
  - [x] 구매 금액 입력값은 문자가 포함될 수 없다.
- [x] 당첨 번호 6자리를 수동으로 입력할 수 있다.
- [x] 총 수익률을 계산하여 출력한다. (총 구매금액을 1로 잡고 최종 당첨금을 합산하여 비율을 구한다.)

## 입출력 예시

```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```