package com.juaracoding.ujian1batch4androidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val article = intent.getParcelableExtra<Article>("ARTICLE")

        if (article != null) {
            supportActionBar?.title = article.title
            findViewById<ImageView>(R.id.articleDetailImage).setImageResource(article.imageResourceId)
            findViewById<TextView>(R.id.articleDetailTitle).text = article.title
            findViewById<TextView>(R.id.articleDetailOverview).text = article.overview
        }

        val shareButton = findViewById<Button>(R.id.btnShare)
        shareButton.setOnClickListener {
            if (article != null) {
                shareArticle(article)
            }
        }

    }


    private fun shareArticle(article: Article) {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "${article.title}\n${article.description}")
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Share using"))
    }
}