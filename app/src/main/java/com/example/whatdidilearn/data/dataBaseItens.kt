package com.example.whatdidilearn.data

import com.example.whatdidilearn.entities.Level
import com.example.whatdidilearn.entities.itemLearned

class dataBaseItens {
    fun getAll(): List<itemLearned> {
        val itemOne = itemLearned(
            "Kotlin - Null Safety",
            "O sistema de tipos de Kotlin visa eliminar o perigo de referências nulas do código",
             Level.HIGH
        )
        val itemTwo = itemLearned(
            "Layout editor",
            "O Design Editor exibe o layput em vários dispositivos e versões do Android. É possível criar e editar um layout usando apenas componentes visuais.",
            Level.HIGH
        )
        val itemThree = itemLearned(
            "Git",
            "O sistema de tipos de Kotlin visa eliminar o perigo de referências nulas do código",
            Level.HIGH
        )
        val itemFour = itemLearned(
                "GroupView",
        "O sistema de tipos de Kotlin visa eliminar o perigo de referências nulas do código",
        Level.HIGH
        )

        return listOf(itemOne,itemTwo, itemThree, itemFour)
    }
}

