class car(name:String,ownname:String,pric:Double,kmdriv:Double) {
    var car_name: String = ""
    var owner_name: String = ""
    var price: Double = 0.0
    var km_driven:Double=0.0
    init{
        car_name = name
        owner_name = ownname
        price=pric
        km_driven=kmdriv
        println("Car Name: ${car_name} ")
        println("Owner :${owner_name}")
        println("price :${price}")
        println(" kilometer :${km_driven}")

    }
    fun getcarprice()
    {
        println("$" + (price-km_driven).toString())
    }
}
fun main(args: Array<String>){
    val myclass = car ("verna","Krish",123656.32,5698.2 )
    myclass.getcarprice()
}