public class FindInMountainArray {
    public static void main(String[] args) {
        
        int[] arr={1,2,1,0};
        int x=1;
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        //assending
        //arr[mid]>x -> {e=mid-1}
        //arr[mid]<x && arr[mid]>arr[mid-1] -> {s=mid+1}
        //arr[mid]<x && arr[mid]<arr[mid-1] -> {e=mid-1}
        //if(arr[mid]==x && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){return mid;}
        //arr[mid]==x && arr[mid]<arr[mid+1] -> {return mid}
        //arr[mid]==x && arr[mid]>arr[mid+1] -> {e=mid-1 && s=0}

        ans=binarySearch(arr,start,end,x);

        System.out.println(ans);

        
    
        
    }

    public static int binarySearch(int[] arr,int start,int end, int x) {
        int mid;

        while(end>=start)
        {
            mid=start+(end-start)/2;
            System.out.println(start+" "+mid+" "+end);
                        

            if(arr[mid]==x && arr[mid]<arr[mid+1]){System.out.println(mid+"here"); return mid;}
            else if(arr[mid]==x && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1] ){System.out.println(mid);return mid;}//peak point
            else if(arr[mid]==x && arr[mid]>arr[mid+1]){System.out.println(mid);binarySearch(arr,0,mid-1,x);}
            
            if(arr[mid]>x){System.out.println(mid+"heree");binarySearch(arr,start,mid-1,x);}
            if(arr[mid]<x && arr[mid]<arr[mid+1]){System.out.println(mid);binarySearch(arr,mid+1,end,x);}
            if(arr[mid]<x && arr[mid]>arr[mid+1]){System.out.println(mid);binarySearch(arr,start,mid-1,x);}
            
        }
        return -1;
    }
}
