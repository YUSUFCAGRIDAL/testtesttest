public class ddd {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        int k = strs[0].length();
        for (String each : strs) {
            if(each.length()<k){
                k=each.length();
            }
        }
        String temp="";
        for (int i = 0; i <= k; i++) {
            for (String each : strs) {
                temp+=each.charAt(i);
//updated
            }
        }


    }
}
