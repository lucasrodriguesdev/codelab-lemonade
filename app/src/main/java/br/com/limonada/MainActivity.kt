package br.com.limonada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var clickState: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgClickable = findViewById<ImageView>(R.id.imgClickable)
        imgClickable.setOnClickListener {
            clickToSelect()
        }
    }

    fun clickToSelect(){
        when(clickState){
            1 -> squeeze()
            2 -> drink()
            3 -> restart()
            else -> select()
        }
    }

    fun squeeze(){
        val textTips = findViewById<TextView>(R.id.tvMessage)
        textTips.text = getResources().getString(R.string.SQUEEZE)

        val imgClickable = findViewById<ImageView>(R.id.imgClickable)
        imgClickable.setImageResource(R.drawable.squeeze)
        clickState +=1
    }

    fun drink(){
        val textTips = findViewById<TextView>(R.id.tvMessage)
        textTips.text = getResources().getString(R.string.DRINK)

        val imgClickable = findViewById<ImageView>(R.id.imgClickable)
        imgClickable.setImageResource(R.drawable.drink)
        clickState +=1
    }

    fun restart(){
        val textTips = findViewById<TextView>(R.id.tvMessage)
        textTips.text = getResources().getString(R.string.RESTART)

        val imgClickable = findViewById<ImageView>(R.id.imgClickable)
        imgClickable.setImageResource(R.drawable.restart)
        clickState = 0
    }

    fun select(){
        val textTips = findViewById<TextView>(R.id.tvMessage)
        textTips.text = getResources().getString(R.string.SELECT)

        val imgClickable = findViewById<ImageView>(R.id.imgClickable)
        imgClickable.setImageResource(R.drawable.select)
        clickState +=1
    }

}