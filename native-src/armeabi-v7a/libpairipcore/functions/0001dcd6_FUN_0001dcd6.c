/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001dcd6
 * Address  : 0001dcd6
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001dcd6(int *param_1,undefined4 param_2,int param_3)

{
  if (param_3 != 0) {
    FUN_0001be92(param_1,param_3);
    __aeabi_memcpy(*param_1 + param_1[1],param_2,param_3);
    param_1[1] = param_1[1] + param_3;
  }
  return param_1;
}


