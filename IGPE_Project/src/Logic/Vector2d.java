package Logic;

public class Vector2d {

		public static Vector2d ZERO = new Vector2d(0, 0);
	
	    private  int x;
	    private  int y;
	    
	    public Vector2d(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	    
	    public Vector2d minus(Vector2d s) {
	        return new Vector2d(x - s.x, y - s.y);
	    }
	    
	    public Vector2d add(Vector2d s) {
	        return new Vector2d(x + s.x, y + s.y);
	    }

	    public int dot(Vector2d o) {
	        return x * o.x + y * o.y ;
	    }

	    public int abs() {
	        return (int) Math.sqrt(x * x + y * y );
	    }

		public int getX() {
			return x;
		}

	    public int getY() {
			return y;
		}

		/**
		 * @param x the x to set
		 */
		public void setX(int x) {
			this.x = x;
		}

		/**
		 * @param y the y to set
		 */
		public void setY(int y) {
			this.y = y;
		}

}
