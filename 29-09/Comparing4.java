public class Comparing4 {

    public static void main(String []args) {

        String line = args [0];
        String line2 = args [1];

        char [] symb = line.toCharArray();
        char [] symb2 = line2.toCharArray();

        boolean t = true;

        for (int i = 0; i < symb.length; i++) {

            if (symb[i] == symb2[i]) {
                t = true;
                System.out.println(line + " = " + line2);
            } 
            else {
                t = false; 
                System.out.println(line + " != " + line2);
                break;
            }
        }
        
        for (int i = 0; i < symb.length; i++) {
			      if (line.charAt(i) > line2.charAt(i)) {
				        System.out.println(line + " > " + line2);
				        t = false;
				        break;
			      }
			      else if (line.charAt(i) < line2.charAt(i)) {
				        System.out.println(line + " < " + line2);
				        t = false;
				        break;
			      }
		    }
    
    }
}
