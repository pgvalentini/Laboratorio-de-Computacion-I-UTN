package TrabajoPrácticoDos;

import java.util.Scanner;

public class Ej_04 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingese el importe para saber que cantidad de billetes y monedas necesitas");
    double numero = sc.nextDouble();
    int numero1,doscientos,cien,cincuenta,veinte,diez,cinco,dos,uno,cincuentacen,veinticincocen,diezcen,cincocen;
    double mod;
    doscientos = (int)numero/200;
    cien = (int)((numero-(doscientos*200))/100); 
    cincuenta = (int)((numero-(doscientos*200)-(cien*100))/50);
    veinte = (int)((numero-(doscientos*200)-(cien*100)-(cincuenta*50))/20);
    diez = (int)((numero-(doscientos*200)-(cien*100)-(cincuenta*50)-(veinte*20))/10);
    cinco = (int)((numero-(doscientos*200)-(cien*100)-(cincuenta*50)-(veinte*20)-(diez*10))/5);
    dos = (int)((numero-(doscientos*200)-(cien*100)-(cincuenta*50)-(veinte*20)-(diez*10)-(cinco*5))/2);
    uno = (int) ((numero-(doscientos*200)-(cien*100)-(cincuenta*50)-(veinte*20)-(diez*10)-(cinco*5)-(dos*2)));
    numero1=(int)numero;
    cincuentacen = (int)(((numero-numero1)*100)/50);
    veinticincocen = (int)((((numero-numero1)*100-(cincuentacen*50)))/25);
    diezcen = (int)((((numero-numero1)*100-(cincuentacen*50)-(veinticincocen*25)))/10);
    cincocen = (int)((((numero-numero1)*100-(cincuentacen*50)-(veinticincocen*25)-(diezcen*10)))/5);
    
    if(numero>1)System.out.print("se necesitan las siguiente cantidad de billetes");
    if(doscientos!=0)System.out.print(", "+doscientos+" de 200");
    if(cien!=0)System.out.print(", "+cien+" de 100");
    if(cincuenta!=0)System.out.print(", "+cincuenta+" de 50");
    if(veinte!=0)System.out.print(", "+veinte+" de 20");
    if(diez!=0)System.out.print(", "+cien+" de 10");
    if(cinco!=0)System.out.print(", "+cinco+" de 5");
    if(dos!=0)System.out.print(", "+dos+" de 2");
    if(uno!=0)System.out.print(", "+uno+" de 1");
    if((cincuentacen+veinticincocen+diezcen+cincocen)>0)System.out.print(" y se necesitan las siguientes monedas");
    if(cincuentacen!=0)System.out.print(", "+cincuentacen+" de 50");
    if(veinticincocen!=0)System.out.print(", "+veinticincocen+" de 25");
    if (diezcen!=0)System.out.print(", "+diezcen+" de 10");
    if (cincocen!=0)System.out.print(", "+cincocen+" de 5");
    System.out.println();
        
    }
    
}
