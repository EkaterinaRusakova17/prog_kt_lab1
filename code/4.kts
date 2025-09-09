fun main(args: Array<String>) {
    val wordCount = args.groupingBy { it }.eachCount()
    val sortedWords = wordCount.toList().sortedBy { it.first }

    for ((word, count) in sortedWords) {
        println("$word $count")
    }
}