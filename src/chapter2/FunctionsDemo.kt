package chapter2

/**
 * Created by akshaymukadam on 01/10/17.
 */
fun main(args: Array<String>) {

    println("Max value is ${maxByBlock(3, 5)}")

    println("Max Value by Expression Body ${maxByExpression(3, 5)}")
    println("Max Value by Expression Body Inference ${maxByExpressionWithInference(3, 5)}")
}

/**
 * If a function is written with curly braces and body its is called as block body functions
 */
fun maxByBlock(a: Int, b: Int): Int {
    return if (a > b) a else b
}


/**
 * If a function is returns an expression directly it is called expression body
 */
fun maxByExpression(a: Int, b: Int): Int = if (a > b) a else b


/**
 * Type Inference, but generally prefer it for very small functions ,that does not have too many return types,which will help
 * you or some other guy to get acquainted with code quickly
 */
fun maxByExpressionWithInference(a: Int, b: Int) = if (a > b) a else b