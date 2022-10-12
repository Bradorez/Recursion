public class Main
{
    //##############Part 1###############3
    public static void print_after(int num)
    {
        if (num > 0)
        {
            print_after(num-1);
        }
        System.out.println(num);
    }
    public static void print_before(int num)
    {
        System.out.println(num);
        if (num > 0)
        {
            print_before(num-1);
        }

    }
    //##############Part 2###############3
    public static void print_array(int[] arr)
    {
        System.out.println(arr[0]);
        if (arr.length!=1)
        {
            int[] copy = new int[arr.length-1];
            for (int i = 0; i < arr.length-1; i++)
            {
                copy[i] = arr[i+1];
            }
            print_array(copy);

        }
    }
    public static int array_sum(int[] arr,int count)
    {
        if (arr.length - 1 == count)
        {
            return arr[count];
        }
        return arr[count] + array_sum(arr,count + 1);
    }
    public static int array_equal(int[] arr,int num, int count)
    {
        int sum = 0;
        if (num == arr[count])
        {
            sum = 1;
        }
        if (arr.length - 1 == count)
        {
            return sum;
        }
        return sum + array_equal(arr,num,count + 1);
    }
    //##############Part 3###############3
    public static void print_str(String str)
    {

        System.out.println(str.substring(0,1));
        if (str.length()!= 1)
        {
        print_str(str.substring(1));
        }
    }
    public static void printReverseString(String str)
    {


        if (str.length()!= 1)
        {
            printReverseString(str.substring(1));
        }
        System.out.println(str.substring(0,1));
    }
    public static String returnReverseString(String str)
    {
        if (str.length() == 1)
        {
            return str;
        }
        return str.substring(str.length() - 1 ,str.length()) + returnReverseString(str.substring(0,str.length() - 1));
    }



    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        print_before(9);
        print_after(9);
        print_array(arr);
        System.out.println("sum = " + array_sum(arr,0));
        System.out.println("count of num in array = " + array_equal(arr,4,0));
        print_str("Hello");
        printReverseString("Hello!");
        System.out.println(returnReverseString("Hello!"));
    }
}