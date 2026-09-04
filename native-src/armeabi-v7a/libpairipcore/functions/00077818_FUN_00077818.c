/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00077818
 * Address  : 00077818
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00077818(int *param_1,int param_2)

{
  char cVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  char *pcVar7;
  undefined4 *puVar8;
  undefined1 *puVar9;
  int iVar10;
  int iVar11;
  int *piVar12;
  int iVar13;
  undefined1 *puVar14;
  int iVar15;
  int *piVar16;
  undefined4 uVar17;
  bool bVar18;
  int *local_74;
  int local_6c;
  int local_68 [2];
  int local_60;
  undefined4 local_5c;
  int *local_50;
  int local_48;
  int local_40;
  undefined4 local_3c;
  int *local_30;
  int local_28;
  
  pcVar7 = (char *)FUN_00025e6c(DAT_00077e3c + 0x77834);
  local_28 = **(int **)(DAT_00077e40 + 0x77848);
  if (*pcVar7 == '\x01') {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_00077e44 + 0x77860);
    local_74 = (int *)*puVar8;
  }
  else {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_00077e48 + 0x77da4);
    local_74 = (int *)FUN_00076fc0();
    iVar10 = DAT_00077e4c + 0x77dc0;
    *puVar8 = local_74;
    puVar9 = (undefined1 *)FUN_00025e6c(iVar10);
    *puVar9 = 1;
  }
  cVar1 = *(char *)(param_2 + 0x14);
  param_1[6] = 0;
  *param_1 = 0;
  if (cVar1 != '\x01') goto LAB_00077d74;
  puVar8 = (undefined4 *)FUN_000a0398(0xf);
  *puVar8 = 0;
  *(undefined1 *)puVar8 = 0x6a;
  *(undefined1 *)((int)puVar8 + 1) = 0x61;
  *(undefined1 *)((int)puVar8 + 2) = 0x76;
  puVar8[1] = 0;
  *(undefined1 *)((int)puVar8 + 3) = 0x61;
  *(undefined1 *)(puVar8 + 1) = 0x2f;
  *(undefined1 *)((int)puVar8 + 5) = 0x6c;
  *(undefined4 *)((int)puVar8 + 7) = 0;
  *(undefined1 *)((int)puVar8 + 6) = 0x61;
  *(undefined1 *)((int)puVar8 + 7) = 0x6e;
  *(undefined1 *)(puVar8 + 2) = 0x67;
  *(undefined1 *)((int)puVar8 + 9) = 0x2f;
  *(undefined4 *)((int)puVar8 + 0xb) = 0;
  *(undefined1 *)((int)puVar8 + 10) = 0x4c;
  *(undefined1 *)((int)puVar8 + 0xb) = 0x6f;
  *(undefined1 *)(puVar8 + 3) = 0x6e;
  *(undefined1 *)((int)puVar8 + 0xd) = 0x67;
  *(undefined1 *)((int)puVar8 + 0xe) = 0;
  puVar9 = (undefined1 *)FUN_000a0370(0x10);
  uVar2 = *(undefined1 *)((int)puVar8 + 1);
  uVar3 = *(undefined1 *)((int)puVar8 + 2);
  uVar4 = *(undefined1 *)((int)puVar8 + 3);
  uVar5 = *(undefined1 *)(puVar8 + 1);
  *puVar9 = *(undefined1 *)puVar8;
  uVar6 = *(undefined1 *)((int)puVar8 + 5);
  puVar9[1] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar8 + 6);
  puVar9[2] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar8 + 7);
  puVar9[3] = uVar4;
  uVar4 = *(undefined1 *)(puVar8 + 2);
  puVar9[4] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar8 + 9);
  puVar9[5] = uVar6;
  uVar6 = *(undefined1 *)((int)puVar8 + 10);
  puVar9[6] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar8 + 0xb);
  puVar9[7] = uVar3;
  uVar3 = *(undefined1 *)(puVar8 + 3);
  puVar9[8] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar8 + 0xd);
  puVar9[10] = uVar6;
  puVar9[9] = uVar5;
  puVar9[0xb] = uVar2;
  puVar9[0xc] = uVar3;
  puVar9[0xe] = 0;
  puVar9[0xd] = uVar4;
  FUN_00023f74(puVar8);
  iVar10 = (**(code **)(*local_74 + 0x18))(local_74,puVar9);
  pcVar7 = (char *)FUN_00025e6c(DAT_00077e50 + 0x779a8);
  if (*pcVar7 == '\x01') {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_00077e54 + 0x779c0);
    uVar17 = *puVar8;
  }
  else {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_00077e58 + 0x77ddc);
    uVar17 = FUN_00076fc0();
    iVar11 = DAT_00077e5c;
    *puVar8 = uVar17;
    puVar14 = (undefined1 *)FUN_00025e6c(iVar11 + 0x77df8);
    *puVar14 = 1;
  }
  iVar11 = DAT_00077e60 + 0x779e4;
  local_48 = iVar10;
  local_40 = iVar11;
  local_3c = uVar17;
  local_30 = &local_40;
  FUN_00023f68(puVar9,0x10);
  iVar10 = (**(code **)(*local_74 + 0x2b0))(local_74,*(undefined4 *)(param_2 + 0xc),local_48,0);
  pcVar7 = (char *)FUN_00025e6c(DAT_00077e64 + 0x77a24);
  if (*pcVar7 == '\x01') {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_00077e68 + 0x77a3c);
    uVar17 = *puVar8;
  }
  else {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_00077e6c + 0x77e10);
    uVar17 = FUN_00076fc0();
    iVar15 = DAT_00077e70;
    *puVar8 = uVar17;
    puVar9 = (undefined1 *)FUN_00025e6c(iVar15 + 0x77e2c);
    *puVar9 = 1;
  }
  iVar15 = *param_1;
  *param_1 = iVar10;
  local_68[0] = 0;
  local_60 = iVar11;
  local_5c = uVar17;
  local_50 = &local_60;
  if (iVar15 != 0) {
    piVar12 = (int *)param_1[6];
    local_6c = iVar15;
    if (piVar12 == (int *)0x0) goto LAB_00077e38;
    (**(code **)(*piVar12 + 0x18))(piVar12,&local_6c);
  }
  piVar12 = (int *)param_1[6];
  param_1[6] = 0;
  piVar16 = param_1 + 2;
  if (piVar12 == piVar16) {
    iVar10 = 0x10;
LAB_00077ae0:
    (**(code **)(*piVar12 + iVar10))();
    if (local_50 != (int *)0x0) goto LAB_00077ac0;
LAB_00077af8:
    piVar12 = (int *)0x0;
    param_1[6] = 0;
  }
  else {
    iVar10 = 0x14;
    if (piVar12 != (int *)0x0) goto LAB_00077ae0;
    if (local_50 == (int *)0x0) goto LAB_00077af8;
LAB_00077ac0:
    if (local_50 == &local_60) {
      iVar10 = *local_50;
      param_1[6] = (int)piVar16;
      (**(code **)(iVar10 + 0xc))(local_50,piVar16);
      piVar12 = local_50;
    }
    else {
      param_1[6] = (int)local_50;
      local_50 = (int *)0x0;
      piVar12 = (int *)0x0;
    }
  }
  iVar10 = local_68[0];
  local_68[0] = 0;
  if (iVar10 != 0) {
    local_6c = iVar10;
    if (piVar12 == (int *)0x0) goto LAB_00077e38;
    (**(code **)(*piVar12 + 0x18))(piVar12,&local_6c);
    piVar12 = local_50;
  }
  if (piVar12 == &local_60) {
    iVar10 = 0x10;
LAB_00077b80:
    (**(code **)(*piVar12 + iVar10))();
    piVar12 = *(int **)(param_2 + 8);
  }
  else {
    iVar10 = 0x14;
    if (piVar12 != (int *)0x0) goto LAB_00077b80;
    piVar12 = *(int **)(param_2 + 8);
  }
  if (piVar12 != (int *)0x0) {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_00077e74 + 0x77ba4);
    iVar10 = 0;
    do {
      iVar15 = *param_1;
      pcVar7 = (char *)FUN_00025e6c(DAT_00077e78 + 0x77be0);
      if (*pcVar7 == '\x01') {
        uVar17 = *puVar8;
      }
      else {
        uVar17 = FUN_00076fc0();
        *puVar8 = uVar17;
        puVar9 = (undefined1 *)FUN_00025e6c(DAT_00077e80 + 0x77cd8);
        *puVar9 = 1;
      }
      iVar13 = FUN_00073564(uVar17,*(undefined4 *)(DAT_00077e84 + 0x77c0c),
                            *(undefined4 *)(DAT_00077e84 + 0x77c10),piVar12[3],piVar12[2],piVar12[3]
                           );
      pcVar7 = (char *)FUN_00025e6c(DAT_00077e88 + 0x77c28);
      if (*pcVar7 == '\x01') {
        uVar17 = *puVar8;
      }
      else {
        uVar17 = FUN_00076fc0();
        *puVar8 = uVar17;
        puVar9 = (undefined1 *)FUN_00025e6c(DAT_00077e8c + 0x77d04);
        *puVar9 = 1;
      }
      local_68[0] = iVar13;
      local_60 = iVar11;
      local_5c = uVar17;
      local_50 = &local_60;
      (**(code **)(*local_74 + 0x2b8))(local_74,iVar15,iVar10,iVar13);
      iVar15 = local_68[0];
      local_68[0] = 0;
      if (iVar15 != 0) {
        local_6c = iVar15;
        if (local_50 == (int *)0x0) goto LAB_00077e38;
        (**(code **)(*local_50 + 0x18))(local_50,&local_6c);
      }
      if (local_50 == &local_60) {
        iVar15 = 0x10;
LAB_00077bb4:
        (**(code **)(*local_50 + iVar15))();
      }
      else {
        iVar15 = 0x14;
        if (local_50 != (int *)0x0) goto LAB_00077bb4;
      }
      piVar12 = (int *)*piVar12;
      iVar10 = iVar10 + 1;
    } while (piVar12 != (int *)0x0);
  }
  iVar10 = local_48;
  bVar18 = local_48 != 0;
  local_48 = 0;
  if (bVar18) {
    local_68[0] = iVar10;
    if (local_30 == (int *)0x0) {
LAB_00077e38:
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_30 + 0x18))(local_30,local_68);
  }
  if (local_30 == &local_40) {
    iVar10 = 0x10;
  }
  else {
    iVar10 = 0x14;
    if (local_30 == (int *)0x0) goto LAB_00077d74;
  }
  (**(code **)(*local_30 + iVar10))();
LAB_00077d74:
  if (**(int **)(DAT_00077e7c + 0x77d84) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


