import java.util.*;
public class CountWords{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] arr = str.split(" ");
    int count = 0;
    for(int i =0; i < arr.length;i++){
     if(arr[i]!=" "){
         count++;
     }
    }
    System.out.println(count);

  }
}
