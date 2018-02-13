public class Main{
    public static void main(String[] arg){
        System.out.println("");
        System.out.println("Clase de Programacion II");
        System.out.println("");
        System.out.println("\n\n\t Ejercicio Nº 1");
        System.out.println("");
        System.out.println("");

        int var1 = 50;
        int var2 = 20;
        float division = (var1/var2);

        System.out.println("La suma de los numeros "+var1+"+"+var2+" es= "+(var1+var2));
        System.out.println("La resta de los numeros "+var1+"-"+var2+" es= "+(var1-var2));
        System.out.println("La multiplicacion de los numeros "+var1+"*"+var2+" es= "+(var1*var2));
        System.out.println("La division de los numeros "+var1+"/"+var2+" es= "+division);

        int var3 = 100;

        while(var3>0){
            System.out.println(var3);
            var3--;
        }

        System.out.println("FIN");
    }
}

public class Sumar{
    int a = 3;
    int b = 4;

    public int sumanumero(){
        int c;
        c = a+b;

        return b;
    }
}