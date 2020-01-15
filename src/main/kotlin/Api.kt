import daikon.HttpServer
import daikon.gson.json

fun main() {
    HttpServer()
        .get("/hello") { req, res -> res.json(Greeting("hello", "world")) }
        .start()
}

data class Greeting(val say: String, val language: String)