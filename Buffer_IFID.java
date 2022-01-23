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
public class Buffer_IFID extends Buffer 
{
    public int PC;
    public int NPC; 

    private int IR;  

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

    public Buffer_IFID(FumMips fumMips) 
    {
        super(fumMips);
    }

    public int getIR() 
    {
        return IR;
    }

    public void setIR(int instruction) 
    {
        this.IR = instruction;

        opcode = fumMips.ExtractPart(31, 26, instruction);
        rs = fumMips.ExtractPart(25, 21, instruction);
        rt = fumMips.ExtractPart(20, 16, instruction);
        rd = fumMips.ExtractPart(15, 11, instruction);
        shamt = fumMips.ExtractPart(10, 6, instruction);
        funct = fumMips.ExtractPart(5, 0, instruction);
        immediate = fumMips.ExtractPart(15, 0, instruction);
        target = fumMips.ExtractPart(25, 0, instruction);

        sData = fumMips.getRegister(this.rs);
        tData = fumMips.getRegister(this.rt);
    }
    
}
