package Characters;

import ErrorsAndInterfaces.TestException;

public class Kenga extends Character{
    public Kenga(){
        super("Кенга");
    }


    public static class Options { //внутренний статический класс, вложенный
        public static void giveAnAge(int value, String name) throws TestException {
            if (value > 10) {
                throw new TestException("Число слишком большое");
            } else if (value <= 0) {
                throw new TestException("Число слишком маленькое");
            } else {
                System.out.println(name + " " + value + " лет");
            }
        }
    }
}
