package com.example.covid19.utils

sealed class DataState<T>(val datasucss: T?=null, val error: Any? =null) {
    class Loading<T>:DataState<T>();
    class success<T>(val data:T):DataState<T>(datasucss = data);
     class  Error<T>(val exception: T):DataState<T>(error = exception);

}