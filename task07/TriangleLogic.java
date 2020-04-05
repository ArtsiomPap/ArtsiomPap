package by.htp.classAndObj.task07;

public class TriangleLogic {

	public Triangle creatObj(int x1, int y1, int x2, int y2, int x3, int y3) {
		Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
		return triangle;
	}

	public double perimetr(Triangle triangle) {
		double AB;
		double BC;
		double AC;

		AB = Math.sqrt(
				Math.pow(triangle.getX2() - triangle.getX1(), 2) + Math.pow(triangle.getY2() - triangle.getY1(), 2));
		BC = Math.sqrt(
				Math.pow(triangle.getX3() - triangle.getX2(), 2) + Math.pow(triangle.getY3() - triangle.getY2(), 2));
		AC = Math.sqrt(
				Math.pow(triangle.getX3() - triangle.getX1(), 2) + Math.pow(triangle.getY3() - triangle.getY1(), 2));

		double perimetr = AB + BC + AC;

		return perimetr;
	}

	public double areaOf​​ATriangle(Triangle triangle) {
		double AB;
		double BC;
		double AC;

		AB = Math.sqrt(
				Math.pow(triangle.getX2() - triangle.getX1(), 2) + Math.pow(triangle.getY2() - triangle.getY1(), 2));
		BC = Math.sqrt(
				Math.pow(triangle.getX3() - triangle.getX2(), 2) + Math.pow(triangle.getY3() - triangle.getY2(), 2));
		AC = Math.sqrt(
				Math.pow(triangle.getX3() - triangle.getX1(), 2) + Math.pow(triangle.getY3() - triangle.getY1(), 2));

		double perimetr = AB + BC + AC;
		double poluPerimetr = perimetr / 2.0;
		double areaOf​​ATriangle = Math
				.sqrt(poluPerimetr * (poluPerimetr - AB) * (poluPerimetr - BC) * (poluPerimetr - AC));

		return areaOf​​ATriangle;
	}

	public double [] medianInterseption(Triangle triangle) {
	

		double[] middleAB = new double[2];
		middleAB[0]=(triangle.getX1()+triangle.getX2())/2;//координата по x
		middleAB[1]=(triangle.getY1()+triangle.getY2())/2;//координата по y
		
		double [] pointOfmedian= new double [2];

		pointOfmedian[0]=(1*triangle.getX1()+2*middleAB[0])/3;// кордината x пересечения медиан
		pointOfmedian[1]=(1*triangle.getY1()+2*middleAB[1])/3;//кордината y пересечения медиан
		return pointOfmedian;
	}
}
