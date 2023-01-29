public class Solution {
    static int countPaths(int x, int y, int n) {
        if (x == n - 1 && y == n - 1) {
            return 1;
        }
        if (x > n - 1 || y > n - 1) {
            return 0;
        }
        return countPaths(x + 1, y, n) + countPaths(x, y + 1, n);
    }

}