package dio.com;

public class CalcularEmprestimo {

    public static int duasParcelas(){
        return 2;
    }
    public static int tresParcelas(){
        return 3;
    }
    public static double taxaDuasParcelas(){
        return 0.3;
    }
    public static double taxaTresParcelas(){
        return 0.45;
    }

    public static void calculando(double valor, int parcelas){

        if(parcelas == 2){
            double valorFinal = valor + (valor * duasParcelas());
            System.out.println("Emprestimo com duas parcelas resulta: "+valorFinal);
        }else if (parcelas == 3){
            double valorFinal = valor + (valor * tresParcelas());
            System.out.println("Emprestimo com tres parcelas resulta: "+valorFinal);
        }else{
            System.out.println("Opcao invalida!");
        }
    }


}
