package me.camdenorrb.katvaults

import me.camdenorrb.katvaults.cmds.TestCmd
import org.bukkit.plugin.java.JavaPlugin


class KatVaults : JavaPlugin() {

	override fun onLoad() {
		instance = this
	}

	override fun onEnable() {
		getCommand("test").executor = TestCmd()
	}

	override fun onDisable() = Unit


	companion object {

		lateinit var instance: KatVaults
			private set

	}

}