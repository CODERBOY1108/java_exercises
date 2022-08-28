public class program3_3
{
public static void main(String[] args) {
char[] source = { 'a', 'b', 'r', 'a', 'j', 'a', 't',
't', 'n', 'w', 'x', 'y', 'z' };
char[] destin = new char[7];
System.arraycopy(source, 2, destin, 0, 5);
System.out.println(String.valueOf(destin));
}
}