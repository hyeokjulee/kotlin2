fun main() {
    var i = 10
    var l = 20L

    var name = "10"
    name = i.toString()
    i = name.toInt()

    l = i.toLong()
    i = l.toInt()
}