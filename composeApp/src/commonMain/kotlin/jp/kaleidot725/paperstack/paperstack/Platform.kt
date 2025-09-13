package jp.kaleidot725.paperstack.paperstack

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform