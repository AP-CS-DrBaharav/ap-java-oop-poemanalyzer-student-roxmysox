
public class PoemAnalyzer {
    private String[][] wordsArray;
    private int rows;
    private int cols;
    
    public PoemAnalyzer(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.wordsArray = new String[rows][cols];
    }
    
    public void setRow(int r, String[] strRow) {
        int i = 0;
        for (; i < strRow.length; i++) {
            this.wordsArray[r][i] = strRow[i];
        }
        for (; i < cols; i++) {
            this.wordsArray[r][i] = "";
        }
    }
    
    public String getWord(int r, int c) {
        return wordsArray[r][c];
    }
    
    public String findLongest() {
        String longest = "";
        for (int r = 0; r<this.rows; r++) {
            for (int c = 0; c<this.cols; c++) {
                if (this.getWord(r, c).length() > longest.length()) {
                    longest = this.getWord(r, c);                    
                }
            }
        }
        return longest;
    }
    
    public boolean contains(String str) {
        for (int r = 0; r<this.rows; r++) {
            for (int c = 0; c<this.cols; c++) {
                if (this.getWord(r, c).equals(str)) {
                    return true;              
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int r = 0; r<this.rows; r++) {
            for (int c = 0; c<this.cols; c++) {
                str += this.getWord(r, c) + " ";
            }
            str += "\n";
        }
        return str;
    }
}
