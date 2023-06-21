package lotto.view

import lotto.LottoDrawingMachine
import lotto.Lottos

object ResultView {
    fun printPurchasedLottos(lottos: Lottos) {
        println("${lottos.getNumberOfLottos()} 개를 구매했습니다.")
        lottos.lottos.forEach {
            println(it.numbers)
        }
    }

    fun printDrawResult(drawResult: LottoDrawingMachine.DrawResult) {
        println("당첨 통계")
        println("---------")
        drawResult.rankPrizes.forEach {
            if (it.rank.matchBonus) {
                println("${it.rank.matchCount}개 일치, 보너스 볼 일치 (${it.rank.reward}원)- ${it.winnerCount}개")
            } else {
                println("${it.rank.matchCount}개 일치 (${it.rank.reward}원)- ${it.winnerCount}개")
            }
        }
        println("총 수익률은 ${drawResult.totalRoi}입니다.")
    }
}
