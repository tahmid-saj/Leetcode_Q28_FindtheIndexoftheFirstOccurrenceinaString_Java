class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        int start = 0;
        
        for (int i = 0, j = 0; i <= haystack.length() - 1 && j <= needle.length() - 1; ) {
            if ((haystack.charAt(i)) == needle.charAt(j)) {
                if (j == 0) {
                    start = i;
                }

                if (j == needle.length() - 1) {
                    return start;
                }

                i++;
                j++;

                continue;
            }

            if (haystack.charAt(i) != needle.charAt(j)) {
                if (j > 0) {
                    i = start + 1;
                    j = 0;
                } else if (j == 0) {
                    i++;
                }
            }
        }

        return -1;
    }
}
