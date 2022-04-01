import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import lesson2.*;
import something;
public class Main {

    public static void main(String[] args) {
//        1 task
//        calculateNumbers(5,3,6);
//        2 task
        int[] nums = {5,3,6,7,8,9};
//        oddNums(nums);

        //3 task
        Awesome awesome = new Awesome();
//        Scanner console = new Scanner(System.in);
//        int numCheck =  console.nextInt();
//        System.out.println(awesome.returnBool(numCheck));

        //4 task
        Avarage avarage = new Avarage();
//        Scanner console1 = new Scanner(System.in);
//        int a = console1.nextInt();
//        int b = console1.nextInt();
//        int c = console1.nextInt();
//
//        System.out.println(avarage.avarage(a,b,c));

        //5 task
        int[] nums1 = {1,5,8,9,11};
//        primeNumbers(nums1);
        //6 task
        double f = 274.3;
//        temperature(f);
        //7 task
        int num3 = 565;
//        System.out.println(num3/1000 == 0);
//        addNums(num3);
        //8task
        int[] arr2 = {1,5,8,9,11};
//        reverseArray(arr2);
// text

        //date
//        Calendar now = Calendar.getInstance();
////        Date date = calendar.getTime();
////        int pastYear =  now.get(Calendar.YEAR)-1998;
//        now.add(Calendar.YEAR, -1998);
//        now.add(Calendar.MONTH, -9);
//        now.add(Calendar.DAY_OF_MONTH, -13);
//        now.set(Calendar.MINUTE);
//        System.out.println(now.get(Calendar.MONTH));
//        LocalDate pdate = LocalDate.of(1998, 10, 13);
//        // current date
//        LocalDate now = LocalDate.now();
//        // difference between current date and date of birth
//        Period diff = Period.between(pdate, now);
//        System.out.println("Past " +diff.getYears() + "years " + diff.getMonths() + " month " + diff.getDays() + " days");


//        Calendar calNewYork = Calendar.getInstance();
//        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//        System.out.println();
//        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
//                + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
//        System.out.println();


//        Calendar calTimeZone = Calendar.getInstance();
//        calTimeZone.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//        System.out.println(calTimeZone.get());

//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(cal.get(Calendar.DAY_OF_MONTH)));
//        System.out.println(cal.getTime());


//        lesson 2
        Str str = new Str();
        str.tasks();
    }

public void numbers() {

}
    public static void calculateNumbers(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void oddNums(int[] arr) {
        for (int value : arr) {
            if (value % 2 != 0)
                System.out.println(value);
        }
    }

    public static void primeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int primeNum = 0;
            if (arr[i] == 1) {
                System.out.println(arr[i]);
            }else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        primeNum++;
                    }
                }
                if (primeNum == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
//new text 123
    public static void temperature(double f) {
        double c = ((f-32)*5)/9;
        System.out.println(c);
    }

    public static void reverseArray(int[] arr) {
        int[] resultArrays = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            resultArrays[j] = arr[i];
            j++;
            System.out.println(resultArrays[i]);
		//print
        }
    }

    public static void addNums(int num3) {
        int result = num3 % 10;
        for (int i = 10; ; i*=10) {
            num3 = num3 / 10;
            result += num3 % 10;

            if (num3 / i == 0) {
                break;
            }
        }
        System.out.println(result);
    }
}

