package lession01;


import java.util.*;

public class VariableLearning {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
////    System.out.println("Please enter the numer: ");
////    int firstInput = scanner.nextInt();
////    int result = 1;
////    for(int i = 1; i <= firstInput; i++) {
////      result = result * i;
////    }
////
////    System.out.println(String.format("Gai thua cua %s: %s", firstInput, result));
//
////    System.out.println("Nhap chieu dai mang so nguyen cua ban: ");
////    int arrLength = scanner.nextInt();
////    int[] arrInt = new int[arrLength];
////    int averageTotal = 0;
////    for(int i = 0; i < arrLength; i++) {
////      System.out.println(String.format("Nhap so nguyen thu %s: ", i+1));
////      arrInt[i] = scanner.nextInt();
////      averageTotal  = averageTotal + arrInt[i];
////    }
////    System.out.println(String.format("Mang so nguyen cua ban la %s", Arrays.toString(arrInt)));
////    System.out.println(String.format("Average total is: %s", averageTotal/arrLength));
//
//
////    System.out.println("Nhap chieu dai mange so nguyen cua ban: ");
////    int arrLength = scanner.nextInt();
////
////    int[] arrInt = new int[arrLength];
////    for(int i = 0; i < arrLength; i++) {
////      System.out.println(String.format("Nhap phan tu thu: %s", i+1));
////      arrInt[i] = scanner.nextInt();
////    }
////
////    System.out.println(String.format("Mang ban da input la: %s", Arrays.toString(arrInt)));
////
////    int[] arrTemp;
//
//
//
////    int maxNum = 0;
////    for(int i : arrInt) {
////      maxNum = i > maxNum ? i : maxNum;
////    }
////
////    System.out.println(String.format("Max number of your array is: %s", maxNum));
//
//  }
//
//  int getMax(int[] arrInt) {
//    int maxNum = 0;
//    for(int i : arrInt) {
//      maxNum = i > maxNum ? i : maxNum;
//    }
//
//    System.out.println(String.format("Max number of your array is: %s", maxNum));
//    return maxNum;
//  }

    List<Integer> myList = new ArrayList<>();
    myList.add(2);
    myList.add(1);
    myList.add(2);
    myList.add(2);
    myList.add(2);
    myList.add(2);
    //myList.add(2);

//    myList.remove(1);
//
//    for(int e : myList) {
//      System.out.println(e);
//    }
//
//    System.out.println(myList.get(1));

//    System.out.println(myList.get(3));

    Map<Integer, String> boxes = new HashMap<>();
    boxes.put(113, "Police");
    boxes.put(114, "l");
    boxes.put(114, "Fire EMS");

    //to use with for() loop
    Set<Integer> myKeys = boxes.keySet();
    for(Integer key : myKeys) {
      System.out.println("key: " + boxes.get(key));
    }

    //to remove dup
    Iterator<Map.Entry<Integer, String>> myIntegrator = boxes.entrySet().iterator();
    while (myIntegrator.hasNext()) {
      Map.Entry<Integer, String> temp = myIntegrator.next();
      String tempValue = temp.getValue();
    }



}


}
