import java.util.*;

public class Main {

    public static void main(String[] args) {

//           1) გამოიტანეთ დაპროგრამების ენების სახელები ცალ–ცალკე ხაზზე( C++, C# , java, pascal, php, JavaScript, ActionScript).

        String languages [] = {"C++", "C#", "java", "pascal", "php", "JavaScript", "ActionScript"};

        for(int i = 0; i < languages.length; i++){
            System.out.println(languages[i]);
        }


//        ------------------------------------------------------------------------------------------------------



    //  2) დავწეროთ კოდი რომელიც გამოიტანს შეტანილი ორი მთელი რიცხვის
        //შემთხვევაში, პირველის მეორეზე გაყოფის შედეგად მიღებულ მთელ შედეგს
        //და მეორის პირველზე გაყოფის შედეგად მიღებულ ნაშთს. (ფორმატის
        //გათვალისწინებით).


        int firstNumber,secondNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");

        firstNumber = sc.nextInt();

        System.out.print("Enter Second Number : ");

        secondNumber = sc.nextInt();




        //       პირველის მეორეზე გაყოფის შედეგად მიღებული მთელი შედეგი

        int onlyFloat = firstNumber / secondNumber;

        //       პირველის მეორეზე გაყოფის შედეგად მიღებული მთელი შედეგი




        //        მეორის პირველზე გაყოფის შედეგად მიღებული ნაშთი

        int nashti = (secondNumber % firstNumber);


        //        მეორის პირველზე გაყოფის შედეგად მიღებული ნაშთი




        System.out.println("The sum of two numbers x and y is: " + onlyFloat);


        System.out.println("nashti " + nashti);



//        ------------------------------------------------------------------------------------------------------


    //     3 შეიტანეთ სამი მთელი რიცხვი, გამოიტანეთ მათი ჯამი და ნამრავლი.

    int a,b,c, result , multiply;

    Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter First Number : ");

        a = sc2.nextInt();

        System.out.println("Enter Second Number : ");

        b = sc2.nextInt();

        System.out.println("Enter Third Number : ");


        c = sc2.nextInt();


        result = a + b + c;

        multiply = a * b * c;

        System.out.println("მათი ჯამია " + result);
        System.out.println("მათი ნამრავლია " +multiply);



//        ------------------------------------------------------------------------------------------------------



//   4)   შეიტანეთ სამნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრები ცალ-ცალკე ხაზზე.

        int num;

        Scanner sc3 = new Scanner(System.in);

        System.out.println("Enter a three-digit number : ");

        num = sc3.nextInt();

        // გადამყავს მომხმარებლის მიერ შემოყვანილი ციფრი "String" ტიპში,რათა შემდგომ შევძლო მასზე for loop-ით გადარბენა,რომ რიცხვის ციფრები ცალ-ცალკზე ხაზზე დავბეჭდო.

        String str = Integer.toString(num);

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }



//        ------------------------------------------------------------------------------------------------------

//   5)  შეიტანეთ ოთხნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.

            int sum = 0;

            Scanner sc6 = new Scanner(System.in);

            System.out.println("Enter 4 digit number : ");

            int no = sc.nextInt();

            for (int i = 0 ; i < 4 ; i++){
                int x = no % 10;
                sum = sum + x;
                no = no / 10;
                System.out.println("ra sachiroa : ");
            }

            System.out.println("Their sum is : " + sum);



//        ------------------------------------------------------------------------------------------------------





//    6) შეიტანეთ ოთხნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.


        int num2 , digit , sum2 = 0;

        Scanner sc4 = new Scanner(System.in);

        System.out.println("Enter four digit number : ");

        num2 = sc4.nextInt();

        while(num2 > 0){

            //   digit-ში ვინახავ ყოველ იტერაციაზე 10-ზე გაყოფის შედეგად მოცემულ ნაშთებს.

            digit = num2 % 10;

            // sum-ში ვინახავ digit-იდან წამოსული ნაშთების ჯამს ყოველ იტერაციაზე.

            sum2 = sum2 + digit;

            num2 = num2 / 10 ;

        }

        System.out.println("Sum of digits : " +sum2);




//     ------------------------------------------------------------------------------------------------------



//    7)    იპოვეთ ორი მთელი რიცხვის უდიდესი საერთო გამყოფი და უმცირესი საერთო ჯერადი.(ევკლიდეს ალგორითმი).





//     ------------------------------------------------------------------------------------------------------


//    8)  დაბეჭდეთ მთელი რიცხვები M-დან N-მდე.


    int num3;

    Scanner sc5 = new Scanner(System.in);

    System.out.println("Enter number : ");

    num3 = sc5.nextInt();

    for(int i = 1; i <= num3; i++){
        System.out.println(i);
    }




//     ------------------------------------------------------------------------------------------------------




//  9) განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაბეჭდეთ მასივის ელემენტები, მასივის უდიდესი და უმცირესი ელემენტი.


        int numArray [] = {1,2,3,4,5,6,7,8};

        int smallest = numArray[0];
        int largest = numArray[0];

        for (int i = 0; i < numArray.length; i++){

            System.out.println(numArray[i]);

            if(numArray[i] > largest){
                largest = numArray[i];
            }else if(numArray[i] < smallest){
                smallest = numArray[i];
            }

        }

        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);


////     ------------------------------------------------------------------------------------------------------


////        10. განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაალაგეთ მასივი ზრდადობით, დაბეჭდეთ მასივი.


        int numbers [] = {8,6,7,4,5,3,2,1};

//        sort მეთოდით ვახდენ მოცემული მასივის ზრდადობის მიხედვით დალაგებას და შემდეგ ამ ყველაფერს ვატარებ for loop-ში.

        Arrays.sort(numbers);

        for (int i = 0 ; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }



////     ------------------------------------------------------------------------------------------------------



//        11. განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, ჩაწერეთ მასში შემთხვევითი რიცხვები, დაბეჭდეთ მასივი.


        int [] arr = new int[8];

        Random r = new Random();

        for (int i = 0 ; i < arr.length; i++){
            arr[i] = r.nextInt();
            System.out.println(arr[i]);
        }





////     ------------------------------------------------------------------------------------------------------


//  12. განსაზღვრეთ 8 ელემენტიანი მთელ რიცხვთა მასივი, ჩაწერეთ მასში შემთხვევითი რიცხვები, დაალაგეთ მასივი კლებადობით, დაბეჭდეთ მასივი.

        Integer [] arr2 = new Integer[8];

        Random r2 = new Random();

        for (int i = 0 ; i < arr2.length; i++){
            arr2[i] = r2.nextInt();
            Arrays.sort(arr2, Collections.reverseOrder());
            System.out.println(arr2[i]);
        }

    }
}