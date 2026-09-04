/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000204c0
 * Address  : 000204c0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000204c0(int param_1,undefined4 param_2)

{
  FUN_000203bc(*(undefined4 *)(param_1 + 8),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,1);
  FUN_0001dcd6(param_2,*(undefined4 *)(param_1 + 0xc),*(undefined4 *)(param_1 + 0x10));
  FUN_000203bc(*(undefined4 *)(param_1 + 0x14),param_2,
               (int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a,0);
  return;
}


