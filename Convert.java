public class Convert{
public static void main(String[] args){
String str ="i love programming";
String str1 ="I LOVE PROGRAMMING";
String str2[] =str1.split(" ");
System.out.println(str.toLowerCase());
System.out.println(str1.toUpperCase());
System.out.println("str equals to str1:"+str.equals(str1));
System.out.println("Length of str:"+str.length());
System.out.println("Length of str1:"+str1.length());
System.out.println("No of Character upto name is : " +str.charAt(2));
System.out.println("No of Character upto name is : " +str1.charAt(5));
System.out.println("Index in str is:" + str.indexOf("o"));
System.out.println("Index in str1 is:" + str1.indexOf("P"));
for(String str3:str2){
	System.out.println(str3);}
}
}