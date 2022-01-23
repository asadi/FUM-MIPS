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
