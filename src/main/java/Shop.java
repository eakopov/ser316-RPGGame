import items.*;
import java.util.Random;

public class Shop {

    public Armor returnFirstItem(){
        Random random = new Random();

        int randomNumber = random.nextInt(3) + 1;

        if(randomNumber == 1){

        } else if(randomNumber == 2){

        } else if(randomNumber == 3){

        } else {
            System.out.println("Error: Random Number Generator generating bad numbers :(");
        }
    }

    public void generateCondition() {
        
    }
}
