package org.basic_study

var teks: String = "ini kelas pemrograman mobile"

fun stringToElemen(teks: String): List<String>{
    var teksList = teks.split(" ")
    return teksList
}

fun main(){
    print(stringToElemen(teks))
}