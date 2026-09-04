/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d8c8
 * Address  : 0001d8c8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001d8c8(int param_1)

{
  undefined1 uVar1;
  
  uVar1 = *(undefined1 *)(param_1 + 0x186);
  *(undefined1 *)(param_1 + 0x186) = 1;
  FUN_0001eb18(param_1);
  *(undefined1 *)(param_1 + 0x186) = uVar1;
  return;
}


