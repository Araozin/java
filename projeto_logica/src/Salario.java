//Deu alguma coisa errada kkkkkk
public class Salario {
    public static void main(String[] args){
        float salario = 2100.00f;
        float porcetagem_1 = 30;
        float porcetagem_2 = 15;
        float porcetagem_3 = 5;
        //Calculo para o salario se transformar em '%'
        float calculoDaPorcetagem_1 = (porcetagem_1 /100) * salario;
        float calculoDaPorcetagem_2 = (porcetagem_2 /100) * salario;
        float calculoDaPorcetagem_3 = (porcetagem_3 /100) * salario;
        float resultado = (int)calculoDaPorcetagem_1;
        float segundoValor =(int)calculoDaPorcetagem_2;
        float terceiroValor = (int)calculoDaPorcetagem_3;

        System.out.println("Seu valor e: " + resultado + segundoValor + terceiroValor);
    }
}
