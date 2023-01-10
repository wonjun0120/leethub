class Solution {
    public int removeElement(int[] A, int elem) {
        int l = A.length;
        for (int i=0; i<l; i++) {
            if (A[i] == elem) {
                A[i--] = A[l-- -1];
            }
        }
        return l;
    }

}