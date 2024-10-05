fun main() {
    // Читаем ввод: два числа и оператор
    println("Введите число1 операция число2 :")
    val input = readLine() ?: return
    val parts = input.split(' ')

    // Проверка ввода
    if (parts.size != 3) {
        println("Ты ошибся. Используйте формат: число1 операция число2")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val operation = parts[1][0]
    val num2 = parts[2].toDoubleOrNull()

    // Проверка корректности чисел
    if (num1 == null || num2 == null) {
        println("Ошибка: одно из чисел введено неверно.")
        return
    }

    val result: Double? // Переменная для хранения результата

    // Обработка операции с помощью when
    result = when (operation) {
        '+' -> num1 + num2 // Сложение
        '-' -> num1 - num2 // Вычитание
        '*' -> num1 * num2 // Умножение
        '/' -> {
            // Проверка деления на ноль
            if (num2 != 0.0) {
                num1 / num2 // Деление
            } else {
                println("Ошибка: деление на ноль!")
                return
            }
        }
        else -> {
            println("Ошибка: неверная операция")
            return
        }
    }

    // Вывод результата
    println(result)
}