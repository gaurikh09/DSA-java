// Welcome to CodeCollab!
class Solution {
    public String countAndSay(int n) {
        String current = "1";
        for (int step = 2; step <= n; step++) {
            StringBuilder next = new StringBuilder();
            int i = 0;
            while (i < current.length()) {
                char ch = current.charAt(i);
                int count = 1;

                while (i + count < current.length() && current.charAt(i + count) == ch) {
                    count++;
                }
                next.append(count).append(ch);
                i += count;
            }
            current = next.toString();
        }
        return current;
    }
}