/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023c8c
 * Address  : 00023c8c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023c8c(int param_1)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + 8);
  if (*(char *)(iVar1 + 4) == '\b') {
    FUN_0001d2ce(*(undefined4 *)(iVar1 + 8),*(undefined4 *)(iVar1 + 0xc),DAT_00023cb0 + 0x23ca8,0xb)
    ;
    return;
  }
  return;
}


