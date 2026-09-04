/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a2cc
 * Address  : 0001a2cc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a2cc(uint *param_1,byte param_2)

{
  byte bVar1;
  uint uVar2;
  byte *pbVar3;
  uint uVar4;
  
  bVar1 = (byte)*param_1;
  if ((bVar1 & 1) == 0) {
    if (bVar1 != 0x14) {
      pbVar3 = (byte *)((int)param_1 + 1);
      *(byte *)param_1 = bVar1 + 2;
      uVar2 = (uint)(bVar1 >> 1);
      goto LAB_0001a31c;
    }
    uVar4 = 10;
LAB_0001a2f6:
    uVar2 = uVar4;
    FUN_00019ffc(param_1,uVar2,1,uVar2,uVar2,0,0);
  }
  else {
    uVar2 = param_1[1];
    uVar4 = (*param_1 & 0xfffffffe) - 1;
    if (uVar2 == uVar4) goto LAB_0001a2f6;
  }
  param_1[1] = uVar2 + 1;
  pbVar3 = (byte *)param_1[2];
LAB_0001a31c:
  pbVar3[uVar2] = param_2;
  pbVar3[uVar2 + 1] = 0;
  return;
}


