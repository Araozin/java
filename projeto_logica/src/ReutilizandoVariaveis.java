public class ReutilizandoVariaveis {
    public static void main(String[] args){
        double salario = 3000.00D;
        double resultado = salario * 0.5;
        System.out.println("50% eh: "+resultado);
        //alterando o valor da varia bem no meio do codigo, pelo visto no java funciona, muito nanaice.
        resultado = salario * 0.3;
        System.out.println("30% eh: "+ resultado);
        resultado = salario * 0.3;
        System.out.println("5% eh:" + resultado);

    }
}
