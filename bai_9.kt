//Nhập n sau đó in ra tam giác số
fun main(args: Array<String>) {
    print("Nhập n : ")
    var n = readln()!!.toInt()
    for(i in 1..n){
        for(j in 1..i){
            print("$j")
        }
        print("\n")
    }
}