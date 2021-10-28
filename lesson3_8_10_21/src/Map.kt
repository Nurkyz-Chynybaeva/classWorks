class Map {
}
fun main(){
    val map = mapOf(
        Pair(1 , "1"),
          1 to 2,
        "2" to 3,
        Pair(3 , "1"),
        null to "xxx"
    )
    println(map["2"])
    print(map.entries)

//    map.forEach{ (key, value) ->
//        println("key = $key value = $value")
//
//    }
}