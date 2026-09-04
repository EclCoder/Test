/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025224
 * Address  : 00025224
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00025224(int *param_1)

{
  uint uVar1;
  
  uVar1 = *(uint *)(*(int *)param_1[2] + *param_1 * 8);
  return *(int *)param_1[2] + *param_1 * 8 + (uVar1 | (uVar1 & 0x40000000) << 1);
}


