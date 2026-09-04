/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021bac
 * Address  : 00021bac
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00021bac(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_00021c24 + 0x21bbc,1);
  if ((*(char *)(param_1 + 0xc) != '\0') || (*(int *)(param_1 + 0x10) != 0)) {
    FUN_000203aa(param_2,0x7b);
  }
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  if (((*(char *)(param_1 + 0xc) != '\0') || (*(int *)(param_1 + 0x10) != 0)) &&
     (FUN_000203fa(param_2,0x7d), (*(byte *)(param_1 + 0xc) & 1) != 0)) {
    FUN_0001dcd6(param_2,DAT_00021c28 + 0x21bf8,9);
  }
  if (*(int *)(param_1 + 0x10) != 0) {
    FUN_0001dcd6(param_2,DAT_00021c2c + 0x21c08,4);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 0x10),param_2);
  }
  FUN_0001bdc8(param_2,0x3b);
  return;
}


