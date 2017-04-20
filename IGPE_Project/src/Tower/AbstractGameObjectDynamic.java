package Tower;

import Logic.ICollidable;
import Logic.IGameObjectDynamic;
import Logic.Vector2d;

public abstract class AbstractGameObjectDynamic implements IGameObjectDynamic{
		
		protected Vector2d position;
		protected Vector2d size;
		protected Vector2d velocity 	= new Vector2d(0.0, 0.0);
		
		public String toString() {
			String s ="[";
			s+=" pos: "+position.toString();
			s+=" vel: "+velocity.toString();
			s+="]";
			return s;
		}
		
		public AbstractGameObjectDynamic(Vector2d _position, Vector2d _size) {
			this.position = _position;
			this.size = _size;
		}
		
		
		public void move(final double dt) {

		}
		
		@Override
		public Vector2d getPosition() {
			return position;
		}

		@Override
		public Vector2d getVelocity() {
			return velocity;
		}
		
		@Override
		public Vector2d getSize() {
			return size;
		}
		
		@Override
		public void setPosition(Vector2d pos) {
			position = pos;
			
		}

		@Override
		public void setVelocity(Vector2d _vel) {
			this.velocity = _vel;
			
		}

		@Override
		public void setSize(Vector2d _size) {
			this.size = _size;
			
		}	
		
		@Override
		public boolean collide(ICollidable c) {
			
			return false;
		}	

	}
