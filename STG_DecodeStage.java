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

public class STG_DecodeStage extends STG_Stage 
{
    public STG_DecodeStage(FumMips fumMips) 
    {
        super(fumMips);
    }

    @Override
    protected void ClockTick() 
    {
        bufferIdEx.A = bufferIfId.sData;
        bufferIdEx.B = bufferIfId.tData;
        bufferIdEx.Imm = bufferIfId.immediate;
        bufferIdEx.NPC = bufferIfId.NPC;
        bufferIdEx.IR = bufferIfId.getIR();
////        fumMips.ProgramCounter = bufferIdEx.NPC;
        
        this.Decode(bufferIfId.getIR());
       
    }
    
    public void Decode(int instruction) // int is 32 bit in java
    { 
        bufferIdEx.opcode = fumMips.ExtractPart(31, 26, instruction);
        bufferIdEx.rs = fumMips.ExtractPart(25, 21, instruction);
        bufferIdEx.rt = fumMips.ExtractPart(20, 16, instruction);
        bufferIdEx.rd = fumMips.ExtractPart(15, 11, instruction);
        bufferIdEx.shamt = fumMips.ExtractPart(10, 6, instruction);
        bufferIdEx.funct = fumMips.ExtractPart(5, 0, instruction);
        bufferIdEx.immediate = fumMips.ExtractPart(15, 0, instruction);
        bufferIdEx.target = fumMips.ExtractPart(25, 0, instruction);

        bufferIdEx.sData = this.fumMips.getRegister(bufferIdEx.rs);
        bufferIdEx.tData = this.fumMips.getRegister(bufferIdEx.rt);
    }
   

}
