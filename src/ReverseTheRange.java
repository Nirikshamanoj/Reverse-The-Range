import java.util.Scanner;
public class ReverseTheRange {
    static int[] reverseRange(int array[],int start,int end)
    {
        int size=array.length;
        int i=start,j=end;
        while (i<j)
        {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int B=scanner.nextInt();
        int C=scanner.nextInt();
        int[] array=reverseRange(A,B,C);
        for (int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
