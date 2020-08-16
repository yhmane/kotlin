package study.first.func

/**
 *  익명함수
 *  일반함수 이지만 이름이 없는것,
 *  람다와 비교 되는것은 return이나 break, continue를 사용하기 용이하기 때문에
 *
 *  인라인함수
 *  함수가 호출되는 곳에 함수 본문의 내용을 모두 복사해 넣음
 *
 *  확장함수
 *  클래스에 다양한 함수가 정의 되어 있는데, 기존 함수가 아닌 나만의 원하는 함수를 추가 시켜줄 경우
 *
 *  중위함수
 *  클래스의 멤버를 호출할 때 사용하는 점(.)을 생략하고 함수 이름 뒤에 소괄호를 붙이지 않아 직관적인 이름을 사용할 수 있는 표현법
 *  1) 멤버 메서드 또는 확장 함수
 *  2) 하나의 매개변수를 지녀야 함
 *  3) infix 키워드를 사용하여 정의
 *
 *  재귀함수
 *  재귀로도 사용할 수 있음. 다만, 제어문을 적절히 사용하여 무한루프를 방지해야 함
 */

fun main() {
    // 인라인
    shortFunc(3) {println("Fist call: $it")}

    // 확장
    val source = "Hello World"
    val target = "Kotln"
    println(source.getLongString(target))

    // 중위 함수
    println(3 multiply 10)

    // 재귀함수
    println(factorial(1))
    println(factorial(4))
}

/**
 * 인라인 함수
 */
inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before Calling out()")
    out(a)
    println("After Calling out()")
}

/**
 * 확장함수
 */
fun String.getLongString(target: String) = if (this.length > target.length) this else target

/**
 * 중위함수
 */
infix fun Int.multiply(x: Int) = this * x

/**
 * 재귀함수
 */
fun factorial(n: Int): Long = if (n == 1) n.toLong() else n * factorial(n-1)