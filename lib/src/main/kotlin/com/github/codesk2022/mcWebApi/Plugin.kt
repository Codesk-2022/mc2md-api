package com.github.codesk2022.mcWebApi;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin: JavaPlugin() {
  override fun onEnable(){
    this.getLogger().info("""
      Hello
    """)
  }
}