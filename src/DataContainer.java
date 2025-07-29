public class DataContainer<T extends  Number> {
    private T value;
    public DataContainer(T Value) {
        this.value =Value;
    }
    public double getDoubleValue() {
        return value.doubleValue();
    }

    public static void main(String[]  args  ) {
        DataContainer d = new DataContainer<>(10 );
        System.out.println(d);
    }
}
