package Tower;

import Logic.ICollidable;
import Logic.IGameObjectStatic;
import Logic.Vector2d;

public abstract class AbstractTower implements IGameObjectStatic{
		
		protected Vector2d position;
		protected Vector2d size;
		
		public String toString() {
			String s ="[";
			s+=" pos: "+position.toString();
			s+="]";
			return s;
		}
		
		public AbstractTower(Vector2d _position, Vector2d _size) {
			this.position = _position;
			this.size = _size;
		}
		
		@Override
		public Vector2d getPosition() {
			return position;
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
		public void setSize(Vector2d _size) {
			this.size = _size;
			
		}	
		
		@Override
		public boolean collide(ICollidable c) {
			
			return false;
		}	

	}
