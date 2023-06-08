package ua.sherlock.gb.popularLibraries

class CountersModel {

    val counters = mutableListOf(0,0,0)
    fun getCurrentIndex(index: Int) : Int {
        return counters[index]
    }

    fun next(index: Int): Int {
        counters[index]++
        return getCurrentIndex(index)
    }

    fun set(index: Int, value: Int){
        counters[index] = value
    }
}