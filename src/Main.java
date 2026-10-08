package src;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static double aireCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }

    public static int secondConverter(int hour, int minute){
        return hour * 3600 + minute * 60;
    }

    public static boolean isOdd(int num){
        if (num % 2 == 0)
            return false;
        else
            return true;
    }



    public static int checkTheBigger(int a, int b, int c){
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int numOperation(int a, int b, char operation){
        if(operation == '+'){
            return a + b;
        } else if (operation == '-') {
            return a - b;
        } else if (operation == '*') {
            return a * b;
        }else if (operation == '/') {
            if (b == 0) {
                throw new ArithmeticException("we cant devide by 0");
            }
            else return a / b;
        }
        else throw new IllegalArgumentException("operation not supported " +operation);
    }

    public static void multiplicationTable(int n){
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void factorial(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("the input should be positive");
        }else{

            for (int i = 0; i < n; i++){
                int result = i * n;
                System.out.println(result);
            }
        }
    }

    public static long factorial2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("L'entrée doit être positive ou nulle.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // accumule le produit : result = result * i
        }

        return result;
    }

    public static void main(String[] args) {

//  déclarer une variable de type boolean et l’initialiser à false ;
        boolean isFalse;
        isFalse = false;
//• déclarer une variable de type int et l’initialiser à 10 ;
        int number;
        number = 10;
//• déclarer une variable de type double et l’initialiser à 3.5 ;
        double test;
        test = 3.5;
//• déclarer une variable de type char et l’initialiser à 'i' ;
        char lettre;
        lettre = 'i';
//• déclarer une variable de type String et l’initialiser à "Bonjour" ;
        String name;
        name = "Bonjour";
//• afficher toutes les valeurs dans la console.
       // System.out.println("isFalse: "+ isFalse + " ,number: " + number + " ,test: " +test+ " ,lettre: "+lettre+ " ,name: " + name);


//        Écrire une méthode qui reçoit en paramètre le rayon r d’un cercle et retourne son aire.
//        Tester cette méthode depuis la méthode main().

        double result = aireCercle(2);
        // System.out.println(result);


//        Écrire une méthode qui reçoit trois entiers représentant respectivement un nombre d’heures, de minutes et de
//        secondes, et retourne la durée totale exprimée en secondes.
//                Exemple : 1 h 10 min 30 s → 4230 secondes.

        int resultConverter = secondConverter(0,30);
        // System.out.println(resultConverter);

//    Écrire une méthode qui reçoit un entier et retourne true si cet entier est impair et false sinon.
//    Tester la méthode avec différentes valeurs.

        // System.out.println(isOdd(23));

//    Écrire une méthode qui reçoit trois entiers en paramètres et retourne le plus grand des trois.

        // System.out.println(checkTheBigger(2,8,25));

//        Écrire une méthode qui reçoit deux nombres et un opérateur parmi +, -, * et /.
//        La méthode retourne le résultat de l’opération demandée.
//        Penser au cas particulier de la division par zéro.

        //System.out.println(numOperation(12,0,'/'));

//        Écrire une méthode qui reçoit un entier n et affiche sa table de multiplication de 0 à 10.
//        Exemple pour n = 2 : 2 × 0 = 0, 2 × 1 = 2, …, 2 × 10 = 20.

        //multiplicationTable(23);

//        Écrire une méthode qui reçoit un entier positif n et retourne sa factorielle.
//                Exemple : 5! = 5 × 4 × 3 × 2 × 1 = 120.
//        Pour cet exercice, utiliser une boucle.
        factorial(9);
    }
}