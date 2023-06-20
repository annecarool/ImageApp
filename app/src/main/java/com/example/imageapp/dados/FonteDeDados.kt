package com.example.imageapp.dados

import com.example.imageapp.R
import com.example.imageapp.model.IdImagemDescricao

class FonteDeDados {

    fun carregarListaMolduras():List<IdImagemDescricao>{

        return listOf<IdImagemDescricao>(
            IdImagemDescricao(R.drawable.bluesman, R.string.Bluesman, R.string.autor),
            IdImagemDescricao(R.drawable.queimaminhapele, R.string.QueimaMinhaPele, R.string.autor),
            IdImagemDescricao(R.drawable.medesculpajayz, R.string.MeDesculpaJayZ, R.string.autor),
            IdImagemDescricao(R.drawable.minotaurodeborges, R.string.MinotauroDeBorges, R.string.autor),
            IdImagemDescricao(R.drawable.kanyewestdabahia, R.string.KanyeWestDaBahia, R.string.autor),
            IdImagemDescricao(R.drawable.flamingos, R.string.Flamingos, R.string.autor),
            IdImagemDescricao(R.drawable.girassoisdevangogh, R.string.GirassoisDeVanGogh, R.string.autor),
            IdImagemDescricao(R.drawable.pretoeprata, R.string.PretoEPrata, R.string.autor),
            IdImagemDescricao(R.drawable.bbking, R.string.BBKing, R.string.autor)

        )

    }

}