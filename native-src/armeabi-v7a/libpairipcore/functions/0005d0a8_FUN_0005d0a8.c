/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005d0a8
 * Address  : 0005d0a8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005d0a8(undefined4 param_1,uint *param_2)

{
  if ((param_2[6] & 1) != 0) {
    FUN_00023f68(param_2[8],param_2[6] & 0xfffffffe);
  }
  if ((*param_2 & 1) == 0) {
    return;
  }
  FUN_00023f68(param_2[2],*param_2 & 0xfffffffe);
  return;
}


