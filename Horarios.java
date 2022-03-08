package dio.com;

public class Horarios{

    public static void Turno(int hora){

        switch (hora){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                BoaMadrugada();
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                BomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                BoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                BoaNoite();
                break;
            default:
                System.out.println("Opcao invalida!");
                break;



        }

    }

    public static void BoaMadrugada(){
        System.out.println("Tenha uma otima madrugada!");
    }
    public static void BomDia(){
        System.out.println("Tenha um bom dia!");

        }

    public static void BoaTarde(){
        System.out.println("Tenha uma boa tarde!");
        }
    public static void BoaNoite(){
        System.out.println("Tenha uma boa noite!");
        }
    }

