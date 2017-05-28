package me.camdenorrb.katvaults.cmds

import com.google.gson.GsonBuilder
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player


class TestCmd : CommandExecutor {

	val gson = GsonBuilder().disableHtmlEscaping().create()!!


	override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
		if (sender !is Player) return false
		sender.sendMessage(gson.toJson(sender.inventory))
		return true
	}

}