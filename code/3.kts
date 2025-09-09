fun main(args: Array<String>) {
    val uniqueSortedWords = args.distinct().sorted()
    for (word in uniqueSortedWords) {
        println(word)
    }
}