/**
 *
 * @author Ebrahim Asadi (ceo@hdfsoft.com)
 * 
 */

package com.hdfsoft.mips.simulator;

public class Buffer_EXMEM extends Buffer 
{
    public int PC;
    public int IR;
    public int A;
    public int B;
    public int ALUOUT;
    public boolean Zero;

    public Buffer_EXMEM(FumMips fumMips) {
        super(fumMips);
    }
}
