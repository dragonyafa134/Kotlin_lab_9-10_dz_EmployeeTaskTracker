object AppSettings {
    val version = "1.0.0"
    var isDarkNode = true

    fun toggleTheme(){
        isDarkNode = !isDarkNode
    }
}

fun checkTheme(){
    if (AppSettings.isDarkNode){
        println("Темная тема включенна")
    }
}