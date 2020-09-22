package demo1

import kotlin.math.max

fun largeNumber(num1:Int, num2:Int):Int{
    return max(num1,num2)
}

fun largeNumberOfThree(num1: Int,num2: Int,num3:Int):Int{
    var value1 = if (num1>num2){
        num1
    }else{
        num2
    }

    var value2 = if (num2>num3){
        num2
    }else{
        num3
    }
    return max(value1,value2)
}

fun main(){
    var a = 10
    var b = 20
    var d = 15
    var c = largeNumber(a,b)
    var e = largeNumberOfThree(a,b,d)
//    println(c)
    println(e)
}