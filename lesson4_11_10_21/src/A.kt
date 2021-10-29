//class A(private val a1:Int, private val a2:Int) : BaseA(a1,a2)
//open class BaseA(val a1p:Int, val a2p:Int)

 open class Person1(
    val name : String,
    val secondName : String,
    val age : Int
){
    constructor(name: String, secondName: String, age: Int, company:String)
            : this(name, secondName, age){
    }
    open fun  print(){
        println("name = $name, \n secondName = $secondName,\n age = $age")
    }


     class Employe(
         val nameE : String,
         val secondNameE : String,
         val ageE : Int
     ): Person1(nameE, secondNameE, ageE ){

         override fun print(){
             println("name = $name \nsecondName = $secondName \nage = $age")
         }
     }

}

