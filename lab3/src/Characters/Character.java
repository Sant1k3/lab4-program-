package Characters;
import places.Places;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public abstract class Character{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    protected String name;
    protected int age;
    protected String places;
    protected String sub;
    protected String action;

    public Character(String name){
        this.name = name;
    }

    public void action(String something, String something1){
    }
    public void action(String something){
    }

    public void SetPlace(Places place){
        places = place.GetPlace();
    }

    public String GetName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
