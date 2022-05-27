# 1단계 - 문자열 덧셈 계싼기
## 기능 요구 사항
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다. 
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다. 
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다. 
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다. 
  - 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.

## To Do
- [x] 빈 문자열 또는 null 을 입력할 경우 0 을 반환한다
- [x] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다
- [x] 쉼표 `,` 구분자로 입력할 경우 두 숫자의 합을 반환한다
- [x] 콜론 `:` 구분자로 입력할 경우 두 숫자의 합을 반환한다
- [x] 쉽표, 콜론 구분자를 같이 입력할 경우에도 모든 숫자의 합을 반환하다
- [x] 커스텀 구분자를 지정할 수 있고 커스텀 구분자로 구분 된 숫자의 합을 반환한다
- [x] 음수를 전달 할 경우 RuntimeException 이 발생한다
- [x] 숫자가 아닌 문자열이 입력될 경우 RuntimeException 이 발생한다
- [x] 지정한 구분자 외의 다른 구분자를 사용하면 RuntimeException 이 발생한다
- [x] 기능에 따라 메소드 또는 클래스로 분리해 이름으로 구분짓게 한다