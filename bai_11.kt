//Nhập chuỗi đếm nguyên âm phụ âm
fun main(args: Array<String>) {
    print("Mời nhập chuỗi: ")
    var chuoi= readln()!!.toString().lowercase()
    var sum1 =0
    var sum2 =0
    for(char in chuoi){
        when(char){
            'a', 'e', 'i', 'o', 'u'->sum1+=1
            else -> sum2++
        }
    }
    print("\n số nguyên âm : $sum1")
    print("\n số phụ âm : $sum2")
}