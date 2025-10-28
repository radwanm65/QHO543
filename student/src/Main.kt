fun main() {
    val student1 = Student("Alice", 95.0)
    val student2 = Student("Bob", 82.0)
    val student3 = Student("Charlie", 68.5)
    val student4 = Student("Dana", 54.0)

    student1.displayInfo()
    println()
    student2.displayInfo()
    println()
    student3.displayInfo()
    println()
    student4.displayInfo()


        val studentx2 = Studentx("Alice")

        studentx2.grade = 85.0   // ✅ Valid — will update
        studentx2.displayInfo()

        studentx2.grade = 105.0  // ❌ Invalid — will not update
        studentx2.displayInfo()
    }
