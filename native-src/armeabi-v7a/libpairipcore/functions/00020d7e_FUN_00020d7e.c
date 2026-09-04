/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020d7e
 * Address  : 00020d7e
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00020d7e(undefined1 *param_1,undefined1 *param_2)

{
  undefined1 uVar1;
  
  if (param_1 != param_2) {
    for (; param_2 = param_2 + -1, param_1 < param_2; param_1 = param_1 + 1) {
      uVar1 = *param_1;
      *param_1 = *param_2;
      *param_2 = uVar1;
    }
  }
  return;
}


