package com.krzysolutions.tictactoe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //button click function
    protected fun btnClick(view:View){
        //get all info for the selected button
        val btnSelected = view as Button
        var cellID = 0

        //set button ID
        when(btnSelected.id){
            R.id.btn1-> cellID = 1
            R.id.btn2-> cellID = 2
            R.id.btn3-> cellID = 3
            R.id.btn4-> cellID = 4
            R.id.btn5-> cellID = 5
            R.id.btn6-> cellID = 6
            R.id.btn7-> cellID = 7
            R.id.btn8-> cellID = 8
            R.id.btn9-> cellID = 9
        }
        //show message | debugging purpose
        //Toast.makeText(this, "ID: " + cellID, Toast.LENGTH_LONG).show()
        PlayGame(cellID, btnSelected)
    }



        var player1 = ArrayList<Int>()
        var player2 = ArrayList<Int>()
        var activePlayer = 1

        //Player activity
        fun PlayGame(cellID:Int, btnSelected:Button){


            //Action for player 1
            if (activePlayer == 1){
                btnSelected.text = "X"
                btnSelected.setBackgroundResource(R.color.green)
                player1.add(cellID)
                activePlayer = 2
                AutoPlay()
            } else { //Action for player 2
                btnSelected.text = "0"
                btnSelected.setBackgroundResource(R.color.red)
                player2.add(cellID)
                activePlayer = 1
            }

            //disable button so player can't press the same button again
            btnSelected.isEnabled = false

            //call function to check the winner of the game
            CheckWinner()
        }

        //finding the winner
        fun CheckWinner(){
            var winner = -1

            //row1
            if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
                winner = 1
            }
            if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
                winner = 2
            }
            //row2
            if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
                winner = 1
            }
            if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
                winner = 2
            }
            //row3
            if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
                winner = 1
            }
            if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
                winner = 2
            }

            //column1
            if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
                winner = 1
            }
            if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
                winner = 2
            }
            //column2
            if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
                winner = 1
            }
            if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
                winner = 2
            }
            //column3
            if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
                winner = 1
            }
            if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
                winner = 2
            }

            //diagonal1
            if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
                winner = 1
            }
            if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
                winner = 2
            }
            //diagonal2
            if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
                winner = 1
            }
            if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
                winner = 2
            }

            //checking information about the winner
            if (winner != -1){

                //message if player wins
                if (winner == 1){
                    Toast.makeText(this, "Player 1: Winner Winner Chicken Dinner!", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Player 2: Winner Winner Chicken Dinner!", Toast.LENGTH_LONG).show()
                }
            }

        }

    //function for autoplay
    fun AutoPlay(){

        var emptyCells = ArrayList<Int>()

        //check which cells are not selected
        for (cellID in 1..9){

            if(!(player1.contains(cellID) || player2.contains(cellID))){
                emptyCells.add(cellID)
            }
        }

        //Random cell selection
        var random = Random()
        val randomIndex = random.nextInt(emptyCells.size-0)+0 //index of selected cell
        val cellID = emptyCells.get(randomIndex) //get item of the cell

        var btnSelected:Button?
        when(cellID){
            1 -> btnSelected = btn1
            2 -> btnSelected = btn2
            3 -> btnSelected = btn3
            4 -> btnSelected = btn4
            5 -> btnSelected = btn5
            6 -> btnSelected = btn6
            7 -> btnSelected = btn7
            8 -> btnSelected = btn8
            9 -> btnSelected = btn9
            else -> {
                btnSelected = btn1
            }
        }

        PlayGame(cellID, btnSelected)
    }

}

