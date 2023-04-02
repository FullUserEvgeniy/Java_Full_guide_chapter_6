// возврат данных из метода экземпляра класса
public class BoxDemo4 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        box2.width = 3;
        box2.height =6;
        box2.depth = 9;

        System.out.println("Объем первой коробки равен: " + box1.volume() + " sm3");
        System.out.println("Объем второй коробки равен: " + box2.volume() + " sm3");
    }
    static class Box{

        double width;
        double height;
        double depth;

        double volume(){
            return width * height * depth;
        }
    }
}
/*
Объем первой коробки равен: 3000.0 sm3
Объем второй коробки равен: 162.0 sm3
 */