public class Creating{
    public static void main(String[] args){
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++)
            arr[i] = i;

        for(int i = 0; i < 5; i++)
            System.out.println(arr[i]);

        String[] myNames = {"A", "B", "C", "D"};
        
        for(int i = 0; i < 4; i++)
            System.out.println(myNames[i]);
    }
}    
