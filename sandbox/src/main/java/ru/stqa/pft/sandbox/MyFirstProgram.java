package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args){

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle();
    r.a = 4;
    r.b = 6;
    System.out.println("Площадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + area(r));
  }

  public static double area(Rectangle r){
    return r.a * r.b;
  }

  public static double area(Square s) {
    return s.l * s.l;
  }
}
