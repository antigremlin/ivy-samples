package spike.utils;

public class Bar {
    private String name;

    public Bar(Foo f) {
        name = f.toString();
    }

    public String getName() {
        return name;
    }
}
