//helloname

public String helloName(String name) {
  return "Hello " + name + "!";
}

//makeAbba
public String makeAbba(String a, String b) {
   return a + b + b + a;
}

//makeTags
public String makeTags(String tag, String word) {
   return "<" + tag + ">" + word + "</" + tag + ">";
    
}

//makeOutWord
public String makeOutWord(String out, String word) {
  int midIndex = out.length() / 2;
        return out.substring(0, midIndex) + word + out.substring(midIndex);
    
}

//extraend
public String extraEnd(String str) {
  if (str.length() < 2) {
            // Handle cases where the string length is less than 2
            return "String length must be at least 2.";
  }
  String lastTwoChars = str.substring(str.length() - 2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
}

//firstTwo
public String firstTwo(String str) {
  if (str.length() < 2) {
            // If the string is shorter than length 2, return the whole string
            return str;
        } else {
            // Return the first two characters of the string
            return str.substring(0, 2);
        }
}

//firstHalf
public String firstHalf(String str) {
   int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
}

//withoutEnd
public String withoutEnd(String str) {
  if (str.length() >= 2) {
            // Return the substring excluding the first and last characters
            return str.substring(1, str.length() - 1);
        } else {
            // Handle cases where the string length is less than 2
            return "String length must be at least 2.";
        }

}

//comboString
public String comboString(String a, String b) {
   if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
}

//nonStart
public String nonStart(String a, String b) {
  if (a.length() >= 1 && b.length() >= 1) {
            return a.substring(1) + b.substring(1);
        } else {
            // Handle cases where either string has length less than 1
            return "Both strings must have at least length 1.";
        }
}

//left2
public String left2(String str) {
  if (str.length() >= 2) {
            // Rotate left 2 by moving the first 2 characters to the end
            return str.substring(2) + str.substring(0, 2);
        } else {
            // Handle cases where the string length is less than 2
            return "String length must be at least 2.";
        }
}

//right2
public String right2(String str) {
  if (str.length() >= 2) {
            // Rotate right 2 by moving the last 2 characters to the start
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        } else {
            // Handle cases where the string length is less than 2
            return "String length must be at least 2.";
        }
}


//theEnd
public String theEnd(String str, boolean front) {
 
        if (front) {
            return str.substring(0, 1); 
        } else {
            return str.substring(str.length() - 1);  
        }
}

//withouEnd2
public String withouEnd2(String str) {
   if (str.length() > 2) {
            
            return str.substring(1, str.length() - 1);
        } else {
            
            return "";
        }
}

//middleTwo
public String middleTwo(String str) {
  int middleIndex = str.length() / 2;
        
        String middleTwoChars = str.substring(middleIndex - 1, middleIndex + 1);
        return middleTwoChars;
  
}

//endsLy
public boolean endsLy(String str) {
    return str.endsWith("ly");
    
}

//nTwice
public String nTwice(String str, int n) {
   if (str.length() >= n) {
            
            return str.substring(0, n) + str.substring(str.length() - n);
        } else {
            
            return "";
        }
}

//twoChar
public String twoChar(String str, int index) {
  if (index >= 0 && index + 2 <= str.length()) {
           
            return str.substring(index, index + 2);
        } else {
            
            return str.substring(0, 2);
        }
}

// middleThree
public String middleThree(String str) {
   int middleIndex = str.length() / 2;
       
        return str.substring(middleIndex - 1, middleIndex + 2);
    }

//public boolean hasBad(String str) {
   return str.startsWith("bad", 0) || str.startsWith("bad", 1);
}

//atFirst
public String atFirst(String str) {
    if (str.length() >= 2) {
            
            return str.substring(0, 2);
        } else if (str.length() == 1) {

            return str + "@";
        } else {
      return "@@";
        }
}

//lastChars
public String lastChars(String a, String b) {
  char firstChar = (a.length() > 0) ? a.charAt(0) : '@';
        char lastChar = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
        return String.valueOf(firstChar) + String.valueOf(lastChar);
}


//conCat
public String conCat(String a, String b) {
  if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
}


// lastTwo
public String lastTwo(String str) {
   if (str.length() >= 2) {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1)
                    + str.charAt(str.length() - 2);
        } else {
            return str;
        }
}


// seeColor
public String seeColor(String str) {
   if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
}


//frontAgain
public boolean frontAgain(String str) {
   if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            String lastTwo = str.substring(str.length() - 2);
            return firstTwo.equals(lastTwo);
        } else {
            return false;
        }
}


//minCat
public String minCat(String a, String b) {
   int lenA = a.length();
        int lenB = b.length();
        
        if (lenA > lenB) {
            return a.substring(lenA - lenB) + b;
        } else if (lenB > lenA) {
            return a + b.substring(lenB - lenA);
        } else {
            return a + b;
        }
}

//extraFront
public String extraFront(String str) {
   if (str.length() < 2) {
            return str + str + str;
        } else {
            String firstTwo = str.substring(0, 2);
            return firstTwo + firstTwo + firstTwo;
        }
}

//without2
public String without2(String str) {
 int len = str.length();
        if (len >= 2 && str.substring(0, 2).equals(str.substring(len - 2))) {
            return str.substring(2);
        } else {
            return str;
        }
}


//deFront
public String deFront(String str) {    
if(str.length() > 0) {
    if(str.substring(0,1).equals("a") && !str.substring(1,2).equals("b")) {
      return str.substring(0,1) + str.substring(2,str.length());
    } else if(str.substring(1,2).equals("b") && !str.substring(0,1).equals("a")) {
      return str.substring(1,2) + str.substring(2,str.length());
    } else if(str.substring(0,1).equals("a") && str.substring(1,2).equals("b")) {
      return str;
    } else {
      return str.substring(2,str.length());
    }
  } else {
    return "";
  }
}

// startWord
public String startWord(String str, String word) {
  if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
}

// withoutX
public String withoutX(String str) {
  if (str.length() >= 1 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() >= 1 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
}

//withoutX2
public String withoutX2(String str) {
  if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else if (str.length() >= 1 && str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.length() >= 2 && str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        } else {
            return str;
        }
}
