class LottoCard {
    private val numbers: List<Int>

    constructor() {
        numbers = LOTTO_NUMBERS.shuffled().subList(0, LOTTO_NUMBER_CNT)
    }

    constructor(numbers: List<Int>) {
        this.numbers = numbers
    }

    fun getWinning(winningLottoCard: LottoCard, bonusNumber: Int): Winning {
        val count = numbers.filter { winningLottoCard.numbers.contains(it) }.size
        return Winning.matchWinning(count, numbers.contains(bonusNumber))
    }

    override fun toString(): String {
        return numbers.toString()
    }

    companion object {
        const val LOTTO_NUMBER_CNT = 6
        const val LOTTO_START_NUMBER = 1
        const val LOTTO_LAST_NUMBER = 45
        val LOTTO_NUMBERS = (LOTTO_START_NUMBER..LOTTO_LAST_NUMBER).toList()
    }
}

class LottoCards(cnt: Int) {
    var cards: List<LottoCard> = (1..cnt).map { LottoCard() }

    fun getStatistic(beforeWeekLottoCard: LottoCard, bonusNumber: Int): Map<Winning, Int> {
        return cards.map { it.getWinning(beforeWeekLottoCard, bonusNumber) }
            .filter { it != Winning.NONE }.groupingBy { it }.eachCount()
    }
}