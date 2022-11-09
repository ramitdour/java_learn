package part11.exceptions;

public class Main {
    public static void main(String[] args) {

        try {
            int x = 1/1;

            throw  new Exception("RAMITTT");
        }catch (Exception e){
            System.out.println("Some errot");
            System.out.println(e);
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println();
        }
    }
}
