import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


                int[] inp = {1, 2, 3, 4, 5, 6, 7};
                int n = inp.length;
                int k = 3;

                int[] a = Arrays.copyOfRange(inp, 0, n - k);
                int[] b = Arrays.copyOfRange(inp, n - k, n);


                int[] c = new int[n];
                for(int i = 0; i<b.length; i++){
                    c[i] = b[i];
                }
                for(int i = 0; i<a.length; i++){
                   c[i+b.length] = a[i];
                }

        System.out.println(Arrays.toString(c));
            }
        }
