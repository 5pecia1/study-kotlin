package main

import java.util.*
import java.util.function.Consumer

/**
 * Created by sol on 2016-12-21.
 */
fun main(args: Array<String>) {
    //use null
    var a: Int = 123
    //a = null // error
    var b: Int? = 213
    b = null // success

    //String templates
    val name = "kotlin"
    val age = 10
    val query = "name $name Age $age NameSize ${name.length} $name.length"
    println(query)

    //java Object
    /*
     * private int getLength(Object obj) {
     *  if (obj instanceof String) {
     *      return ((String)obj).length();
     *  }
     *  return 0;
     * }
     */
    //kotlin
    fun getLength(obj: Any): Int {
        if (obj is String) {
            return obj.length
        }
        return 0
    }

    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())
    cases("hello")

    //loop
    val arrayList = ArrayList<Int>()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)
    arrayList.add(4)
    arrayList.add(5)
    arrayList.add(6)
    arrayList.add(7)
    arrayList.add(8)

    for(s in arrayList) {
        println("String : $s")
    }

    //loop-ranges
    for (x in 1..5) {
        println(x)
    }

    //lambdas
    /*
     * button.setOnclickListener {
     *  view -> view.alpha = 0.5f
     *  // same
     *  // it.alpha = 0.5f
     * }
     */

    //stream
    arrayList.filter { it > 5 }.map { println("index : ${it * 2}") }

    
}

//pattern matching
fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unkown")
    }
}
