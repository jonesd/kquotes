import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class QuotesTest {
    @Test
    fun there_is_a_daily_quote() {
        assertNotNull(Quotes().quoteOfTheDay())
    }

    @Test
    fun daily_quote_same_during_day() {
        val quotes = Quotes()

        val daily = mutableSetOf<Quote>()
        repeat(10) {
            daily.add(quotes.quoteOfTheDay())
        }
        assertEquals(1, daily.size)
    }

    @Test
    fun random_quote_should_give_different_quotes() {
        val quotes = Quotes()

        var collected = mutableSetOf<Quote>()
        repeat(10) {
            collected.add(quotes.randomQuote())
        }
        assertTrue(collected.size > 1)
        assertTrue(collected.size <= 10)
    }
}
