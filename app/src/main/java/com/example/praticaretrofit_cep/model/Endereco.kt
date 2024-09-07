package com.example.praticaretrofit_cep.model

data class Endereco(
    val cep: String = "",
    val logradouro: String = "",
    val complemento: String = "",
    val bairro: String = "",
    val localidade:String="",
    val uf:String="",
    val estado:String="",
    val regiao:String="",
    val ibge:String="",
    val gia:String="",
    val ddd:String="",
    val siafi:String=""
)