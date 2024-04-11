//doubleChar
public String doubleChar(String str) {
    StringBuilder result = new StringBuilder();

       
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
    
            result.append(currentChar).append(currentChar);
        }

        return result.toString();
    
}


//countHi
public int countHi(String str) {
  int count = 0;
        int index = str.indexOf("hi"); 
        while (index != -1) {
            count++; 
            index = str.indexOf("hi", index + 1); 
}
        return count;
    
}

//catDog
public boolean catDog(String str) {
  int catCount = 0;
        int dogCount = 0;
        int index = str.indexOf("cat"); 
        while (index != -1) {
            catCount++;
            index = str.indexOf("cat", index + 1); }
            
        index = str.indexOf("dog"); 

        while (index != -1) {
            dogCount++; 
            index = str.indexOf("dog", index + 1); 
        }

        return catCount == dogCount;
    }


// countCode
public int countCode(String str) {

int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }


//endOther
public boolean endOther(String a, String b) {
   String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);
    
}

//xyzThere
public boolean xyzThere(String str) {
   str = str.replaceAll("(\\.)(xyz)", "");
return str.contains("xyz");
}


//bobThere
public boolean bobThere(String str) {
if(str.length()<=2){
  return false;
} 
for(int i=0;i<str.length()-2;i++)
{
  if(((str.substring(i,i+1).equals("b")) && (str.substring(i+2,i+3)).equals("b"))){
    return true;
  }
}
return false;
}


//xyBalance
public boolean xyBalance(String str) {
   int lastYIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                lastYIndex = str.indexOf('y', i); 
                if (lastYIndex == -1) { 
                    return false;
                }
                i = lastYIndex; 
            }
        }
        return true; 
}


//mixString
public String mixString(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  int max = Math.max(aLen, bLen);
  String word = "";

  for (int i = 0; i < max; i++) {
    if (i <= aLen-1)
      word += a.substring(i,i+1);
    if (i <= bLen-1)
    word += b.substring(i,i+1);

  }

  return word;

}


//repeatEnd
public String repeatEnd(String str, int n) {
  int a=str.length();
  String newWord="";
  
  for(int i=0;i<n;i++){
    newWord += str.substring(a - n, a);

  }
  return newWord;
}


//repeatFront
public String repeatFront(String str, int n) {
  StringBuilder result=new StringBuilder();
  for (int i=n;i>0;i--){
    result.append(str.substring(0,i));
  }
  return result.toString();
}


//repeatSeparator
public String repeatSeparator(String word, String sep, int count) {
   StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
}


//prefixAgain
public boolean prefixAgain(String str, int n) {
  int len = str.length();
  String prefix = str.substring(0,n);
  
  for (int i = n; i < len; i++) {
    if(n+i <= len) { 
      if (prefix.equals(str.substring(i,n+i)))
        return true;
    }
  }
  return false;
}


//xyzMiddle
public boolean xyzMiddle(String str) {
  String xyz = "xyz";
  int len = str.length();
  int middle = len / 2;
  
  if (len < 3)
    return false;
    
  if (len % 2 != 0) {
    if (xyz.equals(str.substring(middle-1,middle+2))) {
      return true;
    } else {
        return false;
      }
  } else if (xyz.equals(str.substring(middle-1,middle+2)) || 
      xyz.equals(str.substring(middle-2,middle+1))) {
          return true;
  } else
      return false;  
}


//getSandwich
public String getSandwich(String str) {
   int len = str.length();
  String tmpString = "";
  String finalString = "";
  int start = 0;
  int finish = 0;
  boolean found = false;
  
  if (len <= 10)
    return "";
  
  for (int i = 0; i < len - 4; i++) {
    tmpString = str.substring(i, i+5);
    
    if (tmpString.equals("bread") && found == true)
      finish = i;  
      
    if (tmpString.equals("bread") && found == false) {
      start = i+5;
      found = true; 
    } 
  }
  
  finalString = str.substring(start,finish);
  return finalString;

}


//sameStarChar
public boolean sameStarChar(String str) {
   for(int i = 1; i < str.length() - 1; i++) {
        if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
            return false;
    }
                
    return true;
}


// oneTwo
public String oneTwo(String str) {
   String result = "";
  for(int i=0; i <str.length()-2; i += 3)
  {
      result = result + str.substring(i+1,i+3) + str.charAt(i);
  }
  return result;
}


//zipZap
public String zipZap(String str) {
  int len = str.length();
  String finalString = "";
  
  for (int i = 0; i < len; i++) {
    finalString += str.substring(i,i+1);
    if (i > 0 && i < len-1) {
      if (str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p')
        finalString = finalString.substring(0,finalString.length()-1);
    }
  }
  return finalString;
}


//starOut
public String starOut(String str) {
 StringBuilder result = new StringBuilder();
    
    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);
        
        if (currentChar == '*') {
                      if (i > 0 && str.charAt(i - 1) != '*') {
                result.deleteCharAt(result.length() - 1); 
                }
           
            if (i < str.length() - 1 && str.charAt(i + 1) != '*') {
                i++;
            }
        } else {
            result.append(currentChar); 
            }
    }
    
    return result.toString();

}


//plusOut
public String plusOut(String str, String word) {
   StringBuilder result = new StringBuilder();
    int wordLength = word.length();
    
    for (int i = 0; i < str.length(); ) {
        if (i + wordLength <= str.length() && str.substring(i, i + wordLength).equals(word)) {
            result.append(word);
            i += wordLength; 
            } else {
            result.append("+"); 
            i++;
        }
    }
    
    return result.toString();
}


//wordEnds
public String wordEnds(String str, String word) {
   StringBuilder result = new StringBuilder();
    int wordLength = word.length();
    
    for (int i = 0; i < str.length(); i++) {
        if (i + wordLength <= str.length() && str.substring(i, i + wordLength).equalsIgnoreCase(word)) {
            
            if (i > 0) {
                result.append(str.charAt(i - 1));
            }
            
            if (i + wordLength < str.length()) {
                result.append(str.charAt(i + wordLength));
            }
        }
    }
    
    return result.toString();

}
