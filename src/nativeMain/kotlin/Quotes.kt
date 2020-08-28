import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.todayAt
import kotlin.random.Random

class Quotes {
    fun quoteOfTheDay(): Quote {
        val today: LocalDate = Clock.System.todayAt(TimeZone.currentSystemDefault())
        return quoteCatalogue[today.dayOfYear % quoteCatalogue.size]
    }

    fun randomQuote(): Quote {
        return quoteCatalogue[Random.nextInt(0, quoteCatalogue.size)]
    }
}

val quoteCatalogue = listOf(
    Quote("If Hitler invaded hell I would make at least a favourable reference to the devil in the House of Commons.", "Winston Churchill"),
    Quote("Now that the House of Commons is trying to become useful, it does a great deal of harm.", "Oscar Wilde"),
    Quote("No man is regular in his attendance at the House of Commons until he is married.", "Benjamin Disraeli"),
    Quote("For far too long the House of Commons has been run as little more than a private club by and for gentleman amateurs.", "John Bercow"),
    Quote("But first, the news: The House of Commons was sealed off today after police chased an escaped lunatic through the front door during Prime Minister's question time. A spokesman at Scotland Yard said it was like looking for a needle in a haystack.", "Ronnie Barker"),
    Quote("I hate rodents. I mean, the House of Commons is completely infested. I will stand on a chair if I see one of the things.", "Liz Truss"),
    Quote("Anybody who enjoys being in the House of Commons probably needs psychiatric help.", "Ken Livingstone")
)

data class Quote(val text: String, val author: String)
