import kotlin.random.Random

fun main(args: Array<String>) {
    val line = "--------------------------------------"

    println("Hello World!")
    println(line)
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val invertedOddNumber = numbers
        .filter { it -> it % 2 != 0 }
        .joinToString { "${-it}" }
    println(invertedOddNumber)

    println(line)
    val name = getName().ifBlank { "John Doe" }
    println(name)
    println(line)

    val input = "####PLACE##HOLDER####"
    val result = input.removeSurrounding("####")
    println(result)
    println(line)

    val regex = Regex("""\w*\d+\w*""")
    val inputForRegex = "login: Pokemon5, password: 1q2w3e4r5t"
    val replacementResult = regex.replace(inputForRegex, replacement = "xxx")
    println("Initial input: $inputForRegex")
    println("Anonimized result: $replacementResult")
    println(line)

    println("sometimes.text.should.be.split".split("."))
    println(line)

    val inputForSubstring = "What is the answer to the Ultimate Question of Life, the Universe, and Everything? 42"
    val answer = inputForSubstring.substringAfter("?")
    println(answer)
    println(line)

    val multilineString = """
        # Kotlin
        # Java
    """.trimMargin("#")
    println(multilineString)
    println(line)

    val copySet = numbers.toSet()
    println(copySet)
    println(line)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredNumbers = numbersMap.filter { (key,value) -> key.endsWith("1") && value > 10 }
    println(filteredNumbers)

    println(line)
    val numbersInString = listOf("one", "two", "three", "four")
    println(numbersInString.associateWith { it.length })

}

fun getName(): String =
    if (Random.nextBoolean()) "" else "David"