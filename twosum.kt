fun twosum(arr: Array<Int>, target: Int) : Array<Int?>{
    val map: HashMap<Int,Int> = HashMap<Int,Int>()
    for(i in 0..arr.size-1){
        val num = target - i
        if(map.contains(num)){
            return arrayOf(map.get(num), i)
        } else {
            map.put(arr[i], i)
        }
    }
    return arrayOf(0,0)
}

fun main(){
    val nums = arrayOf(2,7,11,15)
    val target = 9
    println(twosum(nums, target))
}
