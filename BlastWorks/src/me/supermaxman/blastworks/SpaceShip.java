package me.supermaxman.blastworks;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Minecart;

public class SpaceShip extends Thread {
	
	Block rocket;
	Block rocket2;
	Block rocket3;
	Block s;
	Block s1;
	Block s2;
	Block s3;
	Block s4;
	
	Block s5;
	Block s6;
	Block s7;
	
	Block s8;
	Block s9;
	Block s10;
	Block s11;
	Block s12;
	Block s13;
	Block s14;
	Block s15;
	Block s16;
	Block s17;
	Block s18;
	Block s19;
	Block s20;
	
	Block g2;
	Block g3;
	Block g4;
	
	Block t1;
	Block t2;
	Block t3;
	
	Block t4;
	Block t5;
	Block t6;
	
	Block s21;
	Block s22;
	Block s23;
	
	Block s24;
	Block s25;
	Block s26;
	
	Block s27;
	Block s28;
	Block s29;
	
	Block s30;
	Block s31;
	Block s32;
	
	Block s33;
	Block s34;
	Block s35;
	
	Block b;
	Minecart cart;
	
	public SpaceShip(Block r, Block rr, Block rrr){ rocket = r;rocket2=rr;rocket3=rrr;
	 s = rocket2.getRelative(-1, 2, 0);
	 s1= s.getRelative(-1, -1, 0);
	 s2= s.getRelative(1, -1, 0);
	 s3= s.getRelative(0, -1, -1);
	 s4= s.getRelative(0, -1, 1);;
	
	 s5 = rocket2.getRelative(1, 0, 0);
	 s6 = rocket2.getRelative(0, 0, 1);
	 s7 = rocket2.getRelative(0, 0, -1);
	
	 s8 = s.getRelative(0, -2, -2);
	 s9 = s.getRelative(0, -2, 2);
	 s10 = s.getRelative(-1, -2, 1);
	 s11 = s.getRelative(-1, -2, -1);
	 s12 = s10.getRelative(0, -1, 0);
	 s13 = s11.getRelative(0, -1, 0);
	 s14 = s10.getRelative(0, -2, 0);
	 s15 = s11.getRelative(0, -2, 0);
	 s16 = s10.getRelative(0, -3, 0);
	 s17 = s11.getRelative(0, -3, 0);
	 s18 = s10.getRelative(0, -2, -1);
	 s19 = s18.getRelative(1, 0, 0);
	 s20 = s19.getRelative(0, -1, 0);
	
	 g2 = s20.getRelative(-1, 0, 0);
	 g3 = s20.getRelative(0, 0, 1);
	 g4 = s20.getRelative(0, 0, -1);
	
	 t1 = g3.getRelative(0, 1, 0);
	 t2 = g3.getRelative(0, 2, 0);
	 t3 = g3.getRelative(0, 3, 0);
	
	 t4 = g4.getRelative(0, 1, 0);
	 t5 = g4.getRelative(0, 2, 0);
	 t6 = g4.getRelative(0, 3, 0);
	
	 s21 = s8.getRelative(0, -1, 0);
	 s22 = s8.getRelative(0, -2, 0);
	 s23 = s8.getRelative(0, -3, 0);
	
	 s24 = s9.getRelative(0, -1, 0);
	 s25 = s9.getRelative(0, -2, 0);
	 s26 = s9.getRelative(0, -3, 0);
	
	 s27 = s5.getRelative(0, -1, 0);
	 s28 = s5.getRelative(0, -2, 0);
	 s29 = s5.getRelative(0, -3, 0);
	
	 s30 = s6.getRelative(0, -1, 0);
	 s31 = s6.getRelative(0, -2, 0);
	 s32 = s6.getRelative(0, -3, 0);
	
	 s33 = s7.getRelative(0, -1, 0);
	 s34 = s7.getRelative(0, -2, 0);
	 s35 = s7.getRelative(0, -3, 0);
	
	 b = s.getRelative(0, -3, 0);
	
	 cart = b.getWorld().spawn(b.getLocation().add(0, 1, 0), Minecart.class);
	
		try {
			sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	
	
	
	
	
	}
	
	public void run(){

		int i = 1;
		while(rocket2.getRelative(0, 2, 0).getLocation().getY()<120){
			
			
			
			
			rocket.setTypeId(0);rocket = rocket.getRelative(BlockFace.UP);rocket.setType(Material.ENDER_STONE);
			rocket2.setTypeId(0);rocket2 = rocket2.getRelative(BlockFace.UP);rocket2.setType(Material.ENDER_STONE);
			rocket3.setTypeId(0);rocket3 = rocket3.getRelative(BlockFace.UP);rocket3.setType(Material.NETHERRACK);
			s.setTypeId(0);s = s.getRelative(BlockFace.UP);s.setType(Material.IRON_BLOCK);
			s1.setTypeId(0);s1 = s1.getRelative(BlockFace.UP);s1.setType(Material.IRON_BLOCK);
			s2.setTypeId(0);s2 = s2.getRelative(BlockFace.UP);s2.setType(Material.IRON_BLOCK);
			s3.setTypeId(0);s3 = s3.getRelative(BlockFace.UP);s3.setType(Material.IRON_BLOCK);
			s4.setTypeId(0);s4 = s4.getRelative(BlockFace.UP);s4.setType(Material.IRON_BLOCK);
			s5.setTypeId(0);s5 = s5.getRelative(BlockFace.UP);s5.setType(Material.IRON_BLOCK);
			s6.setTypeId(0);s6 = s6.getRelative(BlockFace.UP);s6.setType(Material.IRON_BLOCK);
			s7.setTypeId(0);s7 = s7.getRelative(BlockFace.UP);s7.setType(Material.IRON_BLOCK);
			s8.setTypeId(0);s8 = s8.getRelative(BlockFace.UP);s8.setType(Material.IRON_BLOCK);
			s9.setTypeId(0);s9 = s9.getRelative(BlockFace.UP);s9.setType(Material.IRON_BLOCK);
			s10.setTypeId(0);s10 = s10.getRelative(BlockFace.UP);s10.setType(Material.IRON_BLOCK);
			s11.setTypeId(0);s11 = s11.getRelative(BlockFace.UP);s11.setType(Material.IRON_BLOCK);
			s12.setTypeId(0);s12 = s12.getRelative(BlockFace.UP);s12.setType(Material.IRON_BLOCK);
			s13.setTypeId(0);s13 = s13.getRelative(BlockFace.UP);s13.setType(Material.IRON_BLOCK);
			s14.setTypeId(0);s14 = s14.getRelative(BlockFace.UP);s14.setType(Material.IRON_BLOCK);
			s15.setTypeId(0);s15 = s15.getRelative(BlockFace.UP);s15.setType(Material.IRON_BLOCK);
			s16.setTypeId(0);s16 = s16.getRelative(BlockFace.UP);s16.setType(Material.IRON_BLOCK);
			s17.setTypeId(0);s17 = s17.getRelative(BlockFace.UP);s17.setType(Material.IRON_BLOCK);
			s18.setTypeId(0);s18 = s18.getRelative(BlockFace.UP);s18.setType(Material.IRON_BLOCK);
			s19.setTypeId(0);s19 = s19.getRelative(BlockFace.UP);s19.setType(Material.IRON_BLOCK);
			s20.setTypeId(0);s20 = s20.getRelative(BlockFace.UP);s20.setType(Material.IRON_BLOCK);
			s21.setTypeId(0);s21 = s21.getRelative(BlockFace.UP);s21.setType(Material.IRON_BLOCK);
			s22.setTypeId(0);s22 = s22.getRelative(BlockFace.UP);s22.setType(Material.IRON_BLOCK);
			s23.setTypeId(0);s23 = s23.getRelative(BlockFace.UP);s23.setType(Material.IRON_BLOCK);
			s24.setTypeId(0);s24 = s24.getRelative(BlockFace.UP);s24.setType(Material.IRON_BLOCK);
			s25.setTypeId(0);s25 = s25.getRelative(BlockFace.UP);s25.setType(Material.IRON_BLOCK);
			s26.setTypeId(0);s26 = s26.getRelative(BlockFace.UP);s26.setType(Material.IRON_BLOCK);
			s27.setTypeId(0);s27 = s27.getRelative(BlockFace.UP);s27.setType(Material.IRON_BLOCK);
			s28.setTypeId(0);s28 = s28.getRelative(BlockFace.UP);s28.setType(Material.IRON_BLOCK);
			s29.setTypeId(0);s29 = s29.getRelative(BlockFace.UP);s29.setType(Material.IRON_BLOCK);
			s30.setTypeId(0);s30 = s30.getRelative(BlockFace.UP);s30.setType(Material.IRON_BLOCK);
			s31.setTypeId(0);s31 = s31.getRelative(BlockFace.UP);s31.setType(Material.IRON_BLOCK);
			s32.setTypeId(0);s32 = s32.getRelative(BlockFace.UP);s32.setType(Material.IRON_BLOCK);
			s33.setTypeId(0);s33 = s33.getRelative(BlockFace.UP);s33.setType(Material.IRON_BLOCK);
			s34.setTypeId(0);s34 = s34.getRelative(BlockFace.UP);s34.setType(Material.IRON_BLOCK);
			s35.setTypeId(0);s35 = s35.getRelative(BlockFace.UP);s35.setType(Material.IRON_BLOCK);
			
			g2.setTypeId(0);g2 = g2.getRelative(BlockFace.UP);g2.setType(Material.GLOWSTONE);
			g3.setTypeId(0);g3 = g3.getRelative(BlockFace.UP);g3.setType(Material.GLOWSTONE);
			g4.setTypeId(0);g4 = g4.getRelative(BlockFace.UP);g4.setType(Material.GLOWSTONE);
			
			t1.setTypeId(0);t1 = t1.getRelative(BlockFace.UP);t1.setType(Material.TNT);
			t2.setTypeId(0);t2 = t2.getRelative(BlockFace.UP);t2.setType(Material.TNT);
			t3.setTypeId(0);t3 = t3.getRelative(BlockFace.UP);t3.setType(Material.TNT);
			t4.setTypeId(0);t4 = t4.getRelative(BlockFace.UP);t4.setType(Material.TNT);
			t5.setTypeId(0);t5 = t5.getRelative(BlockFace.UP);t5.setType(Material.TNT);
			t6.setTypeId(0);t6 = t6.getRelative(BlockFace.UP);t6.setType(Material.TNT);
			
			b.setTypeId(0);b = b.getRelative(BlockFace.UP);b.setType(Material.AIR);
			cart.teleport(b.getLocation().add(0, 2, 0));
			
			
			i++;
				
				try {
					sleep(1000/i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		
		if (rocket2.getRelative(0, 2, 0).getLocation().getY()>=120){
			rocket.setTypeId(0);
			rocket2.setTypeId(0);
			rocket3.setTypeId(0);
			
			s.setTypeId(0);
			s1.setTypeId(0);
			s2.setTypeId(0);
			s3.setTypeId(0);
			s4.setTypeId(0);
			s5.setTypeId(0);
			s6.setTypeId(0);
			s7.setTypeId(0);
			s8.setTypeId(0);
			s9.setTypeId(0);
			s10.setTypeId(0);
			s11.setTypeId(0);
			s12.setTypeId(0);
			s13.setTypeId(0);
			s14.setTypeId(0);
			s15.setTypeId(0);
			s16.setTypeId(0);
			s17.setTypeId(0);
			s18.setTypeId(0);
			s19.setTypeId(0);
			s20.setTypeId(0);
			s21.setTypeId(0);
			s22.setTypeId(0);
			s23.setTypeId(0);
			s24.setTypeId(0);
			s25.setTypeId(0);
			s26.setTypeId(0);
			s27.setTypeId(0);
			s28.setTypeId(0);
			s29.setTypeId(0);
			s30.setTypeId(0);
			s31.setTypeId(0);
			s32.setTypeId(0);
			s33.setTypeId(0);
			s34.setTypeId(0);
			s35.setTypeId(0);
			
			g2.setTypeId(0);
			g3.setTypeId(0);
			g4.setTypeId(0);
			
			t1.setTypeId(0);
			t2.setTypeId(0);
			t3.setTypeId(0);
			t4.setTypeId(0);
			t5.setTypeId(0);
			t6.setTypeId(0);
			
		}
		
		
	}
}