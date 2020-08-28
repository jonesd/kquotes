import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default

fun main(args: Array<String>) {
    val parser = ArgParser("quotes")
    val number by parser.option(ArgType.Int, description = "Number of quotes", shortName = "n").default(1)
    val day by parser.option(ArgType.Boolean, description = "Show Quote of the Day", shortName = "d").default(false)
    parser.parse(args)

    val quotes = Quotes()
    if (day) {
        printQuote(quotes.quoteOfTheDay())
    } else {
        repeat(number) {
            printQuote(quotes.randomQuote())
        }
    }
}

fun printQuote(quote: Quote) {
    println(quote.text)
    println("-- ${quote.author}")
}

