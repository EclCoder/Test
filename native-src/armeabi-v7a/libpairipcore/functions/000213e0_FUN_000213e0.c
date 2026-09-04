/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000213e0
 * Address  : 000213e0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000213e0(int param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  ulonglong uVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  ulonglong uVar7;
  undefined4 uVar8;
  undefined4 uStack_28;
  
  uStack_28 = &stack0xfffffff8;
  iVar2 = *(int *)(param_1 + 8);
  uVar8 = param_2;
  if (iVar2 == 0) {
    uVar3 = 2;
    iVar2 = DAT_0002146c + 0x21410;
  }
  else if (iVar2 == 2) {
    uVar3 = 3;
    iVar2 = DAT_00021474 + 0x21408;
  }
  else {
    if (iVar2 != 1) goto LAB_00021414;
    uVar3 = 2;
    iVar2 = DAT_00021470 + 0x21400;
  }
  FUN_0001dcd6(param_2,iVar2,uVar3,param_4,param_2,param_3);
LAB_00021414:
  if (*(int *)(param_1 + 0xc) != 0) {
    iVar2 = 0;
    uVar1 = (ulonglong)(*(int *)(param_1 + 0xc) - 1);
    do {
      iVar4 = iVar2;
      iVar6 = (int)(uVar1 >> 0x20);
      uVar5 = (uint)uVar1;
      uVar7 = FUN_00026034(uVar5,iVar6,10,0);
      *(byte *)((int)&uStack_28 + iVar4 + 3) = (char)uVar1 + (char)uVar7 * -10 | 0x30;
      iVar2 = iVar4 + -1;
      uVar1 = uVar7;
    } while ((uint)(uVar5 < 10) <= (uint)-iVar6);
    FUN_0001dcd6(param_2,(int)&uStack_28 + iVar4 + 3,-(iVar4 + -1),&stack0xffffffc7 + iVar4,uVar8,
                 param_3);
  }
  return;
}


