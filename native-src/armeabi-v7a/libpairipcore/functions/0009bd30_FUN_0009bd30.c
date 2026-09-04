/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009bd30
 * Address  : 0009bd30
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009bd30(undefined4 *param_1,undefined4 param_2,int *param_3)

{
  int *piVar1;
  int iVar2;
  bool bVar3;
  int local_6c;
  int local_68;
  int local_60 [4];
  int *local_50;
  undefined4 local_48;
  int local_40;
  int aiStack_38 [4];
  int *local_28;
  int local_1c;
  
  local_1c = **(int **)(DAT_0009c020 + 0x9bd54);
  if (*(char *)(DAT_0009c01c + 0x9bd46) == '\0') {
    *(undefined1 *)(param_1 + 0xc) = 0;
    *(undefined1 *)(param_1 + 2) = 0;
    *param_1 = 6;
    goto LAB_0009bf68;
  }
  iVar2 = *param_3;
  if (iVar2 == 0) {
    *(undefined1 *)(param_1 + 0xc) = 0;
    *(undefined1 *)(param_1 + 2) = 0;
    *param_1 = 5;
    goto LAB_0009bf68;
  }
  local_28 = (int *)param_3[6];
  *param_3 = 0;
  local_48 = param_2;
  if (local_28 == (int *)0x0) {
    local_50 = (int *)0x0;
LAB_0009be20:
    local_68 = 0;
    param_1[2] = param_2;
    *param_1 = 0;
    param_1[4] = iVar2;
    local_28 = (int *)0x0;
LAB_0009be38:
    param_1[10] = 0;
LAB_0009bef8:
    *(undefined1 *)(param_1 + 0xc) = 1;
    local_40 = 0;
  }
  else {
    if (local_28 == param_3 + 2) {
      local_68 = iVar2;
      local_50 = local_60;
      (**(code **)(*local_28 + 0xc))(local_28,local_60);
      local_40 = local_68;
      iVar2 = local_68;
      if (local_50 == (int *)0x0) goto LAB_0009be20;
      local_28 = local_50;
      if (local_50 == local_60) goto LAB_0009be98;
LAB_0009bdc0:
      local_68 = 0;
      param_1[2] = param_2;
      *param_1 = 0;
      param_1[4] = iVar2;
      local_50 = (int *)0x0;
    }
    else {
      param_3[6] = 0;
      local_50 = local_28;
      local_40 = iVar2;
      if (local_28 != local_60) goto LAB_0009bdc0;
LAB_0009be98:
      local_68 = 0;
      local_28 = aiStack_38;
      (**(code **)(*local_50 + 0xc))(local_50,local_28);
      *param_1 = 0;
      param_1[2] = local_48;
      param_1[4] = local_40;
      if (local_28 == (int *)0x0) goto LAB_0009be38;
    }
    piVar1 = local_28;
    local_40 = 0;
    if (local_28 != aiStack_38) {
      param_1[10] = local_28;
      local_28 = (int *)0x0;
      goto LAB_0009bef8;
    }
    iVar2 = *local_28;
    param_1[10] = param_1 + 6;
    (**(code **)(iVar2 + 0xc))(local_28);
    iVar2 = local_40;
    *(undefined1 *)(param_1 + 0xc) = 1;
    bVar3 = local_40 != 0;
    local_40 = 0;
    if (bVar3) {
      local_6c = iVar2;
      if (local_28 == (int *)0x0) goto LAB_0009c018;
      (**(code **)(*local_28 + 0x18))(local_28,&local_6c);
    }
    if (local_28 == piVar1) {
      iVar2 = 0x10;
LAB_0009c008:
      (**(code **)(*local_28 + iVar2))();
    }
    else {
      iVar2 = 0x14;
      if (local_28 != (int *)0x0) goto LAB_0009c008;
    }
  }
  iVar2 = local_68;
  local_68 = 0;
  if (iVar2 != 0) {
    local_6c = iVar2;
    if (local_50 == (int *)0x0) {
LAB_0009c018:
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_50 + 0x18))(local_50,&local_6c);
  }
  if (local_50 == local_60) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (local_50 == (int *)0x0) goto LAB_0009bf68;
  }
  (**(code **)(*local_50 + iVar2))();
LAB_0009bf68:
  if (**(int **)(DAT_0009c024 + 0x9bf78) == local_1c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


