fun main(){
    for(i in 1..5) print("$i ")
    for(i in 1..5 step 2) print("$i ")
    for(i in 5 downTo 1) print("$i ")

    println()

    var x = 0
    while(x < 3){
        println("while: $x")
        x++
    }

    var y = 0
    do{
        println("do-while: $y")
        y++
    }while(y<3)
}