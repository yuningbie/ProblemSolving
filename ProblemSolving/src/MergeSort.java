
public class MergeSort {
	
    public static int[] merge(int[] leftArr, int[] rightArr)
    {
        int l = 0;
        int r = 0 ;
        int s = 0;
        int[] sortedArr = new int[leftArr.length+rightArr.length];
        boolean isSorted = false;
       // System.out.println("in merge");
        while(!isSorted)
        {
            if(l<leftArr.length && r<rightArr.length)
            {
                if(leftArr[l] <= rightArr[r])
                {
                    sortedArr[s] = leftArr[l];
                    l++;
                    s++;
                }
                else
                {
                    sortedArr[s] = rightArr[r];
                    r++;
                    s++;
                }
            }
            else if(l<leftArr.length && r>=rightArr.length)
            {
                for(int i=l; i<leftArr.length; i++)
                {
                    sortedArr[s] = leftArr[i];
                    s++;
                    l++;
                }
                
            }
            else if(l>=leftArr.length && r<rightArr.length)
            {
                for(int i=r; i<rightArr.length; i++)
                {
                    sortedArr[s] = rightArr[i];
                    s++;
                    r++;
                }
                
            }
            else
            {
                //System.out.println("isSorted");
                isSorted = true;
            }
        }
        return sortedArr;
    }
    
    public static int[] mergeSort(int[] arr)
    {
        if(arr.length <= 1)
        {
            return arr;
        }
        else
        {
            int m = (arr.length)/2;
            int l = 0;
            int r = arr.length;
            int[] leftArr = new int[m];
            int[] rightArr = new int[r-m];
            
            for(int i=l; i<m; i++)
            {
                leftArr[i] = arr[i];
                //System.out.println("leftArr[i]  = "+leftArr[i] );
            }
            int j = 0;
            for(int i=m; i<r; i++)
            {
                rightArr[j] = arr[i];
               // System.out.println("rightArr[j] = "+rightArr[j] );
                j++;
            }
            
            int[] left = mergeSort(leftArr);
            int[] right = mergeSort(rightArr);
            //System.out.println("left.length = "+left.length+ ", right.length = "+right.length);
            return merge(left, right);
        }
    }

	public static void main(String[] args) {

		int[] array = {5, 4, 9, 0, 3, 6};
		array = mergeSort(array);
		int[] x = {5, 3};
		int[] y = {4, 2, 1};
		//int[] array = merge(x, y);
 		for(int i= 0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}

	}

}
