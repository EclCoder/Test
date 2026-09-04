/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019d38
 * Address  : 00019d38
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Control flow encountered bad instruction data */

void FUN_00019d38(uint param_1)

{
  undefined4 extraout_r1;
  undefined4 extraout_r2;
  undefined4 unaff_r5;
  undefined4 *unaff_r6;
  
  if (param_1 < 0xfffffffc) {
    return;
  }
  FUN_00019da8(iRam00019d4c + 0x19d4a);
  *unaff_r6 = extraout_r1;
  unaff_r6[1] = extraout_r2;
  unaff_r6[2] = unaff_r5;
  unaff_r6[3] = unaff_r6;
  unaff_r6[4] = &stack0xfffffff8;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


