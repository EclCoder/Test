/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024d8c
 * Address  : 00024d8c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_00024d8c(int *param_1,int param_2,undefined4 param_3,uint param_4)

{
  int iVar1;
  int local_1c;
  undefined4 uStack_18;
  uint local_14;
  
  local_1c = param_2;
  uStack_18 = param_3;
  local_14 = param_4;
  local_14 = (**(code **)(*param_1 + 0xc))(param_1,0xffffffff);
  local_14 = local_14 & 0xfffffffe;
  if (local_14 != 0) {
    if (param_2 != 0) {
      local_14 = local_14 - 1;
    }
    if (*(char *)((int)param_1 + 0x181) == '\x01') {
      local_14 = local_14 + 1;
    }
    iVar1 = FUN_0002506a(param_1[1],&local_14,&local_1c);
    if (((iVar1 != 0) && (local_1c != 0)) &&
       (iVar1 = FUN_00025090(param_1,local_14,&local_1c), iVar1 != 0)) goto LAB_00024dda;
  }
  *(undefined1 *)(param_1 + 0x60) = 1;
LAB_00024dda:
  return CONCAT44(local_1c,param_1);
}


