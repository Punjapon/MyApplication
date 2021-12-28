package th.ac.kku.nkc.cis.mobile.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        val buttonBack= findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener { view ->
            finish()
        }
    }
}