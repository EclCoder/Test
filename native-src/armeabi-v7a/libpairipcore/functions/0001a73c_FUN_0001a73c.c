/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a73c
 * Address  : 0001a73c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a73c(char *param_1,int param_2)

{
  int iVar1;
  
  iVar1 = FUN_00026070(param_2,10000);
  *param_1 = (char)iVar1 + '0';
  FUN_0001a700(param_1 + 1,param_2 + iVar1 * -10000);
  return;
}


