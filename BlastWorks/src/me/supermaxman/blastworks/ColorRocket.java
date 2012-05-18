package me.supermaxman.blastworks;

import org.bukkit.DyeColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.material.Wool;

public class ColorRocket extends Thread {
	
	Block rocket;
	Block rocket2;
	Block color;
	DyeColor clr;
	int nclr;
	public ColorRocket(Block r, Block rr, Block c, DyeColor cl){ rocket = r;rocket2=rr;color=c;clr = cl;}
	
	public void run(){
		if ((clr.toString().equals("BLUE"))||(clr.toString().equals("LIGHT_BLUE"))){
			nclr = 0;
			
		}else if ((clr.toString().equals("PURPLE"))||(clr.toString().equals("MAGENTA"))||(clr.toString().equals("PINK"))){
			nclr =1;
			
		}else if (clr.toString().equals("CYAN")){
			nclr =2;
			
		}else if (clr.toString().equals("ORANGE")){
			nclr =3;
			
		}else if (clr.toString().equals("GREEN")){
			nclr =4;
			
		}else if (clr.toString().equals("RED")){
			nclr =5;
			
       	}else{
       		
	 		nclr =5;
		}
		
		
		
		
		
		int i = 1;
		while(i<=50){
			rocket.getRelative(0, 0+i-1, 0).setTypeId(0);
			
			
			
			for (Player p : rocket.getWorld().getPlayers()){
				
				p.playEffect(rocket.getRelative(0, 0+i-1, 0).getLocation(), Effect.POTION_BREAK, nclr);
				
			}
			
			
			
			
			
			
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
			
			
			for (Player p : rocket.getWorld().getPlayers()){
				
				p.playEffect(cb.getLocation(), Effect.POTION_BREAK, 0);
				
			}
			
			System.out.println(clr.toString());			

			this.interrupt();
		}
		
		
	}
}