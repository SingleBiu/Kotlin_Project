package demo1

fun main(){
    var v = getDaysPlus(2000,2)
    println(v)
}

fun getDaysOfMonth(month:Int):Int{
    when(month){
        1,3,5,7,8,10,12->return 31
        2->return 28
        4,6,9,11->return 30
        else ->return -1
    }
}

fun getDaysPlus(year:Int,month: Int):Int{
    if ((year%4==0 && year%100!=0) || year%400==0){
        when(month){
            2->return 29
            else->return getDaysOfMonth(month)
        }
    }else{
        return getDaysOfMonth(month)
    }
}