import java.util.Iterator;
import java.util.List;
public class Homework_251_260 {
    List<Double> arr;
    Iterator<Double> iterator;

    Homework_251_260(List<Double> arr){
        this.arr = arr;
        iterator = arr.iterator();
    }

    public void n251(){
        double max = Double.MIN_VALUE;

        for(double num : arr){
            if(num > max){
                max = num;
            }
        }

        System.out.println(max);

    }

    public void n252(){
        double min = Double.MAX_VALUE;

        for(double num : arr){
            if(num < min){
                min = num;
            }
        }

        System.out.println(min);

    }

    public void n253(){
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for(double num : arr){
            if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }

        System.out.println(max + min);

    }

    public void n254(){
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for(double num : arr){
            if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }

        System.out.println(max * min);

    }

    public void n255(){
        double max = Double.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
                index = i;
            }
        }

        System.out.println(max + index);
    }

    public void n256(){
        double min = Double.MAX_VALUE;
        int index = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
                index = i;
            }
        }

        System.out.println(min + index);

    }

    //Mnacac@ chem haskanum arachin kam verchin
    // mecaguyn kam poqraguyn tarer@ vornen
}
