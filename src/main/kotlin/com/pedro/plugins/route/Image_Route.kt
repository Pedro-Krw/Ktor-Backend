package com.pedro.plugins.route


import com.pedro.data.Image
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_Url = "http://192.168.1.5:8100"
private val image = listOf(

    Image("gambar satu" , "gambar keren" , "$BASE_Url/Img/dua.jpg"),
    Image("gambar dua" , "gambar kece" , "$BASE_Url/img/satu.jpg"),
    Image("gambar tiga" , "gambar gaul" , "$BASE_Url/img/tiga.jpg"),
    Image("gambar empat" , "gambar dark image" , "$BASE_Url/img/empat.jpg"),
    Image("gambar lima" , "gambar cool" , "$BASE_Url/img/lima.jpg"),
    Image("gambar enam" , "gambar nice image" , "$BASE_Url/img/enam.jpg")

)


fun Route.randomimage(){

    get("/random-image"){
      call.respond(
          HttpStatusCode.OK,
          image.random()
      )

    }


}