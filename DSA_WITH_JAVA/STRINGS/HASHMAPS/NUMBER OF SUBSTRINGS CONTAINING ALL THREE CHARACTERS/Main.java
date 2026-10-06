// NUMBER OF SUBSTRINGS CONTAINING ALL THREE CHARACTERS
// BRUTE FORCE
// TC => O(N^2)
// SC => O(1)

class Main {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int[] hash = new int[3];
            for (int j = i; j < n; j++) {
                hash[s.charAt(j) - 'a'] = 1;
                if (hash[0] + hash[1] + hash[2] == 3) {
                    cnt = cnt + (n - j);
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "bbacba";
        int ans = numberOfSubstrings(s);
        System.out.println(ans);
    }
}