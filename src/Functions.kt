fun main() {
name()
    module()

    var final =add(3,4,5,6)
    print(final)

    interest()

}

fun name(){
    val name = ("Sarah")
    println("Hello ${name}")
}
fun module(){
    var a = 20
    var b = 8
    var module = a % b
    println(module)

}
fun add(a:Int,b:Int,c:Int,d:Int):Int{
    var sum = a + b + d+ c
    return sum

}
fun interest(){
    var fact =("I cant help laughing when i feel like.")
    println(fact)
}

    