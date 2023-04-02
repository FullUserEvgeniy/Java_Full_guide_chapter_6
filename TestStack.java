class TestStack{
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Стек mystack1: ");
        for (int i = 0; i < 10; i++) System.out.print(mystack1.pop() + " ");

        System.out.println("\nСтек mystack2: ");
        for (int i = 0; i < 10; i++) System.out.print(mystack2.pop() + " ");
    }
    // Этот класс реализует стек целых чисел , который может хранить 10 значений
    static class Stack {
        private int [] stck = new int[10];
        private int tos;

        Stack(){
            this.tos = -1;
        }

        void push (int item){
            if (tos == 9){
                System.out.println("Стек полон");
            }
            else stck[++tos] = item;
        }

        int pop(){
            if (tos < 0) {
                System.out.println("\nСтек пуст");
                return 0;
            }
            else return stck[tos--];
        }
    }
}

