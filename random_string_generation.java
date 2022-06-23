// Your First Program
import java.util.Random;
import java.util.Arrays; 
import java.util.Collections;
import java.util.*;
 


class Main {
  public static String RandomStringgenerator() {

    // create a string of all characters
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // specify length of random string
    int length = 10;

    for(int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(alphabet.length());

      // get character specified by index
      // from the string
      char randomChar = alphabet.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    return randomString;

  }

  public static void main(String[] args){

    //int len = 1000000;
    //String[] list = new String[len];
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i<1000000; i++){
        String str = RandomStringgenerator();
        //System.out.println(str);
        list.add(str);
    }
    System.out.println(list);
    Collections.sort(list);
    //for (int i = 0; i < list.length; i++) {
    //    for (int j = i + 1; j < words.length; j++) {
    //        if (list[i].compareTo(list[j]) > 0) {
    //            String temp = list[i];
    //            list[i] = list[j];
    //            list[j] = temp;
    //        }
     //   }
    System.out.println(list);

  }
}