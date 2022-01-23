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

public class STG_FetchStage extends STG_Stage 
{

    public STG_FetchStage(FumMips fumMips) {
        super(fumMips);
    }

    @Override
    protected void ClockTick() {
        bufferIfId.PC = bufferIfId.NPC;
        
        int instruction = fumMips.instructionMemory.load(bufferIfId.PC);
        bufferIfId.setIR(instruction);
        if (bufferExMem.Zero)
        {
            bufferIfId.PC = bufferExMem.ALUOUT;
            fumMips.ProgramCounter = bufferIfId.PC;
        }
        else
        {
            // چون آدرس دهي بايتي نيست و هر چهار بايت يك آدرس دارند بايد آدرس را بر چهار تقسيم كنيم
            bufferIfId.NPC = bufferIfId.PC + 4/4;  
            bufferIfId.PC = bufferIfId.PC + 4/4;  
            fumMips.ProgramCounter = bufferIfId.PC;
        }
    }
    
}
