class Studentx(var name: String) {

    var grade: Double = 0.0
        set(value) {
            if (value in 0.0..100.0) {
                field = value
                println("Grade updated successfully to $value")
            } else {
                println("Invalid grade! Must be between 0 and 100. Grade not updated.")
            }
        }

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


