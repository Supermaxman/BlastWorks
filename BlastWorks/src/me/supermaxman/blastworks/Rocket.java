package me.supermaxman.blastworks;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
public class Rocket extends Thread {
	
	Block rocket;
	Block rocket2;
	public Rocket(Block r, Block rr){ rocket = r;rocket2=rr;}
	
	public void run(){
		int i = 1;
		while(i<=50){
			
			rocket.getRelative(0, 0+i-1, 0).setTypeId(0);
			
			for (Player p : rocket.getWorld().getPlayers()){
				
				p.playEffect(rocket.getRelative(0, 0+i-1, 0).getLocation(), Effect.POTION_BREAK, 5);
				
			}
			rocket2.getRelative(0, 0+i-1, 0).setTypeId(0);
			if (rocket2.getRelative(0, 0+i+1, 0).getTypeId()==0){
				
				rocket.getRelative(0, 0+i, 0).setType(Material.ENDER_STONE);
				rocket2.getRelative(0, 0+i, 0).setType(Material.ENDER_STONE);
				i++;
				try {
					sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				i=51;
			}
		}
		if (i>50){
			rocket.getRelative(0, 0+i-1, 0).setTypeId(0);
			rocket2.getRelative(0, 0+i-1, 0).setTypeId(0);
			
			rocket2.getWorld().createExplosion(rocket2.getRelative(0, 0+i, 0).getLocation(), 6);
			rocket2.getWorld().createExplosion(rocket2.getRelative(5, 0+i, 0).getLocation(), 4);
			rocket2.getWorld().createExplosion(rocket2.getRelative(0, 0+i, 5).getLocation(), 4);
			this.interrupt();
		}
		
		
	}
}