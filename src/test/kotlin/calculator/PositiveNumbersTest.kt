package calculator

import calculator.model.CalculatorErrorCode
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import io.kotest.matchers.throwable.shouldHaveMessage

class PositiveNumbersTest : StringSpec({

    "PositiveNumbers 생성 시 양수로 구성되면 정상 생성된다." {
        val expect = List(10) { it }

        val positiveNumbers = PositiveNumbers(elements = expect)

        positiveNumbers.elements shouldBe expect
    }

    "PositiveNumbers 생성 시 음수가 있을 경우 IllegalArgumentException 예외가 발생한다." {
        forAll(
            row(listOf(-1, 2, 3), "-1"),
            row(listOf(-1, -2, -3), "-1, -2, -3"),
        ) { numbers, expect ->
            val exception = shouldThrow<IllegalArgumentException> {
                PositiveNumbers(
                    elements = numbers,
                )
            }

            exception shouldHaveMessage CalculatorErrorCode.INVALID_POSITIVE_NUMBERS.message(expect)
        }
    }
})
