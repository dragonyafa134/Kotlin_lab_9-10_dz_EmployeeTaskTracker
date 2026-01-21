import kotlin.toString

enum class Pri {
    LOW,
    MEDIUM,
    HIGH
}

data class Task( val title: String,
                 val description: String,
                 val priority: Pri,
                 val isCompleted: Boolean = false  ){
    override fun toString(): String {
        return  "Ваше названия $title  Описания $description Приоритет задачи $priority Метод string()"
    }

//    override fun equals(other: Any?): String {
//       if ( title == "Лабораторная работа 9-10 по котлину"){return title}
//
//    }

    override fun hashCode(): Int {
        var result = isCompleted.hashCode()
        return result
    }


}

fun main(){
    val task1 = Task("Лабораторная работа 9-10 по котлину", "Мы будеи изучать много интересного ", Pri.LOW)
    val task2 = Task("Лабораторная работа 9-10 по котлину", "Мы будеи изучать много интересного ", Pri.LOW)
    val task3 = Task("Лабораторная работа 9-10 по котлину", "Мы будеи изучать много интересного ", Pri.HIGH)

    println(task3.toString())
    println(task3.hashCode())

}