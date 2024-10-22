class Shape
{
 void draw(){ System.out.println("drawing shape");}
 void erase(){ System.out.println("erasing shape");}
}
 class Oval extends Shape
 {
 void draw(){ System.out.println("drawing Oval");}
 void erase(){ System.out.println("erasing circle");}
 }
 class Square extends Shape
 {
 void draw(){ System.out.println("drawing Square");}
 void erase(){ System.out.println("erasing Square");}
 }
 class Rhombus extends Shape
 {
 void draw(){ System.out.println("drawing Rhombus");}
 void erase(){ System.out.println("erasing Rhombus");}
 }

 public class Polymorphism
 {
   public static void main(String[]args)
   {
     Shape S = new Shape();
     Shape o = new Oval();
     Shape s = new Square();
     Shape r = new Rhombus();
     o.draw();
     o.erase();
     s.draw();
     s.erase();
     r.draw();
     r.erase();
   }
}