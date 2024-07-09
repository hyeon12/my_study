package chapter14.src;

public class Setter {
    private String name;
    private String hobby;

    public Setter(String hobby){
        this.hobby = hobby;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Setter{" +
                "name='" + name + '\'' + "hobby=" + hobby +
                '}';
    }
}
