package net.martinreyes.lanzardadosmartin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var boton: Button
    lateinit var lbl: TextView
    lateinit var img: ImageView
    lateinit var img2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_roller)


        lbl = findViewById(R.id.lblSaludo)
        boton = findViewById(R.id.btnRoller)

        img = findViewById(R.id.imgRoller)
        img2 = findViewById(R.id.imgRoller2)



        img.setImageDrawable(resources.getDrawable(R.drawable.dice_3))
        img2.setImageDrawable(resources.getDrawable(R.drawable.dice_3))

        boton.setOnClickListener {
            val al1 = getRandomDiceImage()
            val al2 = getRandomDiceImage()

            val idImagenAl1 = when (al1){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }


            val idImagenAl2 = when (al2){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }

            img.setImageResource(idImagenAl1)
            img2.setImageResource(idImagenAl2)

            lbl.text = "Dado 1: "+al1.toString()+"\n" +"Dado 2: "+al2.toString()
        }
    }

    private fun getRandomDiceImage() : Int {
        return (1..6).random()
    }

}