package com.karamathaproperties.myapplication.data

import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.karamathaproperties.myapplication.models.User
import com.karamathaproperties.myapplication.navigation.ROUTE_HOME
import com.karamathaproperties.myapplication.navigation.ROUTE_LOGIN
import com.karamathaproperties.myapplication.navigation.ROUTE_REGISTER

class AuthViewModel (var navController:NavHostController, var context:Context){
    var mAuth:FirebaseAuth

    init {
        mAuth= FirebaseAuth.getInstance()
    }

    fun signup(username: String, email: String, pass: String, confpass: String){

        if (username.isBlank() || email.isBlank() || pass.isBlank() || confpass.isBlank()){
            Toast.makeText(context,"Please Fill In All Details",Toast.LENGTH_LONG).show()
        }else if (pass != confpass){
            Toast.makeText(context, "Password Do Not Match",Toast.LENGTH_LONG).show()
        }else {
            mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    val userdata = User(username, email, pass, confpass, mAuth.currentUser!!.uid)
                    val regRef = FirebaseDatabase.getInstance().getReference()
                        .child("Users/" + mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {
                        if (it.isSuccessful) {
                            Toast.makeText(context, "User Created SuccessFully",Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_HOME)
                        } else {
                            Toast.makeText(context, "${it.exception!!.message}", Toast.LENGTH_LONG)
                                .show()
                            navController.navigate(ROUTE_REGISTER)
                        }
                    }
                } else{
                    navController.navigate(ROUTE_REGISTER)
                }
            }
        }

    }
    fun login(email: String,pass:String){
        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
            if (it.isSuccessful){
                Toast.makeText(context, "Welcome Back", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_HOME)
            }else{
                Toast.makeText(context, "${it.exception!!.message}",Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }
    }
    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUTE_LOGIN)
    }
    fun isLoggedIn():Boolean{
        return mAuth.currentUser !=null
    }

}