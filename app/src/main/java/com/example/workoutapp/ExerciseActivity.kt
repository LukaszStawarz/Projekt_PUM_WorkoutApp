package com.example.workoutapp
import android.content.Intent
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle
import com.example.workoutapp.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {

    private var binding: ActivityExerciseBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnUpperBody?.setOnClickListener {
            val intent = Intent(this,UpperBodyActivity::class.java)
            startActivity(intent)
        }
        binding?.btnLowerBody?.setOnClickListener {
            val intent = Intent(this,LowerBodyActivity::class.java)
            startActivity(intent)
        }
        binding?.btnCoreBody?.setOnClickListener {
            val intent = Intent(this,CoreBodyActivity::class.java)
            startActivity(intent)
        }
        binding?.btnCardio?.setOnClickListener {
            val intent = Intent(this,CardioActivity::class.java)
            startActivity(intent)
        }


    }
}