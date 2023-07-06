public class recursion {
        public static int calculatefact(int n) {
            if(n == 1 || n == 0){
                return 1;
            }
            int fact_nm1 = calculatefact(n-1);
            int fact_n = n* fact_nm1;
            return fact_n;

        }
        public static void main(String args[]){
            int n =5;
            int ans = calculatefact(n);
            System.out.println(ans);
        }
}