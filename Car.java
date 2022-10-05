public class Car<DataType> {
    private String name;
    private DataType obj;
    public Car (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public DataType getObj() {
        return obj;
    }

    public void setObj(DataType obj) {
        this.obj = obj;
    }
}