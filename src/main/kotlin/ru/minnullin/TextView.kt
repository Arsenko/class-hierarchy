package ru.minnullin

open class TextView(text:String) : View(){
    var text:String=text
    get
    set(value){
        if(value!=""){
            field=value
        }
    }
}