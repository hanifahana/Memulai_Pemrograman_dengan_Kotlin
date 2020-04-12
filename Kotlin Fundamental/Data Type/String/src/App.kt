// main function
fun main() {
    // val tidak bisa diubah nilainya. Kalau dipaksa ada
    // kompilation error: Val cannot be reassigned
    // var bisa diubah nilainya, jadi untuk loop bisa pake var
    val text  = "Kotlin"
    val firstChar = text[0]

    print("First character of $text is $firstChar")
}