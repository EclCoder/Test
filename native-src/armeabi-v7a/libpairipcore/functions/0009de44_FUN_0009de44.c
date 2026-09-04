/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009de44
 * Address  : 0009de44
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009de44(int param_1,int *param_2)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + 4);
  *param_2 = (int)&DAT_0009de5c + DAT_0009de5c;
  param_2[1] = iVar1;
  return;
}


