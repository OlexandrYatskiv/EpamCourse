
public class Main  {
    public static void main(String[] args) {
FirstClass firstClass = new FirstClass("Hello world");
        System.out.println(firstClass.toString());
        System.out.println((firstClass.charAt(1)));
        System.out.println(firstClass.length());
        System.out.println(firstClass.subSequence(2,9));
        System.out.println(firstClass.isEmpty());

    }
}