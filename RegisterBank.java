/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package ebrahim.asadi.fum.mips;

import java.util.ArrayList;

public class RegisterBank {
  //  private Register[] registers;
    private ArrayList<Integer> registers;

    public RegisterBank()
    {
            registers = new ArrayList<Integer>();
  
            for (int i = 0; i < 32; i++) {
                registers.add(0);
        }
    }
   
    protected void Initialize(ArrayList<Integer> registers)
    {
        this.registers = registers;
    }
    
    public int getRegister(int registerNumber)
    {
        if (registerNumber < 0 || registerNumber > 31)
            return 0;
        
        return registers.get(registerNumber);
                //[registerNumber].getValue();   
    }
    
    
    protected String getRegisterStr(int registerNumber)
    {
        if (registerNumber < 0 || registerNumber > 31)
            return "Register Number must be between 0 and 31";
        
        return String.format("%32s", 
            Integer.toBinaryString(registers.get(registerNumber))
        ).toUpperCase().replace(' ', '0');
    }

    protected void setRegister(int registerNumber, int newValue)
    {
        registers.set(registerNumber, newValue);
    }
    
    @Override
    public String toString()
    {
       String result = "";
       
        for (int i = 0; i < 32; i++) {
            result += registers.get(i).toString();
            result += "\n";
        }
       return result;
    }
}
