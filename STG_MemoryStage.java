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
public class STG_MemoryStage extends STG_Stage
{

    public STG_MemoryStage(FumMips fumMips) {
        super(fumMips);
    }

    @Override
    protected void ClockTick() {
        bufferMemWb.IR = bufferExMem.IR;
        bufferMemWb.ALUOUT = bufferExMem.ALUOUT;
        bufferMemWb.LMD = fumMips.instructionMemory.load(bufferExMem.ALUOUT);
    }
    
}
