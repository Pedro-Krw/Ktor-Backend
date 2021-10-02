package com.pedro.plugins

import com.pedro.plugins.route.randomimage
import io.ktor.routing.*
import io.ktor.http.content.*
import io.ktor.application.*

fun Application.configureRouting() {
    

    routing {
        randomimage()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
