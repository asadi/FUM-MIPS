/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package com.hdfsoft.mips.simulator;

public class STG_ExecuteStage extends STG_Stage 
{

    public STG_ExecuteStage(FumMips fumMips) {
        super(fumMips);
    }

    @Override
    protected void ClockTick() {
        bufferExMem.IR = bufferIdEx.IR;
        bufferExMem.Zero = false;
        bufferExMem.B = bufferIdEx.B;
        
        Execute(bufferIdEx.IR);
    }
    
    protected void Execute(int instruction) // int is 32 bit in java
    { 
        switch(bufferIdEx.opcode)
        {   
            case 0:
                switch(bufferIdEx.funct){
                    case 32: // 100000 = add
                        bufferIdEx.dData = bufferIdEx.sData + bufferIdEx.tData;
                        break;

                    case 34: // 100010 = sub
                        bufferIdEx.dData = bufferIdEx.sData - bufferIdEx.tData;
                        break;

                    case 36: // 100100 = and
                        bufferIdEx.dData = bufferIdEx.sData & bufferIdEx.tData;
                        break;

                    case 37: // 100101 = or
                        bufferIdEx.dData = bufferIdEx.sData | bufferIdEx.tData;
                        break;

                    case 42: // 101010 = slt
                        bufferIdEx.dData = bufferIdEx.sData < bufferIdEx.tData ? 1 : 0;
                        break;
                }
                fumMips.setRegister(bufferIdEx.rd, bufferIdEx.dData);
                break;

            case 2: // 000010 = j
                bufferIdEx.PC = bufferIdEx.Imm;
                fumMips.ProgramCounter = bufferIdEx.PC;
                bufferIfId.NPC = fumMips.ProgramCounter;
                break;
            case 4: // 000100 = beq  
                if (bufferIdEx.tData == bufferIdEx.sData) 
                {
                    bufferIdEx.PC = bufferIdEx.PC + SignExtended(bufferIdEx.immediate);
                }
                bufferIdEx.PC = bufferIdEx.PC + 4/4;
                fumMips.ProgramCounter = bufferIdEx.NPC;
                break;
            case 5: // 000101 = bne  
                if (bufferIdEx.tData != bufferIdEx.sData) 
                {
                    bufferIdEx.PC = bufferIdEx.PC + SignExtended(bufferIdEx.immediate);
                }
                bufferIdEx.PC = bufferIdEx.PC + 4/4;
                fumMips.ProgramCounter = bufferIdEx.NPC;
                break;
            case 8: // 001000 = addi
                bufferIdEx.tData = bufferIdEx.sData + SignExtended(bufferIdEx.immediate);
                fumMips.setRegister(bufferIdEx.rt, bufferIdEx.tData);
                break;
            case 12: // 001100 = andi
                bufferIdEx.tData = bufferIdEx.sData & ZeroExtended(bufferIdEx.immediate);
                fumMips.setRegister(bufferIdEx.rt, bufferIdEx.tData);
                break;
            case 13: // 001101 = ori
                bufferIdEx.tData = bufferIdEx.sData | ZeroExtended(bufferIdEx.immediate);
                fumMips.setRegister(bufferIdEx.rt, bufferIdEx.tData);
                break;
            case 10: // 001010 = slti
                bufferIdEx.tData = bufferIdEx.sData < SignExtended(bufferIdEx.immediate) ? 1 : 0;
                fumMips.setRegister(bufferIdEx.rt, bufferIdEx.tData);
                break;
            case 43: // 101011 = sw
                fumMips.dataMemory.store(bufferIdEx.sData + bufferIdEx.immediate, bufferIdEx.tData);
                fumMips.setRegister(bufferIdEx.rt, bufferIdEx.tData);
                break;
            case 35: // 100011 = lw
                bufferIdEx.tData = fumMips.dataMemory.load(bufferIdEx.sData + bufferIdEx.immediate);
                fumMips.setRegister(bufferIdEx.rt, bufferIdEx.tData);
                break;
      }
    }

    public int SignExtended(int number)
    {
        String instBits;
        instBits = Integer.toBinaryString(number);
        instBits= String.format("%32s", instBits).replace(' ', '0');

        String result= "";
        
        for (int i = 0; i < 16; i++) 
        {
            result += instBits.charAt(15); 
        }
        result += instBits.substring(31-15, 31-0+1); //bits 15-0

        return Integer.parseUnsignedInt(result, 2);
    }

    public int ZeroExtended(int number)
    {
        String instBits;
        instBits = Integer.toBinaryString(number);
        instBits= String.format("%32s", instBits).replace(' ', '0');

        String result= "";
        
        for (int i = 0; i < 16; i++) 
        {
            result += "0"; 
        }
        result += instBits.substring(31-15, 31-0+1); //bits 15-0

        return Integer.parseUnsignedInt(result, 2);
    }
}
