package com.pedro.plugins.route


import com.pedro.data.Image
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_Url = "http://192.168.1.5:8100"
private val image = listOf(
    Image("gambar satu" , "gambar keren" , "https://images.unsplash.com/photo-1633099702771-ce69a3ebb7bf?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMDh8fHxlbnwwfHx8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" , "senin 2021"),
    Image("gambar dua" , "gambar kece" , "https://images.unsplash.com/photo-1633119641005-7187adf29b4b?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4N3x8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", "selasa 2021"),
    Image("gambar tiga" , "gambar gaul" , "https://images.unsplash.com/photo-1633113088942-99089f4abffa?ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw4NXx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", "rabu 2021"),
    Image("gambar empat" , "gambar dark image" , "https://images.unsplash.com/photo-1633114130148-3f40987134d2?ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw3MHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", "kamis 2021"),
    Image("gambar lima" , "gambar cool" , "https://images.unsplash.com/photo-1633110385662-6b1e0d4245de?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw2NHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", "jumat 2021"),
    Image("gambar enam" , "gambar nice image" , "https://images.unsplash.com/photo-1524758631624-e2822e304c36?ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw2NXx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" , "sabtu 2021")

)


fun Route.randomimage(){

    get("/random-image"){
      call.respond(
          HttpStatusCode.OK,
          image.random()
      )

    }


}