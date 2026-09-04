/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001bee0
 * Address  : 0001bee0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_0001bee0(undefined4 *param_1,char *param_2)

{
  size_t sVar1;
  
  *param_1 = param_2;
  sVar1 = strlen(param_2);
  param_1[1] = sVar1;
  return param_1;
}


