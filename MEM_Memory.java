/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebrahim.asadi.fum.mips;

/**
 *
 * @author Ebrahim Asadi (asadi.email@gmail.com)
 * 
 */
public class MEM_Memory {

    private final MEM_MemoryLine[] lines; 

    // int data type is 4 byte in java. 
    // MEM_Memory size = (4 bytes * number of lines)
    private final int numberOfLines; 

    public MEM_Memory(int numberOfLines) {
        this.numberOfLines = numberOfLines;
        this.lines = new MEM_MemoryLine[numberOfLines]; 
        for(int i = 0; i < numberOfLines; i++)
            this.lines[i] = new MEM_MemoryLine();
    }

    public int load(int lineNumber)
    {
        if (lineNumber < 0 || lineNumber > numberOfLines)
           return 0;
        
        return lines[lineNumber].getValue();   
    }
        
    public String loadCode(int address)
    {
        return lines[address].getCode();
    }

    public String loadAsString(int address)
    {
        if (address < 0 || address > numberOfLines)
            return "Access Violation"; // TO-DO: throw exception
        
        return String.format("%32s", 
                Integer.toBinaryString(
                        lines[address].getValue()))
                .toUpperCase().replace(' ', '0');
    }

    protected void store(int lineNumber, int newValue)
    {
        lines[lineNumber].setValue(newValue); 
    }
    
    protected void store(int lineNumber, int newValue, String newCode)
    {
        lines[lineNumber].setValue(newValue); 
        lines[lineNumber].setCode(newCode); 
    }
    
    @Override
    public String toString()
    {
       String result = "";
       
        for (int i = 0; i < 32; i++) {
            result += lines[i].toString();
            result += "\n";
        }
       return result;
    }
    
}
