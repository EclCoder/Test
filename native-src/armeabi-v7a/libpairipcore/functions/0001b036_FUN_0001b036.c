/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b036
 * Address  : 0001b036
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b036(undefined4 *param_1)

{
  int iVar1;
  
  iVar1 = *(int *)*param_1;
  if (iVar1 != 0) {
    ((int *)*param_1)[1] = iVar1;
    FUN_00023f5c();
    return;
  }
  return;
}


