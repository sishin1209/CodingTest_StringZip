package com.sishin.pe.codingtest_stringzip

import android.text.TextUtils

//aaabbb
fun main() {
    var a = "abcabcbaccc";
    println(a)

    subStringZip(1,a);
}

fun stringZip(str: String): Int {
    var result = str.length;
    for (i in 0 until str.length) {
        println(i);
    }
    return result
}

//// zipPos 압축 단위
//// str 주어진 문자
fun subStringZip(zipPos: Int, str:String):String {
    var result: String = str;
    var tempStr:String = "";
    var strArray: MutableList<String> = arrayListOf();
    for(i in 0 until str.length){
        try{
            tempStr = str.substring(i,i+zipPos)
        }catch (e:StringIndexOutOfBoundsException){
            tempStr = str.substring(i,str.length)
        }

        strArray.add(tempStr);
    }
    isSameCheck(strArray)
    return result;
}

fun isSameCheck(strArray:MutableList<String>):String{
    var resultStr = "";
    var count = 1;
    for (i in 1 until strArray.size){

    }
    println(resultStr);
    return resultStr;
}

fun isSameStr(oldStr: String, newStr: String): Boolean {
    return oldStr.equals(newStr);
}