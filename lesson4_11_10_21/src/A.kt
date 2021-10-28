//class A(private val a1:Int, private val a2:Int) : BaseA(a1,a2)
//open class BaseA(val a1p:Int, val a2p:Int)

class Person1(
    val name : String,
    val secondName : String,
    val age : Int
){
    fun  print(){
        println("name = $name, \n secondName = $secondName,\n age = $age")
    }
}

