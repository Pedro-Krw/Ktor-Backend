package com.pedro.plugins.route


import com.pedro.data.Image
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_Url = "http://192.168.1.5:8100"
private val image = listOf(
    Image("gambar satu" , "gambar keren" , "$BASE_Url/rabbits/satu.jpg" , "senin 2021"),
    Image("gambar dua" , "gambar kece" , "$BASE_Url/rabbits/dua.jpg", "selasa 2021"),
    Image("gambar tiga" , "gambar gaul" , "$BASE_Url/rabbits/tiga.jpg", "rabu 2021"),
    Image("gambar empat" , "gambar dark image" , "$BASE_Url/rabbits/empat.jpg", "kamis 2021"),
    Image("gambar lima" , "gambar cool" , "$BASE_Url/rabbits/lima.jpg", "jumat 2021"),
    Image("gambar enam" , "gambar nice image" , "$BASE_Url/rabbits/enam.jpg" , "sabtu 2021")

)


fun Route.randomimage(){

    get("/random-image"){
      call.respond(
          HttpStatusCode.OK,
          image.random()
      )

    }


}