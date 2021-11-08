package ran.am.myfragmentdojo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1=findViewById(R.id.button2)
        btn2=findViewById(R.id.button3)
        btn3=findViewById(R.id.button4)

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frid, BlankFragment()).commit()
        }

        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frid, BlankFragment2()).commit()
        }

        btn3.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frid, BlankFragment3()).commit()
        }
    }
}