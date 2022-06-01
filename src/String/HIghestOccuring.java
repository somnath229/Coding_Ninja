package String;

public class HIghestOccuring {
    public static void main(String[] args) {
        String str = "soooomnattthoo";
        int arr[] = new int[256];
        for(int i = 0 ;i< str.length();i++){
            arr[str.charAt(i)]++;
//            System.out.println(arr[str.charAt(i)]+" "+str.charAt(i));
        }

        String str1 = "somnath";
        int max = -1;
        char result = ' ';
        for(int i = 0 ;i< str1.length();i++){
//            System.out.println(arr[str.charAt(i)]);
            if(arr[str.charAt(i)] > max){
                max = arr[str.charAt(i)];
                result = str.charAt(i);
            }
//            if( arr[str.charAt(i)] != arr[str1.charAt(i)]) System.out.println(false);
//            System.out.println(true);
        }

        System.out.println(max);
        System.out.println(result);
    }
}
