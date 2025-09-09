fun main(args: Array<String>) {
    val inputText = if (args.isNotEmpty()) {
        args.joinToString(" ")
    } else {
        readLine() ?: ""
    }

    if (inputText.isBlank()) {
        return
    }

    val words = inputText.split("\\s+".toRegex())

    words.groupingBy { it }.eachCount()
        .toList()
        .sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })
        .forEach { (word, count) -> println("$word $count") }
}