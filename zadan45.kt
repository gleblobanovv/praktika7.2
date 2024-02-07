fun main(){
    var n1= readLine()!!.toDouble()
    var n2= readLine()!!.toDouble()
    var n3= readLine()!!.toDouble()

    when{
        (n1<5 && n2<5 && n3<5)-> println("Все товары хорошие")
        (n1>5 && n2>5 && n3>5)-> println("Все товары плохие")
        (n1<5 && n2>5 && n3>5)-> println("Товар 1 хороший, остальные плохие")
        (n1>5 && n2<5 && n3>5)-> println("Только товар 2 хороший")
        (n1>5 && n2>5 && n3<5)-> println("Только 3 товар хороший")
    }
}