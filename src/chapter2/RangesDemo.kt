package chapter2

/**
 * Created by akshaymukadam on 06/10/17.
 */
fun main(args: Array<String>) {

    for (i in 1..10) {
        println("Number is ${i}")
    }

    for (i in 1..4) {
        println("New Number is ${i}")
    }

    for (i in 4..1) {
        println("Reverse orderis ${i}")
    }

    for (i in 4 downTo 1) {
        println("Reverse order ${i}")
    }

    for (i in 4 downTo 2 step 2) {
        println("Reverse order new ${i}")
    }
}