package Characters;

import java.io.IOException;

public class Puh extends Character {
    public boolean hearmessage;
    public boolean check;
    public Puh() {
        super("Пух");
    }
    @Override
    public void action(String something) {
        if (hearmessage == true) {
            System.out.println(name + something + places);
        }
        else{
            System.out.println("Пух не услышал о Восточном Полюсе! Попробуйте ввести другой ответ");
            System.exit(1);
        }
    }



    public void hearmessage() throws IOException {
        System.out.println("Услышал ли Пух сообщение о Восточном Полюсе?");
        String reply = br.readLine();
        switch(reply){
            case("Да"):
                hearmessage = true;
                break;
            case("Нет"):
                hearmessage = false;
                break;
            default:
                System.out.println("Вы ввели некорректный ответ");
                hearmessage();
                break;
        }
    }

    public void checkopen() throws IOException{
        System.out.println("Смог ли Пух попасть на Восточный Полюс?");
        String read = br.readLine();
        switch (read){
            case("Да"):
                check = true;
                break;
            case("Нет"):
                check = false;
                break;
            default:
                System.out.println("Вы ввели некорректный ответ!");
                checkopen();
        }
    }

    public void opened(){
        if (check==true){
            System.out.println("Пух побывал на Восточном Полюсе и был в шоке от увиденного");
            System.out.println("Вернувшись, Пуху снился, увиденный им Восточный Полюс");
        }
        else{
            System.out.println("Пух не смог добраться до Восточного Полюса");
            System.out.println("Вернувшись, Пуху снился, так и непокоренный Восточный Полюс");
        }
    }
}