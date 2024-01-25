package Characters;


import java.io.IOException;

public class Christofer extends Character {
    Boolean isbusy;

    public Christofer() {
        super("Кристофер Робен");
    }

    @Override
    public void action(String something, String something1){
        System.out.println(something + places + something1 + name);
        class Action{ //local class
            private String description = "this is an action";
            public String getDescription(){
                return this.description;
            }
        }
    }

    @Override
    public void action(String something){
        System.out.println(something + places);
    }

    public void checkbusy() throws IOException {
        System.out.println("Были ли заняты Кристофер и Кенга?");
        String check = br.readLine();
        switch (check){
            case("Да"):
                isbusy=true;
                break;
            case("Нет"):
                isbusy=false;
                break;
            default:
                System.out.println("Вы ввели некорректный ответ");
                checkbusy();
                break;
        }
    }

    public void busy(String something, String name1){
        if(isbusy==true) {
            System.out.println(name + something + name1);
        }
        else{
            System.out.println("Поскольку Кристофер не был занят, то они немедля отправились на Восточный Полюс по просьбе Пуха");
        }
    }
}

