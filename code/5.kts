fun main(args: Array<String>) {
    val wordCount = args.groupingBy { it }.eachCount()
    val sortedWords = wordCount.toList().sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })

    for ((word, count) in sortedWords) {
        println("$word $count")
    }
}