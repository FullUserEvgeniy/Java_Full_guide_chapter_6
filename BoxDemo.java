// создание экземпляра класса и демонстрация разных ссылок на экземпляры
public class BoxDemo{
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        box2.width = 3;
        box2.height = 6;
        box2.depth = 9;

        vol = box1.width * box1.height * box1.depth;
        System.out.println("Объем первой коробки равен: " + vol);

        vol = box2.width * box2.height * box2.depth;
        System.out.println("Объем второй коробки равен: " + vol);
    }
    static class Box {
        double width;
        double height;
        double depth;
    }
}
/*
Объем первой коробки равен: 3000.0
Объем второй коробки равен: 162.0
 */

