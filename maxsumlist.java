class maxsumlist
{
    public static void main(String[] args)
    {
        int[] arr={1,3,2,4,3};
        int index;
        for(index = 0; index < args.length ; index++)
        {
            //convert command line argument to int
            arr[index] = Integer.parseInt(args[index]);
        }
        int max=0,sum=0;
        System.out.println("List is :");
        for(index = 0; index < args.length; index++)
        {
            //for displaying the element
            System.out.println(arr[index]);
            //finding max
            if(max < arr[index])
            {
                max = arr[index];
            }
            //doing sum
            sum += arr[index];
        }
        //display sum
        System.out.println("Sum = "+sum);
        //display max
        System.out.println("Max = "+max);
    }
}