/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a9bc
 * Address  : 0001a9bc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a9bc(undefined2 *param_1,undefined4 param_2,uint param_3,uint param_4)

{
  longlong lVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  undefined4 unaff_r4;
  undefined4 unaff_r5;
  undefined4 unaff_r6;
  undefined4 unaff_r7;
  undefined4 unaff_r11;
  uint uVar6;
  undefined4 unaff_lr;
  bool bVar7;
  ulonglong uVar8;
  
  uVar2 = DAT_0001aa2c;
  if (param_4 == 0) {
    FUN_0001a5f0(param_1,param_3);
    return;
  }
  if (1 < param_4 && (uint)(param_3 <= DAT_0001aa2c) <= 2 - param_4) {
    uVar8 = FUN_00026034(param_3,param_4,DAT_0001aa30,2);
    lVar1 = (uVar8 & 0xffffffff) * (ulonglong)(uVar2 + 1);
    uVar6 = (uint)lVar1;
    bVar7 = param_3 < uVar6;
    param_3 = param_3 - uVar6;
    param_4 = (param_4 -
              ((int)(uVar8 >> 0x20) * (uVar2 + 1) + (int)uVar8 * 2 + (int)((ulonglong)lVar1 >> 0x20)
              )) - (uint)bVar7;
    param_1 = (undefined2 *)FUN_0001a5f0(param_1,(int)uVar8);
  }
  iVar3 = DAT_0001aa6c;
  iVar4 = FUN_00026034(param_3,param_4,DAT_0001aa6c,0,unaff_r11,unaff_r4,unaff_r5,unaff_r6,unaff_r7,
                       unaff_lr);
  iVar5 = param_3 - iVar4 * iVar3;
  *param_1 = *(undefined2 *)(DAT_0001aa70 + 0x1aa58 + iVar4 * 2);
  iVar3 = DAT_0001a814;
  iVar4 = FUN_00026070(iVar5,DAT_0001a814);
  iVar5 = iVar5 - iVar4 * iVar3;
  param_1[1] = *(undefined2 *)(DAT_0001a818 + 0x1a800 + iVar4 * 2);
  iVar3 = FUN_00026070(iVar5,10000);
  param_1[2] = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar3 * 2);
  FUN_0001a700(param_1 + 3,iVar5 + iVar3 * -10000);
  return;
}


