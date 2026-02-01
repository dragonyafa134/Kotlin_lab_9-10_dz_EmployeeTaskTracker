object Logger {
    var count = 0
    fun log(message: String){
        count++
        println("[$count] $message")
    }
}

fun main(){
    Logger.log("Первоае сообщения")
    Logger.log("Второе сообщения")
    val logger1 = Logger
    val logger2 = Logger
    println(logger1 == logger2)
}