package me.supermaxman.blastworks;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Wool;

public class ColorRocket extends Thread {
	
	Block rocket;
	Block rocket2;
	Block color;
	DyeColor clr;
	public ColorRocket(Block r, Block rr, Block c, DyeColor cl){ rocket = r;rocket2=rr;color=c;clr = cl;}
	
	public void run(){
		int i = 1;
		while(i<=50){
			rocket.getRelative(0, 0+i-1, 0).setTypeId(0);
			rocket2.getRelative(0, 0+i-1, 0).setTypeId(0);
			color.getRelative(0, 0+i-1, 0).setTypeId(0);
			
			if (rocket2.getRelative(0, 0+i+1, 0).getTypeId()==0){
				
				rocket.getRelative(0, 0+i, 0).setType(Material.ENDER_STONE);
				rocket2.getRelative(0, 0+i, 0).setType(Material.ENDER_STONE);
				color.getRelative(0, 0+i, 0).setType(Material.WOOL);
				((Wool) color.getRelative(0, 0+i, 0).getState().getData()).setColor(clr);
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
			color.getRelative(0, 0+i-1, 0).setTypeId(0);

			rocket2.getWorld().createExplosion(rocket2.getRelative(0, 0+i, 0).getLocation(), 6);
			rocket2.getWorld().createExplosion(rocket2.getRelative(5, 0+i, 0).getLocation(), 4);
			rocket2.getWorld().createExplosion(rocket2.getRelative(0, 0+i, 5).getLocation(), 4);
			Block cb = color.getRelative(0, 0+i-1, 0);
			cb.setType(Material.WOOL);
			((Wool) cb.getState().getData()).setColor(clr);
			System.out.println(clr.toString());			

			this.interrupt();
		}
		
		
	}
}