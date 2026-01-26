package teja.example.mod1casestudy1
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = findViewById<Button>(R.id.bt1)
        val y = findViewById<Button>(R.id.bt2)
        val z = findViewById<Button>(R.id.bt3)

        x.setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java))
        }
        y.setOnClickListener {
            startActivity(Intent(this, RelativeActivity::class.java))
        }
        z.setOnClickListener {
            startActivity(Intent(this, ConstraintActivity::class.java))
        }
    }
}
