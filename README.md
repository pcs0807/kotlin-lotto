# kotlin-lotto

- [x] 문자열을 나누는 함수 및 테스트 코드 작성.
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- [x] 구분자 조회하는 함수 및 테스트 코드 작성.
- [x] 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “`//;\n1;2;3`”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론`(;)`이며, 결과 값은 6이 반환되어야 한다.
- [x] 입력이 문자/음수 인지 판단하는 validator 클래스 추가.
- [x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 예외(RuntimeException)를 throw 한다.
- [x] 입력과 출력 클래스를 작성한다.
- [x] 로또 클래스 및 테스트코드를 작성한다.
- [x] 랜덤 로또를 생성하는 클래스 및 테스트 코드를 작성한다.
- [x] 당점 로또 번호를 입력받는다.
- [x] 상금 처리하는 클래스 작성
- [x] 당점 로또 번호를 통해서 통계를 출력한다.
- [x] 생성자에 set를 사용해보자.
- [x] 로또 등수를 enum을 만들어보자.
- [x] 통계쪽 로직 이동
- [x] Lotto 에 맞춘 것을 따로 상태로 두지 않는다.
- [x] Lotto의 내부 Int를 클래스로 감싸고 LottoNum이 숫자 범위에 대한 책임을 가진다.
- [x] 2등을 위한 통계 관련 코드 추가 및 테스트 코드 작성
- [ ] 입력 및 출력 및 실행관련 코드 추가