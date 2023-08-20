import java.util.Iterator;
import java.util.List;
public class Homework_231_250 {
    List<Integer> arr;
    Iterator<Integer> iterator;

    public Homework_231_250(List<Integer> arr) {
        this.arr = arr;
        iterator = arr.iterator();
    }

    public void n231(){
        int num;
        int sum = 0;

        while(iterator.hasNext()){
            num = iterator.next();
            if(num % 2 == 0){
                sum += (int) Math.pow(num,2);
            }
        }

        System.out.println(sum);

    }

    public void n232(){
        int num;
        int counter = 0;

        while(iterator.hasNext()){
            num = iterator.next();
            if(num % 2 == 0){
                counter++;
            }
        }

        System.out.println(counter);

    }

    public void n233(){
        int num;
        int sum1 = 0, sum2 = 1;

        while(iterator.hasNext()){
            num = iterator.next();
            if(num % 2 == 0){
                sum1 += num;
                sum2 *= num;
            }
        }

        System.out.println(sum1 + " " + sum2);

    }

    public void n234(){
        int num;
        int sum = 0;
        int counter = 0;

        while(iterator.hasNext()){
            num = iterator.next();
            if(num % 2 != 0){
                sum += num;
                counter++;
            }
        }

        try{
        System.out.println(sum / counter);
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }
    }

    public void n235(){
        int sum = 0;
        int counter = 0;
        int num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num % 2 != 0) {
                sum += (int) Math.pow(num, 2);
                counter++;
            }

        }

        try {
            System.out.println(Math.sqrt((double) sum / counter));
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }
    }

    public void n236(){
        int num;
        int sum = 1;
        int counter = 0;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num % 2 != 0) {
                sum *= num;
                counter++;
            }
        }

        System.out.println(counter + " " + sum);

    }

    public void n237(){
        int counter = 0;

        while (iterator.hasNext()) {
            if(iterator.next() == 0){
                counter++;
            }
        }

        System.out.println(counter);

    }

    public void n238(){
        int sum = 0;
        int counter = 0;
        int num;

        while(iterator.hasNext()){
            num = iterator.next();
            if(num % 3 == 0){
                sum += num;
                counter++;
            }
        }

        try{
            System.out.println(sum / counter);
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }

    }

    public void n239(){
        int counter = 0;
        int sum = 0;
        int num;

        while (iterator.hasNext()) {
            num = iterator.next();
            if (num % 5 == 0) {
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

    public void n240(){
        int couner = 0;

        while(iterator.hasNext()){
            if(iterator.next() % 7 == 0){
                couner++;
            }
        }

        System.out.println(couner);

    }

    public void n241(int k){
        int sum = 0;
        int num;

        while(iterator.hasNext()){
            num = iterator.next();
            if(num % k == 0){
                sum += num;
            }
        }

        System.out.println(sum);

    }

    public void n242(int m){
        int sum = 1;
        int num;

        while(iterator.hasNext()){
            num = iterator.next();
            if(num % m == 0){
                sum *= num;
            }
        }

        System.out.println(sum);
    }

    public void n243(int t){
        int counter = 0;

        while(iterator.hasNext()){
            if(iterator.next() % t == 0){
                counter++;
            }
        }

        System.out.println(counter);

    }

    public void n244(){
        int num;
        int sum = 1;

        while (iterator.hasNext()){
            num = iterator.next();
            if(num % 5 == 2){
                sum *= num;
            }
        }

        System.out.println(sum);

    }

    public void n245(){
        int sum = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) % 3 == 0 && i % 3 == 0){
                sum += arr.get(i);
            }
        }

        System.out.println(sum);

    }

    public void n246(){
        int sum = 0;
        int counter = 0;

        for(int i = 0; i < arr.size(); i++){
            if(Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0){
                sum += arr.get(i);
                counter++;
            }
        }

        try{
            System.out.println(sum / counter);
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }

    }

    public void n247(){
        int sum = 0;
        int counter = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > i){
                sum += (int) Math.pow(arr.get(i), 2);
                counter++;
            }
        }

        try {
            System.out.println(Math.sqrt((double) sum / counter));
        }catch (ArithmeticException e){
            System.out.println("NoN");
        }

    }

    public void n248(int k){
        int sum = 0;
        int num;

        for(int i = 0; i < arr.size(); i++){
            num = arr.get(i) + i;
            if(Math.pow(num,2) % k == 0){
                sum += arr.get(i);
            }
        }

        System.out.println(sum);

    }

    public void n249(int k){
        int counter = 0;

        for(int i = 0; i < arr.size(); i++){
            if(Math.abs(arr.get(i) - i) > k){
                counter++;
            }
        }

        System.out.println(counter);

    }

    public void n250(){
        int sum = 1;

        for(int i = 0; i < arr.size(); i++){
            if((arr.get(i) * i) % 3 == 2){
                sum *= (int) Math.pow(arr.get(i),2);
            }
        }

        System.out.println(sum);

    }

}
