package chapter2

import java.util.*

/**
 * Created by akshaymukadam on 02/10/17.
 */

data class PersonDemo(val name: String)

data class PersonInfo(val name: String, val isMarried: Boolean) {

    /**
     * Demo to write different ways of custom accessor or getter
     */
    val isAdult: Boolean
        get() {
            return isMarried
        }
    val isNotAdult: Boolean
        get() = !isMarried
}

class Rectangle(val width: Int, val height: Int)


fun createRectangle(): Rectangle {
    val randomRect = Random();
    return Rectangle(randomRect.nextInt(10), randomRect.nextInt(10))
}

fun main(args: Array<String>) {

    // always declare as variables
    val personDemo = PersonDemo("James")

    println("Person  name is ${personDemo.name}")

    val personInfo = PersonInfo("Bob", false)

    println("Is person Adult ? -> ${personInfo.isAdult}")
    println("Is person NotAdult ? -> ${personInfo.isAdult}")

    val rectangle = createRectangle();
    println("Rectangle width = ${rectangle.width} + height = ${rectangle.height}")
}






