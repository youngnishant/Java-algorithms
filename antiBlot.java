public class MyClass {
    
    public static String antiBlot(String line) {
        
          String res="";
          String[] str1=line.split("=");
          String[] str2=str1[0].split("\\s+[\\+]");
         
            if(str1[1].contains("inkblot")){
               res+=str2[0].trim();
               res+=" ";
               res+="+";
               res+=" ";
               res+=str2[1].trim();
               res+=" ";
               res+="=";
               res+=" ";
              res+=String.valueOf(Integer.parseInt(str2[0].trim())+Integer.parseInt(str2[1].trim()));
          }
          else if(str2[0].contains("inkblot")){
            
              res+=String.valueOf(Integer.parseInt(str1[1].trim())-Integer.parseInt(str2[1].trim()));
              res+=" ";
              res+="+";
              res+=" ";
              res+=str2[1].trim();
              res+=" ";
              res+="=";
              res+=" ";
              res+=str1[1].trim();
          }
          else if(str2[1].contains("inkblot")){
              res+=str2[0].trim();
              res+=" ";
              res+="+";
              res+=" ";
              res+=String.valueOf(Integer.parseInt(str1[1].trim())-Integer.parseInt(str2[0].trim()));
             res+=" ";
              res+="=";
              res+=" ";
              res+=str1[1].trim();
              
          }
          else{
              res="not found";
          }
        
            return res;
} 
    public static void main(String args[]) {
      
      System.out.println(antiBlot("34 + inkblot43 = 64"));
    }
}
