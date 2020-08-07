package `03kotlin_function_programing`

fun main() {
    val res1 = add(3, 2)
    val res2 = mul(add(3, 2), 5)

    println("res1: $res1, res2: $res2")
}

fun add(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b