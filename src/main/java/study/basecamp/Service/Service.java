package study.basecamp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import study.basecamp.Game.NumberGenerator;

import java.util.Random;

@org.springframework.stereotype.Service
public class Service {

    private NumberGenerator numberGenerator;

    @Autowired
    public void setNumberGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public String doYouGuess(int num){

        int randNum = numberGenerator.next();
        return randNum == num? "Win": "Lose";

    }

    //    public ResponseGame game(int guessNumber) {
//
//        int i = numberGenerator.numberGenerator();
//
//        if (i == guessNumber) {
//            return new ResponseGame("Your guess is: " +guessNumber,"W_I_N_N_E_R_!");
//
//        }
//
//        return  new ResponseGame("Your guess is: " +guessNumber,"L_O_O_S_E");
//}
}