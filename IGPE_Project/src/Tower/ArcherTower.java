package Tower;

import Logic.Vector2d;

public class ArcherTower extends AbstractTower {

	public ArcherTower(Vector2d _position) {
		super(_position);
		attack = 10;
	}
	
	public void attackMod () {
		// se trova una collisione diminuisce l'attacco al nemico con cui collide
	}

}
