/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a178
 * Address  : 0001a178
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint * FUN_0001a178(uint *param_1,undefined4 param_2,uint param_3)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  byte *pbVar4;
  
  uVar1 = *param_1;
  uVar3 = param_1[1];
  if (uVar1 * -0x80000000 == 0) {
    uVar3 = (uVar1 & 0xff) >> 1;
  }
  iVar2 = (uVar1 & 0xfffffffe) - 1;
  if ((*param_1 & 1) == 0) {
    iVar2 = 10;
  }
  if (iVar2 - uVar3 < param_3) {
    FUN_00019f04(param_1,iVar2,(param_3 - iVar2) + uVar3,uVar3,uVar3,0,param_3,param_2);
  }
  else if (param_3 != 0) {
    pbVar4 = (byte *)param_1[2];
    if (uVar1 * -0x80000000 == 0) {
      pbVar4 = (byte *)((int)param_1 + 1);
    }
    __aeabi_memmove(pbVar4 + uVar3,param_2,param_3);
    uVar3 = uVar3 + param_3;
    if ((*param_1 & 1) == 0) {
      *(char *)param_1 = (char)uVar3 * '\x02';
    }
    else {
      param_1[1] = uVar3;
    }
    pbVar4[uVar3] = 0;
  }
  return param_1;
}


