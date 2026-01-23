abstract class Department (
    val departmentName : String,
){
    abstract fun printDepartmentGoal()

}

class DevelopmentDepartment : Department("Разрабокта"){
    override fun printDepartmentGoal() {
        println("Писать чистый код")
    }
}


class TestingDepartment : Department("Тестирование"){
    override fun printDepartmentGoal() {
        println("Находить все баги")
    }
}

fun main(){
    val d = DevelopmentDepartment()
    val t = TestingDepartment()

    d.printDepartmentGoal()
    t.printDepartmentGoal()
}