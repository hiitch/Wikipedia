package demo.com.wikipedia

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Fonction qui se lance lorsqu'on clique sur le bouton rechercher
    fun search(v: View) {
        val intent = Intent(this, HistoricActivity::class.java)
        startActivity(intent)
    }
}
