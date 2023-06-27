package com.example.imageapp

import android.os.Bundle
import android.os.Message
import android.text.Html.ImageGetter
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.imageapp.dados.FonteDeDados
import com.example.imageapp.model.IdImagemDescricao
import com.example.imageapp.ui.theme.ImageAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(255, 255, 255)
                ) {
                    AppPhotoGallery()
                }
            }
        }
    }
}
@Composable
fun AppPhotoGallery() {

    var expandir by remember { mutableStateOf(false) }

    Column() {

        Card(
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(Color(255, 255, 255)),
            elevation = CardDefaults.cardElevation(4.dp),
            border = BorderStroke(2.dp, Color(255, 255, 255)),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row() {
                Column(
                    modifier = Modifier
                        .animateContentSize(
                            animationSpec = spring(
                                dampingRatio = Spring.DampingRatioNoBouncy,
                                stiffness = Spring.StiffnessMedium
                            )
                        )
                ) {

                    Text(
                        text = stringResource(id = R.string.title),
                        modifier = Modifier
                            .clickable { expandir = !expandir }
                            .padding(20.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 40.sp,
                        color = Color(0, 0, 0),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.W700,
                        lineHeight = 1.em
                    )
                    if (expandir == true) {
                        Text(
                            text = stringResource(id = R.string.info),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp)
                                .padding(bottom = 20.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 15.sp,
                            color = Color(0, 0, 0),
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.ExtraLight,
                            lineHeight = 1.em
                        )
            }

                }
                ExpandirTitulo(expandir = false, onClick = { expandir = !expandir })
            }

        }

        LazyColumn() {
            items(FonteDeDados().carregarListaMolduras()) { idImagemDescricao ->
                ImageStructure(idImagemDescricao)
            }
        }
    }
}

@Composable
fun ImageStructure(
    idImagemDescricao: IdImagemDescricao
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(255, 255, 255)),
            elevation = CardDefaults.cardElevation(4.dp),
            border = BorderStroke(2.dp, Color(255, 255, 255)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = idImagemDescricao.idImage),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(300.dp)
                    .padding(10.dp)
                    .border(BorderStroke(2.dp, Color(255, 255, 255))),
            )

            Text(
                text = stringResource(id = idImagemDescricao.idDescricao),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp),
                textAlign = TextAlign.Center,
                lineHeight = 1.em,
                fontSize = 15.sp,
                color = Color(0, 0, 0),
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Normal
            )

            Text(
                text = stringResource(id = idImagemDescricao.idAutor),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Color(0, 0, 0),
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraLight
            )
        }

    }
}

@Composable
fun ExpandirTitulo(
    expandir: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
    ) {
        Icon(
            imageVector =
            if (expandir) Icons.Filled.KeyboardArrowUp
            else Icons.Filled.KeyboardArrowDown,
            contentDescription = null,
            tint = Color(0,0,0)
        )

    }
}

