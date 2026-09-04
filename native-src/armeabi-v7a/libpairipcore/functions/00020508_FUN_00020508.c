/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020508
 * Address  : 00020508
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020508(int param_1,undefined4 param_2)

{
  if (*(char *)(param_1 + 0x1c) == '\x01') {
    FUN_0001dcd6(param_2,DAT_00020598 + 0x20520,2);
  }
  FUN_0001dcd6(param_2,DAT_0002059c + 0x2052c,3);
  if (*(char *)(param_1 + 0x1d) == '\x01') {
    FUN_0001dcd6(param_2,DAT_000205a0 + 0x2053e,2);
  }
  if (*(int *)(param_1 + 0xc) != 0) {
    FUN_000203aa(param_2,0x28);
    FUN_000205b8(param_1 + 8,param_2);
    FUN_000203fa(param_2,0x29);
  }
  FUN_0001dcd6(param_2,DAT_000205a4 + 0x20568,1);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  if (*(int *)(param_1 + 0x18) != 0) {
    FUN_000203aa(param_2,0x28);
    FUN_000205b8(param_1 + 0x14,param_2);
    FUN_000203fa(param_2,0x29);
    return;
  }
  return;
}


