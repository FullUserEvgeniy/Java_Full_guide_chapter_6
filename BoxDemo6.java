// создание экземпляра класса с одновременной инициализацией переменных экземпляра в конструкторе
public class BoxDemo6 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(3, 6, 9);

        System.out.println("Объем первой коробки равен: " + box1.volume() + " sm3");
        System.out.println("Объем второй коробки равен: " + box2.volume() + " sm3");
    }

    static class Box{
        private double width;
        private double height;
        private double depth;

        Box(double width, double height, double depth){
            System.out.println("Сздаем экземпляр класса Box, и устанавливаем значение переменным экземпляра в конструкторе");
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        double volume(){
            return width * height * depth;
        }
    }
}
/*
Сздаем экземпляр класса Box, и устанавливаем значение переменным экземпляра в конструкторе
Сздаем экземпляр класса Box, и устанавливаем значение переменным экземпляра в конструкторе
Объем первой коробки равен: 3000.0 sm3
Объем второй коробки равен: 162.0 sm3
 */