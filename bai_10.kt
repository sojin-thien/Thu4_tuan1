//ktra số đối xứng
fun main(args: Array<String>) {
    print("Nhập n : ")
    var n=readln()!!.toInt().toString()
    if(n==n.reversed()){
        print("\n là số chính phương")
    }else{
        print("\n không là số chính phương")
    }
}