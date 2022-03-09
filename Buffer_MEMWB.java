/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package ebrahim.asadi.fum.mips;

public class Buffer_MEMWB extends Buffer 
{
   public int PC;
   public int IR;
   public int ALUOUT;
   public int LMD;

    public Buffer_MEMWB(FumMips fumMips) {
        super(fumMips);
    }
   
}
