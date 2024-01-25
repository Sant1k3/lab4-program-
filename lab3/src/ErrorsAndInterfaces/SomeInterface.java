package ErrorsAndInterfaces;

import Characters.Character;
import ErrorsAndInterfaces.SomeException;

public interface SomeInterface {
    public void somemethod(Character c) throws SomeException;
}