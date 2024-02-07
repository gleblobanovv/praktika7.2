fun main(){
    var num1= readLine()!!.toInt()
    var num2= readLine()!!.toInt()

    if (num1%2 ==0 && num2%2==0){
        println("Оба числа четные")
    }else if (num1%2 !=0 && num2%2 !=0){
        println("Оба числа нечетные")
    }else{
        println("Одно число четное, а другое нет")
    }
}
