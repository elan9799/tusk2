import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scun = new Scanner(System.in);
           //1st
        String x = scun.next();
        String y = scun.next();

        Integer da = Integer.valueOf(x);
        Integer ba = Integer.valueOf(y);
        if(da % ba == 0){
            System.out.println("делится");
        }else {
            System.out.println("не делится");
        }
            //2nd

        int a = scun.nextInt();
        int b = scun.nextInt();
        double fsd = (double) a / (double) b;
        System.out.println(fsd);
            //3rd

        String str = scun.next();
        char firstStr = str.charAt(0);
        int firstChar = Integer.valueOf(firstStr);
        if (firstChar <= 90  || firstChar > 1040 && firstChar <= 1071){
            System.out.println("все ок");  //А = 1040 Я = 1071 а = 1072 я =1103
        }else {
            System.out.println("слово начинается не с заглавной буквы");
        }
            //4th

        String NumberLine = scun.next();
        char gdz = NumberLine.charAt(0);
        char gmn = NumberLine.charAt(1);
        int numbr = Integer.valueOf(gdz - '0');
        int numbro = Integer.valueOf(gmn - '0');
        int boi = numbr + numbro;
        System.out.println(boi);
            //5th

        String God = scun.next();
        int lenght = God.length();
        String damnSon = God.substring(1 , lenght); //вот тут не понял почему не нужен lenght-1
        char firstGodStr = God.charAt(0);
        int firstGodChar = Integer.valueOf(firstGodStr);
        if(firstGodChar <= 90  || firstGodChar > 1040 && firstGodChar <= 1071){
            System.out.println("все ок расслабься");
        }else {
            firstGodChar = firstGodStr - 32;
            char presF = (char) firstGodChar;
            String dontKnow = String.valueOf(presF);
            System.out.println(dontKnow + damnSon);
        }
            //6th

        int vasilii = scun.nextInt();
        int pay = Integer.parseInt(Integer.toString(vasilii).substring(0, 1));
        int bills = Integer.parseInt(Integer.toString(vasilii).substring(1, 2));
        int mzf = Integer.parseInt(Integer.toString(vasilii).substring(2, 3));
        int ahah = pay + bills + mzf;
        System.out.println(ahah);

            //7th  как можно упростить схему?

        int pervorChislo = scun.nextInt();
        int vtoroeChislo = scun.nextInt();
        int treteChislo = scun.nextInt();
        if(pervorChislo % 2 == 0 && vtoroeChislo % 2 == 0 && treteChislo % 2 == 0){
            if (pervorChislo > vtoroeChislo && pervorChislo > treteChislo){
                System.out.println(pervorChislo);
            }else if (vtoroeChislo > pervorChislo && vtoroeChislo > treteChislo){
                System.out.println(vtoroeChislo);
            }else{
                System.out.println(treteChislo);
            }
        }else if(pervorChislo % 2 == 0 && vtoroeChislo % 2 == 0 && treteChislo % 2 != 0){
            if(pervorChislo > vtoroeChislo){
                System.out.println(pervorChislo);
            }else{
                System.out.println(vtoroeChislo);
            }
        }else if(pervorChislo % 2 == 0 && vtoroeChislo % 2 != 0 && treteChislo % 2 == 0){
            if(pervorChislo > treteChislo){
                System.out.println(pervorChislo);
            }else{
                System.out.println(treteChislo);
            }
        }else if(pervorChislo % 2 != 0 && vtoroeChislo % 2 == 0 && treteChislo % 2 == 0){
            if(vtoroeChislo > treteChislo){
                System.out.println(vtoroeChislo);
            }else{
                System.out.println(treteChislo);
            }
        }else if(pervorChislo % 2 != 0 && vtoroeChislo % 2 != 0 && treteChislo % 2 == 0){
            System.out.println(treteChislo);
        }else if(pervorChislo % 2 == 0 && vtoroeChislo % 2 != 0 && treteChislo % 2 != 0){
            System.out.println(pervorChislo);
        }else if(pervorChislo % 2 != 0 && vtoroeChislo % 2 == 0 && treteChislo % 2 != 0){
            System.out.println(vtoroeChislo);
        }else{
            System.out.println("нет четных камон");}

            //8th

        int my = scun.nextInt();
        int brain = scun.nextInt();
        int isBroken = scun.nextInt();
        if (my * my + brain * brain == isBroken * isBroken ){
            System.out.println("все оке");
        }else {
            System.out.println("все не ок");
        }
    }
}
