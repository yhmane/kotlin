package study.second.property

/**
 * 자바와 마찬가지로 함수를 재정의 할 수 있음
 * 다만, property는 기본적으로 private 이기 때문에
 * 재정의 할 경우 open을 명시해 줌
 */

open class First {
    open val x: Int = 0
        get() {
            println("First x")
            return field
        }

    val y: Int = 0
}

class Second : First() {
    override val x: Int = 0
        get() {
            println("Second X")
            return field + 3
        }
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}