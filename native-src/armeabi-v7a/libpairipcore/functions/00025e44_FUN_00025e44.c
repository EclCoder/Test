/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025e44
 * Address  : 00025e44
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00025e44(int param_1)

{
  longlong lVar1;
  
  lVar1 = FUN_00023fa6();
  if (lVar1 == CONCAT44(DAT_00025e64,DAT_00025e68)) {
    param_1 = *(int *)(param_1 + -0x24);
  }
  else {
    param_1 = param_1 + 0x58;
  }
  return param_1;
}


