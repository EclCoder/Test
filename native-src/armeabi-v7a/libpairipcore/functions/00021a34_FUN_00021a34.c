/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021a34
 * Address  : 00021a34
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00021a34(int param_1,undefined4 param_2)

{
  int iVar1;
  
  if (*(char *)(param_1 + 0x10) == '\x01') {
    FUN_0001bdc8(param_2,0x5b);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
    FUN_0001bdc8(param_2,0x5d);
  }
  else {
    FUN_0001bdc8(param_2,0x2e);
    FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  }
  iVar1 = *(int *)(param_1 + 0xc);
  if (1 < *(byte *)(iVar1 + 4) - 0x51) {
    FUN_0001dcd6(param_2,DAT_00021a90 + 0x21a80,3);
    iVar1 = *(int *)(param_1 + 0xc);
  }
  FUN_0001bd9c(iVar1,param_2);
  return;
}


