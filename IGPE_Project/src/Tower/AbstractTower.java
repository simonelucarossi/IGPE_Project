package Tower;

import Logic.ICollidable;
import Logic.IGameObjectStatic;
import Logic.Vector2d;

public abstract class AbstractTower implements IGameObjectStatic{
		
		Vector2d position;
		Vector2d size = new Vector2d(3, 3);
		int attack; 
		int level = 1, levelMax = 3;
		
		public AbstractTower(Vector2d _position) {
			this.position = _position;
		}
			
		public void upLevelTower() { 
			if(!checkLevelMax()) { 
					level++;
					size.setX(size.getX()+2);
					size.setY(size.getY()+2);
					attack += attack/4;		
			}
		}
		
		public boolean checkLevelMax() { return level==levelMax; }
		
		public Vector2d getCentre() {
			Vector2d posCentre = new Vector2d(position.getX() + size.getX()/2, position.getY() + size.getY()/2);
			return posCentre;
		}
		
		@Override
		public Vector2d getPosition() { return position; }
		
		@Override
		public Vector2d getSize() { return size; }
		
		public int getAttack() { return attack; }
			
		@Override
		public void setPosition(Vector2d pos) { this.position = pos; }

		@Override
		public void setSize(Vector2d _size) { this.size = _size; }	
		
		public void setAttack(int attack) { this.attack = attack; }
		
		@Override
		public boolean collide(ICollidable c) {
			// TODO Auto-generated method stub
			return false;
		}	

	}
