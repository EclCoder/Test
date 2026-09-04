/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a07c
 * Address  : 0001a07c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a07c(uint *param_1,uint param_2)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte *pbVar5;
  uint uVar6;
  uint uVar7;
  
  if (0xfffffff7 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00019fd0();
  }
  uVar2 = (*param_1 & 0xfffffffe) - 1;
  if ((*param_1 & 1) == 0) {
    uVar2 = 10;
  }
  if (param_2 <= uVar2) {
    return;
  }
  uVar2 = 10;
  if (10 < param_2) {
    uVar2 = param_2 | 7;
  }
  uVar3 = *param_1;
  uVar6 = param_1[1];
  if ((uVar3 & 1) == 0) {
    uVar6 = (uVar3 & 0xff) >> 1;
  }
  uVar4 = (uVar3 & 0xfffffffe) - 1;
  uVar7 = uVar4;
  if ((*param_1 & 1) == 0) {
    uVar7 = 10;
  }
  if (uVar2 < 0xb) {
    pbVar5 = (byte *)param_1[2];
    pbVar1 = (byte *)((int)param_1 + 1);
    uVar3 = 1;
  }
  else {
    if (uVar7 < uVar2) {
      pbVar1 = (byte *)FUN_000a0370();
    }
    else {
      pbVar1 = (byte *)FUN_000a0370();
      if ((uVar3 & 1) == 0) {
        uVar4 = 10;
      }
      if (uVar4 < uVar2) {
        FUN_00023f68(pbVar1,uVar2 + 1);
        return;
      }
    }
    pbVar5 = (byte *)param_1[2];
    uVar3 = uVar3 & 1;
    if (uVar3 == 0) {
      pbVar5 = (byte *)((int)param_1 + 1);
    }
  }
  if (uVar6 != 0xffffffff) {
    __aeabi_memmove(pbVar1,pbVar5,uVar6 + 1);
  }
  if (uVar3 != 0) {
    FUN_00023f68(pbVar5,uVar7 + 1);
  }
  if (uVar2 < 0xb) {
    *(byte *)param_1 = (byte)(uVar6 << 1);
  }
  else {
    param_1[2] = (uint)pbVar1;
    *param_1 = uVar2 + 1 | 1;
    param_1[1] = uVar6;
  }
  return;
}


