class Cat {

    val name: String
    var age: Int
    var weight: Int

    constructor(name: String, age: Int, weight: Int) {
        this.name = name
        this.age = age
        this.weight = weight
    }

    fun walk() {
        weight--
    }

    override fun toString() : String {
        return "Name: $name Age: $age"
    }
}
