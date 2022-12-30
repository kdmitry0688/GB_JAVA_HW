public class Task2 {
    public static void main(String[] args) {

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            dfs(image, sr, sc, color, originalColor);
        }
        return image;
    }

    public void dfs(int[][] image, int i, int j, int newColor, int originalColor) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != originalColor) {
            return;
        }
        image[i][j] = newColor;

        dfs(image, i - 1, j, newColor, originalColor);
        dfs(image, i + 1, j, newColor, originalColor);
        dfs(image, i, j - 1, newColor, originalColor);
        dfs(image, i, j + 1, newColor, originalColor);
    }
}
