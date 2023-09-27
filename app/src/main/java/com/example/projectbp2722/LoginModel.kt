package com.example.projectbp2722

class LoginModel {
    //variable
    var username = " "
    var password = " "
    //method/func
    fun loginCek():Boolean{
        if(username.equals("daffa")&&password.equals("admin")){
            return true
        }else{
            return false
        }
    }
}