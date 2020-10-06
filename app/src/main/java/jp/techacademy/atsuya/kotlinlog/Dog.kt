package jp.techacademy.atsuya.kotlinlog

import android.util.Log

val TAG: String = "kotlintest"

class Dog(var name: String, var age: Int) {
    constructor(name: String) : this(name,0){
    }
    // メソッド
    fun say() {
        Log.d(TAG, name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}