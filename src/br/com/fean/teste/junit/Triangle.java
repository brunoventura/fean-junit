package br.com.fean.teste.junit;

/**
 *
 * @author dfleck
 */
public class Triangle {

    // -------------------------
    // Class Attributes 
    // -------------------------
    private String side1;
    private String side2;
    private String side3;

    // -------------------------
    // Constructors
    // -------------------------
    public Triangle() {
        // Create a default triangle
        this("0", "0", "0");
    }
    
    public Triangle(String s1, String s2, String s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    // -------------------------
    // Methods
    // -------------------------
    public String determineTriangleType() {
        
        String type = "";
        
        // This code runs when the user pushes the button
        int s1 = -1, s2=-1, s3 = -1;
        String err = "";
        try {
            s1 = Integer.parseInt(side1);
        } catch (NumberFormatException e) {
           err += "Lado 1 não é um número!\n";
        }
        try {
            s2 = Integer.parseInt(side2);
        } catch (NumberFormatException e) {
           err += "Lado 2 não é um número!\n";
        }
        try {
            s3 = Integer.parseInt(side3);
        } catch (NumberFormatException e) {
           err += "Lado 3 não é um número!\n";
        }
        
        // Chceck that nothing is negative
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
               err += "Pelo menos um dos tamanhos é negativo 0!\n";            
        }
        
        // Check for side length
        if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)) {
               err += "O tamanho do triangulo não é válido!\n";
        }  
        
        if (err.length() > 0) {
           type = err;   
        } else {            
            if ((s1 == s2) && (s2 == s3)) {
               type= "Equilatero";
           } else if (( s1 == s2) || (s2 == s3) || (s1 == s3)) {
               type = "Isósceles";
           } else {
               type = "Escaleno";
           }                 
        }
        
        return type;        
    }

     
}