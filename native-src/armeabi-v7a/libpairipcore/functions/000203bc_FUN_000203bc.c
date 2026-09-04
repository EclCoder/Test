/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000203bc
 * Address  : 000203bc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000203bc(int param_1,undefined4 param_2,int param_3,int param_4)

{
  if ((uint)((int)((uint)*(ushort *)(param_1 + 5) << 0x1a) >> 0x1a) < (uint)(param_3 + param_4)) {
    FUN_0001bd9c(param_1,param_2);
    return;
  }
  FUN_000203aa(param_2,0x28);
  FUN_0001bd9c(param_1,param_2);
  FUN_000203fa(param_2,0x29);
  return;
}


