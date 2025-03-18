public class lc3411 {

        public int maxLength(int[] nums) {

            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                int lcm=nums[i];
                int gcd = nums[i];
                int prod = nums[i];
                for(int j=i+1;j<nums.length;j++){
                    prod*=nums[j];
                    gcd=gcd(gcd,nums[j]);
                    lcm=((lcm*nums[j])/gcd(lcm,nums[j]));
                    if(prod==lcm*gcd){
                        max=Math.max(max,j-i+1);
                    }
                }
            }
            return max;
        }
        public static int gcd(int a , int b){
            if(b==0){
                return a;
            }
            return gcd(b,a%b);
        }


}

