//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun timesTwo(it: Int) = it * 2 // Regular Function Definition

val timesThree = { it: Int -> it * 3 } //Lambda Function
val timesFour = (fun(it: Int) = it * 4) //Anonymous Function

fun perform(operation: (Int) -> Int): Int {
    return operation(5)
}

data class Employee(val name: String, val email: String, var salary: Double)

fun main() {
    val result1 = perform { it * 3 }
    println(result1)


    val result2 = perform(fun(it: Int) = it * 4)
    println(result2)

    // create a function reference to timesTwo and store it in the variable twice

    val twice = ::timesTwo
    val result4 = perform(::timesTwo)
    println(result4)

    val peopleList = listOf("Salem Serif", "Marwan Radwan", "Edita Gashi", "Piotr Bednorz", "Chathurika")
    peopleList.forEach { person -> println(person) }


    val cubeLambda: (Int) -> Int = { i -> i * i * i }
    println(cubeLambda(3))

    val numList = listOf(111, 222, 333, 555, 666, 444, 888, 777)

    // Using .filter and .foreach to loop through a list

    numList.filter { it < 500 }
        .forEach { println(it) }    // Output: 111, 222, 333, 444

// Using class objects as list members within Lists

    val employeeList: List<Employee> = listOf(
        Employee("Chathurika", "chathurika@unifiedwidgets.example.com", 38000.0),
        Employee("Piotr", "piotr@unifiedwidgets.example.com", 42000.0),
        Employee("Marwan Radwan", "radwanm@unifiedwidgets.example.com", 45000.0)

    )        // Extract and print all employee emails

    // Using .map and .foreach to loop through a list

    employeeList.map { it.email }
        .forEach { println(it) }


}