 Package​ ​PROGRAMMING2​; 
 import​ ​java​.​swing​.*; 
 ​public​ ​class​ ​ConversationFromBinaryToDecimal​ { 
  
 ​public​ ​static​ ​void​ ​main​(​String​[] ​args​){ 
 ​   
 ​   
 ​/** 
 ​ * 
 ​ * @author : BALOLOY, ELLAIZA MAE A.
 ​ */ 
  
 ​    ​/** 
 ​     * @param args the command line arguments 
 ​     */ 
 ​    
 ​        ​String​ ​binaryString​=​JOptionPane​.​showInputDialog​(​"Enter a 6-bit binary number"​); 
 ​        ​int​ ​binary​=​Integer​.​parseInt​(​binaryString​); 
 ​          ​int​ ​decimal​=​0​; 
 ​          ​int​ ​bit​; 
 ​           
 ​        ​int​ ​i​=​0​; 
 ​        ​int​ ​power2​=​1​; 
 ​        ​int​ ​len​=​binaryString​.​length​(); 
 ​        ​while​ (​i​<​len​) { 
 ​                ​bit​=​binary​%​10​;​//get the last bit (6th) 
 ​                ​decimal​=​decimal​+​bit​*​power2​;​//add it, multiplied by the corresponding power of 2 
 ​                ​binary​=​binary​/​10​;​//get rid of the 6th bit, now the 5th bit is last 
 ​                ​power2​*=​2​; 
 ​                ​i​++; 
 ​                 
 ​         ​bit​=​binary​%​10​;​//get the last bit (6th) 
 ​         ​decimal​=​decimal​+​bit​*​1​;​//add it, multiplied by the corresponding power of 2 
 ​         ​binary​=​binary​/​10​;​//get rid of the 6th bit, now the 5th bit is last 
 ​               
 ​         ​bit​=​binary​%​10​;​//get the last bit (5th) 
 ​         ​decimal​=​decimal​+​bit​*​2​;​//add it, multiplied by the corresponding power of 2 
 ​         ​binary​=​binary​/​10​;​//get rid of the 5th bit, now the 4th bit is last 
 ​               
 ​         ​bit​=​binary​%​10​;​//get the last bit (4th) 
 ​         ​decimal​=​decimal​+​bit​*​4​;​//add it, multiplied by the corresponding power of 2 
 ​         ​binary​=​binary​/​10​;​//get rid of the 4th bit, now the 3rd bit is last 
 ​               
 ​         ​bit​=​binary​%​10​;​//get the last bit (3rd) 
 ​         ​decimal​=​decimal​+​bit​*​8​;​//add it, multiplied by the corresponding power of 2 
 ​         ​binary​=​binary​/​10​;​//get rid of the 3rd bit, now the 2nd bit is last 
 ​               
 ​         ​bit​=​binary​%​10​;​//get the last bit (2nd) 
 ​         ​decimal​=​decimal​+​bit​*​16​;​//add it, multiplied by the corresponding power of 2 
 ​         ​binary​=​binary​/​10​;​//get rid of the 2nd bit, now the 1st bit is last  
 ​               
 ​         ​bit​=​binary​%​10​;​//get the last bit (1st) 
 ​         ​decimal​=​decimal​+​bit​*​32​;​//add it, multiplied by the corresponding power of 2 
 ​                 
 ​         ​String​ ​binaryOutput​=​"Binary: "​ + ​binaryString​; 
 ​         ​String​ ​decimalOutput​=​"Decimal: "​ + (​decimal​*​2​-​1​); 
 ​          
 ​          ​JOptionPane​.​showMessageDialog​(​null​, ​binaryOutput​ + "\" + decimalOutput, 
 ​            ​"Binary to Decimal Conversion"​, ​JOptionPane​.​INFORMATION_MESSAGE​); 
 ​          
 ​          ​System​.​exit​(​0​); 
 ​          
 ​ ​/*1. what is the largest binary number you can input into the program? 
 ​   = 101011 
 ​   2. what is its decimal value? 
 ​   = 43*/ 
 ​   
 ​  } 
 ​  }  