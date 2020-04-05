package by.htp.classAndObj.task07;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки
 *  пересечения медиан.  
 */
public class Triangle {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int y3;
	private int x3;

	public Triangle() {

	}
	
	public Triangle (int x1,int y1,int x2,int y2,int x3,int y3) {
		this.x1=x1;
		this.x2=x2;
		this.x3= x3;
		this.y1= y1;
		this.y2= y2;
		this.y3= y3;
	}

	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	@Override
	public String toString() {
		return "Triangle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", y3=" + y3 + ", x3=" + x3 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x1;
		result = prime * result + x2;
		result = prime * result + x3;
		result = prime * result + y1;
		result = prime * result + y2;
		result = prime * result + y3;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (x1 != other.x1)
			return false;
		if (x2 != other.x2)
			return false;
		if (x3 != other.x3)
			return false;
		if (y1 != other.y1)
			return false;
		if (y2 != other.y2)
			return false;
		if (y3 != other.y3)
			return false;
		return true;
	}
	
}
