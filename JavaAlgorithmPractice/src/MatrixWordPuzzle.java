import java.util.HashMap;

public class MatrixWordPuzzle {

	public MatrixWordPuzzle() {
		// TODO Auto-generated constructor stub
	}
	
	public static HashMap<String, Integer> solveMatrix(String[][] matrix, String[] wordBank){
		HashMap<String, Integer> puzzleMap = new HashMap<String, Integer>();
		String matrixInStringFormat = "";
		String stringBreak = "|";
		for(int i = 0; i < matrix.length; i++){
		
			for(int j = 0; j < matrix[0].length; j++){
				matrixInStringFormat += matrix[i][j];
			}
			matrixInStringFormat += stringBreak;
		}
		
		for(int i = 0; i < matrix[0].length; i++){
			
			for(int j = 0; j < matrix.length; j++){
				matrixInStringFormat += matrix[j][i];
			}
			matrixInStringFormat += stringBreak;
		}
		for(int k = 0; k < wordBank.length; k++){
			puzzleMap.put(wordBank[k], wordSubstring(matrixInStringFormat, wordBank[k]));
		}
		System.out.println(matrixInStringFormat);
		return puzzleMap;
		
	}

	public static int wordSubstring(String matrix, String pattern){
		  
		int index = matrix.indexOf(pattern);
		String temp = "";
		int count = 0;
		while(index!=-1){
			count++;
			matrix = matrix.substring(index+1);
			index = matrix.indexOf(pattern);
		}
		
		return count;
	}
	
	public static void testMatrixPuzzel(String[][] matrix, String[] wordBank){
	 HashMap<String, Integer> map = solveMatrix(matrix, wordBank);
	 for (HashMap.Entry<String, Integer> entry : map.entrySet())
	 {
	     System.out.println("Word:"+entry.getKey() + " appears " + entry.getValue()+" times");
	 }
	}
}
