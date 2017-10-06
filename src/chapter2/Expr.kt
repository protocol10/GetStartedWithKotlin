package chapter2

/**
 * Created by akshaymukadam on 06/10/17.
 */
interface Expr {
}

class Num(val nu: Int) : Expr

class Sum(val a: Expr, val b: Expr) : Expr

fun evalWithIf(e: Expr): Int {

    if (e is Num) {
        val n = e as Num;
        return n.nu;
    }
    if (e is Sum) {

        return evalWithIf(e.a) + evalWithIf(e.b);
    } else
        throw IllegalArgumentException("Bad letter")
}


fun evalWithWhen(e: Expr): Int =

        when {
            e is Num
            -> e.nu
            e is Sum
            -> evalWithWhen(e.a) + evalWithWhen(e.b)
            else -> throw IllegalArgumentException("Bad letter")
        }


fun main(args: Array<String>) {

    println("Sum is" + evalWithIf(Sum(Num(2), Sum(Num(3), Num(3)))))
    println("Sum isWith When" + evalWithWhen(Sum(Num(2), Sum(Num(3), Num(3)))))

}