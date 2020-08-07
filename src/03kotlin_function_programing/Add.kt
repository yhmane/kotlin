package `03kotlin_function_programing`

fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(5, 10)

    println(result1)
    println(result2)
}