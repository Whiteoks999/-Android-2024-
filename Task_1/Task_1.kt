fun main() {
    var array = IntArray(100)
	for (i in 0..array.size-1) {
    	array[i] = i+1
	}
    array[20]=array[44]

    for (i in 0..array.size-1) {
    	println(array[i])
	}
    println("Repeating element:"+findRepeat(array))

}
fun findRepeat(array:IntArray):Int{
    array.sort()
    var a:Int = 0
    for(i in 0..array.size-1){
        if(array[i]==array[i+1]){
            a = array[i]
            break
        }  
    }
    return a
}
