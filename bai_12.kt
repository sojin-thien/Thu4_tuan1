/*
Viết chương trình nhập số tiền rút (bội số của 10k)
Chia ra số lượng tờ tiền cần trả gồm: 500k, 200k, 100k, 50k, 20k, 10k*/
fun main() {
    print("Mời nhập vào số tiền (bội số của 10,000): ")
    var money = readln()!!.toInt()

    if (money % 10 != 0) {
        println("Vui lòng nhập số tiền là bội số của 10,000.")
        return
    }
    val m500 = money / 500
    money %= 500
    val m200 = money / 200
    money %= 200
    val m100 = money / 100
    money %= 100
    val m50 = money / 50
    money %= 50
    val m20 = money / 20
    money %= 20
    val m10 = money / 10
    money %= 10
    println("Số lượng tờ cần trả:")
    println("500k: $m500 tờ")
    println("200k: $m200 tờ")
    println("100k: $m100 tờ")
    println("50k: $m50 tờ")
    println("20k: $m20 tờ")
    println("10k: $m10 tờ")
}
