package study.second.property

/**
 * 자바 클래스 필드 =: 코틀린 프로퍼티
 * 코틀린은 get/set 함수를 자동으로 생성해줌
 *
 * class Person(var name: String, var age: Int)
 */

class User(val id: Int, var name: String, var age: Int)

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name // getter로 인식
    user.age = 41 // setter 로 인식

    println("name: $name, ${user.age}")
}