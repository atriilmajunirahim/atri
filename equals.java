/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atri
 */
public class equals {
    public static void main(String[] args) {
      System.out.println("atri ilma juni rahim");
      System.out.println("E1E117027");
        
        System.out.println("Perbedaan antara pemakaian == dengan equals");
        
        String st1 = "saya suka makan nasi goreng";
        String st2 = "saya suka makan nasi goreng";
        String st3 = "saya suka";
        String st4 = "makan";
        String st5 = "nasi goreng";
        String st6 = st3 + st4 + st5 ;
        
        System.out.println(st1==st2);
        System.out.println(st6==st1);
        System.out.println(st6==st2);
        System.out.println(st6.equals(st1));
        System.out.println(st1.equals(st2));
        System.out.println(st6.equals(st2));
    }
    
}
