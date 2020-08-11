package study.first.func

fun main() {
    var result: Int
    result = highOrder({ x, y -> x + y }, 10, 20)
    println(result)
}

/**
 * 매개변수에 람다식 함수롤 이용한 고차 함수
 */
fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int) = sum(a, b)