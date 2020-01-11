// the main function
fun main() {
    // creating an instance of the user class
    val user = User()

    //getting and storing the user data
    println("Enter full name")
    user.name = readLine().toString()

    println("Enter age")
    user.age = readLine().toString().toInt()

    println("Enter sex (male or female)")
    user.sex = readLine().toString()

    println("Enter email address")
    user.email = readLine().toString()

    // displaying the user data
    println("Welcome, ${user.name}. You're a ${user.age} year old ${user.sex} and you signed in with ${user.email}")
}

// creating the user class
class User() {

    // creating members of the class
    var name: String = ""
    var age: Int = 0
    var email: String = ""
    var sex: String = ""
}
