fun main() {
    var array = arrayOf("a","f","s","v","a","v","k","a","z","s")
    array.sort()
    var quantity = 1
    for(i in 0..array.size-1){

        if(i!=array.size-1&&array[i].equals(array[i+1])){
            quantity++
        }else{
            println("element: "+array[i]+", quantity: "+quantity)
            quantity=1
        }
    }
}
