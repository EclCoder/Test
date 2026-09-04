/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a3b0
 * Address  : 0001a3b0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_0001a3b0(byte *param_1,uint param_2,uint param_3)

{
  int iVar1;
  uint uVar2;
  byte *pbVar3;
  
  uVar2 = *(uint *)(param_1 + 4);
  pbVar3 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar3 = param_1 + 1;
    uVar2 = (uint)(*param_1 >> 1);
  }
  if (uVar2 == 0) {
LAB_0001a3f2:
    uVar2 = 0xffffffff;
  }
  else {
    if (param_3 < uVar2) {
      uVar2 = param_3 + 1;
    }
    do {
      if (uVar2 == 0) goto LAB_0001a3f2;
      iVar1 = uVar2 - 1;
      uVar2 = uVar2 - 1;
    } while (pbVar3[iVar1] != param_2);
  }
  return uVar2;
}


