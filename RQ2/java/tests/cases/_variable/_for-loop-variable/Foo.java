public class Foo{
    public ArrayList<Integer> printTest() {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : this.test) {
            if (integer > this.getB()) {
                result.add(integer);
            }
        }
        return result;
    }
}