package demo1

fun main(){
    yzThree()
}

fun yzThree(){
    for(i in 900 until 1000 step 1){
        var num = i
        var ge = num%10
        var shi = num/10%10
        var bai = num/100%10
        if ((ge+shi+bai)%3==0)
            println(num)
        else{
            continue
        }
    }
}