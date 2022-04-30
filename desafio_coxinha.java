

    import java.text.ParsePosition;
    import java.util.Scanner;

    public class desafio_coxinha {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double participante= scan.nextInt();

            double coxinha = scan.nextInt();

//TODO: Complete os espaços em branco com uma possível solução para o desafio


            double media = participante/coxinha;


            System.out.printf("%.2f",media );

            scan.close();
        }
    }

