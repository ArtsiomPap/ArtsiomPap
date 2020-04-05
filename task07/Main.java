package by.htp.classAndObj.task07;

public class Main {

	public static void main(String[] args) {

		TriangleLogic triangleLogic = new TriangleLogic();

		Triangle triangle1 = triangleLogic.creatObj(3, 1, 5, 6, 7, 4);

		double perimetrTriangle1 = triangleLogic.perimetr(triangle1);
		double areaOf​​ATriangle = triangleLogic.areaOf​​ATriangle(triangle1);

		System.out.println("Периметр треугольника = " + perimetrTriangle1);

		System.out.println("Площадь треугольника = " + areaOf​​ATriangle);

		double medianInterseption[] = triangleLogic.medianInterseption(triangle1);
		System.out.println("Координаты точки пересечения медиан " + "x= " + medianInterseption[0] + " y= "
				+ medianInterseption[1]);
	}

}
