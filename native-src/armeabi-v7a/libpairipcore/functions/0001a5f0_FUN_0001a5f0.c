/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a5f0
 * Address  : 0001a5f0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


byte * FUN_0001a5f0(byte *param_1,uint param_2,int param_3,undefined4 param_4)

{
  int iVar1;
  int iVar2;
  undefined4 extraout_r3;
  undefined4 extraout_r3_00;
  undefined4 unaff_r4;
  byte *pbVar3;
  undefined4 unaff_r5;
  undefined4 unaff_r6;
  undefined4 unaff_r7;
  undefined4 unaff_r11;
  undefined4 unaff_lr;
  
  iVar1 = DAT_0001a884;
  if (DAT_0001a6e4 < param_2) {
    if (DAT_0001a6e8 < param_2) {
      if (param_2 <= DAT_0001a6ec) {
        pbVar3 = (byte *)FUN_0001a81c(param_1,param_2);
        return pbVar3;
      }
      iVar2 = FUN_00026070(param_2,DAT_0001a884);
      param_2 = param_2 - iVar2 * iVar1;
      param_3 = DAT_0001a888 + 0x1a870;
      *(undefined2 *)param_1 = *(undefined2 *)(param_3 + iVar2 * 2);
      param_1 = param_1 + 2;
      param_4 = extraout_r3_00;
    }
    else if (param_2 <= DAT_0001a6f0) {
      pbVar3 = (byte *)FUN_0001a7ac(param_1,param_2);
      return pbVar3;
    }
    iVar1 = DAT_0001a814;
    iVar2 = FUN_00026070(param_2,DAT_0001a814,param_3,param_4,unaff_r11,unaff_r4,unaff_r5,unaff_r6,
                         unaff_r7,unaff_lr);
    param_2 = param_2 - iVar2 * iVar1;
    param_3 = DAT_0001a818 + 0x1a800;
    *(undefined2 *)param_1 = *(undefined2 *)(param_3 + iVar2 * 2);
    param_1 = param_1 + 2;
    param_4 = extraout_r3;
  }
  else {
    if (param_2 < 10000) {
      if (param_2 < 100) {
        if (param_2 < 10) {
          pbVar3 = param_1 + 1;
          *param_1 = (byte)param_2 | 0x30;
        }
        else {
          pbVar3 = param_1 + 2;
          *(undefined2 *)param_1 = *(undefined2 *)(DAT_0001a6fc + 0x1a6c6 + param_2 * 2);
        }
      }
      else {
        if (0x7c < param_2 >> 3) {
          pbVar3 = (byte *)FUN_0001a700(param_1,param_2);
          return pbVar3;
        }
        iVar1 = FUN_00026070(param_2 & 0xffff,100);
        *param_1 = (byte)iVar1 | 0x30;
        *(undefined2 *)(param_1 + 1) =
             *(undefined2 *)(DAT_0001a6f8 + 0x1a684 + (param_2 + iVar1 * -100 & 0xffff) * 2);
        pbVar3 = param_1 + 3;
      }
      return pbVar3;
    }
    if (param_2 <= DAT_0001a6f4) {
      pbVar3 = (byte *)FUN_0001a73c(param_1,param_2);
      return pbVar3;
    }
  }
  iVar1 = FUN_00026070(param_2,10000,param_3,param_4,unaff_r11,unaff_r4,unaff_r5,unaff_r6,unaff_r7,
                       unaff_lr);
  *(undefined2 *)param_1 = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar1 * 2);
  pbVar3 = (byte *)FUN_0001a700(param_1 + 2,param_2 + iVar1 * -10000);
  return pbVar3;
}


