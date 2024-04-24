// sleepIn:

public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday||vacation){
    return true;
  }
  else{
    return false;
  }
}

// monkeyTrouble:

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile&&bSmile){
    return true;
  }else if(!aSmile&&!bSmile){
    return true;
  }
  return false;
}

//sumDouble:

public int sumDouble(int a, int b) {
   if (a!=b){
     return a+b;
   }
   else if (a==b){
     return 2*(a+b);
   }
   return 0;
}

//diff21

public int diff21(int n) {
  if(n<=21){
    return  (21-n);
  }else if(n>21)
  {
    return (2*(n-21));
  }
  else {
    return 0;
  }
}

//parrotTrouble

public boolean parrotTrouble(boolean talking, int hour) {
  if(talking &&( hour<7 || hour>20)){
    return true;
  }
  return false;
}


//makes10

public boolean makes10(int a, int b) {
  if(((a==10)||(b==10))||(a+b==10)){
    return true;
  }
  
return false;
}

//nearHundred

public boolean nearHundred(int n) {
  if((Math.abs(100-n)<=10)||(Math.abs(200-n)<=10)){
    return true;
  
  }
  return false;
}


//posNeg

public boolean posNeg(int a, int b, boolean negative) {
  if (negative){
    return(a<0 && b<0 ) ;
  
  }else{
    return ((a < 0 && b > 0) || (a > 0 && b < 0));

  }
}

//notString

public String notString(String str) {
  if(str.length()>=3 && str.substring(0,3).equals("not")){
    return str;
  }
  else{
    return "not "+str;
  }
}


//missingChar

public String missingChar(String str, int n) {
 return (str.substring(0,n)+str.substring(n+1,str.length()));
}

//frontBack

public String frontBack(String str) {
  if(str.length()<=1){
    return str;
  }
    String last=str.substring(str.length()-1);
    String mid=str.substring(1,str.length()-1);
    String first=str.substring(0,1);
    
    return(last+mid+first);
  
}

//front3

public String front3(String str) {
  if(str.length()<=3){
    return str+str+str;
  }else {
    String newString=str.substring(0,3);
    return newString+newString+newString;
  }
  }

//backAround

public String backAround(String str) {
  char temp=str.charAt (str.length()-1);
    return temp+ str+ temp;
  
}

//or35

public boolean or35(int n) {
  if ((n%3==0)||(n%5==0)){
    return true;
  }
  return false;
}


//front22

public String front22(String str) {
  if (str.length()>2){
   return str.substring(0,2)+str+str.substring(0,2);
  }
  return str+str+str;
}


//startHi

public boolean startHi(String str) {
  if(str.startsWith("hi")){
    return true;
  }
  return false;
}


// icyHot

public boolean icyHot(int temp1, int temp2) {
  if((temp1 < 0 && temp2>100 ) || (temp1>0 && temp2 <100)) {
    return true;
  }
  return false;
}


//in1020

public boolean in1020(int a, int b) {
  if(( a >=10 &&  a<=20) ||(b>=10 &&  b<=20)){
    return true;
  }
  return false;
}


//hasTeen

public boolean hasTeen(int a, int b, int c) {
  if ((a>=13 && a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19)){
    return true;
  }
  return false;
}


//loneTeen


public boolean loneTeen(int a, int b) {
 return (a >= 13 && a <= 19) != (b >= 13 && b <= 19);
}


//delDel

public String delDel(String str) {
  if(str.startsWith("del",1)){
    return str.charAt(0)+str.substring(4,str.length());
  }
  return str;
}


//mixStart

public boolean mixStart(String str) {
  if(str.length()>=3){
    return str.substring(1,3).equals("ix");
}
return false;
}

//startOz

public String startOz(String str) {
  String result="";
  
  if(str.length()>=1 && str.charAt(0)=='o'){ 
    result = result + str.charAt(0);
  }
   if(str.length()>=2 && str.charAt(1)=='z'){
    result = result + str.charAt(1);
  }
  return result;
}


//intMax

public int intMax(int a, int b, int c) {
  if(a>=b && a>=c){
    return a;
  }else if(b>=a && b>=c){
    return b;
  }
  else{
    return c;
  }
    
}

//close10

public int close10(int a, int b) {
 int aDiff = Math.abs(a - 10);
  int bDiff = Math.abs(b - 10);
  
  if (aDiff < bDiff) {
    return a;
  }
  if (bDiff < aDiff) {
    return b;
  }
  return 0;  
  
 
}


//in3050

public boolean in3050(int a, int b) {
  if(a>=30 && a<=40 && b>=30 && b<=40 ){
    return true;
  }
  else if(a>=40 && a<=50 && b>=40 && b<=50){
    return true;
 
  }
  return false;
}


//max1020

public int max1020(int a, int b) {
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }
  
  if(a>=10 && a<=20){
    return a;
  }
  else if(b>=10 && b<=20){
    return b;
  }
  return 0;
}

// stringE

public boolean stringE(String str) {
  int count=0;
  
  for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='e')count++;
  }
  return (count>=1 && count<=3);
}

//lastDigit

public boolean lastDigit(int a, int b) {
  
   return(a % 10 == b % 10);

}

// endUp

public String endUp(String str) {
  if(str.length()<3){
    return str.toUpperCase();
  }
  return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
}


//everyNth

public String everyNth(String str, int n) {
  String result = "";

  for (int i=0; i<str.length(); i = i + n) {
    result = result + str.charAt(i);
  }
  return result;

}

