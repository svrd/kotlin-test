class Sample {
    fun sum(a: Int, b: Int) : Int {
        return a + b
    }
}

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}