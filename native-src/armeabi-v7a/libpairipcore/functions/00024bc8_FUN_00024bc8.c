/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024bc8
 * Address  : 00024bc8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_00024bc8(int *param_1,int param_2,undefined4 param_3)

{
  int iVar1;
  undefined4 uVar2;
  undefined1 auStack_38 [16];
  int local_28;
  
  iVar1 = (**(code **)(*param_1 + 8))(param_1);
  uVar2 = DAT_00024c3c;
  if (iVar1 != 0) {
    if (param_2 == -1) {
      (**(code **)(*param_1 + 0x24))(param_1,auStack_38);
      iVar1 = (**(code **)(*param_1 + 0xc))(param_1,0xfffffffe);
      if (local_28 != 0) {
        (**(code **)(*param_1 + 0x10))(param_1,0xfffffffe,local_28 + iVar1);
      }
      (**(code **)(*param_1 + 0x10))(param_1,0xffffffff,param_3);
      (**(code **)(*param_1 + 0x34))(param_1,0);
      uVar2 = 0;
    }
    else {
      (**(code **)(*param_1 + 0x10))(param_1,param_2,param_3);
      uVar2 = 0;
    }
  }
  return uVar2;
}


