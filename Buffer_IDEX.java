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
