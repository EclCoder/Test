/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001acc8
 * Address  : 0001acc8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0001acc8(byte *param_1)

{
  uint uVar1;
  
  uVar1 = *(uint *)(param_1 + 4);
  if ((*param_1 & 1) == 0) {
    uVar1 = (uint)(*param_1 >> 1);
  }
  return uVar1 == 0;
}


