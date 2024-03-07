fun main() {
}

open class Person

abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class SuperMan : Person()

class Dog : Animal() {
    override fun move() {
        println("껑충")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살금")
    }
}