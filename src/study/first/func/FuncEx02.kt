package study.first.func

/**
 * 반환값이 없는 함수
 * Unit =: void (Java)
 * Kotlin의 Unit은 Java의 void와 대응
 * Unit은 특수한 객체를 반환, void는 아무것도 반환하지 않음
 */

fun printUnit(a: Int, b: Int): Unit {
    println("a와 b의 합은 ${a + b}")
}

fun printUnit1(a: Int, b: Int): Unit = println("a와 b의 합은 ${a + b}")

/**
 * 반환값과 반환값의 자료형이 없으면 Unit으로 반환값을 추론
 */
fun printUnit2(a: Int, b: Int) = println("a와 b의 합은 ${a + b}")

fun main() {
    printUnit(1, 3)
    printUnit1(2, 3)
    printUnit2(3, 3)
}