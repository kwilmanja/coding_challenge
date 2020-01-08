import java.util.Scanner;
public class HexagonWordSearch{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of search words: ");
        int numberOfWords = scan.nextInt();
        int side = scan.nextInt();
        String[] words = new String[numberOfWords + 1];

        for (int i = 0; i<words.length; i++){
        	words[i] = scan.nextLine();
        } 
        int value = 2 * side - 1;

        //Create Matrix:
        String[][] puzzle = new String[value][value];
        
        //Turn each line into a string
        String[] lines = new String[value];
        for (int i = 0; i< value; i++){
        	lines[i] = scan.nextLine();
        	System.out.println(lines[i]);
        }

        for (int i = 0; i < lines.length; i++) {
        	for (int n = 0; n < lines[i].length(); n++) {
        		if (!lines[i].substring(n, n+1).equals(" ")) {
        			puzzle[i][n] = lines[i].substring(n, n+1);
        	}
        }
        
        //Spot of matrix
        for (int r = 0; i< value; i++){
        	for (int c = 0; n < value; n++){
        		//Picks Letter
		        for (int i = 0; i < lines.length; i++) {
		        	for (int n = 0; n < lines[i].length(); n++) {
		        		if (!lines[i].substring(n, n+1).equals(" ")) {
		        			puzzle[r][c] = lines[i].substring(n, n+1);
		        		}
		        	}
		
		        }


        	}
        }


        //Check for word:
        for (int i = 0; i< value; i++){
        	for (int n = 0; n < value; n++){
        		//At the spot
        		for (int w = 0; w<numberOfWords; w++){
        			boolean good = true;
        			String word = words[w];
        			//working with word:
        			for (int l = 0; l<word.length() l++){
        				//working with letter:
        				if (puzzle[i + l][n + l] != word.substring(l) 
        					|| puzzle[i + l][n - l] != word.substring(l)
        					||puzzle[i + l][n] != word.substring(l)
        					||puzzle[i + l][n + l] != word.substring(l)
        					||puzzle[i + l][n + l] != word.substring(l)
        					||puzzle[i + l][n + l] != word.substring(l)){
        					good = false;
        				}
        			}
        		}
        	}
        }
        
    }
}