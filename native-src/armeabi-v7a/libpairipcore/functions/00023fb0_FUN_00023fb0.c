/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023fb0
 * Address  : 00023fb0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_00023fb0(uint *param_1)

{
  return (*param_1 >> 8 | param_1[1] << 0x18) == DAT_00023fd8 && DAT_00023fd4 == param_1[1] >> 8;
}


