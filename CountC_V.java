class CountC_V{
public static void main(String[] args){
String a="Paradise Resturent";
int cCount=0;
int vCount=0;
a=a.toLowerCase();
for(int i =0;i<a.length();i++){
if(a.charAt(i)=='a'||a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o'|| a.charAt(i)=='u'){
System.out.print(a.charAt(i));


vCount++;

}
else if(a.charAt(i)>'a'||a.charAt(i)<='z'){
System.out.print(a.charAt(i));
cCount++;
}

}
System.out.println("vowels ==>>"+vCount);
System.out.println("Consonents===>>"+cCount);
}
}