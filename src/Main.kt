fun main() {
    myFunc(10) {
        println("함수 호출")
    }
}

fun myFunc(a: Int, callBack : () -> Unit = {}) {
    println("함수 시작!!!")
    callBack()
    println("함수 끝!!!")
}