package Logic;

public abstract class AbstractGameObject implements IGameObject{
		
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
		
		public AbstractGameObject(Vector2d _position, Vector2d _size) {
			this.position = _position;
			this.size = _size;
		}
		
		@Override
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
		public void setPosition(Vector2d pos) {
			position = pos;
			
		}

		@Override
		public void setVelocity(Vector2d _vel) {
			this.velocity = _vel;
			
		}
		
		@Override
		public Vector2d getSize() {
			return size;
		}

		@Override
		public void setSize(Vector2d _size) {
			this.size = _size;
			
		}	

	}
