/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package ebrahim.asadi.fum.mips;

public class MEM_MemoryLine {
    private int value; // int is 4 bytes (32 bits) in java 
    private String code; // mips language instruction (for example ADD R6, R4, R2)
    
    public MEM_MemoryLine()
    {
        this.value = 0;
        this.code = "";
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int newValue) {
        this.value = newValue;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String newCode) {
        this.code = newCode;
    }
    
    public void Reset() {
        value = 0;
        code = "";
    }
    
    @Override
    public String toString() {
        return String.format("%8s", Integer.toHexString(value)).toUpperCase().replace(' ', '0');
    }
    
}
