/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e9d6
 * Address  : 0001e9d6
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001e9d6(int param_1)

{
  undefined4 uVar1;
  
  if (*(char *)(param_1 + 0x10) != '\0') {
    return 0;
  }
  *(undefined1 *)(param_1 + 0x10) = 1;
  uVar1 = FUN_0001eaae(*(undefined4 *)(param_1 + 0xc));
  *(undefined1 *)(param_1 + 0x10) = 0;
  return uVar1;
}


