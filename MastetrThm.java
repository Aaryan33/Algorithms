// Implement three cases of Master theorem

public class MastetrThm {
    public static void main(String[] args) {
        System.out.println(masterTheorem(2, 2, 1, 0));
    }

    public static String masterTheorem(int a, float b, int k, double p) {
        double logBtoA = Math.log(a) / Math.log(b);

        if (a > Math.pow(b, k)){
            
            return "O(n^" + logBtoA + ")";

        }
        else if (a == Math.pow(b, k)){
            if (p > -1){

                return "O(n^" + logBtoA + ")* logn^" + (p + 1) + ")";

            } 
            else if (p == -1) {

                return "O(n^" + logBtoA + "loglogn)";

            } 
            else {

                return "O(n^" + logBtoA + ")";

            }
        } 
        else {

            if (p >= 0) {
                
                return "(n^" + k + "* logn^" + p + ")";

            } 
            else {

                return "(n^" + k + ")";

            }
        }
    }
}