package teja.example.mod1casestudy1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class ConstraintActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ CORRECT layout reference
        setContentView(R.layout.activity_constraint)

        val h = findViewById<Button>(R.id.home)
        h.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
