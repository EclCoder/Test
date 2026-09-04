/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020478
 * Address  : 00020478
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020478(int param_1,undefined4 param_2)

{
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,0);
  FUN_000203aa(param_2,0x5b);
  FUN_000203bc(*(undefined4 *)(param_1 + 0xc),param_2,0x13,0);
  FUN_000203fa(param_2,0x5d);
  return;
}


