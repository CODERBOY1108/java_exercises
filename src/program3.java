public class program3{
public static void main(String[] args)
{
int j=0;
int[] num = {10,39,56,74,24};
int[] num2 = new int[num.length+1];
for(int i=0; i<num.length;i++)
{
if(i==2) {
num2[i+1] = num[i];
num2[i] =87;
j+=2; }
else {
num2[j] = num[i];
j++; } }
num=num2;
for(int i:num)
{
System.out.println(i);
} } }