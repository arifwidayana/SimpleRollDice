package com.arifwidayana.rolldice

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arifwidayana.rolldice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val MAX = 6
        private const val TAG = "MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pickDice()
        logging()
    }

    private fun logging() {
        Log.d(TAG,"You Getting Me!")
    }

    private fun pickDice() {
        binding.btnRoll.setOnClickListener{
            rollDice()
            Toast.makeText(this, "You have get Roll ${rollDice()}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice(): Int {
        val getNumber = Dice(MAX).roll()
        when (getNumber) {
            1 -> bindImage(R.drawable.dice_1)
            2 -> bindImage(R.drawable.dice_2)
            3 -> bindImage(R.drawable.dice_3)
            4 -> bindImage(R.drawable.dice_4)
            5 -> bindImage(R.drawable.dice_5)
            else -> bindImage(R.drawable.dice_6)
        }
        return getNumber
    }

    private fun bindImage(diceImage: Int) {
        binding.ivDice.setImageResource(diceImage)
        binding.ivDice.contentDescription = diceImage.toString()
    }
}
