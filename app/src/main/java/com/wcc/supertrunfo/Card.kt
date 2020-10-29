package com.wcc.supertrunfo

class Card (
        val vehicle: Vehicle,
        val driver: Driver,
        private val player: Player
) {
    val label: String = "Card ${player.name}"
    val maxVelocity = setMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = setPassengers()
    val xP = setXP()

    private fun setMaxVelocity(): Int {
        TODO()
    }

    private fun setAccelerationTime(): Int {
        TODO()
    }

//    (currentVehiclePlayerOne["passengers"]?.toInt()
//    ?: 0) * (1 + (currentDriverPlayerOne["defensiveDriving"]?.toInt() ?: 0))
    private fun setPassengers(): Int {
        return vehicle.passengers * (1 + driver.defensiveDriving)
    }


    private fun setXP(): Int {
        TODO()
    }
}

