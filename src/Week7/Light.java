package Week7;

import java.security.PrivilegedExceptionAction;

public enum Light {
    RED, YELLOW, GREEN;

   public String output;
    Light(int selection){
        switch (selection){
            default : {
                this.output = "Unsure, just drive";
                break;
            }
            case 1:{
                output = "STOP";
                break;
            }
            case 2:{
                output = "Slow Down";
                break;
            }
            case 3:{
                output = "GO!";
                break;
            }
        }
    }
}
