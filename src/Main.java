public class Main {

    public static void main(String[] args) {
        int sPS1 = 123;
        int ePS1 = 250;
        int sPS2 =223;
        int ePS2 =444;
        if (sPS1<=sPS2 && ePS1 > sPS2 && ePS1 <= ePS2) {
            System.out.println("Точки пересечения отрезков " + sPS2 +" и " + ePS1);
        } else if (sPS1>=sPS2 && ePS1<=ePS2) {
            System.out.println("Точки пересечения отрезков " + sPS1+" и "+ ePS1);
        } else if (sPS1<=sPS2 && ePS1>ePS2) {
            System.out.println("Точки пересечения отрезков " + sPS2+" и "+ ePS2);
        } else if (sPS1>sPS2 && ePS1>ePS2 && ePS2>sPS1) {
            System.out.println(" Точки пересечения отрезков " + sPS1 + " и " + ePS2);
        } else if (sPS1==ePS2) {
            System.out.println(" Точка пересечения отрезков " + sPS1);
        } else if (ePS1==sPS2) {
            System.out.println("Точка пересечения отрезков " + ePS1);
        } else if ((sPS1 < ePS1 && ePS1 < sPS2 && sPS2 < ePS2) || (sPS1 > ePS1 && ePS1 > sPS2 && sPS2 > ePS2) || (sPS1< ePS1 && ePS1>ePS2 && sPS2<ePS2&&ePS2<sPS1)) {
            System.out.println(" Прямые не пересекаются ");
        }else{
            System.out.println("  Некоректный ввод  ");
        }
    }
}