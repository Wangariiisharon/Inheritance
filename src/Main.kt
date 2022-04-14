fun main() {
    var gari = Car("merceddees","personal","pink",14)
    gari.carry(20)
    gari.identity("merceddees","lamborghini","pink")
    println( gari.calculateParkingFees(15))
    var bus =Car.Bus("lambo","audi","blue",25)
    println(bus.maxTripFare(15.2543))
    println(bus.calculateParkingFees(20))
}
open class Car(var make:String, var model:String, var color:String, var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("I am carrying $people passangers")
        } else {
            println("over capacity by $x people")
        }
    }
    fun identity( make:String,model:String, color:String){
      println("I am a $color $model $make")
    }
open fun calculateParkingFees(hours: Int):Int{
    var fees = hours*20
    return fees
}
class Bus( make:String, model:String, color:String, capacity:Int): Car(make,model,color,capacity){
fun maxTripFare(fare: Double):Double{
    var maxfare = fare*capacity
    return maxfare
}
   override fun calculateParkingFees (hours: Int): Int {
 var fees =hours*capacity
       return fees
   }
}

}
