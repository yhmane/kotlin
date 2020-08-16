package study.second.property

/**
 *  코틀린은 get/set 을 자동할당해주지만,
 *  함수 내부의 로직을 바꿔서 사용해야 할 경우가 있음
 *
 *  그럴경우 get/set을 직접 정의해줘야 됨.
 *  field와 value라는 보조 필드를 사용
 */

class User2(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("이름이 바꼈습니다")
            field = value.toUpperCase()
        }

    var age: Int = _age
}

fun main() {
    val user1 = User(1, "hwang", 30)
    user1.name = "yunho"
    println("user name = ${user1.name}")
}