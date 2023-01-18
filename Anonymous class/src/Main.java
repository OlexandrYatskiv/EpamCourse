public class Main {
    public static void main(String[] args) {
        Button coppyBtn = new Button() {
            @Override
            public void click() {
                System.out.println("copy something with copy button");
            }

        };
        coppyBtn.click();
    }
}