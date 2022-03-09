/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package ebrahim.asadi.fum.mips;

abstract class STG_Stage 
{
    protected final FumMips fumMips;
    protected static Buffer_IFID bufferIfId;
    protected static Buffer_IDEX bufferIdEx;
    protected static Buffer_EXMEM bufferExMem;
    protected static Buffer_MEMWB bufferMemWb;

    protected abstract void ClockTick();
    
    public STG_Stage(FumMips fumMips) {
        this.fumMips = fumMips;
        bufferIfId = new Buffer_IFID(fumMips);
        bufferIdEx = new Buffer_IDEX(fumMips);
        bufferExMem = new Buffer_EXMEM(fumMips);
        bufferMemWb = new Buffer_MEMWB(fumMips);
    }
}
