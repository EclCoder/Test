/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001acde
 * Address  : 0001acde
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001acde(undefined4 param_1,byte *param_2)

{
  uint uVar1;
  byte *pbVar2;
  
  uVar1 = *(uint *)(param_2 + 4);
  pbVar2 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar2 = param_2 + 1;
    uVar1 = (uint)(*param_2 >> 1);
  }
  FUN_0001a178(param_1,pbVar2,uVar1);
  return;
}


