package chapter4

/**
 * Created by akshaymukadam on 10/10/17.
 */

interface Clickable {
    fun click()
    fun showOff() = println("Clickable ShowOff")
}

interface Focusable {
    fun showOff() = println("Focusable ShowOff")
    fun setFocus()
}


class Button : Clickable, Focusable {
    override fun setFocus() {
        println("Set Focused")
    }

    override fun showOff() {
        super<Focusable>.showOff()
        super<Clickable>.showOff()
    }

    override fun click() {
        println("Button was not Click")
    }
}


fun main(args: Array<String>) {
    val button = Button();
    button.setFocus()
    button.showOff()
}