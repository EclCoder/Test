/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019fd0
 * Address  : 00019fd0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Control flow encountered bad instruction data */

void FUN_00019fd0(void)

{
  undefined4 extraout_r2;
  undefined4 *extraout_r3;
  
  FUN_0001a508(iRam00019fdc + 0x19fda);
  *extraout_r3 = extraout_r2;
  extraout_r3[1] = extraout_r3;
  extraout_r3[2] = &stack0xfffffff8;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


