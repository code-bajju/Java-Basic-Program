public class Methods {
    /*
     * Method
     * 
     * // if we dont want to use static then we have to create a object in main
     * method
     * static int sum(int a, int b) {
     * int z;
     * z = a + b;
     * return z;
     * }
     * 
     * 
     * public static void main(String[] args) {
     * int x = 9;
     * int y = 7;
     * int v;
     * v = sum(x, y);
     * // method invocation using Object Creation
     * // Methods obj = new Methods();
     * // v = obj.sum(x,y);
     * System.out.println(v);
     * }
     */

    // void method which doesnt return any value
    /*
     * static void bajju(){
     * System.out.
     * println("What’s the best thing about Switzerland? \nI don’t know, but the flag is a big plus."
     * );
     * }
     * public static void main(String[] args) {
     * bajju();
     * }
     */

    /*
     * static void hw(int[] marks) {
     * marks[0] = 90;
     * }
     * 
     * public static void main(String[] args) {
     * int[] arr = { 42, 34, 56, 67, 78, 45 };
     * hw(arr);
     * for (int element : arr) {
     * System.out.println(element);
     * }
     * }
     */

    // method overloading

    // static void fun(){
    // System.out.println("Hello Boys");
    // }
    // static void fun(int a){
    // System.out.println("Hello Girls" + a);
    // }
    // public static void main(String[] args) {
    // fun(9);
    // }
    // //parameters
    // //arguments are actual

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to Varargs");
        System.out.println("sum of 4 and 5 is :" + sum(4,5));
        System.out.println("sum of 4 5 6 is :" + sum(4,5,6));
    }

}
