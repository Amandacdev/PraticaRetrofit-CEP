package com.example.praticaretrofit_cep.model

import retrofit2.http.GET

interface UsuarioService {

    @GET("usuarios")
    suspend fun listar(): List<Usuario>

    @GET("")
    suspend fun getEndereco(): Endereco
}