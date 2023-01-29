class SwappingMaxMin
{

    public static int minmax(int a[],int b[]){
        for(int i=0;i<a.length;i++){
            if(b[i]>a[i]){
                int temp=a[i];
                a[i]=b[i];
                b[i]=temp;
            }
        }    
        return max(a)*max(b);
    }
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int a[]={1, 2, 6, 5, 1, 2};
        int b[]={3, 4, 3, 2, 2, 5};
        System.out.println(minmax(a,b));       
    }
}