fun main(){
    println("Введите высоту")
    val h=readLine().toString().toInt()
    println("Введите ребро")
    val a=readLine().toString().toInt()
    val s=(a*h)/2
    val v=(s*h)/3
    println("Площадь равна:$s")
    println("Объем равен:$v")
}
