/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019ea0
 * Address  : 00019ea0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00019ea0(int *param_1,byte *param_2)

{
  byte *pbVar1;
  
  *param_1 = *(int *)(DAT_00019ed4 + 0x19eac) + 8;
  pbVar1 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar1 = param_2 + 1;
  }
  FUN_00019e3a(param_1 + 1,pbVar1);
  return param_1;
}


