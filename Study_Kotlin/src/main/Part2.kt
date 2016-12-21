package main

/**
 * Created by sol on 2016-12-21.
 */
fun main(args: Array<String>) {
    println("Hello World")
    //val Read-only
    //var Read/Write

    //java
    //final int a = 123;
    //kt
    //val a:int = 123
    //val a = 123

    //java
    //int a = 123;
    //kt
    //var a: Int = 123
    //var a = 123

    val myClass = MyClass()

    myClass.sumPrint(1, 2)

    val length = myClass.getLength("abc")

    println(length)

    //Infix notation
    fun Int.max(x: Int):
            Int = if (this > x) this else x
    println(1.max(2))

    infix fun Int.min(x: Int):
            Int = if (this < x) this else x
    println(1 min 2)
}

class MyClass {
    fun sumPrint(a: Int, b: Int): Unit {
        println(a + b)
    }

    fun sumPrint2(a: Int, b: Int) {
        print(a + b)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int): Int = a + b

    fun sum3(a: Int, b: Int) = a + b

    fun getLength(obj: Any): Int {

        fun getsize(item: String) = item.length

        if (obj is String) {
            return getsize(obj)
        }

        return 0
    }
}
