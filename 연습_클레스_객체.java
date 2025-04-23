/*
삼각형 클래스를 만들어서 
높이와 밑변의 길이를 변수로 만들고 
넓이를 구하는 함수를 만들어서 
메인클래스에서 출력하시오
*/
/*
import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("밑변 : ");
	    double base = sc.nextDouble();
	    System.out.println("높이 : ");
	    double height = sc.nextDouble();
	    Triangle t = new Triangle();
	    
		System.out.println("넓이 : "+ t.getArea(base,height));
	}
}

class Triangle {
    double base;   
    double height;

    public double getArea(double a, double b){
        base = a;
        height = b;
        return (base*height) / 2;
    }
}
*/
import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("밑변 : ");
	    double base = sc.nextDouble();
	    System.out.println("높이 : ");
	    double height = sc.nextDouble();
	    Triangle t = new Triangle(base, height);
	    
		System.out.println("넓이 : "+ t.getArea());
	}
}

private class Triangle {
    double base;   
    double height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    public double getArea(){
        return (base*height) / 2;
    }
}
