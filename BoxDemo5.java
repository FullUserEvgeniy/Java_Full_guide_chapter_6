// установка значений переменных экземпляра через метод, а не напрямую
// закрываем переменные экземпляра от доступа извне
// ключевое слово this
public class BoxDemo5 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.setDim(10, 20, 15);
        box2.setDim(3, 6, 9);

        System.out.println("Объем первой коробки равен: " + box1.volume() + " sm3");
        System.out.println("Объем второй коробки равен: " + box2.volume() + " sm3");
    }
    static class Box{

        private double width;
        private double height;
        private double depth;

        double volume(){
            return width * height * depth;
        }
        void setDim(double width, double height, double depth){
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
    }
}
/*
Объем первой коробки равен: 3000.0 sm3
Объем второй коробки равен: 162.0 sm3
 */