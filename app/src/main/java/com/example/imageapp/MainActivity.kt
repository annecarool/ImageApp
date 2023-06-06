package com.example.imageapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.imageapp.ui.theme.ImageAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImageContent()
                }
            }
        }
    }
}

@Composable
fun ImageStructure(
    idImage: Int,
    idDescricao: Int,
    idAutor: Int
){
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(Color(255,255,255)),
        elevation = CardDefaults.cardElevation(4.dp),
        border = BorderStroke(2.dp, Color(255,255,255)),
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Text(
                text = stringResource(id = R.string.title),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .padding(top = 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 40.sp,
                color = Color(0, 0, 0),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W700,
                lineHeight = 1.em
            )

            Card(
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(255,255,255)),
            elevation = CardDefaults.cardElevation(4.dp),
            border = BorderStroke(2.dp, Color(255,255,255)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            ){
                Image(
                    painter = painterResource(id = idImage),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(300.dp)
                        .padding(10.dp)
                        .border(BorderStroke(2.dp, Color(255, 255, 255))),
                )

                Text(
                    text = stringResource(id = idDescricao),
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
                    text = stringResource(id = idAutor),
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
}

@Composable
fun ImageContent(){

    ImageStructure(
        idImage = R.drawable.bluesman,
        idDescricao = R.string.Bluesman,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.queimaminhapele,
        idDescricao = R.string.QueimaMinhaPele,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.medesculpajayz,
        idDescricao = R.string.MeDesculpaJayZ,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.minotaurodeborges,
        idDescricao = R.string.MinotauroDeBorges,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.kanyewestdabahia,
        idDescricao = R.string.KanyeWestDaBahia,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.flamingos,
        idDescricao = R.string.Flamingos,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.girassoisdevangogh,
        idDescricao = R.string.GirassoisDeVanGogh,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.pretoeprata,
        idDescricao = R.string.PretoEPrata,
        idAutor = R.string.autor
    )

    ImageStructure(
        idImage = R.drawable.bbking,
        idDescricao = R.string.BBKing,
        idAutor = R.string.autor
    )

}

