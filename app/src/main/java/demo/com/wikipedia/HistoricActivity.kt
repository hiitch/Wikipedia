package demo.com.wikipedia

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout

class HistoricActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historic)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)

        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val articles = ArrayList<Article>()
        articles.add(Article("TITRE", "AHAHAHAAHA"))
        articles.add(Article("TITRE2", "BABABABABA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))
        articles.add(Article("TITRE3", "DDADADDA"))


        var adapter = ListArticleAdapter(articles)
        rv.adapter = adapter
    }

    fun delete(v: View) {

    }

}
