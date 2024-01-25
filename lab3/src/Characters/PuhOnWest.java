package Characters;

import java.io.IOException;

public class PuhOnWest extends Puh{
    boolean boolcold;
    public void checkcold() throws IOException {
        System.out.println("Было ли холодно на Восточном Полюсе?");
        String cold = br.readLine();
        switch (cold){
            case("Да"):
                boolcold = true;
                break;
            case("Нет"):
                boolcold = false;
                break;
            default:
                System.out.println("Вы ввели некорректный ответ!");
                checkcold();
        }
    }
    public void dreamwest(){
        if(boolcold == true){
            System.out.println("Восточный Полюс был весь покрыт льдом и снегом");
        }
        else{
            System.out.println("Восточный Полюс был вовсе не холоден, прекрасная погода стояла снаружи!");
        }
    }

    boolean sizebool;
    public void checksize() throws IOException{
        System.out.println("Пух разыскал пчелиный улей и улегся там спать");
        System.out.println("Было ли достаточно места Пуху?");
        String size = br.readLine();
        switch (size){
            case("Да"):
                sizebool = true;
                break;
            case("Нет"):
                sizebool = false;
                break;
            default:
                System.out.println("Вы ввели некорректный ответ!");
                checksize();
        }
    }
    public void sleepinhole(){
        if (sizebool==true){
            System.out.println("Пуху было достаточно места в улье, он съел столько меда, сколько захотел, а после проснулся....");
            System.exit(1);
        }
        else{
            System.out.println("Пуху было недостаточно места, поэтому его ножки торчали из улья");
        }
    }
    public boolean bugsbool;
    public void bugscheck() throws IOException{
        System.out.println("Снился ли Пуху неприятный сон про жуков?");
        String reply = br.readLine();
        switch (reply){
            case("Да"):
                bugsbool = true;
                break;
            case("Нет"):
                bugsbool = false;
                break;
            default:
                System.out.println("Вы ввели некорректный ответ!");
                bugscheck();
        }
    }
    public void bugdream(){
        if(bugsbool == true){
            System.out.println("И вдруг, откуда ни возьмись, пришли Дикие Буки, обитающие на Восточном Полюсе, и стали выщипывать мех на лапках Пуха, чтобы устроить гнезда для своих малышей, и чем больше они щипали, тем холоднее становилось лапкам, и наконец Пух проснулся с криком и обнаружил, что он сидит на стуле, а ноги у него в воде и вокруг него всюду тоже вода!");
        }
        else{
            System.out.println("Пух спал очень хорошо, и проснувшись, пошел по своим медвежьим делам");
        }
    }

}
