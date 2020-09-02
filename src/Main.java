import java.util.*;
public class Main
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int i;
        char c;
        boolean b = false;

        while(b==false){
            System.out.println("Select a function: 1.) Addition 2.) Subtraction 3.) Multiplication 4.) Division  5.) Percent 6.) Remainder");
            System.out.println();
            System.out.println("7.) Log 8.) Root function 9.) Trigonometric functions 10.) Power function 11.) Fibonacci series");
            System.out.println();
            System.out.println("12.) Ascii conversion 13.) Binary, Octal, and Hexadecimal conversion  14.) Free form calulation.");

            int x = scan.nextInt();

            switch(x){

                case 1:
                    add();
                    break;

                case 2:
                    sub();
                    break;

                case 3:
                    times();
                    break;

                case 4:
                    divide();
                    break;

                case 5:
                    percent();
                    break;

                case 6:
                    remainder();
                    break;

                case 7:
                    log();
                    break;

                case 8:
                    root();
                    break;

                case 9:
                    trig();
                    break;

                case 10:
                    pow();
                    break;

                case 11:
                    fibo();
                    break;

                case 12:
                    ascii();
                    break;

                case 13:
                    boh();
                    break;

                case 14:
                    free();
                    break;

                default:
                    System.out.println("That is not a valid number choice!");
                    System.out.println();
            }

            System.out.println("Do you wish to continue (Y/N)");
            c = scan.next().charAt(0);
            c = Character.toUpperCase(c);

            if(c=='N'){
                b=true;
            }
            else if (c=='Y'){
                b=false;
            }
            else{
                System.out.println("Invalid input, please enter (Y/N)");
                c = scan.next().charAt(0);
                c = Character.toUpperCase(c);
            }
            System.out.println();
        }
    }

    public static void add(){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you wish to use? ");
        int x = scan.nextInt();
        int num = 0;

        if(x <= 4){
            int arr [] = new int [x];

            for(int i = 0; i < x; i++){
                arr [i] = scan.nextInt();
                num = num + arr[i];
            }
            System.out.println(num);
            System.out.println();
        }
        else{
            System.out.println("Not a valid number choice!");
            System.out.println();
        }
    }

    public static void sub(){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you wish to use? ");
        int x = scan.nextInt();
        int num = 0;

        if(x <= 4){
            int arr [] = new int [x];

            for(int i = 0; i < x; i++){
                arr [i] = scan.nextInt();
                if(i == 0){
                    num = arr[i];
                }
                else{
                    num = num - arr[i];
                }
            }
            System.out.println(num);
            System.out.println();
        }

        else{
            System.out.println("Not a valid number choice!");
            System.out.println();
        }
    }

    public static void times(){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you wish to use? ");
        int x = scan.nextInt();
        int num = 1;

        if(x <= 4){
            int arr [] = new int [x];

            for(int i = 0; i < x; i++){
                arr [i] = scan.nextInt();
                num = num * arr[i];
            }
            System.out.println(num);
            System.out.println();
        }
        else{
            System.out.println("Not a valid number choice!");
            System.out.println();
        }
    }

    public static void divide(){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you wish to use? ");
        int x = scan.nextInt();
        double num = 0;

        if(x <= 4){
            double arr [] = new double [x];

            for(int i = 0; i < x; i++){
                arr [i] = scan.nextInt();
                if(i == 0){
                    num = arr[i];
                }
                else{
                    num = num / arr[i];
                }
            }
            System.out.println(Math.round(num * 100.00) / 100.00);
            System.out.println();
        }

        else{
            System.out.println("Not a valid number choice!");
            System.out.println();
        }
    }

    public static void percent(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        double x = scan.nextDouble();

        System.out.println("Enter percentage: ");
        double y = scan.nextDouble();

        double p = x * (y / 100);
        System.out.println(p);
        System.out.println();
    }

    public static void remainder(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        double x = scan.nextDouble();

        System.out.println("Enter remainder: ");
        double y = scan.nextDouble();

        double r = x % y;
        System.out.println(r);
        System.out.println();
    }

    public static void log(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        double x = scan.nextDouble();

        System.out.println("Now select log base: 1.) Default[log base of 10], 2.) Selected log base, and 3.) log base e.");
        int xx = scan.nextInt();

        switch(xx){

            case 1:
                double b10 = Math.log(x) / Math.log(10);
                System.out.println("Log base 10 = " + Math.round(b10 * 100.00) / 100.00);
                System.out.println();
                break;

            case 2:
                System.out.println("Enter base: ");
                double b = scan.nextDouble();

                double s = Math.log(x) / Math.log(b);
                System.out.println("Base " + b + " = " + Math.round(s * 100.00) / 100.00);
                System.out.println();
                break;

            case 3:
                System.out.print("Base e = ");

                double e = Math.log(x) / Math.log(Math.E);
                System.out.println(Math.round(e * 100.00) / 100.00);
                System.out.println();
                break;

            default:
                System.out.println("Not a valid number choice!");
                System.out.println();
        }
    }


    public static void root(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        double x = scan.nextDouble();

        System.out.println("Enter root: ");
        double n = scan.nextDouble();

        if(x < 0 && n%2 != 1) {
            System.out.println("Input invalid!");
        }
        else {
            System.out.println((x < 0 ? -1 : 1) * Math.round(Math.pow(Math.abs(x), 1/n) * 100.00) / 100.00);
            System.out.println();
        }
    }

    public static void trig(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        double x = scan.nextDouble();

        System.out.println("Select trigonometric function: ( 1.) Sin 2.) Cos or 3.) Tan )");
        int xx = scan.nextInt();

        switch(xx){

            case 1:
                double sum = Math.sin(x);
                System.out.println(sum);
                System.out.println();
                break;

            case 2:
                sum = Math.cos(x);
                System.out.println(sum);
                System.out.println();
                break;

            case 3:
                sum = Math.tan(x);
                System.out.println(sum);
                System.out.println();
                break;

            default:
                System.out.println("Not a valid number choice!");
                System.out.println();
        }
    }

    public static void pow(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        double x = scan.nextInt();

        System.out.println("Enter power: ");
        double y = scan.nextInt();

        double sum = Math.pow(x,y);
        System.out.println(sum);
        System.out.println();
    }

    public static void fibo(){
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i;

        System.out.println("Enter number sequence: ");
        int count = scan.nextInt();

        System.out.print(n1+ " " +n2);
        for(i = 2; i < count; ++i){
            n3 = n1 + n2;
            System.out.print(" " +n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
        System.out.println();
    }

    public static void ascii(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Ascii variable or number: ");
        String x = scan.nextLine();

        char y = x.charAt(0);
        int ascii = (int)y;

        System.out.println(ascii);
        System.out.println();
    }

    public static void boh(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int x = scan.nextInt();

        System.out.println("Binary is: " + Integer.toBinaryString(x));
        System.out.println("Ocatal is: " + Integer.toOctalString(x));
        System.out.println("Hexadecimal is: " + Integer.toHexString(x));
        System.out.println();
    }


    public static void free(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a simple math equation:");

        String input = scan.nextLine();

        String revisedInput = "";

        int i = 0;
        while (i <= input.length() - 1) {
            if (input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) == '3' || input.charAt(i) == '4'
                    || input.charAt(i) == '5' || input.charAt(i) == '6' || input.charAt(i) == '7' || input.charAt(i) == '8'
                    || input.charAt(i) == '9' || input.charAt(i) == '0' || input.charAt(i) == '+' || input.charAt(i) == '-'
                    || input.charAt(i) == '/' || input.charAt(i) == '*' || input.charAt(i) == '.'){
                revisedInput = revisedInput + input.charAt(i);
                i++;
            }else{
                i++;}
        }

        boolean notdonemul = true;

        int j = 0;
        while (notdonemul) {
            String oldRevised = revisedInput;

            if (j == revisedInput.length()) {
                notdonemul = false;
            } else if (j > revisedInput.length()){
                notdonemul = false;
            } else if (revisedInput.charAt(j) == '*'){
                int j2 = j - 1;
                int xl = 0;
                boolean xlower = true;
                while (xlower) {
                    if (revisedInput.charAt(j2) == '*' || revisedInput.charAt(j2) == '/' || revisedInput.charAt(j2) == '+' ||
                            revisedInput.charAt(j2) == '-' || j2 == 0) {
                        if (j2 == 0) {
                            xl = - 1;
                        } else {
                            xl = j2;
                        }
                        xlower = false;
                        j2 = j + 1;
                    } else {
                        j2--;
                    }
                }
                int xh = 0;
                boolean xhigher = true;
                while (xhigher) {
                    if (revisedInput.charAt(j2) == '*' || revisedInput.charAt(j2) == '/' || revisedInput.charAt(j2) == '+' ||
                            revisedInput.charAt(j2) == '-' || j2 == revisedInput.length() - 1) {
                        if (j2 == revisedInput.length() - 1) {
                            xh = j2 + 1;
                        } else {
                            xh = j2;
                        }
                        xhigher = false;
                    } else {
                        j2++;
                    }
                }

                double x1 = Double.parseDouble(revisedInput.substring(xl + 1, j));
                double x2 = Double.parseDouble(revisedInput.substring(j + 1 , xh));
                double xr = x1 * x2;
                if (xl != -1) {
                    revisedInput =oldRevised.substring(0, xl + 1) + xr + oldRevised.substring(xh);
                }else{
                    revisedInput = xr + oldRevised.substring(xh);
                }
                System.out.println("RevisedMul: " + revisedInput);


            } else {
                j++;
            }

        }

        boolean notdonediv = true;

        int h = 0;
        while (notdonediv) {
            String oldRevisedDiv = revisedInput;

            if (h == revisedInput.length()) {
                notdonediv = false;
            } else if (h > revisedInput.length()){
                notdonediv = false;
            } else if (revisedInput.charAt(h) == '/'){

                int h2 = h - 1;
                int dl = 0;
                boolean dlower = true;
                while (dlower) {
                    if (revisedInput.charAt(h2) == '*' || revisedInput.charAt(h2) == '/' || revisedInput.charAt(h2) == '+' ||
                            revisedInput.charAt(h2) == '-' || h2 == 0) {
                        if (h2 == 0) {
                            dl = - 1;
                        } else {
                            dl = h2;
                        }
                        dlower = false;
                        h2 = h + 1;
                    } else {
                        h2--;
                    }

                }
                int dh = 0;
                boolean dhigher = true;
                while (dhigher) {
                    if (revisedInput.charAt(h2) == '*' || revisedInput.charAt(h2) == '/' || revisedInput.charAt(h2) == '+' ||
                            revisedInput.charAt(h2) == '-' || h2 == revisedInput.length() - 1) {
                        if (h2 == revisedInput.length() - 1) {
                            dh = h2 + 1;
                        } else {
                            dh = h2;
                        }
                        dhigher = false;
                    } else {
                        h2++;
                    }
                }

                double d1 = Double.parseDouble(revisedInput.substring(dl + 1, h));
                double d2 = Double.parseDouble(revisedInput.substring(h + 1 , dh));
                double dr = d1 / d2;
                if (dl != -1) {
                    revisedInput =oldRevisedDiv.substring(0, dl + 1) + dr + oldRevisedDiv.substring(dh);
                }else{
                    revisedInput = dr + oldRevisedDiv.substring(dh);
                }
                System.out.println("RevisedDiv: " + revisedInput);


            } else {
                h++;
            }

        }


        boolean notdoneadd = true;

        int k = 0;
        while (notdoneadd) {
            String oldRevisedAdd = revisedInput;

            if (k == revisedInput.length()) {
                notdoneadd = false;
            } else if (k > revisedInput.length()){
                notdoneadd = false;
            } else if (revisedInput.charAt(k) == '+'){

                int k2 = k - 1;
                int al = 0;
                boolean alower = true;
                while (alower) {
                    if (revisedInput.charAt(k2) == '*' || revisedInput.charAt(k2) == '/' || revisedInput.charAt(k2) == '+' ||
                            revisedInput.charAt(k2) == '-' || k2 == 0) {
                        if (k2 == 0) {
                            al = - 1;
                        } else {
                            al = k2;
                        }
                        alower = false;
                        k2 = k + 1;
                    } else {
                        k2--;
                    }

                }
                int ah = 0;
                boolean ahigher = true;
                while (ahigher) {
                    if (revisedInput.charAt(k2) == '*' || revisedInput.charAt(k2) == '/' || revisedInput.charAt(k2) == '+' ||
                            revisedInput.charAt(k2) == '-' || k2 == revisedInput.length() - 1) {
                        if (k2 == revisedInput.length() - 1) {
                            ah = k2 + 1;
                        } else {
                            ah = k2;
                        }
                        ahigher = false;
                    } else {
                        k2++;
                    }
                }

                double a1 = Double.parseDouble(revisedInput.substring(al + 1, k));
                double a2 = Double.parseDouble(revisedInput.substring(k + 1 , ah));
                double ar = a1 + a2;
                if (al != -1) {
                    revisedInput =oldRevisedAdd.substring(0, al + 1) + ar + oldRevisedAdd.substring(ah);
                }else{
                    revisedInput = ar + oldRevisedAdd.substring(ah);
                }
                System.out.println("RevisedAdd: " + revisedInput);


            } else {
                k++;
            }

        }

        boolean notdonesub = true;

        int l = 0;
        while (notdonesub) {
            String oldRevisedSub = revisedInput;

            if (l == revisedInput.length()) {
                notdonesub = false;
            } else if (l > revisedInput.length()){
                notdonesub = false;
            } else if (revisedInput.charAt(l) == '-'){

                int l2 = l - 1;
                int sl = 0;
                boolean slower = true;
                while (slower) {
                    if (revisedInput.charAt(l2) == '*' || revisedInput.charAt(l2) == '/' || revisedInput.charAt(l2) == '+' ||
                            revisedInput.charAt(l2) == '-' || l2 == 0) {
                        if (l2 == 0) {
                            sl = - 1;
                        } else {
                            sl = l2;
                        }
                        slower = false;
                        l2 = l + 1;
                    } else {
                        l2--;
                    }

                }
                int sh = 0;
                boolean shigher = true;
                while (shigher) {
                    if (revisedInput.charAt(l2) == '*' || revisedInput.charAt(l2) == '/' || revisedInput.charAt(l2) == '+' ||
                            revisedInput.charAt(l2) == '-' || l2 == revisedInput.length() - 1) {
                        if (l2 == revisedInput.length() - 1) {
                            sh = l2 + 1;
                        } else {
                            sh = l2;
                        }
                        shigher = false;
                    } else {
                        l2++;
                    }
                }

                double s1 = Double.parseDouble(revisedInput.substring(sl + 1, l));
                double s2 = Double.parseDouble(revisedInput.substring(l + 1 , sh));
                double sr = s1 - s2;
                if (sl != -1) {
                    revisedInput =oldRevisedSub.substring(0, sl + 1) + sr + oldRevisedSub.substring(sh);
                }else{
                    revisedInput = sr + oldRevisedSub.substring(sh);
                }
                System.out.println("RevisedSub: " + revisedInput);


            } else {
                l++;
            }

        }

        System.out.println(revisedInput);



    }}

      
      