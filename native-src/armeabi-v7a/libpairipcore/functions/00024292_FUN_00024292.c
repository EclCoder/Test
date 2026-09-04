/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024292
 * Address  : 00024292
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint * FUN_00024292(uint *param_1,undefined4 *param_2,int *param_3)

{
  uint uVar1;
  undefined4 uVar2;
  uint uVar3;
  int iVar4;
  
  uVar1 = *param_1;
  if (-1 < (int)uVar1) {
    *param_2 = 1;
    *param_3 = (uint)*(byte *)((int)param_1 + 7) * 4 + 4;
    return param_1 + 1;
  }
  uVar3 = (uVar1 & 0xfffffff) >> 0x18;
  if (uVar3 == 0) {
    uVar2 = 1;
    iVar4 = 4;
  }
  else {
    if (uVar3 != 3 && uVar3 != 1) {
      return (uint *)0x0;
    }
    iVar4 = ((uVar1 & 0xffffff) >> 0x10) * 4 + 4;
    uVar2 = 2;
  }
  *param_3 = iVar4;
  *param_2 = uVar2;
  return param_1;
}


