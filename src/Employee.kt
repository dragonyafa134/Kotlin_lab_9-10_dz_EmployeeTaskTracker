class Employee(
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
) {
    private var fullname: String = fullName
    private var Position: String = position
    private var Salary: Int = salary
    private var YearsOfExperience: Int = yearsOfExperience
//публичный геттер
    val fullName: String
        get() = fullname

    val position: String
        get() = Position

    val salary: Int
        get() = Salary

    val yearsOfExperience: Int
        get() = YearsOfExperience

    fun setSalary(newSalary: Int) {
        if (newSalary < 0) {
            println("Предупреждение: Зарплата не может быть отрицательной")
            Salary = 0
        } else {
            Salary = newSalary
        }
    }

    fun setYearsOfExperience(newYears: Int) {
        if (newYears > 50) {
            println("Предупреждение: Опыт работы не может превышать 50 лет. Устанавливаем 50.")
            YearsOfExperience = 50
        } else {
            YearsOfExperience = newYears
        }
    }
}

fun main() {
    val employee = Employee("Афанасьева Дарья", "Ученик", 500, 2)

    println("ФИО: ${employee.fullName}")
    println("Должность: ${employee.position}")
    println("Зарплата: ${employee.salary}")
    println("Опыт работы: ${employee.yearsOfExperience}")
}