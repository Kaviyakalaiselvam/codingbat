//firstLast6
public boolean firstLast6(int[] nums) {
  int len = nums.length;
        return nums[0] == 6 || nums[len - 1] == 6;
    
}


//sameFirstLast
public boolean sameFirstLast(int[] nums) {
  int len = nums.length;
        return len >= 1 && nums[0] == nums[len - 1];
}


//makePi
public int[] makePi() {
   return new int[]{3, 1, 4};
}


//commonEnd
public boolean commonEnd(int[] a, int[] b) {
  if (a.length >= 1 && b.length >= 1) {
            return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
        }
        return false;
}


// sum3
public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}


//rotateLeft3
public int[] rotateLeft3(int[] nums) {
   int[] rotatedArray = new int[3];
        rotatedArray[0] = nums[1];
        rotatedArray[1] = nums[2];
        rotatedArray[2] = nums[0];
        return rotatedArray;
}


//reverse3
public int[] reverse3(int[] nums) {
  int [] reverseArray=new int [nums.length];
  for(int i=0;i<nums.length;i++){
   reverseArray [i]=nums[nums.length-i-1]; 
  }
  return reverseArray;
}


//maxEnd3
public int[] maxEnd3(int[] nums) {
  int large=0;
  if((nums[0]>nums[nums.length-1]) ||( nums[0]==nums[nums.length-1])){
    large=nums[0];
    
  }
  else if(nums[0]<nums[nums.length-1]){
    large=nums[nums.length-1];
  }
  for(int i=0;i<nums.length;i++){
    nums[i]=large;
  }
  return nums;
}


//sum2
public int sum2(int[] nums) {
  if(nums.length==1){
    return nums[0];
  }
  else if(nums.length==0){
    return 0;
  }else{
    return nums[0]+nums[1];
  }
  
}


// makeEnds
public int[] makeEnds(int[] nums) {
  int[] result=new int[2];
  result[0]=nums[0];
  result[1]=nums[nums.length-1];
  
  return result;
}


//has23
public boolean has23(int[] nums) {
  for(int num:nums){
  if(num==2 || num==3){
    return true;
  }
  }
  return false;
  
}


//middleWay
public int[] middleWay(int[] a, int[] b) {
  return new int[]{a [1],b[1]};
}


//makeEnds
public int[] makeEnds(int[] nums) {
  int[] result=new int[2];
  result[0]=nums[0];
  result[1]=nums[nums.length-1];
  
  return result;
}


// has23
public boolean has23(int[] nums) {
  for(int num:nums){
  if(num==2 || num==3){
    return true;
  }
  }
  return false;
  
}

//no23
public boolean no23(int[] nums) {
   for (int num : nums) {
        if (num == 2 || num == 3) {
            return false;
        }
    }
    return true; 
}


//makeLast
public int[] makeLast(int[] nums) {
    int[] result = new int[nums.length * 2]; 
  
    for (int i = 0; i < nums.length * 2 - 1; i++) {
        result[i] = 0;
    }
    result[nums.length * 2 - 1] = nums[nums.length - 1]; 
    
    return result;
}


// double23
public boolean double23(int[] nums) {
   int count2 = 0;
    int count3 = 0;
    
    for (int num : nums) {
        if (num == 2) {
            count2++;
        } else if (num == 3) {
            count3++;
        }
    }
    
    return count2 == 2 || count3 == 2;
}


//fix23
public int[] fix23(int[] nums) {
   for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == 2 && nums[i + 1] == 3) {
            nums[i + 1] = 0; // Set the element after 2 to 0
        }
    }
    return nums;
}


//start1
public int start1(int[] a, int[] b) {
  int count = 0;
    
    if (a.length > 0 && a[0] == 1) {
        count++;
    }
    
    if (b.length > 0 && b[0] == 1) {
        count++;
    }
    
    return count;
}


//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
    int sumA = a[0] + a[1];
    int sumB = b[0] + b[1];
    
    if (sumA >= sumB) {
        return a;
    } else {
        return b;
    }
}


//makeMiddle
public int[] makeMiddle(int[] nums) {
  int mid = nums.length / 2;
    int[] result = new int[2];
    
    result[0] = nums[mid - 1];
    result[1] = nums[mid];
    
    return result;
}


// plusTwo
public int[] plusTwo(int[] a, int[] b) {
   int[] result = new int[4];
    
    result[0] = a[0];
    result[1] = a[1];
    result[2] = b[0];
    result[3] = b[1];
    
    return result;
    
}


//
