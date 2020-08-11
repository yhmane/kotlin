package study.first.func

/**
 * 람다식이 아닌 일반함수를 매개변수로 사용할 경우
 * ::를 붙여 사용
 */
fun main() {

    var res1 = funcParam(3, 2, ::add) // 일반함수를 매개로 넘길때 :: 를 사용
    println(res1)

    hello(::text)

    // 람다처럼 함수를 변수에 저장하여 사용 가능
    val lambda = ::add
    println(lambda(6,6))
}

fun add(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int,  b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}