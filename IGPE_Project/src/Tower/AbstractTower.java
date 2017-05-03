package Tower;

import Logic.ICollidable;
import Logic.IGameObjectStatic;
import Logic.Vector2d;

public abstract class AbstractTower implements IGameObjectStatic{
		
		protected Vector2d position;
		protected Vector2d size = new Vector2d(3.0, 3.0);
		protected double attack = 0.0; 

		public String toString() {
			String s ="[";
			s+=" pos: "+position.toString();
			s+="]";
			return s;
		}
		
		public AbstractTower(Vector2d _position) {
			this.position = _position;
		}
			
		public Vector2d getCentre() {
			Vector2d posCentre = new Vector2d(position.getX() + size.getX(), position.getY() + size.getY()/2);
			return posCentre;
		}
		
		@Override
		public Vector2d getPosition() {
			return position;
		}
		
		@Override
		public Vector2d getSize() {
			return size;
		}
		
			public double getAttack() {
			return attack;
		}
			
		@Override
		public void setPosition(Vector2d pos) {
			position = pos;
			
		}

		@Override
		public void setSize(Vector2d _size) {
			this.size = _size;
			
		}	
		
		public void setAttack(double attack) {
			this.attack = attack;
		}
		
		@Override
		public boolean collide(ICollidable c) {
			// TODO Auto-generated method stub
			return false;
		}	

	}
