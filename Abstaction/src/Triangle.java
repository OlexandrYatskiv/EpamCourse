public class Triangle extends Figure {
private int firstside, secondside, thirdside;

   Triangle(int firstside, int secondside , int thirdside)
   {

       this.thirdside = thirdside;
       this.secondside = secondside;
       this.firstside = firstside;
   }

    @Override
    void getNameFigure() {
        System.out.println("It`s a triangle");
    }

    @Override
    double Perimeter() {
      return  firstside + secondside + thirdside;
    }
}
