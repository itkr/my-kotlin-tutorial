package sample

fun main(args: Array<String>) {
    val href = Rational(1, 2)
    //val href = Rational(1, 0)
    println(href)
    println("Hello World! abcd")
}

class Rational(val numerator: Int, val denominator: Int) {
    init {
        require(denominator != 0, {"denominator must not be null"})
    }
    override fun toString(): String = "${numerator}/${denominator}"
}