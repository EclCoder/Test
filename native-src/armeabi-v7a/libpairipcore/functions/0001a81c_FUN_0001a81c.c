/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a81c
 * Address  : 0001a81c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a81c(char *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  undefined4 extraout_r3;
  undefined4 unaff_r4;
  undefined4 unaff_r5;
  undefined4 unaff_r6;
  undefined4 unaff_r7;
  undefined4 unaff_r11;
  undefined4 unaff_lr;
  
  iVar2 = DAT_0001a84c;
  iVar1 = FUN_00026070(param_2,DAT_0001a84c);
  param_2 = param_2 - iVar1 * iVar2;
  *param_1 = (char)iVar1 + '0';
  iVar2 = DAT_0001a814;
  iVar1 = FUN_00026070(param_2,DAT_0001a814);
  param_2 = param_2 - iVar1 * iVar2;
  iVar2 = DAT_0001a818 + 0x1a800;
  *(undefined2 *)(param_1 + 1) = *(undefined2 *)(iVar2 + iVar1 * 2);
  iVar2 = FUN_00026070(param_2,10000,iVar2,extraout_r3,unaff_r11,unaff_r4,unaff_r5,unaff_r6,unaff_r7
                       ,unaff_lr);
  *(undefined2 *)(param_1 + 3) = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar2 * 2);
  FUN_0001a700(param_1 + 5,param_2 + iVar2 * -10000);
  return;
}


