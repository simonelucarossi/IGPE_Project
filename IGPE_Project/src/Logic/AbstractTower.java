package Logic;

public class AbstractTower extends AbstractGameObject {

	public AbstractTower(Vector2d _position, Vector2d _size) {
		super(_position, _size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean collide(ICollidable c) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
