package lab21;

import lab9.Student;

public class Task2 {
    public static class WideArray{
        private final Object[] array;
        private int size = 0;

        public WideArray(int capacity){
            array = new Object[capacity];
        }

        public Object getElement(int index){
            if (index >= array.length)
                throw new ArrayIndexOutOfBoundsException();

            return array[index];
        }

        public <T> T getElement(int index, Class<T> type){
            if (index >= array.length)
                throw new ArrayIndexOutOfBoundsException();

            var e = array[index];

            if (!type.isInstance(e))
                throw new ClassCastException();

            return type.cast(e);
        }

        public void addElement(Object e){
            if (size >= array.length)
                throw new ArrayIndexOutOfBoundsException();

            array[size++] = e;
        }

        public void printAll(){
            for (var e : array)
                if (e != null)
                    IO.println(e.toString());
        }
    }

    static void main() {
        var arr = new WideArray(5);
        arr.addElement(12);
        arr.addElement("My String");
        arr.addElement(new Student(12, 64));
        arr.printAll();
    }
}
