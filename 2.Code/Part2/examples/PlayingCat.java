package Part2.examples;

public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer ,int temperature ){
        if ( temperature < 25  || temperature > 45){
            return false;
        }else{
            if (!summer){
                return temperature <= 35;
            }else{
                return true;
            }
        }

    }

}