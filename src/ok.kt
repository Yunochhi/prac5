
//Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
// Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
// Минимум, максимум и шаг указываются пользователем (считываются с клавиатуры).
fun main()
{
    println("Введите начальное значение: ")
    val min: Int = readLine().toString().toInt()
    println("Введите конечное значение: ")
    val max: Int = readLine().toString().toInt()
    println("Введите шаг: ")
    val shag: Int = readLine().toString().toInt()

    for (i in min..max step shag)
    {
        println(i)
    }
}