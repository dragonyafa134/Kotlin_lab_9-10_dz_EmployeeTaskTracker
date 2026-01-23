//interface ReportGenerator{
//    abstract fun generateReport(): String
//}
//
//class Employee(val name: String, val position : String){
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