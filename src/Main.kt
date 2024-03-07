fun main() {
    val box = Box(10)
    val box2 = Box("dfdfd")

    println(box.value)
}

class Box<T>(val value: T)