/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009f240
 * Address  : 0009f240
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Removing unreachable block (ram,0x0009f49c) */

void FUN_0009f240(int *param_1)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  int iVar6;
  char *pcVar7;
  undefined4 *puVar8;
  undefined1 *puVar9;
  int iVar10;
  undefined1 *puVar11;
  undefined4 *puVar12;
  undefined4 uVar13;
  int *piVar14;
  int local_4c;
  int local_48;
  int local_40;
  undefined4 local_3c;
  int *local_30;
  int local_24;
  
  pcVar7 = (char *)FUN_00025e6c(DAT_0009f5e4 + 0x9f258);
  local_24 = **(int **)(DAT_0009f5e8 + 0x9f26c);
  if (*pcVar7 == '\x01') {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_0009f5ec + 0x9f284);
    piVar14 = (int *)*puVar8;
  }
  else {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_0009f5f0 + 0x9f584);
    piVar14 = (int *)FUN_00076fc0();
    iVar10 = DAT_0009f5f4;
    *puVar8 = piVar14;
    puVar9 = (undefined1 *)FUN_00025e6c(iVar10 + 0x9f5a0);
    *puVar9 = 1;
  }
  puVar8 = (undefined4 *)FUN_000a0398(0x14);
  *puVar8 = 0;
  puVar8[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar8[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar8[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar12 = puVar8 + 4;
  *(undefined1 *)puVar8 = 99;
  *(undefined1 *)((int)puVar8 + 1) = 0x6f;
  *(undefined1 *)((int)puVar8 + 2) = 0x6d;
  *(undefined1 *)((int)puVar8 + 3) = 0x2f;
  *(undefined1 *)(puVar8 + 1) = 0x70;
  *(undefined1 *)((int)puVar8 + 5) = 0x61;
  *(undefined1 *)((int)puVar8 + 6) = 0x69;
  *(undefined1 *)((int)puVar8 + 7) = 0x72;
  *(undefined1 *)(puVar8 + 2) = 0x69;
  *(undefined1 *)((int)puVar8 + 9) = 0x70;
  *(undefined1 *)((int)puVar8 + 10) = 0x2f;
  *(undefined1 *)((int)puVar8 + 0xb) = 0x56;
  *(undefined1 *)(puVar8 + 3) = 0x4d;
  *(undefined1 *)((int)puVar8 + 0xd) = 0x52;
  *puVar12 = 0;
  *(undefined1 *)((int)puVar8 + 0xe) = 0x75;
  *(undefined1 *)((int)puVar8 + 0xf) = 0x6e;
  *(undefined1 *)puVar12 = 0x6e;
  *(undefined1 *)((int)puVar8 + 0x11) = 0x65;
  *(undefined1 *)((int)puVar8 + 0x12) = 0x72;
  *(undefined1 *)((int)puVar8 + 0x13) = 0;
  puVar9 = (undefined1 *)FUN_000a0370(0x18);
  uVar1 = *(undefined1 *)((int)puVar8 + 1);
  uVar2 = *(undefined1 *)((int)puVar8 + 2);
  uVar3 = *(undefined1 *)((int)puVar8 + 3);
  *puVar9 = *(undefined1 *)puVar8;
  uVar4 = *(undefined1 *)(puVar8 + 1);
  puVar9[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar8 + 5);
  puVar9[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar8 + 6);
  puVar9[3] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar8 + 7);
  puVar9[4] = uVar4;
  uVar4 = *(undefined1 *)(puVar8 + 2);
  puVar9[5] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar8 + 9);
  puVar9[6] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar8 + 10);
  puVar9[7] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar8 + 0xb);
  puVar9[8] = uVar4;
  uVar4 = *(undefined1 *)(puVar8 + 3);
  puVar9[9] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar8 + 0xd);
  puVar9[10] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar8 + 0xe);
  puVar9[0xb] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar8 + 0xf);
  uVar5 = *(undefined1 *)puVar12;
  puVar9[0xc] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar8 + 0x11);
  puVar9[0xd] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar8 + 0x12);
  puVar9[0x11] = uVar4;
  puVar9[0xe] = uVar2;
  puVar9[0xf] = uVar3;
  puVar9[0x10] = uVar5;
  puVar9[0x13] = 0;
  puVar9[0x12] = uVar1;
  FUN_00023f74(puVar8);
  iVar10 = (**(code **)(*piVar14 + 0x18))(piVar14,puVar9);
  pcVar7 = (char *)FUN_00025e6c(DAT_0009f5f8 + 0x9f404);
  if (*pcVar7 == '\x01') {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_0009f5fc + 0x9f41c);
    uVar13 = *puVar8;
  }
  else {
    puVar8 = (undefined4 *)FUN_00025e6c(DAT_0009f600 + 0x9f5b8);
    uVar13 = FUN_00076fc0();
    iVar6 = DAT_0009f604;
    *puVar8 = uVar13;
    puVar11 = (undefined1 *)FUN_00025e6c(iVar6 + 0x9f5d4);
    *puVar11 = 1;
  }
  local_40 = DAT_0009f608 + 0x9f440;
  local_48 = iVar10;
  local_3c = uVar13;
  local_30 = &local_40;
  FUN_00023f68(puVar9,0x18);
  if (local_48 == 0) {
    iVar10 = (**(code **)(*piVar14 + 0x390))(piVar14);
    if (iVar10 != 0) {
      (**(code **)(*piVar14 + 0x44))(piVar14);
    }
    param_1[6] = 0;
    *param_1 = 0;
  }
  else {
    *param_1 = local_48;
    local_48 = 0;
    if (local_30 == (int *)0x0) {
      param_1[6] = 0;
    }
    else {
      if (local_30 != &local_40) {
        param_1[6] = (int)local_30;
        local_30 = (int *)0x0;
        local_48 = 0;
        goto LAB_0009f554;
      }
      iVar10 = *local_30;
      param_1[6] = (int)(param_1 + 2);
      (**(code **)(iVar10 + 0xc))();
    }
  }
  iVar10 = local_48;
  local_48 = 0;
  if (iVar10 != 0) {
    local_4c = iVar10;
    if (local_30 == (int *)0x0) {
      local_48 = 0;
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_30 + 0x18))(local_30,&local_4c);
  }
  if (local_30 == &local_40) {
    iVar10 = 0x10;
  }
  else {
    iVar10 = 0x14;
    if (local_30 == (int *)0x0) goto LAB_0009f554;
  }
  (**(code **)(*local_30 + iVar10))();
LAB_0009f554:
  if (**(int **)(DAT_0009f60c + 0x9f564) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


