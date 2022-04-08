fun main(){
     rangeNumbers()
    var x = checkElementName(arrayOf("Beatrice", "Lucky", "Luca", "Anastasia", "Faith"))
    println(x)
    robotWork(67)
    matchingMultiplesOutput()
}

fun rangeNumbers() {
    for (num in 1..100) {
        if (num % 2 != 0) {
            println(num)
        }
    }
}

fun  checkElementName(names:Array<String>): Int{

    var x= 0
    for (name in names){
        if (name.length > 5) {
            x++
        }
    }

       return x
}

fun robotWork(ages:Int){
    if (ages < 6){
        println("Serve a glass of milk")
    }
    else if (ages >= 6 && ages <= 15){
        println("Serve a bottle of fanta Orange")
    }
    else{
        println("Serve a bottle of coca cola")
    }

}

fun  matchingMultiplesOutput(){
    for (num in 1..100){
        if (num % 3 ==0 && num %5 == 0){
            println("FizzBuzz")
        }
        else if (num % 3 == 0){
            println("Fizz")
        }
         else if (num  % 5== 0){
            println("Buzz")
        }
        else{
            println(num)
        }

    }

}

