package com.example.imageapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class IdImagemDescricao(
    @DrawableRes val idImage: Int,
    @StringRes val idDescricao: Int,
    @StringRes val idAutor: Int
)

