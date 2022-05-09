package com.example.covid19.utils

class Resources<out T>(val status:Status?,val data:T?,val message:String?) {
    companion object{
        fun<T>success(data:T?): Resources<T> {return Resources(Status.SUCCESS,data,null)}
        fun<T>error(msg: String, data:T?): Resources<T> {return Resources(Status.ERROR,data,message =msg )}
        fun<T>loading(data:T?): Resources<T> {return Resources(Status.LOADING,data,null)}

    }
}