package com.example.thirtydaysofbibleverses2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysofbibleverses2.model.BibleVerseItem
import com.example.thirtydaysofbibleverses2.model.BibleVerseRepository
import com.example.thirtydaysofbibleverses2.ui.theme.ThirtyDaysOfBibleVerses2Theme

@Composable
fun BibleVerseListItem(
    bibleVerse: BibleVerseItem,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column(
            modifier = Modifier
        ) {
            Text(text = stringResource(id = bibleVerse.dayRes, "1"))
            Image(
                painter = painterResource(id = bibleVerse.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Red)
                    .size(height = 150.dp, width = 300.dp)
                //                .fillMaxWidth()

            )
            BibleVerseAndPassageText(bibleVerse)
        }
    }
}

@Composable
fun BibleVerseAndPassageText(
    bibleVerse: BibleVerseItem,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(text = stringResource(id = bibleVerse.verseRes))
        Text(text = stringResource(id = bibleVerse.passageRes))
    }
}


@Preview(showBackground = true)
@Composable
fun BibleVerseListItemPreview() {
    ThirtyDaysOfBibleVerses2Theme {
        BibleVerseListItem(
            bibleVerse = BibleVerseRepository.bibleVerseItems[0]
        )
    }
}