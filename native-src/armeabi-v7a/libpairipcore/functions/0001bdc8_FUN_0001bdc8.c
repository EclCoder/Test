/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001bdc8
 * Address  : 0001bdc8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001bdc8(int *param_1,undefined1 param_2)

{
  int iVar1;
  
  FUN_0001be92(param_1,1);
  iVar1 = param_1[1];
  param_1[1] = iVar1 + 1;
  *(undefined1 *)(*param_1 + iVar1) = param_2;
  return param_1;
}


