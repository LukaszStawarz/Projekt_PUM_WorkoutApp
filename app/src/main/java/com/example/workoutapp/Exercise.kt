package com.example.workoutapp

class Exercise(
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var reps: String){

    fun getId():Int{
        return id
    }

    fun setId(id: Int){
        this.id = id
    }

    fun getName():String{
        return name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getImage():Int{
        return image
    }

    fun setReps(reps: String){
        this.reps = reps
    }

    fun getReps():String{
        return reps
    }
}