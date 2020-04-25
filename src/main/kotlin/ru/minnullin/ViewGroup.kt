package ru.minnullin

class ViewGroup constructor(
    var storedView:View
){
    fun addView(value:View){
        storedView=value
    }
}