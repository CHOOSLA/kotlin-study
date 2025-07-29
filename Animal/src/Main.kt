fun main(){
    var dog = Dog("인절미",3,"골든리트리버")
    var cat = Cat("나비", 6, "red")

    dog.showDogInfo()
    cat.showCatInfo()


}

open class Animal(protected var name: String, internal var age: Int) {
    fun info(){
        println("이름 : $name , 나이 : $age")
    }
}

class Cat(name: String, age: Int, private val _color: String) : Animal(name, age){
    fun showCatInfo(){
        println("===================")
        println("분류 : 고양이")
        println("===================")
        info()
        println("색상 : $_color")
        println("===================")
    }
}

class Dog(name: String, age: Int, public var breed: String) : Animal(name, age){
    fun showDogInfo(){
        println("===================")
        println("분류 : 강아지")
        println("===================")
        info()
        println("품종 : $breed")
        println("===================")
    }
}