package lab18;

public class Task1 {
    static void main() {
        var e = new Exception1();
        e.exceptionDemo();
    }

    static class Exception1{
        public void exceptionDemo() {
            try {
                System.out.println( 2 / 0 );
            } catch (ArithmeticException e){
                IO.println("Попытка деления на 0");
            }

        }
    }

    // 2 / 0
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    //	at lab18.Task1$Exception1.exceptionDemo(Task1.java:11)
    //	at lab18.Task1.main(Task1.java:6)
    // С точки зрения математики действительное целое число / 0 = ошибка, нет такого числа, которое представляет бесконечность
    // Если короче, то в целочисленной арифметике деление на 0 не определено

    // 2,0 / 0,0
    // Infinity
    // Потому что при делении чисел с дробной частью
    // (они представляют сами себя (рациональное число), это не приближенные представления чисел)
    // оператор '/' следует воспринимать как приближенное деление
    // хотя по стандарту IEEE (754) такое деление представляет собой четко определенную операцию
    // 0 / 0 = NaN
    // число / 0 = бесконечность со знаком
}
