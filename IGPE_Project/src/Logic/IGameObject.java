package Logic;

public interface IGameObject extends ICollidable {

		//return the size in pixels of the object
		public Vector2d getSize();
		
		//returns the coordinate of the upper left corner 
		public Vector2d getPosition();
		
		//returns the velocity of the object
		public Vector2d getVelocity();
		
		public void setPosition(Vector2d _position);
		public void setVelocity(Vector2d _velocity);
		public void setSize(Vector2d _size);
		
		
		public void  move(final double dt);
		
			
	}
