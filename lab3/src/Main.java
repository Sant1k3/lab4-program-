import Characters.*;
import Characters.Character;
import ErrorsAndInterfaces.SomeException;
import ErrorsAndInterfaces.SomeInterface;
import ErrorsAndInterfaces.TestException;
import places.Places;
import places.South;
import places.East;
import places.West;

import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {
        Places south = new South();
        Places east = new East();
        Places west = new West();
        Christofer christofer = new Christofer();
        Puh puh = new Puh();
        Character kenga = new Kenga();
        PuhOnWest puhOnWest = new PuhOnWest();

        SomeInterface someInterface = new SomeInterface() {          //анонимный класс
            String name = kenga.GetName();
            @Override
            public void somemethod(Character c) throws SomeException {
                if (c.GetName().isEmpty()){
                    throw new SomeException("Some text for check");
                }
                System.out.println(name + " принадлежал " + c.GetName());
            }
        };

        christofer.SetPlace(south);
        christofer.action("Есть еще ", " -- сказал ");
        christofer.SetPlace(east);
        christofer.action("где-то есть ");
        christofer.SetPlace(west);
        christofer.action("и ");
        puh.SetPlace(east);
        puh.hearmessage();
        puh.action(" очень взволновался и предложил устроить экспедицию к ");
        christofer.checkbusy();
        christofer.busy(" был чем-то занят с ", kenga.GetName());
        puh.checkopen();
        puh.opened();
        puhOnWest.checkcold();
        puhOnWest.dreamwest();
        puhOnWest.checksize();
        puhOnWest.sleepinhole();
        puhOnWest.bugscheck();
        puhOnWest.bugdream();

        //Try Catch structure
        kenga.setAge(10);
        try{
            Kenga.Options.giveAnAge(kenga.getAge(), kenga.GetName());
        }catch (TestException e){
            System.err.println(e.getMessage());
        }
        //test local class

    }

}