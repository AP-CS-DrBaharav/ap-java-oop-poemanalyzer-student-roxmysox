

public class Main {

    
    public static void main(String[] args){
        
        PoemAnalyzer p = new PoemAnalyzer(8,6);
        
        p.setRow(0,new String[] {"And","then","the","day","came",","});
        p.setRow(1,new String[] {"when", "the", "risk"});           
        p.setRow(2,new String[] {"to","remain","tight"});    
        p.setRow(3,new String[] {"in","a","bud"});    
        p.setRow(4,new String[] {"was","more","painful"}); 
        p.setRow(5,new String[] {"than","the","risk"});  
        p.setRow(6,new String[] {"it","took"});  
        p.setRow(7,new String[] {"to","blossom","."});  
        
        
        
        System.out.println("***\n\n ANAIS NIN \"RISK\" ");
        System.out.println(p + "\n\n***\n\n");
        
        System.out.println("The longest word in the poem: " + p.findLongest());
        String str = "buddy";
        System.out.println("The word " + str + " appears in the poem: " + p.contains(str));
        str = "bud";
        System.out.println("The word " + str + " appears in the poem: " + p.contains(str));
        
    }
    
    
    
/*    
    ANAIS NIN “RISK”
And then the day came,
when the risk
to remain tight
in a bud
was more painful
than the risk
it took
to blossom.
*/

}
