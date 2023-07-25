fun main() {
    println("Please enter your age: ")
    val age = readLine()?.toInt()

    if(age != null) {
        if(age >= 0 && age < 18) {
            println("You're not an adult yet")
        } else if(age >= 18 && age <= 65) {
            println("You are an adult")
        } else {
            println("You are really really old")
        }
    }
}