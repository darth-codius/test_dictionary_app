package com.example.myapplication.models

import com.example.myapplication.models.ui.Definition

data class DefinitionDTO(
    val definition: String,
    val example: String
){
    fun toDefinition(): Definition{
        return Definition(
            definition, example
        )
    }
}