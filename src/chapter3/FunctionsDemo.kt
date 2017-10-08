package chapter3

import java.lang.StringBuilder

/**
 * Created by akshaymukadam on 06/10/17.
 */
fun main(ars: Array<String>) {

    val set = setOf<Int>(1, 2, 3, 4)
    println(set.javaClass)

    val list = listOf<String>("Abd", "DEF", "GHI")
    println(list.javaClass)


    val string = listOf<String>("james", "Sadio", "Albert")

    println(string.size)


    val numbers = setOf(1, 2, 4, 5, 3, 1)
    println("Min number is ${numbers.min()}  and max number is${numbers.max()}")

    println("JoinToString" + joinToString(numbers, prefix = "|", seperator = ",", postFix = "|"))
    val lstNu = listOf<Int>(1, 2, 2, 3, 4, 5, 6, 6)

    println("JoinToString Optional Params ${joinToString(lstNu)}")
    println("Extension Functions" + lstNu.joinString(",", "[", "]"))

    firstName = "AKSHAY"
    println("Name is ${firstName}")
}

fun <T> joinToString(collection: Collection<T>, seperator: String = ",", prefix: String = "{", postFix: String = "}"): String {


    val builder = StringBuilder(prefix);

    for ((i, e) in collection.withIndex()) {
        if (i > 0) {
            builder.append(seperator)
        }
        builder.append(e)
    }
    builder.append(postFix)
    return builder.toString()
}

fun <Int> Collection<Int>.joinString(seperator: String = ",", prefix: String = "{", postFix: String = "}"): String {

    val builder = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) {
            builder.append(seperator)
        }
        builder.append(element)
    }
    builder.append(postFix)
    return builder.toString()
}

var firstName: String = ""
    set(value) {
        if (value != null)
            field = value.toLowerCase()
    }
    get() = field
