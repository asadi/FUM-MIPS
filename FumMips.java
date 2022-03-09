/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package ebrahim.asadi.fum.mips;

import java.util.ArrayList;

public class FumMips {

    protected final RegisterBank registerBank;
    protected final MEM_DataMemory dataMemory;
    protected final MEM_InstructionMemory instructionMemory;
//    protected final InstructionDecoder instructionDecoder;
    private final STG_FetchStage stageFetch;
    private final STG_DecodeStage stageDecode;
    private final STG_ExecuteStage stageExecute;
    private final STG_MemoryStage stageMemory;
    private final STG_WriteBackStage stageWriteBack;
    
    public int ProgramCounter;
    
    public FumMips() {
        registerBank = new RegisterBank();
        dataMemory = new MEM_DataMemory(1024);
        instructionMemory = new MEM_InstructionMemory(1024);
//        instructionDecoder = new InstructionDecoder(registerBank, instructionMemory, dataMemory);
        stageFetch = new STG_FetchStage(this);
        stageDecode = new STG_DecodeStage(this);
        stageExecute = new STG_ExecuteStage(this);
        stageMemory = new STG_MemoryStage(this);
        stageWriteBack = new STG_WriteBackStage(this);
        ProgramCounter = 0;
        
    }
    
    /**
     *
     * @param registers
     */
    private void InitializeRegisterBank(ArrayList<Integer> registers)
    {
        registerBank.Initialize(registers);
    }
    
    protected void InitializeRegister(int regNo, int newValue)
    {
        registerBank.setRegister(regNo, newValue);
    }

    protected void InitializeDataMemory(int address, int newValue)
    {
        dataMemory.store(address, newValue);
    }

    protected void InitializeInstructionMemory(int address, int newValue)
    {
        instructionMemory.store(address, newValue);
    }

    protected void InitializeInstructionMemory(int address, String newValue)
    {
        if ("".equals(newValue)) 
            instructionMemory.store(address, 0);
        else
            instructionMemory.store(address, Integer.parseUnsignedInt(newValue, 2));
    }
    
    protected void InitializeInstructionMemory(int address, String newValue, String newCode)
    {
        if ("".equals(newValue)) 
            instructionMemory.store(address, 0, "");
        else
            instructionMemory.store(address, Integer.parseUnsignedInt(newValue, 2), newCode);
    }

    protected String getRegisterStr(int regNo)
    {
        return registerBank.getRegisterStr(regNo);
    }

    protected int getRegister(int regNo)
    {
        return registerBank.getRegister(regNo);
    }

    protected void setRegister(int regNo, int newValue)
    {
        registerBank.setRegister(regNo, newValue);
    }

    protected String getDataMemoryStr(int address)
    {
        return dataMemory.loadAsString(address);
    }

    protected int getDataMemory(int address)
    {
        return dataMemory.load(address);
    }

    protected String getInstructionMemoryStr(int address)
    {
        return instructionMemory.loadAsString(address);
    }

    protected String getInstructionMemoryCode(int address)
    {
        return instructionMemory.loadCode(address);
    }
    
    public void ClockTick()
    {
        // TO-DO: دستورات زیر باید به صورت موازی اجرا شوند
        stageFetch.ClockTick();
        stageDecode.ClockTick();
        stageExecute.ClockTick();
        stageMemory.ClockTick();
        stageWriteBack.ClockTick();
        
    }
   
    public int ExtractPart(int end, int start, int number)
    {
        String instBits = Integer.toBinaryString(number);
        instBits = String.format("%32s", instBits).replace(' ', '0');
        
        int result = Integer.parseUnsignedInt(instBits.substring(31 - end, 31 - start + 1), 2); //bits end-start

        return result;
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
    
}
