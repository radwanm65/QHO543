class Student(var name: String, var grade: Double) {

    fun classifyGrade(): String {
        return when {
            grade >= 90 -> "A"
            grade >= 80 -> "B"
            grade >= 70 -> "C"
            grade >= 60 -> "D"
            else -> "Fail"
        }
    }

    fun displayInfo() {
        println("Student Name: $name")
        println("Grade: $grade")
        println("Classification: ${classifyGrade()}")
    }
}