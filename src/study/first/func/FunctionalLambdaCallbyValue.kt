package study.first.func

/**
 *
 * 1) main -> lambda 바로 실행 -> callByValue() 실행
 * 람다식을 호출하여 사용
 *
 * result
 *
 * lambda func
 * callByValue func
 * true
 */
fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("callByValue func")
    return b
}

val lambda: () -> Boolean = {
    println("lambda func")
    true
}