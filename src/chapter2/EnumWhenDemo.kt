package chapter2

/**
 * Created by akshaymukadam on 06/10/17.
 */
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 120), ORANGE(255, 0, 0),
    GREEN(255, 0, 0), YELLOW(255, 0, 0), BLUE(255, 0, 0);


    fun rgb() = r * g + b;
}


fun getWarm(color: Color) = when (color) {
    Color.RED, Color.BLUE -> "Warm"
    Color.GREEN, Color.YELLOW, Color.ORANGE -> "Sunny"
}

//Richard of york gave apple
fun getMnemonic(color: Color) = when (color) {
    Color.ORANGE -> "Richard"
    Color.YELLOW -> "York"
    Color.GREEN -> "gave"
    Color.RED -> "Apple"
    else -> "Richard went to play"
}


fun whenWithArbitaryObject(c1: Color, c2: Color): String {
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.ORANGE) -> return "RED"
        setOf(Color.BLUE, Color.YELLOW) -> return "Sunny"
        setOf(Color.GREEN, Color.ORANGE) -> return "Black"
        else -> return "Can't Say";
    }
}

fun main(args: Array<String>) {
    println("Color value of RED" + Color.RED.rgb())

    println("Get Warmth " + getWarm(Color.ORANGE))


    println("Whats up? " + getMnemonic(Color.RED))


    println("whenWithArbitaryObject " + whenWithArbitaryObject(Color.ORANGE, Color.GREEN))
}
