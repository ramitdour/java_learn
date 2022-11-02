package Part2;
public class FlourPacker {
    // write your code here
    public static void main(String[] args) {
        System.out.println( canPack(1,0,4));
        System.out.println( canPack(1, 0, 5));
        System.out.println( canPack(0,5,4));
        System.out.println( canPack(2,2,11));
        System.out.println( canPack(-3,2,12));

        System.out.println("");

        System.out.println( canPack(0,5,5));
        System.out.println( canPack(1,5,10));
        System.out.println( canPack(1,6,10));

//        false
//        true
//        true
//        true
//        false

        // true
        // true
        // true

    }

    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal <0){
            return false;
        }

        int req_5 = goal / 5;
        int req_1 = goal % 5;

        if(bigCount * 5 + smallCount < goal){
            return false;
        }

        if((bigCount >= req_5) && (smallCount >= req_1) ){
            return true;
        }

        if (   smallCount >= goal){
            return true;
        }

        if( (goal - bigCount*5 >= 0) && ( (goal - bigCount*5  - smallCount) <=0  )  ){
            return true;
        }

        return false;



    }
}
