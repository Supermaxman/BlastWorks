package me.supermaxman.blastworks;

import java.util.logging.Logger;


import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.material.Wool;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class BlastWorks extends JavaPlugin implements Listener{
	public static BlastWorks plugin;

	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	
	
	@Override
	public void onDisable() {
		this.logger.info("BlastWorks Disabled, No More Bouncing!");
		
	}

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BlastWorks(), this);		
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled! W00T!");
	}

	@EventHandler
	public void onEntityExplode(EntityExplodeEvent event){
		Entity entity = event.getEntity();
		if (entity!=null){
		Location loc = entity.getLocation();
		final Block rocket = loc.getBlock().getRelative(0,1,0);
		final Block rocket2 = loc.getBlock().getRelative(0,2,0);
		final Block rocket3 = loc.getBlock().getRelative(0,-1,0);
		if(rocket.getWorld().getName().equalsIgnoreCase("world")){
		if (rocket.getTypeId()==rocket2.getTypeId()){
			if ((rocket.getType()==Material.ENDER_STONE)&&(!(rocket3.getType()==Material.NETHERRACK))&&(!(rocket3.getType()==Material.GLOWSTONE))){
				event.setCancelled(true);
				
				if ((rocket.getRelative(0, 2, 0).getType()==Material.WOOL)){
					//colored
				DyeColor clr = ((Wool) rocket.getRelative(0, 2, 0).getState().getData()).getColor();
				
				Thread thread =new ColorRocket(rocket, rocket2, rocket.getRelative(0, 2, 0), clr);
				thread.start();
				
				
				}else{
					//normal
					Thread thread =new Rocket(rocket, rocket2);
					thread.start();
				}
				
			}else if((rocket.getType()==Material.ENDER_STONE)&&((rocket3.getType()==Material.NETHERRACK))){
				event.setCancelled(true);
				
				
				//Thread thread =new SpaceShip(rocket, rocket2, rocket3);
				//thread.start();
			}else if((rocket.getType()==Material.ENDER_STONE)&&((rocket3.getType()==Material.GLOWSTONE))){
				event.setCancelled(true);
			}
				
			}
		}	
		}
		
		
	}
	
	




}



