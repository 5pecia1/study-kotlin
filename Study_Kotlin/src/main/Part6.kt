package main

/**
 * Created by sol on 2017-01-03.
 */
fun main(args: Array<String>) {
    val a: String? = null
    val b = a as? Int ?: 0
    println(b)
}