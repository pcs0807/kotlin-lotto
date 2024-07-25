package Lotto.view

import Lotto.domain.Lotto

class ResultView {
    companion object {
        fun printBuyLotto(lottoCount: Int) {
            println("$lottoCount 개를 구매했습니다.")
        }
        fun printLotto(lottos: List<Lotto>) {
            lottos.forEach { lotto ->
                println(lotto.number)}
        }
    }
}