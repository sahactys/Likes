fun main() {
    while (true) {
        var likes: Int
        println("Введите количество лайков")
        while (true) {
            try {
                likes = (readLine()?.toInt() ?: return)
                if (likes < 0) error(0)
                break
            } catch (e: Exception) {
                println("Ошибка ввода, попробуйте еще раз")
            }
        }
        when {
            (likes == 1 || (likes % 10 == 1 && likes % 100 != 11)) -> println("Понравилось $likes человеку")
            else -> println("Понравилось $likes людям")
        }
    }
}