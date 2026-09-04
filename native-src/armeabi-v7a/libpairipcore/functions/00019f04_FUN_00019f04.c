/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019f04
 * Address  : 00019f04
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00019f04(uint *param_1,uint param_2,uint param_3,int param_4,int param_5,int param_6,
                 int param_7,undefined4 param_8)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  byte *pbVar4;
  undefined1 *puVar5;
  
  puVar5 = &stack0xfffffff8;
  if (-param_2 - 10 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00019fd0();
  }
  pbVar4 = (byte *)param_1[2];
  if ((*param_1 & 1) == 0) {
    pbVar4 = (byte *)((int)param_1 + 1);
  }
  if (DAT_00019fcc < param_2) {
    uVar3 = 0xfffffff7;
  }
  else {
    param_3 = param_3 + param_2;
    if (param_3 <= param_2 * 2) {
      param_3 = param_2 << 1;
    }
    uVar3 = (param_3 | 7) + 1;
    if (param_3 < 0xb) {
      uVar3 = 0xb;
    }
  }
  uVar1 = FUN_000a0370(uVar3);
  if (param_5 != 0) {
    __aeabi_memmove(uVar1,pbVar4,param_5);
  }
  if (param_7 != 0) {
    __aeabi_memcpy(uVar1 + param_5,param_8,param_7,param_6,puVar5);
  }
  param_4 = param_4 - (param_6 + param_5);
  if (param_4 != 0) {
    __aeabi_memmove(uVar1 + param_5 + param_7,pbVar4 + param_6 + param_5,param_4);
  }
  if (param_2 != 10) {
    FUN_00023f68(pbVar4);
  }
  uVar2 = param_7 + param_5 + param_4;
  param_1[2] = uVar1;
  *(undefined1 *)(uVar1 + uVar2) = 0;
  *param_1 = uVar3 | 1;
  param_1[1] = uVar2;
  return;
}


