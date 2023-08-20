import java.util.Iterator;
import java.util.List;

public class Homework_211_230 {
    List<Double> arr;
    Iterator<Double> iterator;

    Homework_211_230(List<Double> arr) {
        this.arr = arr;
        iterator = arr.iterator();
    }

    public void n211() {
        double counter = 0;
        double sum = 0;
        double num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num > 0) {
                sum += iterator.next();
                counter++;
            }
        }

        try {
            System.out.println(sum / counter);
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }
    }

    public void n212() {
        double sum = 0;
        double counter = 0;
        double num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num > 0) {
                sum += Math.pow(num, 2);
                counter++;
            }

        }

        try {
            System.out.println(Math.sqrt(sum / counter));
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }
    }

    public void n213() {
        double sum = 0;
        double counter = 0;
        double num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num < 0) {
                sum += Math.pow(num, 2);
                counter++;
            }

        }

        try {
            System.out.println(Math.sqrt(sum / counter));
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }
    }

    public void n214() {
        double counter = 0;
        double sum = 0;
        double num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num < 0) {
                sum += iterator.next();
                counter++;
            }
        }

        try {
            System.out.println(sum / counter);
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }
    }

    public void n215() {
        double sum = 0;
        for (int i = 0; i < arr.size(); i += 2) {
            sum += arr.get(i);
        }
        System.out.println(sum);
    }

    public void n216() {
        double sum = 1;

        for (int i = 0; i < arr.size(); i += 2) {
            sum *= arr.get(i);
        }
        System.out.println(sum);
    }

    public void n217() {
        double sum = 1;

        for (int i = 1; i < arr.size(); i += 2) {
            sum *= Math.pow(arr.get(i), 2);
        }
        System.out.println(sum);
    }

    public void n218() {
        double sum = 0;

        for (int i = 1; i < arr.size(); i += 2) {
            sum += Math.abs(arr.get(i));
        }

        System.out.println(sum);
    }

    public void n219(double k) {
        double counter = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (k % i == 0) {
                counter++;
            }
        }

        System.out.println(counter);

    }

    public void n220() {
        double positiveCounter = 0;
        double negativeCounter = 0;
        double num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num > 0) {
                positiveCounter++;
            } else if (num < 0) {
                negativeCounter++;
            }
        }

        System.out.println("Positive numbers -> " + positiveCounter);
        System.out.println("Negatvie numbers -> " + negativeCounter);

    }

    public void n221(double a, double b) {
        double num;
        double sum = 0;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num >= a && num <= b) {
                sum += num;
            }
        }

        System.out.println(sum);

    }

    public void n222(double a, double b) {
        double num;
        double sum = 1;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num >= a && num < b) {
                sum *= num;
            }
        }

        System.out.println(sum);

    }

    public void n223(double a, double b) {
        double num;
        double counter = 0;
        while (iterator.hasNext()) {
            num = iterator.next();
            if (num > a && num < b) {
                counter++;
            }
        }

        System.out.println(counter);

    }

    public void n224(double k) {
        double num;
        double sum = 0;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (Math.abs(num) < k) {
                sum += Math.pow(num, 3);
            }
        }

        System.out.println(sum);

    }

    public void n225(double t) {
        double num;
        double sum = 1;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (Math.abs(num) < t) {
                sum *= num;
            }
        }

        System.out.println(sum);

    }

    public void n226(double k) {
        double counter = 0;
        double num;

        while (iterator.hasNext()) {
            num = Math.abs(iterator.next());
            if (num < k) {
                counter++;
            }
        }

        System.out.println(counter);

    }

    public void n227(double k) {
        double counter = 0;
        double sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (k % i == 0) {
                sum += arr.get(i);
                counter++;
            }
        }

        System.out.println(sum / counter);

    }

    public void n228(double k) {
        double sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (i % k == 0) {
                sum += arr.get(i);
            }
        }

        System.out.println(sum);

    }

    public void n229() {
        double sum = 1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) - i > 0) {
                sum *= arr.get(i);
            }
        }

        System.out.println(sum);

    }

    public void n230(double k) {
        double sum = 0;
        double counter = 0;
        double num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (Math.floor(num) % k == 0) {
                sum += Math.pow(num, 2);
                counter++;
            }
        }

        try {
            System.out.println(Math.sqrt(sum / counter));
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }
    }

}
