/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ab3c
 * Address  : 0001ab3c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001ab3c(int *param_1,undefined4 param_2,int param_3)

{
  int iVar1;
  
  iVar1 = DAT_0001ab54 + 0x1ab4a;
  if (0xfff < param_3) {
    iVar1 = DAT_0001ab54 + 0x1ab4e;
  }
  *param_1 = param_3;
  param_1[1] = iVar1;
  return;
}


