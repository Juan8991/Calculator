package classes;

import com.sun.source.tree.WhileLoopTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int flag=0;
    public static void main(String[] args) {
        System.out.println("Bienvenid@ a tuCalculadora" +
                "\nLos números decimales se escriben con coma y no con punto, por ejemplo: 19,3");
        mainMenu();
    }
    public static void mainMenu(){
        Scanner in = new Scanner(System.in);
        Float result,number1,number2;
        int option;

        try {
            System.out.println("Ingresa el primer número: ");
            number1 = in.nextFloat();
            do {
                System.out.println("Elija una de las siguientes opciones: \n 1) Suma \n 2) Resta \n 3) Multiplicación \n 4) Divición");
                option = in.nextInt();

                if (option == 1) {
                    System.out.println("Ingrese otro número:");
                    number2 = in.nextFloat();
                    result = number1 + number2;
                    subMenu(result);
                } else if (option == 2) {
                    System.out.println("Ingrese otro número:");
                    number2 = in.nextFloat();
                    result = number1 - number2;
                    subMenu(result);
                } else if (option == 3) {
                    System.out.println("Ingrese otro número:");
                    number2 = in.nextFloat();
                    result = number1 * number2;
                    subMenu(result);
                } else if (option == 4) {
                    System.out.println("Ingrese otro número:");
                    number2 = in.nextFloat();
                    if(number2==0){
                        System.out.println("No es posible dividir por cero");
                    }else {
                        result=number1/number2;
                        subMenu(result);
                    }
                } else {
                    System.out.println("Mala Elección,Vuelva a elegir");
                }


            } while (flag==0);
        }catch (InputMismatchException exception){
            System.out.println("Mala elección");
            mainMenu();
        }
    }
    public static void subMenu(Float result){
        Scanner in = new Scanner(System.in);
        int option2;
        Float number2,result2 = result;


        do{
            System.out.println("Elija una de las siguientes opciones: \n 1) Suma \n 2) Resta \n 3) Multiplicación \n 4) Divición \n 5) Resultado \n 6) Salir");
            option2 =in.nextInt();
            if (option2 ==  1){
                System.out.println("Ingrese otro número:");
                number2 = in.nextFloat();
                result2=result2+number2;
            }else if(option2 == 2){
                System.out.println("Ingrese otro número:");
                number2 = in.nextFloat();
                result2=result2-number2;
            }else if(option2 == 3){
                System.out.println("Ingrese otro número:");
                number2 = in.nextFloat();
                result2=result2*number2;
            }else if(option2 == 4){
                System.out.println("Ingrese otro número:");
                number2 = in.nextFloat();
                if(number2==0){
                    System.out.println("No es posible dividir por cero");
                }else {
                result2=result2/number2;
                }
            }else if(option2 == 5){
                System.out.println("El resultado es:" + result2);
            }
            else if(option2 == 6){
                flag=1;
            }
        }while(flag==0);
    }

}
