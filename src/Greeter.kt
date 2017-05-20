class Greeter(val name: String) {

    val greeting: String by lazy {
        "Hello, $name! 🌍"
    }

}
