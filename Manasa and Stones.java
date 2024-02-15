class Result {

    /*
     * Complete the 'stones' function below.
     * Manasa and Stones problem from HacerRank
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER a
     *  3. INTEGER b
     */

    public static List<Integer> stones(int n, int a, int b) {
    // Write your code here
        
        List<Integer> res = new ArrayList<>();
        
        if(a == b) {
            res.add(a*(n-1));
            return res;
        }
        
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        
        for(int fewerres = (min)*(n-1); fewerres <= (max)*(n-1);fewerres += (max-min)) {
            res.add(fewerres);
        }    
        
        return res;
    }

}
