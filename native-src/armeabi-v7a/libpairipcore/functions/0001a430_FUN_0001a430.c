/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a430
 * Address  : 0001a430
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint * FUN_0001a430(uint *param_1,uint param_2,byte param_3)

{
  byte *pbVar1;
  uint *puVar2;
  int iVar3;
  byte *pbVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  bool bVar8;
  
  uVar6 = param_1[1];
  if (((byte)*param_1 & 1) == 0) {
    uVar6 = (uint)(byte)((byte)*param_1 >> 1);
  }
  if (param_2 <= uVar6) {
    bVar8 = (*param_1 & 1) == 0;
    puVar2 = param_1;
    if (bVar8) {
      puVar2 = (uint *)((int)param_1 + 1);
      *(byte *)param_1 = (byte)(param_2 << 1);
    }
    if (!bVar8) {
      puVar2[1] = param_2;
      puVar2 = (uint *)puVar2[2];
    }
    *(byte *)((int)puVar2 + param_2) = 0;
    return puVar2;
  }
  param_2 = param_2 - uVar6;
  if (param_2 != 0) {
    uVar6 = *param_1;
    uVar7 = param_1[1];
    uVar5 = uVar6 & 1;
    if (uVar5 == 0) {
      uVar7 = (uVar6 & 0xff) >> 1;
    }
    iVar3 = (uVar6 & 0xfffffffe) - 1;
    if ((*param_1 & 1) == 0) {
      iVar3 = 10;
    }
    if (iVar3 - uVar7 < param_2) {
      FUN_00019ffc(param_1,iVar3,(param_2 - iVar3) + uVar7,uVar7,uVar7,0,0);
      uVar5 = (byte)*param_1 & 1;
    }
    pbVar1 = (byte *)param_1[2];
    if (uVar5 == 0) {
      pbVar1 = (byte *)((int)param_1 + 1);
    }
    pbVar4 = pbVar1 + uVar7;
    for (uVar6 = param_2; uVar6 != 0; uVar6 = uVar6 - 1) {
      *pbVar4 = param_3;
      pbVar4 = pbVar4 + 1;
    }
    uVar7 = uVar7 + param_2;
    if ((*param_1 & 1) == 0) {
      *(char *)param_1 = (char)uVar7 * '\x02';
    }
    else {
      param_1[1] = uVar7;
    }
    pbVar1[uVar7] = 0;
  }
  return param_1;
}


