package Tower;

import Logic.ICollidable;
import Logic.IGameObjectStatic;
import Logic.Vector2d;

public class EmptyTower implements IGameObjectStatic {
	
	Vector2d position;
	Vector2d size = new Vector2d(3, 3);
	
	public EmptyTower(Vector2d _position) {
		this.position = _position;
	}

	public Vector2d getCentre() {
		Vector2d posCentre = new Vector2d(position.getX() + size.getX()/2, position.getY() + size.getY()/2);
		return posCentre;
	}
	
	@Override
	public Vector2d getPosition() { return position; }
	
	@Override
	public Vector2d getSize() { return size; }
		
	@Override
	public void setPosition(Vector2d pos) { this.position = pos; }

	@Override
	public void setSize(Vector2d _size) { this.size = _size; }	

	@Override
	public boolean collide(ICollidable c) {
		// TODO Auto-generated method stub
		return false;
	}

}
