package Logic;

public interface IGameObjectDynamic extends IGameObjectStatic {

	  		//returns the velocity of the object
			public Vector2d getVelocity();
	  
			public void setVelocity(Vector2d _velocity);

			public void  move(final double dt);
				
	}
