
    import java.util.Scanner;

    public class desafio_competidores {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String T = scan.nextLine();
            String respostasCompetidores = scan.nextLine();
            String []respostasCompetidoresSplit = respostasCompetidores.split(" ");
            int count = 0;


//TODO: Complete o código com uma possível solução para o problema.



                for(int i=0;i< respostasCompetidoresSplit.length;i++){
                    if(T.equals(respostasCompetidoresSplit[i])){


                        count++;
                    }}

                System.out.println(count);
                scan.close();
            }
        }

