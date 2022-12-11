public class Square extends Figure{
   private int sideSquare;

    Square(int sideSquare)
    {
       this.sideSquare = sideSquare;

    }

    @Override
    void getNameFigure() {
        System.out.println("It`s a square!");
    }

    @Override
    double Perimeter() {
        return sideSquare*4;
    }
}
