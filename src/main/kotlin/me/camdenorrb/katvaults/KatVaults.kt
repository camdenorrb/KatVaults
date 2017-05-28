package me.camdenorrb.katvaults

import org.bukkit.plugin.java.JavaPlugin


class KatVaults : JavaPlugin() {

	override fun onLoad() {
		instance = this
	}

	override fun onEnable() = Unit

	override fun onDisable() = Unit


	companion object {

		lateinit var instance: KatVaults
			private set

	}

}