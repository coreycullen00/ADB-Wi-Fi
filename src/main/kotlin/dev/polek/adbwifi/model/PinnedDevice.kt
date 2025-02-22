package dev.polek.adbwifi.model

data class PinnedDevice(
    val id: String,
    val serialNumber: String,
    val name: String,
    val customName: String? = null,
    val address: String,
    val port: Int,
    val androidVersion: String,
    val apiLevel: String
)
