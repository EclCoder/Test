/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000970d8
 * Address  : 000970d8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000970d8(undefined4 *param_1,int *param_2,byte *param_3)

{
  int iVar1;
  int *piVar2;
  char *pcVar3;
  undefined4 *puVar4;
  undefined1 *puVar5;
  byte *pbVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  int iVar9;
  bool bVar10;
  int local_94;
  int local_90;
  int local_88;
  undefined4 local_84;
  int *local_78;
  int *local_70;
  int local_68;
  undefined4 local_64;
  int *local_58;
  int *local_50 [2];
  int local_48;
  int local_40 [4];
  int *local_30;
  int local_24;
  
  local_24 = **(int **)(DAT_00097440 + 0x97104);
  if (*(char *)(DAT_0009743c + 0x970f5) == '\0') {
    *(undefined1 *)(param_1 + 0xc) = 0;
    *(undefined1 *)(param_1 + 2) = 0;
    *param_1 = 6;
    goto LAB_0009732c;
  }
  pbVar6 = *(byte **)(param_3 + 8);
  if ((*param_3 & 1) == 0) {
    pbVar6 = param_3 + 1;
  }
  piVar2 = (int *)(**(code **)(*param_2 + 0x29c))(param_2,pbVar6);
  pcVar3 = (char *)FUN_00025e6c(DAT_00097444 + 0x97140);
  if (*pcVar3 == '\x01') {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_00097448 + 0x97158);
    uVar8 = *puVar4;
  }
  else {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_0009744c + 0x973dc);
    uVar8 = FUN_00076fc0();
    iVar9 = DAT_00097450;
    *puVar4 = uVar8;
    puVar5 = (undefined1 *)FUN_00025e6c(iVar9 + 0x973f8);
    *puVar5 = 1;
  }
  iVar9 = DAT_00097458 + 0x97184;
  local_70 = piVar2;
  local_68 = iVar9;
  local_64 = uVar8;
  local_58 = &local_68;
  uVar8 = FUN_00073564(param_2,*(undefined4 *)(DAT_00097454 + 0x971cc),
                       *(undefined4 *)(DAT_00097454 + 0x971b8),piVar2);
  pcVar3 = (char *)FUN_00025e6c(DAT_0009745c + 0x971ac);
  if (*pcVar3 == '\x01') {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_00097460 + 0x971c4);
    uVar7 = *puVar4;
  }
  else {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_00097464 + 0x97410);
    uVar7 = FUN_00076fc0();
    iVar1 = DAT_00097468;
    *puVar4 = uVar7;
    puVar5 = (undefined1 *)FUN_00025e6c(iVar1 + 0x9742c);
    *puVar5 = 1;
  }
  local_90 = 0;
  local_88 = iVar9;
  local_84 = uVar7;
  local_78 = &local_88;
  local_50[0] = param_2;
  local_48 = uVar8;
  local_30 = local_40;
  FUN_0009de44(&local_88,local_40);
  *param_1 = 0;
  param_1[2] = local_50[0];
  param_1[4] = local_48;
  local_48 = 0;
  if (local_30 == (int *)0x0) {
    param_1[10] = 0;
LAB_0009725c:
    *(undefined1 *)(param_1 + 0xc) = 1;
    local_48 = 0;
  }
  else {
    if (local_30 != local_40) {
      param_1[10] = local_30;
      local_30 = (int *)0x0;
      goto LAB_0009725c;
    }
    iVar9 = *local_30;
    param_1[10] = param_1 + 6;
    (**(code **)(iVar9 + 0xc))();
    iVar9 = local_48;
    *(undefined1 *)(param_1 + 0xc) = 1;
    bVar10 = local_48 != 0;
    local_48 = 0;
    if (bVar10) {
      local_94 = iVar9;
      if (local_30 == (int *)0x0) goto LAB_00097438;
      (**(code **)(*local_30 + 0x18))(local_30,&local_94);
    }
    if (local_30 == local_40) {
      iVar9 = 0x10;
LAB_000973c0:
      (**(code **)(*local_30 + iVar9))();
    }
    else {
      iVar9 = 0x14;
      if (local_30 != (int *)0x0) goto LAB_000973c0;
    }
  }
  iVar9 = local_90;
  bVar10 = local_90 != 0;
  local_90 = 0;
  if (bVar10) {
    local_94 = iVar9;
    if (local_78 == (int *)0x0) goto LAB_00097438;
    (**(code **)(*local_78 + 0x18))(local_78,&local_94);
  }
  if (local_78 == &local_88) {
    iVar9 = 0x10;
LAB_000972c0:
    (**(code **)(*local_78 + iVar9))();
  }
  else {
    iVar9 = 0x14;
    if (local_78 != (int *)0x0) goto LAB_000972c0;
  }
  piVar2 = local_70;
  local_70 = (int *)0x0;
  if (piVar2 != (int *)0x0) {
    local_50[0] = piVar2;
    if (local_58 == (int *)0x0) {
LAB_00097438:
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_58 + 0x18))(local_58,local_50);
  }
  if (local_58 == &local_68) {
    iVar9 = 0x10;
  }
  else {
    iVar9 = 0x14;
    if (local_58 == (int *)0x0) goto LAB_0009732c;
  }
  (**(code **)(*local_58 + iVar9))();
LAB_0009732c:
  if (**(int **)(DAT_0009746c + 0x9733c) == local_24) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


