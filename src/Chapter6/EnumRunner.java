package Chapter6;



public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;

        for (Shape elem: Shape.values()) {
            elem.setShape(3, i--);
            System.out.println(elem.name() + "-> " + elem.getParameters() + " Ploscha = " + elem.getSquare());
        }
    }
}