/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package com.hdfsoft.mips.simulator;

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
