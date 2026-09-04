/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019fe0
 * Address  : 00019fe0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint * FUN_00019fe0(uint *param_1)

{
  if ((*param_1 & 1) != 0) {
    FUN_00023f68(param_1[2],*param_1 & 0xfffffffe);
  }
  return param_1;
}


