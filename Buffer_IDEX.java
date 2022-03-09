/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package ebrahim.asadi.fum.mips;

public class Buffer_IDEX extends Buffer 
{
    public int PC;
    public int A;
    public int B;
    public int Imm;
    public int NPC;
    public int IR;

    public int opcode;
    public int rs;
    public int rt;
    public int rd;
    public int shamt;
    public int funct;
    public int immediate;
    public int target;
    public int sData;
    public int tData;
    public int dData;

    public Buffer_IDEX(FumMips fumMips) {
        super(fumMips);
    }
}
