package study.first.func

/**
 *
 * 1) main -> otherLambda 이름으로 호출 -> callByName() 실행 -> otherLambda -> 실행
 * 람다식을 호출하여 사용
 *
 * result
 *
 * callByName func
 * otherLambda func
 * true
 */
fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName func")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda func")
    true
}