fun main(){
    var a1 = 10

    // 기본 if 문
    if(a1 == 10){
        println("a1은 10입니다.")
    }

    // 기본 if 문
    if(a1 != 10) {
        println("a1은 10입니다.")
    }

    if(a1 == 10){
        println("a1은 10입니다")
    }else{
        println("a1은 10이 아닙니다.")
    }

    if(a1 == 20) {
        println("a1은 20입니다")
    }else{
        println("a1은 20이 아닙니다.")
    }

    if(a1 == 20) {
        println("a1은 20입니다")
    }else if(a1 == 5){
        println("a1은 5이 입니다.")
    }else{
        println("a1은 20, 5가 아닙니다.")
    }

    // 모든 조건을 만족해야하는 경우
    val a2 = 10
    val a3 = 20

    // 모든 조건을 만족해야 하는 경우
    if(a2 == 10 && a3 == 20){
        println("a2는 10이고 a3는 20입니다.")
    }

    // 모든 조건을 만족해야 하는 경우
    if(a2 == 20 || a3 == 20){
        println("a2는 20이거나 a3는 20입니다.")
    }

    println("==============================")

    var a4 = ""
    var a5 = 10

    if(a5==10){
        a4 = "10입니다."
    } else {
        a4 = "10이 아닙니다."
    }

    println("a4 : $a4")

    val a6 = if (a5 ==10) "10입니다" else "10이 아닙니다."

    println("a6 : $a6")

//    val a7 = if(a5==10){
//        "10입니다"
//    }else{
//        "10이 아닙니다."
//    }

    var a7 = ""
    if(a5 == 10){
        var a8 = ""
        a8 += "안녕하세요"
        a7 = a8;
    } else{
        var a8 = ""
        a8 += "감사합니다"
        a8 += "고맙습니다"
        a7 = a8
    }
    print("a7 : $a7")

    val a9 = if(a5 == 10){
        var a8 = ""
        a8 += "안녕하세요"
        a8 += "반갑습니다"
        a7 = a8;
    } else{
        var a8 = ""
        a8 += "감사합니다"
        a8 += "고맙습니다"
        a7 = a8
    }
}