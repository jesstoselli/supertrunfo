package com.wcc.supertrunfo

data class Player(
        val name: String,
        var isWinner: Boolean = false
)


//class Player() {
//    var name: String = ""
//        get() = "$field *"
//        set(value) {
//            field = value.substring(0, value.length - 1)
//        }
//    var card: Card
//    var isWinner: Boolean = false
//}