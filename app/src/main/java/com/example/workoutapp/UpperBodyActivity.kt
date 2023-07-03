package com.example.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.workoutapp.databinding.ActivityExerciseBinding
import com.example.workoutapp.databinding.ActivityUpperBodyBinding
import org.w3c.dom.Text

class UpperBodyActivity : AppCompatActivity() {
    private var binding : ActivityUpperBodyBinding? = null
    private var breakTimer: CountDownTimer? = null
    private var breakProgress = 0

    private var exerciseTimer: CountDownTimer? = null
    private var exerciseProgress = 0

    private var upperExerciseList: ArrayList<Exercise>?=null
    private var currentExercisePosition = -1

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityUpperBodyBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        upperExerciseList = Constants.upperExerciseList()


        setupBreakView()
    }

    private fun setupBreakView(){

        binding?.rlTimer?.visibility = View.VISIBLE
        binding?.tvStartExercise?.visibility= View.VISIBLE
        binding?.tvExerciseName?.visibility = View.INVISIBLE
        binding?.tvReps?.visibility= View.INVISIBLE
        binding?.rlTimerExercise?.visibility = View.INVISIBLE
        binding?.ivImage?.visibility = View.INVISIBLE
        binding?.tvUpcomingLabel?.visibility = View.VISIBLE
        binding?.tvUpCommingExerciseName?.visibility = View.VISIBLE


        if(breakTimer !=null){
            breakTimer?.cancel()
            breakProgress = 0
        }

        binding?.tvUpCommingExerciseName?.text = upperExerciseList!![currentExercisePosition+1].getName()

        setBreakTimer()
    }

    private fun setupExerciseView(){
        binding?.rlTimer?.visibility = View.INVISIBLE
        binding?.tvStartExercise?.visibility= View.INVISIBLE
        binding?.tvExerciseName?.visibility = View.VISIBLE
        binding?.tvReps?.visibility= View.VISIBLE
        binding?.rlTimerExercise?.visibility = View.VISIBLE
        binding?.ivImage?.visibility = View.VISIBLE
        binding?.tvUpcomingLabel?.visibility = View.INVISIBLE
        binding?.tvUpCommingExerciseName?.visibility = View.INVISIBLE
        if(exerciseTimer !=null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }

        binding?.ivImage?.setImageResource(upperExerciseList!![currentExercisePosition].getImage())
        binding?.tvExerciseName?.text = upperExerciseList!![currentExercisePosition].getName()
        binding?.tvReps?.text = upperExerciseList!![currentExercisePosition].getReps()

        setExerciseTimer()
    }


    private fun setBreakTimer(){
        breakTimer = object : CountDownTimer(5000, 1000){
            override fun onTick(p0: Long){
                breakProgress++
                binding?.tvTimer?.text = (6 - breakProgress).toString()
            }
            override fun onFinish() {
                currentExercisePosition++
                setupExerciseView()
            }
        }.start()
    }
    private fun setExerciseTimer(){
        exerciseTimer = object : CountDownTimer(60000, 1000){
            override fun onTick(p0: Long){
                exerciseProgress++
                binding?.tvTimerExercise?.text = (61 - exerciseProgress).toString()
            }
            override fun onFinish() {
                if(currentExercisePosition <upperExerciseList?.size!! - 1){
                    setupBreakView()
                }else{
                    finish()
                    val intent = Intent(this@UpperBodyActivity,FinishActivity::class.java)
                    startActivity(intent)
                }
            }
        }.start()
    }


    override fun onDestroy() {
        super.onDestroy()

        if(breakTimer !=null){
            breakTimer?.cancel()
            breakProgress = 0
        }
        if(exerciseTimer !=null){
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }
        binding = null
    }

}