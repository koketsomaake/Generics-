
public class GenericClass<T> {
    private T type;

    public void setType(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public GenericClass(T type) {
        this.type = type;
    }

    public static <T> void ArrayContent(T[] type) {
        for (int i = 0; i <type.length; i++) {
            System.out.println(type[i]);
        }
        System.out.println();
    }

    public static void main(String[] Args){
        Integer[] intArray = { 12, 324, 6, 7900 };
        String[] stringArray = { "koketso", "maake ", "wilson", "hlogzen", "thabi" };

        System.out.println("Integer Array:");
        ArrayContent(intArray);

        System.out.println("String Array:");
        ArrayContent(stringArray);

        GenericClass<String> string = new GenericClass<String>("Test");
        System.out.println(string.type);

        GenericClass<Integer> number = new GenericClass<Integer>(1000);
        System.out.println(number.type);
    }
}





