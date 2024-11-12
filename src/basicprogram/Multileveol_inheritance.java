package basicprogram;

public class Multileveol_inheritance {
	class one{
		public static void square(int s) {
			int area = s * s;
			System.out.println("Area of a square is "+ area);
		}
	}
	class two extends one {
		public static void rectangle(double l, double b) {
			double area = l * b;
			System.out.println("Area of a rectangle is "+area);
		}
		
	}
	class three extends two{
		public static void triangle(double b, double h) {
			double area = 0.5*b * h;
			System.out.println("Area of a triangle is "+area);
		}
	}
	class four extends three {
		void circle(int r) {
			double area = Math.PI * r* r;
			System.out.println("Area of a circle is "+area);
		}
		
		}
	class five extends four{
		void semicircle(int r) {
			double area = (Math.PI * r* r)/2;
			System.out.println("Area of a semicircle is "+area);
		}
		public static void main(String[] args) {
			square(5);
			rectangle(3.5,7);
			triangle(4,7);
			Multileveol_inheritance inheritance = new Multileveol_inheritance();
			five r = inheritance.new five();
			r.circle(8);
			r.semicircle(5);
			
		}
	}
	}



