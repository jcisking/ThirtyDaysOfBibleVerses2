package com.example.thirtydaysofbibleverses2.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BibleVerseItem(
    @StringRes val dayRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val verseRes: Int,
    @StringRes val passageRes: Int
)
