package io.github.grape82.chatformat

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.plugin.java.JavaPlugin

class Chatformat : JavaPlugin(), Listener {
    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
    }

    @EventHandler
    fun onChat(event: AsyncPlayerChatEvent) {
        event.format = "${ChatColor.AQUA}${event.player.name}${ChatColor.GRAY}: ${ChatColor.WHITE}${event.message}"
    }
}
