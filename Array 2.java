//countEvens
public int countEvens(int[] nums) {
  	int count = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(nums[i] % 2 == 0)
			count++;
	}
	return count;
}


//bigDiff
public int bigDiff(int[] nums) {
  int max = nums[0];
	int min = nums[0];
	for(int i = 1; i < nums.length; i++)
	{
		if(nums[i] > max)
			max = nums[i];
		else if(nums[i] < min)
			min = nums[i];
	}
	return (max-min);
}


//centeredAverage
public int centeredAverage(int[] nums) {
  int max = nums[0];
	int min = nums[0];
	int sum = nums[0];
	for(int i = 1; i < nums.length; i++)
	{
		sum  += nums[i];
		if(nums[i] > max)
			max = nums[i];
		else if(nums[i] < min)
			min = nums[i];
	}
	return (sum-max-min) / (nums.length - 2);
}


// sum13
public int sum13(int[] nums) {
  int sum = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(nums[i] == 13)
			i++;
		else
			sum += nums[i];
	}
	return sum;
}

//sum67
public int sum67(int[] nums) {
 int sum = 0;
	boolean sixMode = false;
	for(int i = 0; i < nums.length; i++)
	{
		if(sixMode)
		{
			if(nums[i] == 7)
				sixMode = false;
		}
		else if(nums[i] == 6)
			sixMode = true;
		else
			sum += nums[i];
	}
	return sum;
}


//has22
public boolean has22(int[] nums) {
   for(int i = 0; i < nums.length-1; i++)
  {
  	if(nums[i] == 2 && nums[i+1] == 2)
  		return true;
  }
  return false;
}

//lucky13
public boolean lucky13(int[] nums) {
  for(int i = 0; i < nums.length; i++)
  {
  	if(nums[i] == 1 || nums[i] == 3)
  		return false;
  }
  return true;  
}


//sum28
public boolean sum28(int[] nums) {
  int sum = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(nums[i] == 2)
			sum += 2;
	}
	return (sum == 8);
}


//more14
public boolean more14(int[] nums) {
  int balance = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(nums[i] == 1)
			balance++;
		else if(nums[i] == 4)
			balance--;
	}
	return (balance > 0);
}

