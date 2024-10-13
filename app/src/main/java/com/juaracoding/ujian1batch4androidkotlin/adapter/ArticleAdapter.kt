package com.juaracoding.ujian1batch4androidkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ArticleAdapter(private val articles: List<Article>, private val clickListener: (Article) -> Unit) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(article: Article) {
            itemView.findViewById<ImageView>(R.id.articleImage).setImageResource(//tambahakan disini)
            itemView.findViewById<TextView>(R.id.articleTitle).text = //tambahkan disini
            itemView.findViewById<TextView>(R.id.articleOverview).text = //tambahkan disini

            itemView.setOnClickListener { clickListener(article) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(articles[position])
    }

    override fun getItemCount() = //tambahkan disini
}
