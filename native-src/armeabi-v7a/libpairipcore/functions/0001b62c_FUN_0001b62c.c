/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b62c
 * Address  : 0001b62c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0001b62c(int param_1,int param_2,int param_3)

{
  int iVar1;
  
  if (param_3 == 0) {
    return *(int *)(param_1 + 4) == *(int *)(param_2 + 4);
  }
  if (param_1 != param_2) {
    iVar1 = strcmp(*(char **)(param_1 + 4),*(char **)(param_2 + 4));
    return iVar1 == 0;
  }
  return true;
}


