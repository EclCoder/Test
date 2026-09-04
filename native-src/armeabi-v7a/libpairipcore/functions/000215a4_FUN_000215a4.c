/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000215a4
 * Address  : 000215a4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000215a4(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
  if (*(int *)(param_1 + 0x14) != 0) {
    FUN_0001dcd6(param_2,DAT_000215d0 + 0x215c0,10);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x14),param_2);
    return;
  }
  return;
}


