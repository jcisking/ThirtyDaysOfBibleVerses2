package com.example.thirtydaysofbibleverses2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Column(
        modifier = modifier
    ) {
        Text(text = stringResource(id = bibleVerse.dayRes, "1"))
        Image(
            painter = painterResource(id = bibleVerse.imageRes),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
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