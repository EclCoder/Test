/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002068a
 * Address  : 0002068a
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002068a(int param_1,undefined4 param_2)

{
  if (*(char *)(param_1 + 0x14) == '\x01') {
    FUN_000203aa(param_2,0x28);
  }
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  if (*(char *)(param_1 + 0x14) == '\x01') {
    FUN_000203fa(param_2,0x29);
  }
  FUN_000203aa(param_2,0x28);
  FUN_000205b8(param_1 + 0xc,param_2);
  FUN_000203fa(param_2,0x29);
  return;
}


