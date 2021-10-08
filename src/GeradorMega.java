import java.util.Random;

public class GeradorMega {


    public static void main(String[] args) {

        Random gerador = new Random();

        int i = 0;
        while (i < 6) {
            int num = gerador.nextInt(60);
            System.out.println(num);
            i++;
        }
    }
}
