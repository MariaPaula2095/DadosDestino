import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int vidas=5;
     int puntos= 0;
     int dado;
     int rondas=0;
     boolean estado=true;

     Random ale = new Random();

     do {
         dado = ale.nextInt((6 - 1 +1)) + 1;
         System.out.println("Vidas = 5  / Puntos= "+puntos + " El numero del dado es: "+dado );
         rondas++;
         System.out.println("El numero de rondas es " + rondas);

     if (dado==1) {

         vidas-= 1;
         System.out.println("Usted ha perdido una vida. Su numero de vidas es: " + vidas
         + " Su numero de puntos es: " + puntos);

     } else if (dado==6) {

         puntos+= 3;
         System.out.println("Ha ganado 3 puntos. Puntos= "+ puntos);


     } else if (dado==2) {

         puntos+= 1;
         System.out.println("Ha ganado 1 punto. Puntos= "+ puntos);


     } else if (dado==4) {

         puntos+= 1;
         System.out.println("Ha ganado 1 punto. Puntos= "+ puntos);


     } else if (dado==3) {
         puntos+=0;
         System.out.println("Ha ganado 0 puntos. Puntos= "+ puntos);


     }else if (dado == 5) {
         puntos+= 0;
         System.out.println("Ha ganado 0 puntos. Puntos= " + puntos);

     }
     if (puntos>10) {
             estado=false;
             System.out.println("Usted ha ganado el juego");
     }
     if (vidas==0){
         estado=false;
         System.out.println("Usted ha perdido el juego");
     }

     }while (estado);


    }
}