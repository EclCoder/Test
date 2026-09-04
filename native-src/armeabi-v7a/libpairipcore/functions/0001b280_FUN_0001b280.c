/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b280
 * Address  : 0001b280
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b280(void)

{
  int *piVar1;
  int iVar2;
  int unaff_r4;
  
  piVar1 = (int *)FUN_0001b414();
  if (piVar1 != (int *)0x0) {
    unaff_r4 = *piVar1;
  }
  if (piVar1 != (int *)0x0 && unaff_r4 != 0) goto LAB_0001b2a0;
  do {
    DataMemoryBarrier(0x1b);
    FUN_0001b2d4(**(undefined4 **)(DAT_0001b2b8 + 0x1b296));
LAB_0001b2a0:
    iVar2 = FUN_00023fb0(unaff_r4 + 0x28);
  } while (iVar2 == 0);
  FUN_0001b2d4(*(undefined4 *)(unaff_r4 + 0x14));
                    /* WARNING: Subroutine does not return */
  FUN_00019740();
}


