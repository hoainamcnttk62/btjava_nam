package BTThoiGian;


public class Chay{
    public static void main(String[] args) {
        Time t = new Time(11, 3, 5);
        t.display();
        t.setTime(21, 39, 19);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(9, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}