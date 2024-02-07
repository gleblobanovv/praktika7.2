import kotlin.math.sqrt
fun main(){
    var k = readLine()!!.toInt()
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()

    val discriminant = a * a - 4 * b

    if (discriminant>=0) {
        var x1 = (-a + sqrt(discriminant.toDouble())) / 2
        var x2 = (-a - sqrt(discriminant.toDouble())) / 2

        if ((x1 >= -k && x1 <=k) || (x2 >= -k && x2 <= k)) {
            println("Вещественные корни уравнения находятся в интервале (-$k,$k)")
        } else {
            println("Вещественные корни уравнения не находятся в интервале (-$k,$k)")
        }
    }else{
        println("У уравнения нет вещественных корней")
    }
}