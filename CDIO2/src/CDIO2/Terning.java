package CDIO2;

public class Terning {
<<<<<<< HEAD
		 
		static int antalØjne;
		
		public Terning(int øjne) {
			øjne = antalØjne;
		}
		
		public static int rulTerning() {
			antalØjne = (int)(Math.random()*6+1);
			return antalØjne;
		}
		
		public static int getAntalØjne() {
			return antalØjne;
		}
		
		public static void setAntalØjne(int nytAntalØjne) {
			antalØjne = nytAntalØjne;
		}
=======
	
	static int antalØjne;
	
	public Terning(int øjne) {
		
		øjne = antalØjne;
	}
	
	public static int rulTerning() {
		antalØjne = (int)(Math.random()*6+1);
		return antalØjne;
	}
	
	public static int getAntalØjne() {
		return antalØjne;
	}
	
	public static void setAntalØjne(int nytAntalØjne) {
		antalØjne = nytAntalØjne;
>>>>>>> branch 'Development' of https://github.com/Javan00bz/CDIO2.git
		
	}
