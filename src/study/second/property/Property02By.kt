package study.second.property

/**
 * 위임
 * 일을 대신해 주며 중간자 역할을 수행
 * 특정 클래스를 확장허가나 이용할 수 있도록 by를 통한 위임이 가능
 * */

interface Car {
    fun go(): String
}

class VanImpl(val power: String): Car {
    override fun go() = "은 짐을 적재하며 $power 을 가집니다"
}

class SportImpl(val power: String): Car {
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다"
}

class CarModel(val model: String, impl: Car): Car by impl {
    fun carInfo() {
        println("$model ${go()}")
    }
}

fun main() {
    val damas = CarModel("Damas 2010", VanImpl("100마력"))
    val b350d = CarModel("350d 2008", VanImpl("350마력"))

    damas.carInfo()
    b350d.carInfo()
}