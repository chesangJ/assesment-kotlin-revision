fun main() {
    var result= firstchar("Angelaa","Roy")
    println(result)
    var result2=digits (arrayOf(10,20,30,40,50,60))
    println(result2.contentToString())
    word("Nasra")
    var names=people (arrayOf("Anne","Chris","Rotich"))
    println(names)
    var result4=Calculator()
    result4.addition(50,25)
    result4.subtraction(24,56)
    result4.accurateDivision(10,20.0)
    result4.multiplication(2,2)
    var z=trial(arrayOf("Joy","linda","anna","John"))
println(z)
    println(arrayStats(arrayOf(2,4,6,8,10)))



}
fun firstchar(string1:String,string2:String):Char{
    if (string1.length>string2.length){
       return string1[0]
}
    else if (string2.length>string1.length){
        return string2[0]

}
    else{
        return string1[0]
    }

}
fun digits(x:Array<Int>):Array<Any>{
    return arrayOf(x.max(),x.min(),x.average())
}
fun word(x:String){
    println(x.split(""))

}
fun trial(z:Array<String>){

}
fun people(name:Array<String>):String{
    return name.joinToString()
}
open class Calculator(){
    fun addition(num1:Int,num2:Int):Int{
        return(num1+num2)
    }
    fun subtraction(num1:Int,num2:Int):Int{
        return (num1-num2)
    }
    fun accurateDivision(num1:Int,num2:Double):Double{
        return(num1/num2)
    }
    fun multiplication(num1:Int,num2:Int):Int{
        return(num1*num2)
    }
}
data class Stats(var min:Int,var max:Int,var avg:Double)
fun arrayStats(numbers:Array<Int>):Stats{
    val min =numbers.min()
    val max=numbers.max()
    val avg=numbers.average()

    val stats =Stats(min,max,avg)
    return stats

    class ScientificCalculator(val gravity:Double):Calculator(){
        fun weight(mass:Double):Double{
            return gravity*mass
        }
    }



}

