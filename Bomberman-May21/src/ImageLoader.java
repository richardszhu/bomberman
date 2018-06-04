// Project Bomberman

import javax.swing.*;

public class ImageLoader
{
	private ImageIcon bomb, bomber, bomber2, bombPowerUp, breakable, explosion, explosionPowerUp, stoneTile, unbreakable, smoke;
	
	public ImageLoader()
	{
		ClassLoader cldr = this.getClass().getClassLoader();
		
		try
		{
			bomb = new ImageIcon(cldr.getResource("images/bomb.png"));
			bomber = new ImageIcon(cldr.getResource("images/bomber.png"));
			bomber2 = new ImageIcon(cldr.getResource("images/bomber2.png"));
			bombPowerUp = new ImageIcon(cldr.getResource("images/powerup1.png"));
			breakable = new ImageIcon(cldr.getResource("images/breakable.png"));
			explosion = new ImageIcon(cldr.getResource("images/explosion.png"));
			explosionPowerUp = new ImageIcon(cldr.getResource("images/powerup2.png"));
			stoneTile = new ImageIcon(cldr.getResource("images/stonetile.png"));
			unbreakable = new ImageIcon(cldr.getResource("images/unbreakable.png"));
			smoke = new ImageIcon(cldr.getResource("images/unbreakable.png"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ImageIcon getBombImage()
	{
		return bomb;
	}
	
	public ImageIcon getBomberImage()
	{
		return bomber;
	}
	
	public ImageIcon getBomberImage2()
	{
		return bomber2;
	}
	
	public ImageIcon getBreakableImage()
	{
		return breakable;
	}
	
	public ImageIcon getExplosionImage()
	{
		return explosion;
	}
	
	public ImageIcon getStoneTileImage()
	{
		return stoneTile;
	}
	
	public ImageIcon getUnbreakableImage()
	{
		return unbreakable;
	}
	
	public ImageIcon getSmokeImage()
	{
		return smoke;
	}
	
	public ImageIcon getBombPowerUpImage()
	{
		return bombPowerUp;
	}
	
	public ImageIcon getExplosionPowerUpImage()
	{
		return explosionPowerUp;
	}
}
