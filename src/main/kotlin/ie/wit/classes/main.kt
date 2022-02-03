package ie.wit.classes

private val employees = ArrayList<Employee>()

fun main(args: Array<String>) {
    employees.add(Employee("Mark", "Roche"))
    employees.add(Employee("John", "Walsh"))
    employees.add(Employee("Sheila", "Flynn"))
    for ((index, value) in employees.withIndex())
        println("$index: $value")

    employees
        .filter {it.firstName.contains("John")}
        .forEach { println(it) }

    employees
        .sortedBy { it.lastName}
        .forEach { println(it) }

    employees
        .sortedBy { it.lastName}
        .forEach { println(it) }

    employees
        .sortedBy { it.lastName}
        .forEach { println("Employee: ${it.firstName}, ${it.lastName.toUpperCase()}")}
}

fun employeeInfo(){
    val employee1 = Employee("Mark", "Roche")
    val employee2 = employee1.copy(firstName = "Clare")
    val employee3 = employee1.copy()

    println(employee1)
    println(employee2.toString())

    println("employee1 hashcode = ${employee1.hashCode()}")
    println("employee2 hashcode = ${employee2.hashCode()}")
    println("employee3 hashcode = ${employee3.hashCode()}")

    if (employee1.equals(employee2))
        println("employee1 is equal to employee2.")
    else
        println("employee1 is not equal to Employee2.")

    if (employee1.equals(employee3))
        println("employee1 is equal to employee3.")
    else
        println("employee1 is not equal to employee3.")
}