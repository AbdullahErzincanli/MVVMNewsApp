package com.androiddevs.mvvmnewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(
    tableName = "articles"
)
////implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
data class Article(
    @PrimaryKey(autoGenerate = true)
    var uid: Int? = null,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
) : Serializable