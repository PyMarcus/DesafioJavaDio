import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String palavra = input.nextLine();
        // melaomel
        String suporte = "";
        boolean ok = true;
        int contador = 0;
        int[] vetor2 = new int[30];
        int k = 0;
        int index = 0;
        for(int i = 0; i < palavra.length(); i++){
            if(palavra.length()  < 4){
                suporte = palavra;
                System.out.println(suporte);
                ok = false;
                break;
            }else{
                while(k < palavra.length()){
                    if(palavra.charAt(k) == palavra.charAt(i)) vetor2[k] = contador += 1;
                    k += 1;
                }
                k = 0;
                contador = 0;
            }
        }
        if(ok){
            for(int i = 0; i < vetor2.length; i++){
                if(i > 0){
                    if(vetor2[i] > vetor2[i - 1] && vetor2[i + 1]  > vetor2[i - 1]) {
                        index = i;
                        break;
                    }
                }
            }
            if(index == 0) System.out.print(palavra);
            System.out.println(palavra.substring(0, index));
        }


    }
}
