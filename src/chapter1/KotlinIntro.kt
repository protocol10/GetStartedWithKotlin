package chapter1

/**
 * Created by akshaymukadam on 01/10/17.
 */

data class Person(val name: String, val age: Int? = null)
//data class declaration
// val implies as final
//val age:Int?, specifies as nullable argument

fun main(args: Array<String>) { //Top Level Function
    val personList = listOf<Person>(Person("Alice"), Person("Bob", 29))


    val person = personList.maxBy { it.age ?: 0 }; //Lambda expression `it` as the default name of that parameter, which provides access to parameters


    println("Person is ${person}")
}