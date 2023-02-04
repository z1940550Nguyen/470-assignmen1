


public class TestLine {
    public static void main(String args[]) {
        Line l1 = null;
        Line l2 = null;
        l1 = new Line(10, 10, 100, 100,5, "red");
        l1.draw();
        l1.setLine(5, 5, l1.getRight(), l1.getBottom(),5,"yellow");
        l1.draw();
        l1.getLength();
        l1.setLeft(3000);
        l1.draw();
        l2 = new Line(100, 100, 400, 400,5, "blue");
        l2.draw();
        l2.setBottom(479);
        l2.draw();

    }
}

