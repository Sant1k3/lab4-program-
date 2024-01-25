package ErrorsAndInterfaces;

import java.io.IOException;

public class SomeException extends IOException {
        private String name;
        public SomeException(String message, Throwable cause, String name){
            super(message, cause);
            this.name = name;
        }
        public SomeException(String message){
            super(message);
        }
    }


