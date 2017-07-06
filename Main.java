import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
char n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=(char)br.read();
if((n>='a' && n<='z') || (n>='A'  &&  n<= 'Z'))
System.out.println(n+" is alphebet");
else
System.out.println(n+" is not alphebet");

}
