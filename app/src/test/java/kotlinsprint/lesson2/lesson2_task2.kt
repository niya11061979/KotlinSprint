package kotlinsprint.lesson2

fun main() {
    val countEmployees = 50
    val countIntern = 30
    val salaryOfEmployees = 30000
    val salaryOfIntern = 20000
    val payEmployees = countEmployees * salaryOfEmployees
    val payIntern = countIntern * salaryOfIntern
    val totalSalary = payEmployees + payIntern
    val averageSalary = totalSalary / (countIntern + countEmployees)
    println("Расходы на выплату зарплаты постоянных сотрудников: $payEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")

}