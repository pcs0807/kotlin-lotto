package lotto.domain

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import lotto.utils.LottoMachine
import org.junit.jupiter.api.assertThrows

class LottoTest : DescribeSpec({
    describe("로또를 생성합니다.") {
        context("정상적인 경우") {
            it("숫자 6개가 주어진다.") {
                val lotto = Lotto(1, 2, 3, 4, 5, 6)
                lotto.numbers.map { it.num } shouldBe listOf(1, 2, 3, 4, 5, 6)
            }
            it("숫자 6개가 주어진다.") {
                val lotto = Lotto(1, 2, 3, 4, 5, 6)
                lotto.contains(1) shouldBe true
                lotto.contains(2) shouldBe true
                lotto.contains(3) shouldBe true
                lotto.contains(4) shouldBe true
                lotto.contains(5) shouldBe true
                lotto.contains(6) shouldBe true
                lotto.contains(7) shouldBe false
            }
            it("랜덤 생성한다 및 정렬되어있다.") {
                val lotto = LottoMachine.auto()
                lotto.size shouldBe 6
                (lotto[0] < lotto[1]) shouldBe true
                (lotto[1] < lotto[2]) shouldBe true
                (lotto[2] < lotto[3]) shouldBe true
                (lotto[3] < lotto[4]) shouldBe true
                (lotto[4] < lotto[5]) shouldBe true
            }
            it("로또를 비교") {
                val lotto1 = Lotto(1, 2, 3, 4, 5, 6)
                val lotto2 = Lotto(1, 2, 3, 7, 8, 9)
                lotto1.matchedCount(lotto2) shouldBe 3
            }
        }
        context("비정상적인 입력이 있는 경우") {
            it("숫자가 부족한 경우") {
                assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 5) }
            }
            it("숫자가 1~45에 해당하지 않은 경우") {
                assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 5, 99) }
            }
            it("숫자가 1~45에 해당하지 않은 경우1") {
                assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 5, 46) }
            }
            it("숫자가 1~45에 해당하지 않은 경우2") {
                assertThrows<IllegalArgumentException> { Lotto(0, 1, 2, 3, 4, 5) }
            }
            it("음수가 포함된 경우") {
                assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 5, -10) }
            }
            it("숫자가 중복된 경우") {
                assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 5, 5) }
            }
        }
    }
})
