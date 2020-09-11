object proInfo{

    var proName:String = ""
    var proPrice :Int = 0
    var proQuality :String = " "

    fun products (name:String , price :Int , quality:String){
        proName = name
        proPrice = price
        proQuality = quality

        println("The productName is $proName ")
        println("The productPrice is $proPrice ")
        println("The productQuality is $proQuality ")
    }
}

fun main (){
    proInfo.products("SAMSUNG" , 20000,"high")
}