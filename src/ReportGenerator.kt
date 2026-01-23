//interface ReportGenerator{
//    abstract fun generateReport(): String
//}
//
//class Employee(val name: String, val position : String, var currentTask: Task? = null){
//    fun assignTask(newTask: Task) {
//        if (currentTask != null && currentTask.isCompleted) {
//            println("Сотрудник уже занят задачей \"${currentTask!!.name}\"")
//        } else {
//            currentTask = newTask
//            println("Задача \"${newTask.name}\" назначена сотруднику $name")
//        }
//    }

//    fun generateReport(): String {
//        return """
//            Информация о сотруднике:
//            ФИО: $name
//            Позиция: $position
//        """
//    }
//}
//
//class  DevelopmentDepartment(val otdel: String, val drem: String) : ReportGenerator{
//    override fun generateReport(): String {
//        return "Информация о отделе: $otdel\nЦели: $drem"
//    }
//}
//
//fun main(){
//    val r: List<Any> = listOf( Employee("Иванов Иван Иванович", "Разработчик Kotlin"), DevelopmentDepartment("Разработка", "Писать чистый код") )
//
//    for (i in r) {
//        println(i.generateReport)
//        println("-----")
//    }
//}







