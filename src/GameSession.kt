object GameSession {
    init {
        println("Игровая сессия создана")
    }
    var isActive: Boolean = false
    fun start(){
        isActive = true
        println("Игра началась")
    }
    fun end(){
        isActive = false
        println("Игра завершена")
    }
}

fun main(){
    println("Программа запущена")
    println("Проверяем состояния но не трогаем gamesession")
    println("Теперь запускаем игру")
    GameSession.start()
    println("Проверяем состояние еще раз")
    println("Активная ли сесия ${GameSession.isActive}")
}