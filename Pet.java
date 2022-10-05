

public class Pet<VariableType>{
    private String petName;
    private String petType;
    private VariableType petColor;
    

    public void setPetColor(VariableType petColor){
        this.petColor=petColor;
    }
    public VariableType getPetColor(){
        return petColor;
    }

    public void setPetType(String petType){
        this.petType=petType;
    }
    public String getPetType(){
        return petType;
    }

    public void setPetName(String petName){
        this.petName=petName;
    }
    public String getPetName(){
        return petName;
    }
}
