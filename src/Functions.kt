fun main() {
name()
    var result =module(20,8)
    println(result)

    var final =add(3,4,5,6)
    println(final)

    interest()

}

fun name(){
    val name = ("Sarah")
    println("Hello ${name}")
}

fun module(a:Int,b:Int):Int{

    var module = a % b
    return module

}

fun add(a:Int,b:Int,c:Int,d:Int):Int{
    var sum = a + b + d+ c
    return sum

}

fun interest(){
    var fact =("I cant help laughing when i feel like.")
    println(fact)
}

    