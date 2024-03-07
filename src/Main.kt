fun main() {
    val dog: Animal = Dog()
    val cat = Cat()

    if (dog is Dog) {
        dog.draw()
        dog.move()
        println("멍멍이")
    }
}

interface Drawable {
    fun draw()
}

abstract class Animal {
    open fun move() {
        println("이동")
    }
}

class Dog : Animal(), Drawable {
    override fun move() {
        println("껑충")
    }

    override fun draw() {
        println("draw")
    }
}

class Cat : Animal() {
    override fun move() {
        println("살금")
    }
}