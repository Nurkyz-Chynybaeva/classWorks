
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.a201021.R


class MainActivity : AppCompatActivity(){              //View.OnClickListener

    private lateinit var textV:TextView
    private lateinit var layoutV:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textV = findViewById(R.id.text)
        layoutV= findViewById(R.id.layout)



        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)

        btn1.setOnClickListener{
            textV.text = "red"
            layoutV.background(android.R.color.holo_red_dark)

        }
        btn2.setOnClickListener{
            textV.text = "yello"
//            layoutV.setBackgroundColor(android.R.color.holo_orange_light)
            layoutV.background(android.R.color.holo_orange_light)


        }
        btn3.setOnClickListener{
            textV.text = "green"
            layoutV.background(android.R.color.holo_green_dark)


        }


    }




//        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
//        val btn2 = findViewById<AppCompatButton>(R.id.btn2)                     java style
//        val btn3 = findViewById<AppCompatButton>(R.id.btn3)
//
//        btn1.setOnClickListener(this)
//        btn2.setOnClickListener(this)
//        btn3.setOnClickListener(this)
//    }
//
//    override fun onClick(view: View) {
//      val msg=  when(view.id){
//            R.id.btn1 -> "btn1"
//            R.id.btn2 -> "btn2"
//            R.id.btn3 -> "btn3"
//          else -> "unknown"
//        }
//
//        textV.text = msg
//
//    }





//    fun onClickEvent(view:View){                                         старый метод
//      val msg=  when(view.id){
//            R.id.btn1 -> "btn1"
//            R.id.btn2 -> "btn2"
//            R.id.btn3 -> "btn3"
//          else -> "unknown"
//        }
//        val textV = findViewById<TextView>(R.id.text)
//        textV.text = msg
//    }

}

private fun TextView.background() {

}





