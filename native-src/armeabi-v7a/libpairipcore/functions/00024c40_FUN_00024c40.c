/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024c40
 * Address  : 00024c40
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_00024c40(int *param_1,undefined4 param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = (**(code **)(*param_1 + 0x14))(param_1);
  if (iVar1 != 0) {
    uVar2 = (**(code **)(*param_1 + 0x18))(param_1,param_2);
    *param_3 = uVar2;
    return 0;
  }
  return DAT_00024c68;
}


