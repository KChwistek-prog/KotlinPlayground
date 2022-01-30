import kotlin.random.Random

fun main(args: Array<String>) {
    val line = "--------------------------------------"

    println("Hello World!")
    println(line)
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
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
}

fun getName(): String =
    if (Random.nextBoolean()) "" else "David"