class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return floodFillRecur(image, sr, sc, color, image[sr][sc]);
    }
    
    public int[][] floodFillRecur(int[][] image, int sr, int sc, int color, int st) {
        if(image[sr][sc] == st) {
            if(st == color) return image;
            image[sr][sc] = color;
            if(sr + 1 < image.length){
                image = floodFillRecur(image, sr + 1, sc, color, st);
            } 
            if(sr - 1 >= 0) {
                image = floodFillRecur(image, sr - 1, sc, color, st);
            } 
            if(sc + 1 < image[0].length){
                image = floodFillRecur(image, sr, sc + 1, color, st);
            }
            if(sc - 1 >= 0){
                image = floodFillRecur(image, sr, sc - 1, color, st);
            }
        }
        return image;
    }
}