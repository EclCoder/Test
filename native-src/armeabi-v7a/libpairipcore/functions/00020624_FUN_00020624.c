/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020624
 * Address  : 00020624
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020624(int param_1,undefined4 param_2)

{
  if (*(char *)(param_1 + 0xc) == '\x01') {
    FUN_0001dcd6(param_2,DAT_00020670 + 0x2063c,2);
  }
  FUN_0001dcd6(param_2,DAT_00020674 + 0x20648,6);
  if (*(char *)(param_1 + 0xd) == '\x01') {
    FUN_0001dcd6(param_2,DAT_00020678 + 0x2065a,2);
  }
  FUN_0001bdc8(param_2,0x20);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  return;
}


