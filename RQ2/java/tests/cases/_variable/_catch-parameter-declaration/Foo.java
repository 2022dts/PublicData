public class Foo{
    public static void main(String args[]) {
        try{
            int a[] = new int[2];
            a[3] = 1;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}