/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023fdc
 * Address  : 00023fdc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00023fdc(int param_1)

{
  int iVar1;
  uint uVar2;
  
  uVar2 = param_1 + 0x87U & 0xfffffff8;
  iVar1 = FUN_000256e0(uVar2);
  if (iVar1 != 0) {
    __aeabi_memclr8(iVar1,uVar2);
    return iVar1 + 0x80;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}


