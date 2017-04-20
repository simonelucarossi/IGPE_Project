package Logic;

public interface IGameObjectDynamic extends ICollidable {

			//////////
	  		/// Getters and Setters
	  
	  		// Getters
			// return the size of the object
			public Vector2d getSize();
			
			// returns the coordinate of the upper left corner 
			public Vector2d getPosition();
	  		
	  
	 		// Setters 
	  
	        public void setSize(Vector2d _size);
			public void setPosition(Vector2d _position);

	}
