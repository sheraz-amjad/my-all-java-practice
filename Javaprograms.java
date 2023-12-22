import java.lang.String;
public class Javaprograms{
public static void main(String[] args){
String s1 = "Office";
String upper = s1.toUpperCase();
String lower = s1.toLowerCase();

System.out.println(s1);
System.out.println("Length of Office is: "+s1.length());
System.out.println("Upper Case: " +upper);
System.out.println("Lower Case: " +lower);
System.out.println("No of Character upto name is : " +s1.charAt(3));
System.out.println("index of s1 is : " +s1.indexOf("e"));
System.out.println(s1.split("o"));
}
}