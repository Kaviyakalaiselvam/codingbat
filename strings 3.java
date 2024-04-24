//countYZ

public int countYZ(String str) {
   if(str.length() == 0)
        return 0;
        
    int count = 0;  
            
    for(int i = 0; i <= str.length() - 2; i++) {
        if((Character.toLowerCase(str.charAt(i)) == 'y' || 
            Character.toLowerCase(str.charAt(i)) == 'z') &&
            !Character.isLetter(str.charAt(i+1)))
            count++;
    }
                                        
    if(Character.toLowerCase(str.charAt(str.length() - 1)) == 'y' ||
        Character.toLowerCase(str.charAt(str.length() - 1)) == 'z')
        count++;
                                                    
    return count;

}

//withoutString
public String withoutString(String base, String remove) {
    StringBuilder result = new StringBuilder();
        int index = base.toLowerCase().indexOf(remove.toLowerCase()); 
        while (index != -1) {
          result.append(base, 0, index);
            index += remove.length();
            base = base.substring(index);
              index = base.toLowerCase().indexOf(remove.toLowerCase());
        }
   result.append(base);
        return result.toString();
    }
    

 //equalIsNot
public boolean equalIsNot(String str) {
 int len = str.length();
  int not = 0;
  int is = 0;
  
  for (int i = 0; i < len; i++) {
    if (i < len - 2) {
      String tmp = str.substring(i,i+3);
      if (tmp.equals("not"))
        not++;
    }
    if (i < len - 1) {
      String tmp2 = str.substring(i,i+2);
      if (tmp2.equals("is"))
        is++;
    }
  }

  
  if (not == is)
    return true;
  else
    return false;

}

//gHappy
public boolean gHappy(String str) {
  boolean happy = true;
  boolean skip = false;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == 'g'){
      if((i == str.length()-1 && !skip) || (i != str.length()-1 && str.charAt(i+1) != 'g') && !skip){
        happy = false;
      }else{
        happy = true;
        skip = true;
      }
    }else{
      skip = false;
    }
  }
  return happy;
}


//countTriple
public int countTriple(String str) {
    int count = 0;
        if (str.length() < 3) return 0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2))
                count++;
        }
        return count;
    
}


//sumDigits
public int sumDigits(String str) {
  
int sum=0;
  for(int i=0; i < str.length(); i++) {
    if(Character.isDigit(str.charAt(i))) {
      sum = sum + Integer.parseInt(str.substring(i,i+1));
    }
  }
  return sum;
}


//sameEnds
public String sameEnds(String string) {
  int len = string.length();
  String fin = "";
  String tmp = "";
  
  for (int i = 0; i < len; i++) {
    tmp += string.charAt(i);
    int tmplen = tmp.length();
    if (i < len / 2 && tmp.equals(string.substring(len-tmplen,len)))
      fin = tmp;
  }
  return fin;

}

// mirrorEnds

public String mirrorEnds(String string) {
  int len = string.length();
  String fin = "";
  String tmp1 = "";
  String tmp2 = "";

  
  for (int i = 0; i < len; i++) {
    tmp1 += string.substring(i,i+1);
    tmp2 = "";
    for (int j = tmp1.length()-1; j >= 0; j--) {
      tmp2 += tmp1.substring(j,j+1);
      if (tmp2.equals(string.substring(len-i-1,len)))
        fin = tmp1;
    }
  }
  return fin;
}

//maxBlock
public int maxBlock(String str) {
  int count = 0;
		int max = 0;
		
		for(int i=0; i<str.length(); i++){
			
			if(i==0){
				count++;
				max = count;
			}
			else{
				if(str.charAt(i)==str.charAt(i-1)){
					count++;
					if(max<count){
						max = count;
					}
				}//end of if
				
				else{
					count = 1;
				}
			}
			
		}
		
		return max;
	
}


//sumNumbers
public int sumNumbers(String str) {
  int len = str.length();
  int sum = 0;
  String tmp = "";
  
  for (int i = 0; i < len; i++) {
    if (Character.isDigit(str.charAt(i))) {
      if (i < len-1 && Character.isDigit(str.charAt(i+1))) {
        tmp += str.charAt(i);
      }
      else {
        tmp += str.charAt(i);
        sum += Integer.parseInt(tmp);
        tmp = "";
      }
        
    }
  }
  
  return sum;
}


//notReplace
public String notReplace(String str) {
  
  String result = "";
  str = " " + str + "  ";
  for(int i=0; i <=str.length()-2; i++) {
    if(str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))
                  && !Character.isLetter(str.charAt(i+2)))
    {
      result = result + "is not";
      i = i+1;
    }
    else {
      result = result + str.charAt(i);
    }
  }
  return result.substring(1,result.length()-1);
} 
