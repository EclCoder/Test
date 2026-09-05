// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 681-700
// ============================================================

// ============================================================
// Function #681
// Name: FUN_000970d8
// Address: 000970d8
// JNI: NO
// ============================================================


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




// ============================================================
// Function #682
// Name: FUN_00097470
// Address: 00097470
// JNI: NO
// ============================================================


void FUN_00097470(undefined4 *param_1,byte *param_2)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  undefined4 *puVar4;
  undefined1 *puVar5;
  byte *pbVar6;
  undefined4 uVar7;
  int iVar8;
  int local_64 [3];
  int local_58;
  undefined4 local_54;
  int *local_48;
  int local_40;
  int local_38;
  undefined4 local_34;
  int *local_28;
  int local_1c;
  
  local_1c = **(int **)(DAT_000976a0 + 0x97488);
  pbVar6 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar6 = param_2 + 1;
  }
  iVar2 = (**(code **)(*(int *)*param_1 + 0x29c))((int *)*param_1,pbVar6);
  pcVar3 = (char *)FUN_00025e6c(DAT_000976a4 + 0x974c4);
  if (*pcVar3 == '\x01') {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976a8 + 0x974dc);
    uVar7 = *puVar4;
  }
  else {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976ac + 0x97640);
    uVar7 = FUN_00076fc0();
    iVar8 = DAT_000976b0;
    *puVar4 = uVar7;
    puVar5 = (undefined1 *)FUN_00025e6c(iVar8 + 0x9765c);
    *puVar5 = 1;
  }
  iVar8 = DAT_000976b4 + 0x97504;
  local_40 = iVar2;
  local_38 = iVar8;
  local_34 = uVar7;
  local_28 = &local_38;
  iVar2 = FUN_000765d8(*param_1,param_1[2],*(undefined4 *)(DAT_000976b8 + 0x97550),iVar2);
  pcVar3 = (char *)FUN_00025e6c(DAT_000976bc + 0x97530);
  if (*pcVar3 == '\x01') {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976c0 + 0x97548);
    uVar7 = *puVar4;
  }
  else {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976c4 + 0x97674);
    uVar7 = FUN_00076fc0();
    iVar1 = DAT_000976c8;
    *puVar4 = uVar7;
    puVar5 = (undefined1 *)FUN_00025e6c(iVar1 + 0x97690);
    *puVar5 = 1;
  }
  local_54 = uVar7;
  local_58 = iVar8;
  iVar8 = 0x10;
  local_48 = &local_58;
  local_64[1] = 0;
  if (((iVar2 == 0) ||
      (local_64[0] = iVar2, FUN_0009de6c(&local_58,local_64), local_48 == &local_58)) ||
     (iVar8 = 0x14, local_48 != (int *)0x0)) {
    (**(code **)(*local_48 + iVar8))();
  }
  iVar2 = local_40;
  local_40 = 0;
  if (iVar2 != 0) {
    local_64[0] = iVar2;
    if (local_28 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_28 + 0x18))(local_28,local_64);
  }
  if (local_28 == &local_38) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (local_28 == (int *)0x0) goto LAB_00097610;
  }
  (**(code **)(*local_28 + iVar2))();
LAB_00097610:
  if (**(int **)(DAT_000976cc + 0x97620) == local_1c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #683
// Name: FUN_000976d0
// Address: 000976d0
// JNI: NO
// ============================================================


void FUN_000976d0(int *param_1)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  undefined4 *puVar7;
  undefined1 *puVar8;
  uint uVar9;
  char *pcVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  ushort *puVar13;
  undefined2 *puVar14;
  int iVar15;
  int iVar16;
  undefined1 *puVar17;
  int iVar18;
  undefined1 *puVar19;
  int iVar20;
  undefined1 *puVar21;
  undefined4 *puVar22;
  uint uVar23;
  undefined4 uVar24;
  undefined1 *puVar25;
  bool bVar26;
  undefined4 uVar27;
  undefined4 uVar28;
  int local_70;
  undefined4 local_6c;
  uint local_68;
  undefined1 *local_64;
  undefined4 local_60;
  uint local_5c;
  undefined1 *local_58;
  undefined4 local_54;
  undefined1 **local_48;
  int local_3c;
  
  local_3c = **(int **)(DAT_00097960 + 0x97700);
  if (*(char *)(DAT_0009795c + 0x976f1) != '\0') goto LAB_0009b94c;
  puVar7 = (undefined4 *)FUN_000a0398(0x17);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x61;
  *(undefined1 *)((int)puVar7 + 1) = 0x6e;
  *(undefined1 *)((int)puVar7 + 2) = 100;
  *(undefined1 *)((int)puVar7 + 3) = 0x72;
  *(undefined1 *)(puVar7 + 1) = 0x6f;
  *(undefined1 *)((int)puVar7 + 5) = 0x69;
  *(undefined1 *)((int)puVar7 + 6) = 100;
  *(undefined1 *)((int)puVar7 + 7) = 0x2f;
  *(undefined1 *)(puVar7 + 2) = 99;
  *(undefined1 *)((int)puVar7 + 9) = 0x6f;
  *(undefined1 *)((int)puVar7 + 10) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x74;
  *(undefined1 *)(puVar7 + 3) = 0x65;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x6e;
  *(undefined4 *)((int)puVar7 + 0xf) = 0;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x2f;
  *(undefined1 *)(puVar7 + 4) = 0x49;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x6e;
  *(undefined4 *)((int)puVar7 + 0x13) = 0;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x65;
  *(undefined1 *)(puVar7 + 5) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x16) = 0;
  puVar8 = (undefined1 *)FUN_000a0370(0x18);
  uVar1 = *(undefined1 *)((int)puVar7 + 1);
  uVar2 = *(undefined1 *)((int)puVar7 + 2);
  uVar3 = *(undefined1 *)((int)puVar7 + 3);
  *puVar8 = *(undefined1 *)puVar7;
  uVar4 = *(undefined1 *)(puVar7 + 1);
  puVar8[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 5);
  puVar8[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 6);
  puVar8[3] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 7);
  puVar8[4] = uVar4;
  uVar4 = *(undefined1 *)(puVar7 + 2);
  puVar8[5] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 9);
  puVar8[6] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 10);
  puVar8[7] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0xb);
  puVar8[8] = uVar4;
  uVar4 = *(undefined1 *)(puVar7 + 3);
  puVar8[9] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0xd);
  puVar8[10] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0xe);
  puVar8[0xb] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0xf);
  uVar5 = *(undefined1 *)(puVar7 + 4);
  puVar8[0xc] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar7 + 0x11);
  puVar8[0xd] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x12);
  puVar8[0xe] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0x13);
  puVar8[0xf] = uVar3;
  uVar3 = *(undefined1 *)(puVar7 + 5);
  puVar8[0x10] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x15);
  puVar8[0x11] = uVar4;
  puVar8[0x12] = uVar1;
  puVar8[0x13] = uVar2;
  puVar8[0x14] = uVar3;
  puVar8[0x16] = 0;
  puVar8[0x15] = uVar5;
  FUN_00023f74(puVar7);
  uVar9 = (**(code **)(*param_1 + 0x18))(param_1,puVar8);
  pcVar10 = (char *)FUN_00025e6c(DAT_00097964 + 0x978a4);
  if (*pcVar10 == '\x01') {
    puVar7 = (undefined4 *)FUN_00025e6c(DAT_00097968 + 0x978bc);
    uVar24 = *puVar7;
  }
  else {
    puVar7 = (undefined4 *)FUN_00025e6c(DAT_0009ba24 + 0x9b9a8);
    uVar24 = FUN_00076fc0();
    iVar15 = DAT_0009ba28;
    *puVar7 = uVar24;
    puVar25 = (undefined1 *)FUN_00025e6c(iVar15 + 0x9b9c4);
    *puVar25 = 1;
  }
  puVar25 = (undefined1 *)(DAT_0009796c + 0x978e0);
  local_60 = uVar9;
  local_58 = puVar25;
  local_54 = uVar24;
  local_48 = &local_58;
  uVar24 = (**(code **)(*param_1 + 0x54))(param_1,uVar9);
  uVar9 = local_60;
  iVar15 = DAT_00097970;
  bVar26 = local_60 != 0;
  *(undefined4 *)((int)&DAT_00097960 + DAT_00097970) = uVar24;
  local_60 = 0;
  if (bVar26) {
    local_6c = uVar9;
    if (local_48 == (undefined1 **)0x0) goto LAB_0009ba20;
    (**(code **)(*local_48 + 0x18))(local_48,&local_6c);
  }
  if (local_48 == &local_58) {
    iVar16 = 0x10;
LAB_00097988:
    (**(code **)(*local_48 + iVar16))();
  }
  else {
    iVar16 = 0x14;
    if (local_48 != (undefined1 **)0x0) goto LAB_00097988;
  }
  FUN_00023f68(puVar8,0x18);
  uVar24 = *(undefined4 *)((int)&DAT_00097960 + iVar15);
  puVar7 = (undefined4 *)FUN_000a0398(7);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x3c;
  *(undefined4 *)((int)puVar7 + 3) = 0;
  *(undefined1 *)((int)puVar7 + 1) = 0x69;
  *(undefined1 *)((int)puVar7 + 2) = 0x6e;
  *(undefined1 *)((int)puVar7 + 3) = 0x69;
  *(undefined1 *)(puVar7 + 1) = 0x74;
  *(undefined1 *)((int)puVar7 + 5) = 0x3e;
  *(undefined1 *)((int)puVar7 + 6) = 0;
  local_6c._0_2_ = CONCAT11(*(undefined1 *)puVar7,0xc);
  local_6c._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_6c);
  local_6c = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_6c);
  local_68 = (uint)*(uint3 *)((int)puVar7 + 3);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x16);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined4 *)((int)puVar7 + 0xe) = 0;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  iVar15 = DAT_00097974;
  *(undefined1 *)(puVar7 + 4) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined4 *)((int)puVar7 + 0x12) = 0;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x29;
  *(undefined1 *)(puVar7 + 5) = 0x56;
  *(undefined1 *)((int)puVar7 + 0x15) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x18);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x15;
  local_60 = 0x19;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)(puVar7 + 4);
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_58[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_58[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  uVar1 = *(undefined1 *)(puVar7 + 5);
  local_58[0x15] = 0;
  local_58[0x14] = uVar1;
  FUN_00023f74(puVar7);
  puVar17 = (undefined1 *)((uint)&local_6c | 1);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar19 = (undefined1 *)((uint)&local_60 | 1);
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x97b18) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar24 = *(undefined4 *)(iVar15 + 0x97b2c);
  puVar7 = (undefined4 *)FUN_000a0398(9);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x73;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  *(undefined1 *)((int)puVar7 + 3) = 0x46;
  puVar7[1] = 0;
  *(undefined1 *)(puVar7 + 1) = 0x6c;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x67;
  *(undefined1 *)((int)puVar7 + 7) = 0x73;
  *(undefined1 *)(puVar7 + 2) = 0;
  *(undefined1 *)(puVar7 + 2) = 0;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x10);
  local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_60);
  local_60 = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_60);
  local_5c = *(uint *)((int)puVar7 + 3);
  local_58._0_2_ = (ushort)*(byte *)((int)puVar7 + 7);
  FUN_00023f74();
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x1c);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x49;
  *(undefined1 *)((int)puVar7 + 2) = 0x29;
  *(undefined1 *)((int)puVar7 + 3) = 0x4c;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 0x6e;
  *(undefined1 *)((int)puVar7 + 6) = 100;
  *(undefined1 *)((int)puVar7 + 7) = 0x72;
  *(undefined1 *)(puVar7 + 2) = 0x6f;
  *(undefined1 *)((int)puVar7 + 9) = 0x69;
  *(undefined1 *)((int)puVar7 + 10) = 100;
  puVar7[3] = 0;
  puVar7[4] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 99;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x74;
  *(undefined1 *)(puVar7 + 4) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x2f;
  *(undefined1 *)(puVar7 + 5) = 0x49;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x16) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x17) = 0x65;
  *(undefined1 *)(puVar7 + 6) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x19) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x1a) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x1b) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x20);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0x1b;
  local_6c = 0x21;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  local_64[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_64[0x10] = *(undefined1 *)(puVar7 + 4);
  local_64[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_64[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0x14] = *(undefined1 *)(puVar7 + 5);
  local_64[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  local_64[0x16] = *(undefined1 *)((int)puVar7 + 0x16);
  local_64[0x17] = *(undefined1 *)((int)puVar7 + 0x17);
  local_64[0x18] = *(undefined1 *)(puVar7 + 6);
  local_64[0x19] = *(undefined1 *)((int)puVar7 + 0x19);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x1a);
  local_64[0x1b] = 0;
  iVar15 = DAT_00097978;
  local_64[0x1a] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar21 = local_64;
  if ((local_6c & 1) == 0) {
    puVar21 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x97f50) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar24 = *(undefined4 *)(iVar15 + 0x97f34);
  puVar7 = (undefined4 *)FUN_000a0398(9);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x67;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  *(undefined1 *)((int)puVar7 + 3) = 0x46;
  *(undefined1 *)(puVar7 + 1) = 0x6c;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0;
  *(undefined1 *)((int)puVar7 + 6) = 0x67;
  *(undefined1 *)((int)puVar7 + 7) = 0x73;
  *(undefined1 *)(puVar7 + 2) = 0;
  local_6c._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x10);
  local_6c._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_6c);
  local_6c = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_6c);
  local_68 = *(undefined4 *)((int)puVar7 + 3);
  local_64 = (undefined1 *)
             (CONCAT31((int3)((uint)local_64 >> 8),*(undefined1 *)((int)puVar7 + 7)) & 0xffff00ff);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(4);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x29;
  *(undefined1 *)((int)puVar7 + 2) = 0x49;
  *(undefined1 *)((int)puVar7 + 3) = 0;
  local_5c = local_5c & 0xffffff00;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar7,6);
  local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_60);
  local_60 = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_60);
  FUN_00023f74();
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x97f4c) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar11 = *(undefined4 *)(iVar15 + 0x97f34);
  puVar7 = (undefined4 *)FUN_000a0398(9);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x70;
  *(undefined1 *)((int)puVar7 + 1) = 0x75;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x45;
  *(undefined1 *)(puVar7 + 1) = 0x78;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)(puVar7 + 2) = 0;
  *(undefined1 *)((int)puVar7 + 6) = 0x72;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0;
  local_6c._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x10);
  local_6c._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_6c);
  local_6c = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_6c);
  local_68 = *(undefined4 *)((int)puVar7 + 3);
  local_64._0_2_ = (ushort)*(byte *)((int)puVar7 + 7);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x2e);
  uVar24 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar27 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *puVar7 = 0;
  puVar7[1] = uVar24;
  puVar7[2] = uVar27;
  puVar7[3] = uVar28;
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *puVar22 = 0;
  puVar7[5] = uVar24;
  puVar7[6] = uVar27;
  puVar7[7] = uVar28;
  *(undefined1 *)puVar22 = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x49;
  *(undefined1 *)(puVar7 + 5) = 0x29;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x4c;
  *(undefined1 *)((int)puVar7 + 0x16) = 0x61;
  *(undefined1 *)((int)puVar7 + 0x17) = 0x6e;
  *(undefined1 *)(puVar7 + 6) = 100;
  *(undefined1 *)((int)puVar7 + 0x19) = 0x72;
  iVar15 = DAT_0009797c;
  *(undefined1 *)((int)puVar7 + 0x1a) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0x1b) = 0x69;
  *(undefined1 *)(puVar7 + 7) = 100;
  *(undefined4 *)((int)puVar7 + 0x1e) = 0;
  *(undefined4 *)((int)puVar7 + 0x22) = uVar24;
  *(undefined4 *)((int)puVar7 + 0x26) = uVar27;
  *(undefined4 *)((int)puVar7 + 0x2a) = uVar28;
  *(undefined1 *)((int)puVar7 + 0x1d) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x1e) = 99;
  *(undefined1 *)((int)puVar7 + 0x1f) = 0x6f;
  *(undefined1 *)(puVar7 + 8) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x21) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x22) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x23) = 0x6e;
  *(undefined1 *)(puVar7 + 9) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x25) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x26) = 0x49;
  *(undefined1 *)((int)puVar7 + 0x27) = 0x6e;
  *(undefined1 *)(puVar7 + 10) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x29) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x2a) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x2b) = 0x74;
  *(undefined1 *)(puVar7 + 0xb) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x2d) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x30);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x2d;
  local_60 = 0x31;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)puVar22;
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_58[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_58[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_58[0x14] = *(undefined1 *)(puVar7 + 5);
  local_58[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  local_58[0x16] = *(undefined1 *)((int)puVar7 + 0x16);
  local_58[0x17] = *(undefined1 *)((int)puVar7 + 0x17);
  local_58[0x18] = *(undefined1 *)(puVar7 + 6);
  local_58[0x19] = *(undefined1 *)((int)puVar7 + 0x19);
  local_58[0x1a] = *(undefined1 *)((int)puVar7 + 0x1a);
  local_58[0x1b] = *(undefined1 *)((int)puVar7 + 0x1b);
  local_58[0x1c] = *(undefined1 *)(puVar7 + 7);
  local_58[0x1d] = *(undefined1 *)((int)puVar7 + 0x1d);
  local_58[0x1e] = *(undefined1 *)((int)puVar7 + 0x1e);
  local_58[0x1f] = *(undefined1 *)((int)puVar7 + 0x1f);
  local_58[0x20] = *(undefined1 *)(puVar7 + 8);
  local_58[0x21] = *(undefined1 *)((int)puVar7 + 0x21);
  local_58[0x22] = *(undefined1 *)((int)puVar7 + 0x22);
  local_58[0x23] = *(undefined1 *)((int)puVar7 + 0x23);
  local_58[0x24] = *(undefined1 *)(puVar7 + 9);
  local_58[0x25] = *(undefined1 *)((int)puVar7 + 0x25);
  local_58[0x26] = *(undefined1 *)((int)puVar7 + 0x26);
  local_58[0x27] = *(undefined1 *)((int)puVar7 + 0x27);
  local_58[0x28] = *(undefined1 *)(puVar7 + 10);
  local_58[0x29] = *(undefined1 *)((int)puVar7 + 0x29);
  local_58[0x2a] = *(undefined1 *)((int)puVar7 + 0x2a);
  local_58[0x2b] = *(undefined1 *)((int)puVar7 + 0x2b);
  uVar1 = *(undefined1 *)(puVar7 + 0xb);
  local_58[0x2d] = 0;
  local_58[0x2c] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar11,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x982d0) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))();
  uVar11 = *(undefined4 *)(iVar15 + 0x982f8);
  puVar7 = (undefined4 *)FUN_000a0398(9);
  uVar23 = 0;
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x70;
  *(undefined1 *)((int)puVar7 + 1) = 0x75;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x45;
  *(undefined1 *)(puVar7 + 1) = 0x78;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)(puVar7 + 2) = 0;
  *(undefined1 *)((int)puVar7 + 6) = 0x72;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x10);
  local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_60);
  local_60 = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_60);
  local_5c = *(undefined4 *)((int)puVar7 + 3);
  local_58 = (undefined1 *)
             (CONCAT31((int3)((uint)local_58 >> 8),*(undefined1 *)((int)puVar7 + 7)) & 0xffff00ff);
  FUN_00023f74();
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x45);
  uVar24 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar27 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined4 *)((int)puVar7 + 0x41) = 0;
  *puVar7 = 0;
  puVar7[1] = uVar24;
  puVar7[2] = uVar27;
  puVar7[3] = uVar28;
  puVar7[4] = 0;
  puVar7[5] = uVar24;
  puVar7[6] = uVar27;
  puVar7[7] = uVar28;
  puVar7[8] = 0;
  puVar7[9] = uVar24;
  puVar7[10] = uVar27;
  puVar7[0xb] = uVar28;
  puVar7[0xc] = 0;
  puVar7[0xd] = uVar24;
  puVar7[0xe] = uVar27;
  puVar7[0xf] = uVar28;
  *(undefined4 *)((int)puVar7 + 0x3d) = 0;
  iVar16 = DAT_00097980 + 0x985ec;
  do {
    *(byte *)((int)puVar7 + uVar23) =
         *(byte *)(iVar16 + (uVar23 & 7)) ^ *(byte *)(iVar16 + uVar23 + 8);
    uVar23 = uVar23 + 1;
  } while (uVar23 != 0x45);
  local_64 = (undefined1 *)FUN_000a0370(0x48);
  uVar1 = *(undefined1 *)((int)puVar7 + 1);
  uVar2 = *(undefined1 *)((int)puVar7 + 2);
  uVar3 = *(undefined1 *)((int)puVar7 + 3);
  uVar4 = *(undefined1 *)(puVar7 + 1);
  uVar5 = *(undefined1 *)((int)puVar7 + 5);
  *local_64 = *(undefined1 *)puVar7;
  uVar6 = *(undefined1 *)((int)puVar7 + 6);
  local_64[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 7);
  local_64[4] = uVar4;
  local_64[5] = uVar5;
  local_64[2] = uVar2;
  local_64[3] = uVar3;
  local_64[6] = uVar6;
  uVar2 = *(undefined1 *)(puVar7 + 2);
  uVar3 = *(undefined1 *)((int)puVar7 + 9);
  local_68 = 0x44;
  uVar4 = *(undefined1 *)((int)puVar7 + 10);
  uVar5 = *(undefined1 *)((int)puVar7 + 0xb);
  local_6c = 0x49;
  uVar6 = *(undefined1 *)(puVar7 + 3);
  local_64[7] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[8] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[9] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0xf);
  local_64[10] = uVar4;
  uVar4 = *(undefined1 *)(puVar7 + 4);
  local_64[0xb] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0xc] = uVar6;
  uVar6 = *(undefined1 *)((int)puVar7 + 0x12);
  local_64[0xd] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0xe] = uVar2;
  uVar2 = *(undefined1 *)(puVar7 + 5);
  local_64[0xf] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x15);
  local_64[0x10] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar7 + 0x16);
  local_64[0x11] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x17);
  local_64[0x12] = uVar6;
  uVar6 = *(undefined1 *)(puVar7 + 6);
  local_64[0x13] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x19);
  local_64[0x14] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0x1a);
  local_64[0x15] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x1b);
  local_64[0x16] = uVar4;
  uVar4 = *(undefined1 *)(puVar7 + 7);
  local_64[0x17] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x1d);
  local_64[0x18] = uVar6;
  uVar6 = *(undefined1 *)((int)puVar7 + 0x1e);
  local_64[0x19] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x1f);
  local_64[0x1a] = uVar2;
  uVar2 = *(undefined1 *)(puVar7 + 8);
  local_64[0x1b] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x21);
  local_64[0x1c] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar7 + 0x22);
  local_64[0x1d] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x23);
  local_64[0x1e] = uVar6;
  uVar6 = *(undefined1 *)(puVar7 + 9);
  local_64[0x1f] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x25);
  local_64[0x20] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0x26);
  local_64[0x21] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x27);
  local_64[0x22] = uVar4;
  uVar4 = *(undefined1 *)(puVar7 + 10);
  local_64[0x23] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x29);
  local_64[0x24] = uVar6;
  uVar6 = *(undefined1 *)((int)puVar7 + 0x2a);
  local_64[0x25] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x2b);
  local_64[0x26] = uVar2;
  uVar2 = *(undefined1 *)(puVar7 + 0xb);
  local_64[0x27] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x2d);
  local_64[0x28] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar7 + 0x2e);
  local_64[0x29] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x2f);
  local_64[0x2a] = uVar6;
  uVar6 = *(undefined1 *)(puVar7 + 0xc);
  local_64[0x2b] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x31);
  local_64[0x2c] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0x32);
  local_64[0x2d] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x33);
  local_64[0x2e] = uVar4;
  uVar4 = *(undefined1 *)(puVar7 + 0xd);
  local_64[0x2f] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x35);
  local_64[0x30] = uVar6;
  uVar6 = *(undefined1 *)((int)puVar7 + 0x36);
  local_64[0x31] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x37);
  local_64[0x32] = uVar2;
  uVar2 = *(undefined1 *)(puVar7 + 0xe);
  local_64[0x33] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x39);
  local_64[0x34] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar7 + 0x3a);
  local_64[0x35] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x3b);
  local_64[0x36] = uVar6;
  uVar6 = *(undefined1 *)(puVar7 + 0xf);
  local_64[0x37] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x3d);
  local_64[0x38] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0x3e);
  local_64[0x39] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0x3f);
  local_64[0x3a] = uVar4;
  uVar4 = *(undefined1 *)(puVar7 + 0x10);
  local_64[0x3b] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar7 + 0x41);
  local_64[0x3c] = uVar6;
  uVar6 = *(undefined1 *)((int)puVar7 + 0x42);
  local_64[0x3d] = uVar1;
  local_64[0x3e] = uVar2;
  local_64[0x3f] = uVar3;
  local_64[0x40] = uVar4;
  local_64[0x41] = uVar5;
  local_64[0x42] = uVar6;
  uVar1 = *(undefined1 *)((int)puVar7 + 0x43);
  local_64[0x44] = 0;
  local_64[0x43] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar21 = local_64;
  if ((local_6c & 1) == 0) {
    puVar21 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar11,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x982c8) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))();
  uVar11 = *(undefined4 *)(iVar15 + 0x982f8);
  puVar7 = (undefined4 *)FUN_000a0398(9);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x70;
  *(undefined1 *)((int)puVar7 + 1) = 0x75;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x45;
  *(undefined1 *)(puVar7 + 1) = 0x78;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)(puVar7 + 2) = 0;
  *(undefined1 *)((int)puVar7 + 6) = 0x72;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x10);
  local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_60);
  local_60 = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_60);
  local_5c = *(undefined4 *)((int)puVar7 + 3);
  local_58._0_2_ = (ushort)*(byte *)((int)puVar7 + 7);
  FUN_00023f74();
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x2f);
  uVar24 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar27 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *puVar7 = 0;
  puVar7[1] = uVar24;
  puVar7[2] = uVar27;
  puVar7[3] = uVar28;
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *puVar22 = 0;
  puVar7[5] = uVar24;
  puVar7[6] = uVar27;
  puVar7[7] = uVar28;
  *(undefined1 *)puVar22 = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x5b;
  *(undefined1 *)(puVar7 + 5) = 0x42;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x29;
  *(undefined1 *)((int)puVar7 + 0x16) = 0x4c;
  *(undefined1 *)((int)puVar7 + 0x17) = 0x61;
  *(undefined1 *)(puVar7 + 6) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x19) = 100;
  *(undefined1 *)((int)puVar7 + 0x1a) = 0x72;
  *(undefined1 *)((int)puVar7 + 0x1b) = 0x6f;
  *(undefined1 *)(puVar7 + 7) = 0x69;
  *(undefined1 *)((int)puVar7 + 0x1d) = 100;
  *(undefined4 *)((int)puVar7 + 0x1f) = 0;
  *(undefined4 *)((int)puVar7 + 0x23) = uVar24;
  *(undefined4 *)((int)puVar7 + 0x27) = uVar27;
  *(undefined4 *)((int)puVar7 + 0x2b) = uVar28;
  *(undefined1 *)((int)puVar7 + 0x1e) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x1f) = 99;
  *(undefined1 *)(puVar7 + 8) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0x21) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x22) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x23) = 0x65;
  *(undefined1 *)(puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x25) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x26) = 0x2f;
  iVar15 = DAT_00098cc8;
  *(undefined1 *)((int)puVar7 + 0x27) = 0x49;
  *(undefined1 *)(puVar7 + 10) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x29) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x2a) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x2b) = 0x6e;
  *(undefined1 *)(puVar7 + 0xb) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x2d) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x2e) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x30);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0x2e;
  local_6c = 0x31;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  local_64[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_64[0x10] = *(undefined1 *)puVar22;
  local_64[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_64[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0x14] = *(undefined1 *)(puVar7 + 5);
  local_64[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  local_64[0x16] = *(undefined1 *)((int)puVar7 + 0x16);
  local_64[0x17] = *(undefined1 *)((int)puVar7 + 0x17);
  local_64[0x18] = *(undefined1 *)(puVar7 + 6);
  local_64[0x19] = *(undefined1 *)((int)puVar7 + 0x19);
  local_64[0x1a] = *(undefined1 *)((int)puVar7 + 0x1a);
  local_64[0x1b] = *(undefined1 *)((int)puVar7 + 0x1b);
  local_64[0x1c] = *(undefined1 *)(puVar7 + 7);
  local_64[0x1d] = *(undefined1 *)((int)puVar7 + 0x1d);
  local_64[0x1e] = *(undefined1 *)((int)puVar7 + 0x1e);
  local_64[0x1f] = *(undefined1 *)((int)puVar7 + 0x1f);
  local_64[0x20] = *(undefined1 *)(puVar7 + 8);
  local_64[0x21] = *(undefined1 *)((int)puVar7 + 0x21);
  local_64[0x22] = *(undefined1 *)((int)puVar7 + 0x22);
  local_64[0x23] = *(undefined1 *)((int)puVar7 + 0x23);
  local_64[0x24] = *(undefined1 *)(puVar7 + 9);
  local_64[0x25] = *(undefined1 *)((int)puVar7 + 0x25);
  local_64[0x26] = *(undefined1 *)((int)puVar7 + 0x26);
  local_64[0x27] = *(undefined1 *)((int)puVar7 + 0x27);
  local_64[0x28] = *(undefined1 *)(puVar7 + 10);
  local_64[0x29] = *(undefined1 *)((int)puVar7 + 0x29);
  local_64[0x2a] = *(undefined1 *)((int)puVar7 + 0x2a);
  local_64[0x2b] = *(undefined1 *)((int)puVar7 + 0x2b);
  local_64[0x2c] = *(undefined1 *)(puVar7 + 0xb);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x2d);
  local_64[0x2e] = 0;
  local_64[0x2d] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar21 = local_64;
  if ((local_6c & 1) == 0) {
    puVar21 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar11,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x98b2c) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar24 = *(undefined4 *)(iVar15 + 0x98b20);
  puVar7 = (undefined4 *)FUN_000a0398(9);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x68;
  *(undefined1 *)((int)puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 2) = 0x73;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x45;
  *(undefined1 *)(puVar7 + 1) = 0x78;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)((int)puVar7 + 6) = 0x72;
  *(undefined1 *)(puVar7 + 2) = 0;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0;
  local_6c._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x10);
  local_6c._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_6c);
  local_6c = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_6c);
  local_68 = *(undefined4 *)((int)puVar7 + 3);
  local_64._0_2_ = (ushort)*(byte *)((int)puVar7 + 7);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x16);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined4 *)((int)puVar7 + 0xe) = 0;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *(undefined1 *)(puVar7 + 4) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined4 *)((int)puVar7 + 0x12) = 0;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x29;
  *(undefined1 *)(puVar7 + 5) = 0x5a;
  *(undefined1 *)((int)puVar7 + 0x15) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x18);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x15;
  local_60 = 0x19;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)(puVar7 + 4);
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_58[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_58[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  uVar1 = *(undefined1 *)(puVar7 + 5);
  local_58[0x15] = 0;
  local_58[0x14] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(DAT_00098ccc + 0x99014) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar24 = *(undefined4 *)(DAT_00098cd0 + 0x99054);
  puVar7 = (undefined4 *)FUN_000a0398(0xc);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x67;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x49;
  *(undefined1 *)(puVar7 + 1) = 0x6e;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)((int)puVar7 + 6) = 0x45;
  *(undefined1 *)((int)puVar7 + 7) = 0x78;
  puVar7[2] = 0;
  *(undefined1 *)(puVar7 + 2) = 0x74;
  *(undefined1 *)((int)puVar7 + 9) = 0x72;
  *(undefined1 *)((int)puVar7 + 10) = 0x61;
  *(undefined1 *)((int)puVar7 + 0xb) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x10);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0xb;
  local_60 = 0x11;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  uVar1 = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = 0;
  local_58[10] = uVar1;
  FUN_00023f74(puVar7);
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x17);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined4 *)((int)puVar7 + 0xf) = 0;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *(undefined1 *)(puVar7 + 4) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined4 *)((int)puVar7 + 0x13) = 0;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x49;
  *(undefined1 *)(puVar7 + 5) = 0x29;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x49;
  *(undefined1 *)((int)puVar7 + 0x16) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x18);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0x16;
  local_6c = 0x19;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  local_64[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_64[0x10] = *(undefined1 *)(puVar7 + 4);
  local_64[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_64[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0x14] = *(undefined1 *)(puVar7 + 5);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x15);
  local_64[0x16] = 0;
  local_64[0x15] = uVar1;
  FUN_00023f74(puVar7);
  iVar15 = DAT_00098cd4;
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar21 = local_64;
  if ((local_6c & 1) == 0) {
    puVar21 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x992fc) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))();
  uVar24 = *(undefined4 *)(iVar15 + 0x99320);
  puVar7 = (undefined4 *)FUN_000a0398(0xf);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x67;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  *(undefined1 *)((int)puVar7 + 3) = 0x53;
  *(undefined1 *)(puVar7 + 1) = 0x74;
  *(undefined1 *)((int)puVar7 + 5) = 0x72;
  *(undefined4 *)((int)puVar7 + 7) = 0;
  *(undefined1 *)((int)puVar7 + 6) = 0x69;
  *(undefined1 *)((int)puVar7 + 7) = 0x6e;
  *(undefined1 *)(puVar7 + 2) = 0x67;
  *(undefined1 *)((int)puVar7 + 9) = 0x45;
  *(undefined1 *)((int)puVar7 + 10) = 0x78;
  *(undefined4 *)((int)puVar7 + 0xb) = 0;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x74;
  *(undefined1 *)(puVar7 + 3) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x61;
  *(undefined1 *)((int)puVar7 + 0xe) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x10);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0xe;
  local_6c = 0x11;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  uVar1 = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = 0;
  local_64[0xd] = uVar1;
  FUN_00023f74(puVar7);
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x27);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *puVar22 = 0;
  puVar7[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[7] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar22 = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x29;
  *(undefined1 *)(puVar7 + 5) = 0x4c;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x6a;
  *(undefined1 *)((int)puVar7 + 0x16) = 0x61;
  *(undefined1 *)((int)puVar7 + 0x17) = 0x76;
  *(undefined1 *)(puVar7 + 6) = 0x61;
  *(undefined1 *)((int)puVar7 + 0x19) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x1a) = 0x6c;
  *(undefined1 *)((int)puVar7 + 0x1b) = 0x61;
  *(undefined1 *)(puVar7 + 7) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x1d) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x1e) = 0x2f;
  *(undefined4 *)((int)puVar7 + 0x1f) = 0;
  *(undefined1 *)((int)puVar7 + 0x1f) = 0x53;
  *(undefined1 *)(puVar7 + 8) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x21) = 0x72;
  *(undefined1 *)((int)puVar7 + 0x22) = 0x69;
  *(undefined4 *)((int)puVar7 + 0x23) = 0;
  *(undefined1 *)((int)puVar7 + 0x23) = 0x6e;
  *(undefined1 *)(puVar7 + 9) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x25) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x26) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x28);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x26;
  local_60 = 0x29;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)puVar22;
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_58[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_58[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_58[0x14] = *(undefined1 *)(puVar7 + 5);
  local_58[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  local_58[0x16] = *(undefined1 *)((int)puVar7 + 0x16);
  local_58[0x17] = *(undefined1 *)((int)puVar7 + 0x17);
  local_58[0x18] = *(undefined1 *)(puVar7 + 6);
  local_58[0x19] = *(undefined1 *)((int)puVar7 + 0x19);
  local_58[0x1a] = *(undefined1 *)((int)puVar7 + 0x1a);
  local_58[0x1b] = *(undefined1 *)((int)puVar7 + 0x1b);
  local_58[0x1c] = *(undefined1 *)(puVar7 + 7);
  local_58[0x1d] = *(undefined1 *)((int)puVar7 + 0x1d);
  local_58[0x1e] = *(undefined1 *)((int)puVar7 + 0x1e);
  local_58[0x1f] = *(undefined1 *)((int)puVar7 + 0x1f);
  iVar15 = DAT_00098cd8;
  local_58[0x20] = *(undefined1 *)(puVar7 + 8);
  local_58[0x21] = *(undefined1 *)((int)puVar7 + 0x21);
  local_58[0x22] = *(undefined1 *)((int)puVar7 + 0x22);
  local_58[0x23] = *(undefined1 *)((int)puVar7 + 0x23);
  local_58[0x24] = *(undefined1 *)(puVar7 + 9);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x25);
  local_58[0x26] = 0;
  local_58[0x25] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x996d0) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar12 = *(undefined4 *)(iVar15 + 0x996fc);
  puVar7 = (undefined4 *)FUN_000a0398(0x12);
  uVar24 = 0;
  uVar27 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar11 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *puVar7 = 0;
  puVar7[1] = uVar27;
  puVar7[2] = uVar28;
  puVar7[3] = uVar11;
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x67;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  *(undefined1 *)((int)puVar7 + 3) = 0x42;
  *(undefined1 *)(puVar7 + 1) = 0x79;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)((int)puVar7 + 6) = 0x65;
  *(undefined1 *)((int)puVar7 + 7) = 0x41;
  *(undefined1 *)(puVar7 + 2) = 0x72;
  *(undefined1 *)((int)puVar7 + 9) = 0x72;
  *(undefined1 *)((int)puVar7 + 10) = 0x61;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x79;
  *(undefined1 *)(puVar7 + 3) = 0x45;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x78;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x74;
  *(undefined2 *)puVar22 = 0;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x72;
  *(undefined1 *)puVar22 = 0x61;
  *(undefined1 *)((int)puVar7 + 0x11) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x18);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x11;
  local_60 = 0x19;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  uVar1 = *(undefined1 *)puVar22;
  local_58[0x11] = 0;
  local_58[0x10] = uVar1;
  FUN_00023f74(puVar7);
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x17);
  *puVar7 = uVar24;
  puVar7[1] = uVar27;
  puVar7[2] = uVar28;
  puVar7[3] = uVar11;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined4 *)((int)puVar7 + 0xf) = 0;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *(undefined1 *)(puVar7 + 4) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined4 *)((int)puVar7 + 0x13) = 0;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x29;
  *(undefined1 *)(puVar7 + 5) = 0x5b;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x42;
  *(undefined1 *)((int)puVar7 + 0x16) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x18);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0x16;
  local_6c = 0x19;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  local_64[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  iVar15 = DAT_00098cdc;
  local_64[0x10] = *(undefined1 *)(puVar7 + 4);
  local_64[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_64[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0x14] = *(undefined1 *)(puVar7 + 5);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x15);
  local_64[0x16] = 0;
  local_64[0x15] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar21 = local_64;
  if ((local_6c & 1) == 0) {
    puVar21 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar12,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x99a84) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar24 = *(undefined4 *)(iVar15 + 0x99a70);
  puVar7 = (undefined4 *)FUN_000a0398(10);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x67;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x41;
  *(undefined1 *)(puVar7 + 1) = 99;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)((int)puVar7 + 6) = 0x69;
  *(undefined1 *)((int)puVar7 + 7) = 0x6f;
  *(undefined2 *)(puVar7 + 2) = 0;
  *(undefined1 *)(puVar7 + 2) = 0x6e;
  *(undefined1 *)((int)puVar7 + 9) = 0;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x12);
  local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_60);
  local_60 = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_60);
  local_5c = *(undefined4 *)((int)puVar7 + 3);
  local_58._0_3_ = (uint3)*(ushort *)((int)puVar7 + 7);
  FUN_00023f74();
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x15);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x29;
  *(undefined1 *)((int)puVar7 + 2) = 0x4c;
  *(undefined1 *)((int)puVar7 + 3) = 0x6a;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 0x76;
  *(undefined1 *)((int)puVar7 + 6) = 0x61;
  *(undefined1 *)((int)puVar7 + 7) = 0x2f;
  *(undefined1 *)(puVar7 + 2) = 0x6c;
  *(undefined1 *)((int)puVar7 + 9) = 0x61;
  *(undefined1 *)((int)puVar7 + 10) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x67;
  *(undefined1 *)(puVar7 + 3) = 0x2f;
  *(undefined4 *)((int)puVar7 + 0xd) = 0;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x74;
  iVar15 = DAT_00098ce0;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x72;
  *(undefined1 *)(puVar7 + 4) = 0x69;
  *(undefined4 *)((int)puVar7 + 0x11) = 0;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x3b;
  *(undefined1 *)(puVar7 + 5) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x18);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0x14;
  local_6c = 0x19;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  local_64[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_64[0x10] = *(undefined1 *)(puVar7 + 4);
  local_64[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0x14] = 0;
  local_64[0x13] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar21 = local_64;
  if ((local_6c & 1) == 0) {
    puVar21 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x99c74) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))();
  uVar11 = *(undefined4 *)(iVar15 + 0x99c94);
  puVar7 = (undefined4 *)FUN_000a0398(0xb);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x73;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  *(undefined1 *)((int)puVar7 + 3) = 0x50;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 99;
  *(undefined1 *)((int)puVar7 + 6) = 0x6b;
  *(undefined4 *)((int)puVar7 + 7) = 0;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0x67;
  *(undefined1 *)((int)puVar7 + 9) = 0x65;
  *(undefined1 *)((int)puVar7 + 10) = 0;
  local_6c._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x14);
  local_6c._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_6c);
  local_6c = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_6c);
  local_68 = *(undefined4 *)((int)puVar7 + 3);
  local_64 = (undefined1 *)(uint)*(uint3 *)((int)puVar7 + 7);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x2d);
  uVar24 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar27 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *puVar7 = 0;
  puVar7[1] = uVar24;
  puVar7[2] = uVar27;
  puVar7[3] = uVar28;
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *puVar22 = 0;
  puVar7[5] = uVar24;
  puVar7[6] = uVar27;
  puVar7[7] = uVar28;
  *(undefined1 *)puVar22 = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x29;
  *(undefined1 *)(puVar7 + 5) = 0x4c;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x61;
  *(undefined1 *)((int)puVar7 + 0x16) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x17) = 100;
  *(undefined1 *)(puVar7 + 6) = 0x72;
  *(undefined1 *)((int)puVar7 + 0x19) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0x1a) = 0x69;
  *(undefined1 *)((int)puVar7 + 0x1b) = 100;
  *(undefined4 *)((int)puVar7 + 0x1d) = 0;
  *(undefined4 *)((int)puVar7 + 0x21) = uVar24;
  *(undefined4 *)((int)puVar7 + 0x25) = uVar27;
  *(undefined4 *)((int)puVar7 + 0x29) = uVar28;
  *(undefined1 *)(puVar7 + 7) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x1d) = 99;
  *(undefined1 *)((int)puVar7 + 0x1e) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0x1f) = 0x6e;
  *(undefined1 *)(puVar7 + 8) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x21) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x22) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x23) = 0x74;
  *(undefined1 *)(puVar7 + 9) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x25) = 0x49;
  *(undefined1 *)((int)puVar7 + 0x26) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x27) = 0x74;
  *(undefined1 *)(puVar7 + 10) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x29) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x2a) = 0x74;
  iVar15 = DAT_0009a188;
  *(undefined1 *)((int)puVar7 + 0x2b) = 0x3b;
  *(undefined1 *)(puVar7 + 0xb) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x30);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x2c;
  local_60 = 0x31;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)puVar22;
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_58[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_58[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_58[0x14] = *(undefined1 *)(puVar7 + 5);
  local_58[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  local_58[0x16] = *(undefined1 *)((int)puVar7 + 0x16);
  local_58[0x17] = *(undefined1 *)((int)puVar7 + 0x17);
  local_58[0x18] = *(undefined1 *)(puVar7 + 6);
  local_58[0x19] = *(undefined1 *)((int)puVar7 + 0x19);
  local_58[0x1a] = *(undefined1 *)((int)puVar7 + 0x1a);
  local_58[0x1b] = *(undefined1 *)((int)puVar7 + 0x1b);
  local_58[0x1c] = *(undefined1 *)(puVar7 + 7);
  local_58[0x1d] = *(undefined1 *)((int)puVar7 + 0x1d);
  local_58[0x1e] = *(undefined1 *)((int)puVar7 + 0x1e);
  local_58[0x1f] = *(undefined1 *)((int)puVar7 + 0x1f);
  local_58[0x20] = *(undefined1 *)(puVar7 + 8);
  local_58[0x21] = *(undefined1 *)((int)puVar7 + 0x21);
  local_58[0x22] = *(undefined1 *)((int)puVar7 + 0x22);
  local_58[0x23] = *(undefined1 *)((int)puVar7 + 0x23);
  local_58[0x24] = *(undefined1 *)(puVar7 + 9);
  local_58[0x25] = *(undefined1 *)((int)puVar7 + 0x25);
  local_58[0x26] = *(undefined1 *)((int)puVar7 + 0x26);
  local_58[0x27] = *(undefined1 *)((int)puVar7 + 0x27);
  local_58[0x28] = *(undefined1 *)(puVar7 + 10);
  local_58[0x29] = *(undefined1 *)((int)puVar7 + 0x29);
  local_58[0x2a] = *(undefined1 *)((int)puVar7 + 0x2a);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x2b);
  local_58[0x2c] = 0;
  local_58[0x2b] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar11,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x9a000) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar24 = *(undefined4 *)(iVar15 + 0x9a008);
  puVar13 = (ushort *)FUN_000a0398(0xb);
  puVar13[0] = 0;
  puVar13[1] = 0;
  *(undefined1 *)puVar13 = 0x67;
  *(undefined1 *)((int)puVar13 + 1) = 0x65;
  *(undefined1 *)(puVar13 + 1) = 0x74;
  *(undefined1 *)((int)puVar13 + 3) = 0x50;
  puVar13[2] = 0;
  puVar13[3] = 0;
  *(undefined1 *)(puVar13 + 2) = 0x61;
  *(undefined1 *)((int)puVar13 + 5) = 99;
  *(undefined1 *)(puVar13 + 3) = 0x6b;
  *(undefined4 *)((int)puVar13 + 7) = 0;
  *(undefined1 *)((int)puVar13 + 7) = 0x61;
  *(undefined1 *)(puVar13 + 4) = 0x67;
  *(undefined1 *)((int)puVar13 + 9) = 0x65;
  *(undefined1 *)(puVar13 + 5) = 0;
  local_6c = CONCAT31((uint3)*puVar13,0x14);
  local_6c = CONCAT13((char)puVar13[1],(undefined3)local_6c);
  local_68 = *(undefined4 *)((int)puVar13 + 3);
  local_64 = (undefined1 *)(uint)*(uint3 *)((int)puVar13 + 7);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x15);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x29;
  *(undefined1 *)((int)puVar7 + 2) = 0x4c;
  *(undefined1 *)((int)puVar7 + 3) = 0x6a;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 0x76;
  *(undefined1 *)((int)puVar7 + 6) = 0x61;
  *(undefined1 *)((int)puVar7 + 7) = 0x2f;
  *(undefined1 *)(puVar7 + 2) = 0x6c;
  *(undefined1 *)((int)puVar7 + 9) = 0x61;
  *(undefined1 *)((int)puVar7 + 10) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x67;
  *(undefined1 *)(puVar7 + 3) = 0x2f;
  *(undefined4 *)((int)puVar7 + 0xd) = 0;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x72;
  *(undefined1 *)(puVar7 + 4) = 0x69;
  *(undefined4 *)((int)puVar7 + 0x11) = 0;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x67;
  iVar15 = DAT_0009a18c;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x3b;
  *(undefined1 *)(puVar7 + 5) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x18);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x14;
  local_60 = 0x19;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)(puVar7 + 4);
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_58[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x13);
  local_58[0x14] = 0;
  local_58[0x13] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x9a398) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))();
  uVar11 = *(undefined4 *)(iVar15 + 0x9a3b0);
  puVar7 = (undefined4 *)FUN_000a0398(8);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x73;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x44;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)((int)puVar7 + 6) = 0x61;
  *(undefined1 *)((int)puVar7 + 7) = 0;
  local_6c._0_2_ = CONCAT11(*(undefined1 *)puVar7,0xe);
  local_6c._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_6c);
  local_6c = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_6c);
  local_68 = *(undefined4 *)((int)puVar7 + 3);
  local_64 = (undefined1 *)((uint)local_64 & 0xffffff00);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x2c);
  uVar24 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar27 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *puVar7 = 0;
  puVar7[1] = uVar24;
  puVar7[2] = uVar27;
  puVar7[3] = uVar28;
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 3) = 0x6e;
  *(undefined1 *)(puVar7 + 1) = 100;
  *(undefined1 *)((int)puVar7 + 5) = 0x72;
  *(undefined1 *)((int)puVar7 + 6) = 0x6f;
  *(undefined1 *)((int)puVar7 + 7) = 0x69;
  *(undefined1 *)(puVar7 + 2) = 100;
  *(undefined1 *)((int)puVar7 + 9) = 0x2f;
  *(undefined1 *)((int)puVar7 + 10) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x65;
  *(undefined1 *)(puVar7 + 3) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x55;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x72;
  *puVar22 = 0;
  puVar7[5] = uVar24;
  puVar7[6] = uVar27;
  puVar7[7] = uVar28;
  *(undefined1 *)puVar22 = 0x69;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x29;
  iVar15 = DAT_0009a190;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x4c;
  *(undefined1 *)(puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x16) = 100;
  *(undefined1 *)((int)puVar7 + 0x17) = 0x72;
  *(undefined1 *)(puVar7 + 6) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0x19) = 0x69;
  *(undefined1 *)((int)puVar7 + 0x1a) = 100;
  puVar7[7] = 0;
  puVar7[8] = uVar24;
  puVar7[9] = uVar27;
  puVar7[10] = uVar28;
  *(undefined1 *)((int)puVar7 + 0x1b) = 0x2f;
  *(undefined1 *)(puVar7 + 7) = 99;
  *(undefined1 *)((int)puVar7 + 0x1d) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0x1e) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x1f) = 0x74;
  *(undefined1 *)(puVar7 + 8) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x21) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x22) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x23) = 0x2f;
  *(undefined1 *)(puVar7 + 9) = 0x49;
  *(undefined1 *)((int)puVar7 + 0x25) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x26) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x27) = 0x65;
  *(undefined1 *)(puVar7 + 10) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x29) = 0x74;
  *(undefined1 *)((int)puVar7 + 0x2a) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x2b) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x30);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x2b;
  local_60 = 0x31;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)puVar22;
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_58[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_58[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_58[0x14] = *(undefined1 *)(puVar7 + 5);
  local_58[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  local_58[0x16] = *(undefined1 *)((int)puVar7 + 0x16);
  local_58[0x17] = *(undefined1 *)((int)puVar7 + 0x17);
  local_58[0x18] = *(undefined1 *)(puVar7 + 6);
  local_58[0x19] = *(undefined1 *)((int)puVar7 + 0x19);
  local_58[0x1a] = *(undefined1 *)((int)puVar7 + 0x1a);
  local_58[0x1b] = *(undefined1 *)((int)puVar7 + 0x1b);
  local_58[0x1c] = *(undefined1 *)(puVar7 + 7);
  local_58[0x1d] = *(undefined1 *)((int)puVar7 + 0x1d);
  local_58[0x1e] = *(undefined1 *)((int)puVar7 + 0x1e);
  local_58[0x1f] = *(undefined1 *)((int)puVar7 + 0x1f);
  local_58[0x20] = *(undefined1 *)(puVar7 + 8);
  local_58[0x21] = *(undefined1 *)((int)puVar7 + 0x21);
  local_58[0x22] = *(undefined1 *)((int)puVar7 + 0x22);
  local_58[0x23] = *(undefined1 *)((int)puVar7 + 0x23);
  local_58[0x24] = *(undefined1 *)(puVar7 + 9);
  local_58[0x25] = *(undefined1 *)((int)puVar7 + 0x25);
  local_58[0x26] = *(undefined1 *)((int)puVar7 + 0x26);
  local_58[0x27] = *(undefined1 *)((int)puVar7 + 0x27);
  local_58[0x28] = *(undefined1 *)(puVar7 + 10);
  local_58[0x29] = *(undefined1 *)((int)puVar7 + 0x29);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x2a);
  local_58[0x2b] = 0;
  local_58[0x2a] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar11,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x9a654) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  uVar24 = *(undefined4 *)(iVar15 + 0x9a658);
  puVar7 = (undefined4 *)FUN_000a0398(8);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x67;
  *(undefined1 *)((int)puVar7 + 1) = 0x65;
  *(undefined1 *)((int)puVar7 + 2) = 0x74;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x44;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 0x74;
  *(undefined1 *)((int)puVar7 + 6) = 0x61;
  *(undefined1 *)((int)puVar7 + 7) = 0;
  local_6c._0_2_ = CONCAT11(*(undefined1 *)puVar7,0xe);
  local_6c._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_6c);
  local_6c = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_6c);
  local_68 = *(undefined4 *)((int)puVar7 + 3);
  local_64 = (undefined1 *)((uint)local_64 & 0xffffff00);
  FUN_00023f74();
  puVar8 = local_64;
  uVar9 = local_6c;
  puVar7 = (undefined4 *)FUN_000a0398(0x14);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x29;
  *(undefined1 *)((int)puVar7 + 2) = 0x4c;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x6e;
  *(undefined1 *)((int)puVar7 + 5) = 100;
  *(undefined1 *)((int)puVar7 + 6) = 0x72;
  *(undefined1 *)((int)puVar7 + 7) = 0x6f;
  *(undefined1 *)(puVar7 + 2) = 0x69;
  *(undefined1 *)((int)puVar7 + 9) = 100;
  *(undefined1 *)((int)puVar7 + 10) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x6e;
  *(undefined1 *)(puVar7 + 3) = 0x65;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  iVar15 = DAT_0009b978;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x55;
  *puVar22 = 0;
  *(undefined1 *)puVar22 = 0x72;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x69;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0;
  local_58 = (undefined1 *)FUN_000a0370(0x18);
  *local_58 = *(undefined1 *)puVar7;
  local_58[1] = *(undefined1 *)((int)puVar7 + 1);
  local_58[2] = *(undefined1 *)((int)puVar7 + 2);
  local_58[3] = *(undefined1 *)((int)puVar7 + 3);
  local_58[4] = *(undefined1 *)(puVar7 + 1);
  local_58[5] = *(undefined1 *)((int)puVar7 + 5);
  local_58[6] = *(undefined1 *)((int)puVar7 + 6);
  local_5c = 0x13;
  local_60 = 0x19;
  local_58[7] = *(undefined1 *)((int)puVar7 + 7);
  local_58[8] = *(undefined1 *)(puVar7 + 2);
  local_58[9] = *(undefined1 *)((int)puVar7 + 9);
  local_58[10] = *(undefined1 *)((int)puVar7 + 10);
  local_58[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_58[0xc] = *(undefined1 *)(puVar7 + 3);
  local_58[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_58[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_58[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_58[0x10] = *(undefined1 *)puVar22;
  local_58[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x12);
  local_58[0x13] = 0;
  local_58[0x12] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar17;
  }
  puVar21 = local_58;
  if ((local_60 & 1) == 0) {
    puVar21 = puVar19;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar21);
  *(undefined4 *)(iVar15 + 0x9a9e4) = uVar24;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  puVar7 = (undefined4 *)FUN_000a0398(0x10);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x61;
  *(undefined1 *)((int)puVar7 + 1) = 0x6e;
  *(undefined1 *)((int)puVar7 + 2) = 100;
  *(undefined1 *)((int)puVar7 + 3) = 0x72;
  *(undefined1 *)(puVar7 + 1) = 0x6f;
  *(undefined1 *)((int)puVar7 + 5) = 0x69;
  *(undefined1 *)((int)puVar7 + 6) = 100;
  *(undefined1 *)((int)puVar7 + 7) = 0x2f;
  *(undefined1 *)(puVar7 + 2) = 0x6e;
  *(undefined1 *)((int)puVar7 + 9) = 0x65;
  *(undefined1 *)((int)puVar7 + 10) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x55;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x69;
  *(undefined1 *)((int)puVar7 + 0xf) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar7 + 1);
  uVar2 = *(undefined1 *)((int)puVar7 + 2);
  uVar3 = *(undefined1 *)((int)puVar7 + 3);
  *local_64 = *(undefined1 *)puVar7;
  uVar4 = *(undefined1 *)(puVar7 + 1);
  local_64[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar7 + 5);
  local_64[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 6);
  local_64[3] = uVar3;
  local_64[5] = uVar1;
  local_64[4] = uVar4;
  local_64[6] = uVar2;
  local_68 = 0xf;
  uVar1 = *(undefined1 *)(puVar7 + 2);
  uVar2 = *(undefined1 *)((int)puVar7 + 9);
  local_6c = 0x11;
  uVar3 = *(undefined1 *)((int)puVar7 + 10);
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  uVar4 = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[8] = uVar1;
  uVar1 = *(undefined1 *)(puVar7 + 3);
  local_64[9] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[10] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xb] = uVar4;
  local_64[0xc] = uVar1;
  local_64[0xd] = uVar2;
  local_64[0xf] = 0;
  local_64[0xe] = uVar3;
  FUN_00023f74(puVar7);
  puVar8 = local_64;
  if ((local_6c & 1) == 0) {
    puVar8 = puVar17;
  }
  iVar16 = (**(code **)(*param_1 + 0x18))(param_1,puVar8);
  pcVar10 = (char *)FUN_00025e6c(DAT_0009ba2c + 0x9ac4c);
  if (*pcVar10 == '\x01') {
    puVar7 = (undefined4 *)FUN_00025e6c(DAT_0009ba30 + 0x9ac64);
    uVar24 = *puVar7;
  }
  else {
    puVar7 = (undefined4 *)FUN_00025e6c(DAT_0009ba34 + 0x9b9dc);
    uVar24 = FUN_00076fc0();
    iVar18 = DAT_0009ba38;
    *puVar7 = uVar24;
    puVar8 = (undefined1 *)FUN_00025e6c(iVar18 + 0x9b9f8);
    *puVar8 = 1;
  }
  local_60 = iVar16;
  local_58 = puVar25;
  local_54 = uVar24;
  local_48 = &local_58;
  uVar24 = (**(code **)(*param_1 + 0x54))(param_1,iVar16);
  iVar16 = local_60;
  *(undefined4 *)(iVar15 + 0x9a9fc) = uVar24;
  bVar26 = local_60 != 0;
  local_60 = 0;
  if (bVar26) {
    local_70 = iVar16;
    if (local_48 == (undefined1 **)0x0) {
LAB_0009ba20:
      local_60 = 0;
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_48 + 0x18))(local_48,&local_70);
  }
  if (local_48 == &local_58) {
    iVar16 = 0x10;
LAB_0009b980:
    (**(code **)(*local_48 + iVar16))();
  }
  else {
    iVar16 = 0x14;
    if (local_48 != (undefined1 **)0x0) goto LAB_0009b980;
  }
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  uVar24 = *(undefined4 *)(iVar15 + 0x9a9fc);
  puVar7 = (undefined4 *)FUN_000a0398(6);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x70;
  *(undefined1 *)((int)puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 2) = 0x72;
  *(undefined2 *)(puVar7 + 1) = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x73;
  *(undefined1 *)(puVar7 + 1) = 0x65;
  *(undefined1 *)((int)puVar7 + 5) = 0;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar7,10);
  local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_60);
  local_60 = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_60);
  local_5c = CONCAT22((short)(local_5c >> 0x10),*(undefined2 *)((int)puVar7 + 3)) & 0xff00ffff;
  FUN_00023f74();
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x26);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar22 = puVar7 + 4;
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x6a;
  *(undefined1 *)((int)puVar7 + 3) = 0x61;
  *(undefined1 *)(puVar7 + 1) = 0x76;
  *(undefined1 *)((int)puVar7 + 5) = 0x61;
  *(undefined1 *)((int)puVar7 + 6) = 0x2f;
  *(undefined1 *)((int)puVar7 + 7) = 0x6c;
  *(undefined1 *)(puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 9) = 0x6e;
  *(undefined1 *)((int)puVar7 + 10) = 0x67;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x2f;
  *(undefined1 *)(puVar7 + 3) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x69;
  *puVar22 = 0;
  puVar7[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[7] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar22 = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x29;
  *(undefined1 *)(puVar7 + 5) = 0x4c;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x61;
  *(undefined1 *)((int)puVar7 + 0x16) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x17) = 100;
  *(undefined1 *)(puVar7 + 6) = 0x72;
  *(undefined1 *)((int)puVar7 + 0x19) = 0x6f;
  *(undefined1 *)((int)puVar7 + 0x1a) = 0x69;
  *(undefined1 *)((int)puVar7 + 0x1b) = 100;
  *(undefined1 *)(puVar7 + 7) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x1d) = 0x6e;
  *(undefined4 *)((int)puVar7 + 0x1e) = 0;
  *(undefined1 *)((int)puVar7 + 0x1e) = 0x65;
  *(undefined1 *)((int)puVar7 + 0x1f) = 0x74;
  *(undefined1 *)(puVar7 + 8) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0x21) = 0x55;
  *(undefined4 *)((int)puVar7 + 0x22) = 0;
  *(undefined1 *)((int)puVar7 + 0x22) = 0x72;
  *(undefined1 *)((int)puVar7 + 0x23) = 0x69;
  *(undefined1 *)(puVar7 + 9) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x25) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x28);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0x25;
  local_6c = 0x29;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  local_64[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_64[0x10] = *(undefined1 *)puVar22;
  local_64[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  local_64[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0x14] = *(undefined1 *)(puVar7 + 5);
  local_64[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  local_64[0x16] = *(undefined1 *)((int)puVar7 + 0x16);
  local_64[0x17] = *(undefined1 *)((int)puVar7 + 0x17);
  local_64[0x18] = *(undefined1 *)(puVar7 + 6);
  local_64[0x19] = *(undefined1 *)((int)puVar7 + 0x19);
  local_64[0x1a] = *(undefined1 *)((int)puVar7 + 0x1a);
  local_64[0x1b] = *(undefined1 *)((int)puVar7 + 0x1b);
  local_64[0x1c] = *(undefined1 *)(puVar7 + 7);
  local_64[0x1d] = *(undefined1 *)((int)puVar7 + 0x1d);
  local_64[0x1e] = *(undefined1 *)((int)puVar7 + 0x1e);
  local_64[0x1f] = *(undefined1 *)((int)puVar7 + 0x1f);
  local_64[0x20] = *(undefined1 *)(puVar7 + 8);
  local_64[0x21] = *(undefined1 *)((int)puVar7 + 0x21);
  local_64[0x22] = *(undefined1 *)((int)puVar7 + 0x22);
  local_64[0x23] = *(undefined1 *)((int)puVar7 + 0x23);
  uVar1 = *(undefined1 *)(puVar7 + 9);
  local_64[0x25] = 0;
  local_64[0x24] = uVar1;
  FUN_00023f74(puVar7);
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar25 = local_64;
  if ((local_6c & 1) == 0) {
    puVar25 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x1c4))(param_1,uVar24,puVar8,puVar25);
  *(undefined4 *)(DAT_0009ba3c + 0x9b090) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar24 = *(undefined4 *)(DAT_0009ba40 + 0x9b0e4);
  puVar7 = (undefined4 *)FUN_000a0398(9);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x74;
  *(undefined1 *)((int)puVar7 + 1) = 0x6f;
  *(undefined1 *)((int)puVar7 + 2) = 0x53;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 3) = 0x74;
  *(undefined1 *)(puVar7 + 1) = 0x72;
  *(undefined1 *)((int)puVar7 + 5) = 0x69;
  *(undefined1 *)(puVar7 + 2) = 0;
  *(undefined1 *)((int)puVar7 + 6) = 0x6e;
  *(undefined1 *)((int)puVar7 + 7) = 0x67;
  *(undefined1 *)(puVar7 + 2) = 0;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar7,0x10);
  local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar7 + 1),(undefined2)local_60);
  local_60 = CONCAT13(*(undefined1 *)((int)puVar7 + 2),(undefined3)local_60);
  local_5c = *(undefined4 *)((int)puVar7 + 3);
  local_58._0_2_ = (ushort)*(byte *)((int)puVar7 + 7);
  FUN_00023f74();
  puVar8 = local_58;
  uVar9 = local_60;
  puVar7 = (undefined4 *)FUN_000a0398(0x15);
  *puVar7 = 0;
  puVar7[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar7[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar7[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar7 = 0x28;
  *(undefined1 *)((int)puVar7 + 1) = 0x29;
  *(undefined1 *)((int)puVar7 + 2) = 0x4c;
  *(undefined1 *)((int)puVar7 + 3) = 0x6a;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 0x76;
  *(undefined1 *)((int)puVar7 + 6) = 0x61;
  *(undefined1 *)((int)puVar7 + 7) = 0x2f;
  *(undefined1 *)(puVar7 + 2) = 0x6c;
  *(undefined1 *)((int)puVar7 + 9) = 0x61;
  *(undefined1 *)((int)puVar7 + 10) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x67;
  *(undefined1 *)(puVar7 + 3) = 0x2f;
  *(undefined4 *)((int)puVar7 + 0xd) = 0;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x53;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x72;
  *(undefined1 *)(puVar7 + 4) = 0x69;
  *(undefined4 *)((int)puVar7 + 0x11) = 0;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x6e;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x3b;
  *(undefined1 *)(puVar7 + 5) = 0;
  local_64 = (undefined1 *)FUN_000a0370(0x18);
  *local_64 = *(undefined1 *)puVar7;
  local_64[1] = *(undefined1 *)((int)puVar7 + 1);
  local_64[2] = *(undefined1 *)((int)puVar7 + 2);
  local_64[3] = *(undefined1 *)((int)puVar7 + 3);
  local_64[4] = *(undefined1 *)(puVar7 + 1);
  local_64[5] = *(undefined1 *)((int)puVar7 + 5);
  local_64[6] = *(undefined1 *)((int)puVar7 + 6);
  local_68 = 0x14;
  local_6c = 0x19;
  local_64[7] = *(undefined1 *)((int)puVar7 + 7);
  local_64[8] = *(undefined1 *)(puVar7 + 2);
  local_64[9] = *(undefined1 *)((int)puVar7 + 9);
  local_64[10] = *(undefined1 *)((int)puVar7 + 10);
  local_64[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  local_64[0xc] = *(undefined1 *)(puVar7 + 3);
  local_64[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  local_64[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  local_64[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  local_64[0x10] = *(undefined1 *)(puVar7 + 4);
  local_64[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  local_64[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  uVar1 = *(undefined1 *)((int)puVar7 + 0x13);
  local_64[0x14] = 0;
  local_64[0x13] = uVar1;
  FUN_00023f74(puVar7);
  iVar15 = DAT_0009ba44;
  if ((uVar9 & 1) == 0) {
    puVar8 = puVar19;
  }
  puVar25 = local_64;
  if ((local_6c & 1) == 0) {
    puVar25 = puVar17;
  }
  uVar24 = (**(code **)(*param_1 + 0x84))(param_1,uVar24,puVar8,puVar25);
  *(undefined4 *)(iVar15 + 0x9b328) = uVar24;
  if ((local_6c & 1) != 0) {
    FUN_00023f68(local_64,local_6c & 0xfffffffe);
  }
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  (**(code **)(*param_1 + 0x44))(param_1);
  uVar12 = *(undefined4 *)(iVar15 + 0x9b344);
  puVar7 = (undefined4 *)FUN_000a0398(0x17);
  uVar24 = 0;
  uVar27 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar11 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *puVar7 = 0;
  puVar7[1] = uVar27;
  puVar7[2] = uVar28;
  puVar7[3] = uVar11;
  *(undefined1 *)puVar7 = 0x46;
  *(undefined1 *)((int)puVar7 + 1) = 0x4c;
  *(undefined1 *)((int)puVar7 + 2) = 0x41;
  *(undefined1 *)((int)puVar7 + 3) = 0x47;
  *(undefined1 *)(puVar7 + 1) = 0x5f;
  *(undefined1 *)((int)puVar7 + 5) = 0x41;
  *(undefined1 *)((int)puVar7 + 6) = 0x43;
  *(undefined1 *)((int)puVar7 + 7) = 0x54;
  *(undefined1 *)(puVar7 + 2) = 0x49;
  *(undefined1 *)((int)puVar7 + 9) = 0x56;
  *(undefined1 *)((int)puVar7 + 10) = 0x49;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x54;
  *(undefined1 *)(puVar7 + 3) = 0x59;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x5f;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x4e;
  *(undefined4 *)((int)puVar7 + 0xf) = 0;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x45;
  *(undefined1 *)(puVar7 + 4) = 0x57;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x5f;
  *(undefined1 *)((int)puVar7 + 0x12) = 0x54;
  *(undefined4 *)((int)puVar7 + 0x13) = 0;
  *(undefined1 *)((int)puVar7 + 0x13) = 0x41;
  *(undefined1 *)(puVar7 + 5) = 0x53;
  *(undefined1 *)((int)puVar7 + 0x15) = 0x4b;
  *(undefined1 *)((int)puVar7 + 0x16) = 0;
  puVar25 = (undefined1 *)FUN_000a0370(0x18);
  *puVar25 = *(undefined1 *)puVar7;
  puVar25[1] = *(undefined1 *)((int)puVar7 + 1);
  puVar25[2] = *(undefined1 *)((int)puVar7 + 2);
  puVar25[3] = *(undefined1 *)((int)puVar7 + 3);
  puVar25[4] = *(undefined1 *)(puVar7 + 1);
  puVar25[5] = *(undefined1 *)((int)puVar7 + 5);
  puVar25[6] = *(undefined1 *)((int)puVar7 + 6);
  puVar25[7] = *(undefined1 *)((int)puVar7 + 7);
  puVar25[8] = *(undefined1 *)(puVar7 + 2);
  puVar25[9] = *(undefined1 *)((int)puVar7 + 9);
  puVar25[10] = *(undefined1 *)((int)puVar7 + 10);
  puVar25[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  puVar25[0xc] = *(undefined1 *)(puVar7 + 3);
  puVar25[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  puVar25[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  puVar25[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  puVar25[0x10] = *(undefined1 *)(puVar7 + 4);
  puVar25[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  puVar25[0x12] = *(undefined1 *)((int)puVar7 + 0x12);
  puVar25[0x13] = *(undefined1 *)((int)puVar7 + 0x13);
  puVar25[0x14] = *(undefined1 *)(puVar7 + 5);
  puVar25[0x15] = *(undefined1 *)((int)puVar7 + 0x15);
  puVar25[0x16] = 0;
  FUN_00023f74(puVar7);
  puVar14 = (undefined2 *)FUN_000a0398(2);
  *puVar14 = 0;
  *(undefined1 *)puVar14 = 0x49;
  *(undefined1 *)((int)puVar14 + 1) = 0;
  uVar9 = local_60 >> 0x10;
  local_60._0_2_ = CONCAT11(*(undefined1 *)puVar14,2);
  local_60 = CONCAT22((short)uVar9,(undefined2)local_60) & 0xff00ffff;
  FUN_00023f74();
  puVar8 = local_58;
  if ((local_60 & 1) == 0) {
    puVar8 = puVar19;
  }
  uVar12 = (**(code **)(*param_1 + 0x240))(param_1,uVar12,puVar25,puVar8);
  *(undefined4 *)(DAT_0009ba48 + 0x9b57c) = uVar12;
  if ((local_60 & 1) != 0) {
    FUN_00023f68(local_58,local_60 & 0xfffffffe);
  }
  FUN_00023f68(puVar25,0x18);
  (**(code **)(*param_1 + 0x44))(param_1);
  iVar16 = DAT_0009ba4c;
  uVar12 = *(undefined4 *)(DAT_0009ba4c + 0x9b5c8);
  puVar7 = (undefined4 *)FUN_000a0398(0xc);
  *puVar7 = 0;
  *(undefined1 *)puVar7 = 0x41;
  *(undefined1 *)((int)puVar7 + 1) = 0x43;
  puVar7[1] = 0;
  *(undefined1 *)((int)puVar7 + 2) = 0x54;
  *(undefined1 *)((int)puVar7 + 3) = 0x49;
  *(undefined1 *)(puVar7 + 1) = 0x4f;
  *(undefined1 *)((int)puVar7 + 5) = 0x4e;
  puVar7[2] = 0;
  *(undefined1 *)((int)puVar7 + 6) = 0x5f;
  *(undefined1 *)((int)puVar7 + 7) = 0x56;
  *(undefined1 *)(puVar7 + 2) = 0x49;
  *(undefined1 *)((int)puVar7 + 9) = 0x45;
  *(undefined1 *)((int)puVar7 + 10) = 0x57;
  *(undefined1 *)((int)puVar7 + 0xb) = 0;
  puVar8 = (undefined1 *)FUN_000a0370(0x10);
  *puVar8 = *(undefined1 *)puVar7;
  puVar8[1] = *(undefined1 *)((int)puVar7 + 1);
  puVar8[2] = *(undefined1 *)((int)puVar7 + 2);
  puVar8[3] = *(undefined1 *)((int)puVar7 + 3);
  puVar8[4] = *(undefined1 *)(puVar7 + 1);
  puVar8[5] = *(undefined1 *)((int)puVar7 + 5);
  puVar8[6] = *(undefined1 *)((int)puVar7 + 6);
  puVar8[7] = *(undefined1 *)((int)puVar7 + 7);
  puVar8[8] = *(undefined1 *)(puVar7 + 2);
  puVar8[9] = *(undefined1 *)((int)puVar7 + 9);
  puVar8[10] = *(undefined1 *)((int)puVar7 + 10);
  puVar8[0xb] = 0;
  FUN_00023f74(puVar7);
  puVar7 = (undefined4 *)FUN_000a0398(0x13);
  *puVar7 = uVar24;
  puVar7[1] = uVar27;
  puVar7[2] = uVar28;
  puVar7[3] = uVar11;
  *(undefined1 *)puVar7 = 0x4c;
  *(undefined1 *)((int)puVar7 + 1) = 0x6a;
  *(undefined1 *)((int)puVar7 + 2) = 0x61;
  *(undefined1 *)((int)puVar7 + 3) = 0x76;
  *(undefined1 *)(puVar7 + 1) = 0x61;
  *(undefined1 *)((int)puVar7 + 5) = 0x2f;
  *(undefined1 *)((int)puVar7 + 6) = 0x6c;
  *(undefined1 *)((int)puVar7 + 7) = 0x61;
  *(undefined1 *)(puVar7 + 2) = 0x6e;
  *(undefined1 *)((int)puVar7 + 9) = 0x67;
  *(undefined1 *)((int)puVar7 + 10) = 0x2f;
  *(undefined1 *)((int)puVar7 + 0xb) = 0x53;
  *(undefined1 *)(puVar7 + 3) = 0x74;
  *(undefined1 *)((int)puVar7 + 0xd) = 0x72;
  *(undefined1 *)((int)puVar7 + 0xe) = 0x69;
  *(undefined4 *)((int)puVar7 + 0xf) = 0;
  *(undefined1 *)((int)puVar7 + 0xf) = 0x6e;
  *(undefined1 *)(puVar7 + 4) = 0x67;
  *(undefined1 *)((int)puVar7 + 0x11) = 0x3b;
  *(undefined1 *)((int)puVar7 + 0x12) = 0;
  puVar25 = (undefined1 *)FUN_000a0370(0x18);
  *puVar25 = *(undefined1 *)puVar7;
  puVar25[1] = *(undefined1 *)((int)puVar7 + 1);
  puVar25[2] = *(undefined1 *)((int)puVar7 + 2);
  puVar25[3] = *(undefined1 *)((int)puVar7 + 3);
  puVar25[4] = *(undefined1 *)(puVar7 + 1);
  puVar25[5] = *(undefined1 *)((int)puVar7 + 5);
  puVar25[6] = *(undefined1 *)((int)puVar7 + 6);
  puVar25[7] = *(undefined1 *)((int)puVar7 + 7);
  puVar25[8] = *(undefined1 *)(puVar7 + 2);
  puVar25[9] = *(undefined1 *)((int)puVar7 + 9);
  puVar25[10] = *(undefined1 *)((int)puVar7 + 10);
  puVar25[0xb] = *(undefined1 *)((int)puVar7 + 0xb);
  puVar25[0xc] = *(undefined1 *)(puVar7 + 3);
  puVar25[0xd] = *(undefined1 *)((int)puVar7 + 0xd);
  puVar25[0xe] = *(undefined1 *)((int)puVar7 + 0xe);
  puVar25[0xf] = *(undefined1 *)((int)puVar7 + 0xf);
  puVar25[0x10] = *(undefined1 *)(puVar7 + 4);
  puVar25[0x11] = *(undefined1 *)((int)puVar7 + 0x11);
  puVar25[0x12] = 0;
  FUN_00023f74(puVar7);
  uVar24 = (**(code **)(*param_1 + 0x240))(param_1,uVar12,puVar8,puVar25);
  *(undefined4 *)(iVar16 + 0x9b594) = uVar24;
  FUN_00023f68(puVar25,0x18);
  FUN_00023f68(puVar8,0x10);
  iVar15 = (**(code **)(*param_1 + 0x44))(param_1);
  iVar20 = *(int *)(iVar16 + 0x9b5c8);
  iVar18 = *(int *)(iVar16 + 0x9b5d0);
  if (iVar20 != 0) {
    iVar15 = *(int *)(iVar16 + 0x9b5b4);
  }
  if (iVar20 == 0 || iVar15 == 0) {
LAB_0009b8a0:
    iVar15 = DAT_0009ba54 + 0x9b8b0;
    *(undefined1 *)(DAT_0009ba54 + 0x9b8b1) = 0;
  }
  else {
    bVar26 = *(int *)(iVar16 + 0x9b5e4) == 0;
    iVar15 = 0;
    if (!bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b5e0);
    }
    if (bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b5a0) == 0;
    iVar15 = 0;
    if (!bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b598);
    }
    if (bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b5d4) == 0;
    iVar15 = 0;
    if (!bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b5d8);
    }
    if (bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b5a4) == 0;
    iVar15 = 0;
    if (!bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b59c);
    }
    if (bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b5dc) == 0;
    iVar15 = 0;
    if (!bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b5a8);
    }
    if (bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b5c0) == 0;
    iVar15 = 0;
    if (!bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b5b0);
    }
    if (bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b5c4) == 0;
    iVar15 = 0;
    if (!bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b5b8);
    }
    if (bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    if (iVar18 != 0) {
      iVar15 = *(int *)(iVar16 + 0x9b5cc);
    }
    if (iVar18 == 0 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b5ac) != 0;
    iVar15 = 0;
    if (bVar26) {
      iVar15 = *(int *)(iVar16 + 0x9b5bc);
    }
    if (!bVar26 || iVar15 == 0) goto LAB_0009b8a0;
    bVar26 = *(int *)(iVar16 + 0x9b594) != 0;
    iVar15 = DAT_0009ba50 + 0x9ba14;
    *(bool *)(DAT_0009ba50 + 0x9ba15) = bVar26;
    if (bVar26) goto LAB_0009b94c;
  }
  *(undefined4 *)(iVar16 + 0x9b5d4) = 0;
  *(undefined4 *)(iVar16 + 0x9b5d8) = 0;
  *(undefined4 *)(iVar16 + 0x9b5dc) = 0;
  *(undefined4 *)(iVar16 + 0x9b5e0) = 0;
  *(undefined4 *)(iVar16 + 0x9b5e4) = 0;
  *(undefined4 *)(iVar16 + 0x9b5cc) = 0;
  *(undefined4 *)(iVar16 + 0x9b5b4) = 0;
  *(undefined4 *)(iVar16 + 0x9b5b8) = 0;
  *(undefined4 *)(iVar16 + 0x9b5bc) = 0;
  *(undefined4 *)(iVar16 + 0x9b5c0) = 0;
  *(undefined4 *)(iVar16 + 0x9b5c4) = 0;
  *(undefined4 *)(iVar16 + 0x9b594) = 0;
  *(undefined4 *)(iVar16 + 0x9b598) = 0;
  *(undefined4 *)(iVar16 + 0x9b59c) = 0;
  *(undefined4 *)(iVar16 + 0x9b5a0) = 0;
  *(undefined4 *)(iVar16 + 0x9b5a4) = 0;
  *(undefined4 *)(iVar16 + 0x9b5a8) = 0;
  *(undefined4 *)(iVar16 + 0x9b5ac) = 0;
  *(undefined4 *)(iVar16 + 0x9b5b0) = 0;
  if (iVar20 != 0) {
    (**(code **)(*param_1 + 0x58))(param_1,iVar20);
    iVar18 = *(int *)(iVar16 + 0x9b5d0);
    *(undefined4 *)(iVar16 + 0x9b5c8) = 0;
  }
  if (iVar18 != 0) {
    (**(code **)(*param_1 + 0x58))();
    *(undefined4 *)(iVar16 + 0x9b5d0) = 0;
  }
  *(undefined1 *)(iVar15 + 1) = 0;
LAB_0009b94c:
  if (**(int **)(DAT_0009ba58 + 0x9b95c) == local_3c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #684
// Name: FUN_0009ba5c
// Address: 0009ba5c
// JNI: NO
// ============================================================


void FUN_0009ba5c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0009bac0 + 0x9ba78);
  (**(code **)(*param_1 + 0x1cc))();
  if (**(int **)(DAT_0009bac4 + 0x9baa4) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #685
// Name: FUN_0009bac8
// Address: 0009bac8
// JNI: NO
// ============================================================


void FUN_0009bac8(undefined4 *param_1,byte *param_2,undefined4 param_3)

{
  int iVar1;
  char *pcVar2;
  undefined4 *puVar3;
  undefined1 *puVar4;
  byte *pbVar5;
  int iVar6;
  undefined4 uVar7;
  int iVar8;
  int local_6c;
  int local_68;
  int local_60;
  undefined4 local_5c;
  int *local_50;
  undefined4 local_48;
  int local_40;
  undefined4 local_3c;
  int *local_30;
  int local_24;
  
  local_24 = **(int **)(DAT_0009bd00 + 0x9bae4);
  pbVar5 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar5 = param_2 + 1;
  }
  iVar1 = (**(code **)(*(int *)*param_1 + 0x29c))((int *)*param_1,pbVar5);
  pcVar2 = (char *)FUN_00025e6c(DAT_0009bd04 + 0x9bb20);
  if (*pcVar2 == '\x01') {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd08 + 0x9bb38);
    uVar7 = *puVar3;
  }
  else {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd0c + 0x9bca0);
    uVar7 = FUN_00076fc0();
    iVar8 = DAT_0009bd10;
    *puVar3 = uVar7;
    puVar4 = (undefined1 *)FUN_00025e6c(iVar8 + 0x9bcbc);
    *puVar4 = 1;
  }
  iVar8 = DAT_0009bd14 + 0x9bb60;
  local_68 = iVar1;
  local_60 = iVar8;
  local_5c = uVar7;
  local_50 = &local_60;
  iVar1 = FUN_000765d8(*param_1,param_1[2],*(undefined4 *)(DAT_0009bd18 + 0x9bb8c),iVar1,param_3);
  pcVar2 = (char *)FUN_00025e6c(DAT_0009bd1c + 0x9bb90);
  if (*pcVar2 == '\x01') {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd20 + 0x9bba8);
    uVar7 = *puVar3;
  }
  else {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd24 + 0x9bcd4);
    uVar7 = FUN_00076fc0();
    iVar6 = DAT_0009bd28;
    *puVar3 = uVar7;
    puVar4 = (undefined1 *)FUN_00025e6c(iVar6 + 0x9bcf0);
    *puVar4 = 1;
  }
  local_3c = uVar7;
  iVar6 = 0x10;
  local_30 = &local_40;
  local_48 = 0;
  local_40 = iVar8;
  if (((iVar1 == 0) || (local_6c = iVar1, FUN_0009de6c(&local_40,&local_6c), local_30 == &local_40))
     || (iVar6 = 0x14, local_30 != (int *)0x0)) {
    (**(code **)(*local_30 + iVar6))();
  }
  iVar1 = local_68;
  local_68 = 0;
  if (iVar1 != 0) {
    local_6c = iVar1;
    if (local_50 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_50 + 0x18))(local_50,&local_6c);
  }
  if (local_50 == &local_60) {
    iVar1 = 0x10;
  }
  else {
    iVar1 = 0x14;
    if (local_50 == (int *)0x0) goto LAB_0009bc70;
  }
  (**(code **)(*local_50 + iVar1))();
LAB_0009bc70:
  if (**(int **)(DAT_0009bd2c + 0x9bc80) == local_24) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #686
// Name: FUN_0009bd30
// Address: 0009bd30
// JNI: NO
// ============================================================


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




// ============================================================
// Function #687
// Name: JNI_OnLoad
// Address: 0009c028
// JNI: YES
// ============================================================


void JNI_OnLoad(undefined4 param_1)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  char cVar6;
  char cVar7;
  undefined1 uVar8;
  char cVar9;
  char cVar10;
  char cVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  int iVar14;
  char *pcVar15;
  int iVar16;
  __pid_t _Var17;
  undefined4 *puVar18;
  undefined1 *puVar19;
  undefined4 uVar20;
  int iVar21;
  char *__s;
  size_t sVar22;
  undefined1 *puVar23;
  undefined1 *puVar24;
  int iVar25;
  int iVar26;
  int iVar27;
  undefined4 uVar28;
  uint uVar29;
  char *pcVar30;
  int iVar31;
  int *piVar32;
  undefined4 *puVar33;
  int *piVar34;
  bool bVar35;
  int *local_7c;
  uint local_70;
  size_t local_6c;
  uint local_68;
  uint local_64;
  size_t local_60;
  undefined1 *local_5c;
  undefined1 *local_58;
  undefined4 local_54;
  undefined1 *local_50;
  undefined4 local_4c;
  undefined1 **local_40;
  undefined4 local_34;
  uint local_30;
  char *local_2c;
  int local_28;
  
  iVar21 = DAT_0009cae0;
  puVar33 = (undefined4 *)(DAT_0009cae0 + 0x9c044);
  iVar27 = DAT_0009cae0 + 0x9c04c;
  local_28 = **(int **)(DAT_0009cae4 + 0x9c048);
  FUN_0001ae24(iVar27);
  iVar14 = DAT_0009caf4;
  iVar25 = DAT_0009cae8;
  iVar31 = DAT_0009cae8 + 0x9c068;
  if (*(char *)(DAT_0009cae8 + 0x9c06b) == '\x01') {
    pcVar15 = (char *)FUN_00025e6c(DAT_0009caec + 0x9c07c);
    if (*pcVar15 == '\x01') {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009caf0 + 0x9c094);
      piVar32 = (int *)*puVar33;
    }
    else {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da00 + 0x9d900);
      piVar32 = (int *)FUN_00076fc0();
      iVar21 = DAT_0009da04;
      *puVar33 = piVar32;
      puVar23 = (undefined1 *)FUN_00025e6c(iVar21 + 0x9d91c);
      *puVar23 = 1;
    }
    goto LAB_0009d8b0;
  }
  iVar16 = DAT_0009caf8 + 0x9c0b0;
  *(undefined4 *)(DAT_0009caf4 + 0x9c0cc) = param_1;
  pcVar15 = (char *)FUN_00025e6c(iVar16);
  _Var17 = getpid();
  *(__pid_t *)(iVar14 + 0x9c0c8) = _Var17;
  if (*pcVar15 == '\x01') {
    puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009cafc + 0x9c0d4);
    piVar32 = (int *)*puVar18;
  }
  else {
    puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009cafc + 0x9c0d4);
    piVar32 = (int *)FUN_00076fc0();
    iVar14 = DAT_0009da08;
    *puVar18 = piVar32;
    puVar23 = (undefined1 *)FUN_00025e6c(iVar14 + 0x9d948);
    *puVar23 = 1;
  }
  FUN_00073858();
  FUN_000976d0(piVar32);
  if (*(char *)(iVar25 + 0x9c06a) == '\0') {
    puVar33 = (undefined4 *)FUN_000a0398(0x18);
    *puVar33 = 0;
    puVar33[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar33[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar33[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    puVar18 = puVar33 + 4;
    *(undefined1 *)puVar33 = 0x61;
    *(undefined1 *)((int)puVar33 + 1) = 0x6e;
    *(undefined1 *)((int)puVar33 + 2) = 100;
    *(undefined1 *)((int)puVar33 + 3) = 0x72;
    *(undefined1 *)(puVar33 + 1) = 0x6f;
    *(undefined1 *)((int)puVar33 + 5) = 0x69;
    *(undefined1 *)((int)puVar33 + 6) = 100;
    *(undefined1 *)((int)puVar33 + 7) = 0x2f;
    *(undefined1 *)(puVar33 + 2) = 99;
    *(undefined1 *)((int)puVar33 + 9) = 0x6f;
    *(undefined1 *)((int)puVar33 + 10) = 0x6e;
    *(undefined1 *)((int)puVar33 + 0xb) = 0x74;
    *(undefined1 *)(puVar33 + 3) = 0x65;
    *(undefined1 *)((int)puVar33 + 0xd) = 0x6e;
    *(undefined1 *)((int)puVar33 + 0xe) = 0x74;
    *(undefined1 *)((int)puVar33 + 0xf) = 0x2f;
    *puVar18 = 0;
    *(undefined1 *)puVar18 = 0x43;
    *(undefined1 *)((int)puVar33 + 0x11) = 0x6f;
    *(undefined1 *)((int)puVar33 + 0x12) = 0x6e;
    puVar33[5] = 0;
    *(undefined1 *)((int)puVar33 + 0x13) = 0x74;
    *(undefined1 *)(puVar33 + 5) = 0x65;
    *(undefined1 *)((int)puVar33 + 0x15) = 0x78;
    *(undefined1 *)((int)puVar33 + 0x16) = 0x74;
    *(undefined1 *)((int)puVar33 + 0x17) = 0;
    puVar23 = (undefined1 *)FUN_000a0370(0x18);
    uVar1 = *(undefined1 *)((int)puVar33 + 1);
    uVar2 = *(undefined1 *)((int)puVar33 + 2);
    uVar3 = *(undefined1 *)((int)puVar33 + 3);
    *puVar23 = *(undefined1 *)puVar33;
    uVar4 = *(undefined1 *)(puVar33 + 1);
    puVar23[1] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 5);
    puVar23[2] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 6);
    puVar23[3] = uVar3;
    uVar3 = *(undefined1 *)((int)puVar33 + 7);
    puVar23[4] = uVar4;
    uVar4 = *(undefined1 *)(puVar33 + 2);
    puVar23[5] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 9);
    puVar23[6] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 10);
    puVar23[7] = uVar3;
    uVar3 = *(undefined1 *)((int)puVar33 + 0xb);
    puVar23[8] = uVar4;
    uVar4 = *(undefined1 *)(puVar33 + 3);
    puVar23[9] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 0xd);
    puVar23[10] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 0xe);
    puVar23[0xb] = uVar3;
    uVar3 = *(undefined1 *)((int)puVar33 + 0xf);
    uVar5 = *(undefined1 *)puVar18;
    puVar23[0xc] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar33 + 0x11);
    puVar23[0xd] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar33 + 0x12);
    puVar23[0xe] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar33 + 0x13);
    puVar23[0xf] = uVar3;
    uVar3 = *(undefined1 *)(puVar33 + 5);
    puVar23[0x10] = uVar5;
    uVar5 = *(undefined1 *)((int)puVar33 + 0x15);
    puVar23[0x11] = uVar4;
    puVar23[0x16] = *(undefined1 *)((int)puVar33 + 0x16);
    puVar23[0x12] = uVar1;
    puVar23[0x13] = uVar2;
    puVar23[0x14] = uVar3;
    puVar23[0x15] = uVar5;
    puVar23[0x17] = 0;
    FUN_00023f74(puVar33);
    puVar19 = (undefined1 *)(**(code **)(*piVar32 + 0x18))(piVar32,puVar23);
    pcVar15 = (char *)FUN_00025e6c(DAT_0009d230 + 0x9c2a4);
    if (*pcVar15 == '\x01') {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009d234 + 0x9c2bc);
      uVar28 = *puVar33;
    }
    else {
      puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da0c + 0x9d998);
      uVar28 = FUN_00076fc0();
      iVar25 = DAT_0009da10;
      *puVar33 = uVar28;
      puVar24 = (undefined1 *)FUN_00025e6c(iVar25 + 0x9d9b4);
      *puVar24 = 1;
    }
    local_50 = (undefined1 *)(DAT_0009d238 + 0x9c2e4);
    local_58 = puVar19;
    local_4c = uVar28;
    local_40 = &local_50;
    uVar28 = (**(code **)(*piVar32 + 0x54))(piVar32,puVar19);
    puVar19 = local_58;
    *(undefined4 *)(iVar21 + 0x9c048) = uVar28;
    bVar35 = local_58 != (undefined1 *)0x0;
    local_58 = (undefined1 *)0x0;
    if (bVar35) {
      local_34 = puVar19;
      if (local_40 == (undefined1 **)0x0) goto LAB_0009d9fc;
      (**(code **)(*local_40 + 0x18))(local_40,&local_34);
    }
    if (local_40 == &local_50) {
      iVar25 = 0x10;
LAB_0009c350:
      (**(code **)(*local_40 + iVar25))();
    }
    else {
      iVar25 = 0x14;
      if (local_40 != (undefined1 **)0x0) goto LAB_0009c350;
    }
    FUN_00023f68(puVar23,0x18);
    uVar28 = *(undefined4 *)(iVar21 + 0x9c048);
    puVar33 = (undefined4 *)FUN_000a0398(0xe);
    *puVar33 = 0;
    *(undefined1 *)puVar33 = 0x73;
    *(undefined1 *)((int)puVar33 + 1) = 0x65;
    puVar33[1] = 0;
    *(undefined1 *)((int)puVar33 + 2) = 0x6e;
    *(undefined1 *)((int)puVar33 + 3) = 100;
    *(undefined4 *)((int)puVar33 + 6) = 0;
    *(undefined1 *)(puVar33 + 1) = 0x42;
    *(undefined1 *)((int)puVar33 + 5) = 0x72;
    *(undefined1 *)((int)puVar33 + 6) = 0x6f;
    *(undefined1 *)((int)puVar33 + 7) = 0x61;
    *(undefined4 *)((int)puVar33 + 10) = 0;
    *(undefined1 *)(puVar33 + 2) = 100;
    *(undefined1 *)((int)puVar33 + 9) = 99;
    *(undefined1 *)((int)puVar33 + 10) = 0x61;
    *(undefined1 *)((int)puVar33 + 0xb) = 0x73;
    *(undefined1 *)(puVar33 + 3) = 0x74;
    *(undefined1 *)((int)puVar33 + 0xd) = 0;
    local_50 = (undefined1 *)FUN_000a0370(0x10);
    *local_50 = *(undefined1 *)puVar33;
    local_50[1] = *(undefined1 *)((int)puVar33 + 1);
    local_50[2] = *(undefined1 *)((int)puVar33 + 2);
    local_50[3] = *(undefined1 *)((int)puVar33 + 3);
    local_50[4] = *(undefined1 *)(puVar33 + 1);
    local_50[5] = *(undefined1 *)((int)puVar33 + 5);
    local_50[6] = *(undefined1 *)((int)puVar33 + 6);
    local_54 = 0xd;
    local_58 = (undefined1 *)0x11;
    local_50[7] = *(undefined1 *)((int)puVar33 + 7);
    local_50[8] = *(undefined1 *)(puVar33 + 2);
    local_50[9] = *(undefined1 *)((int)puVar33 + 9);
    local_50[10] = *(undefined1 *)((int)puVar33 + 10);
    local_50[0xb] = *(undefined1 *)((int)puVar33 + 0xb);
    uVar1 = *(undefined1 *)(puVar33 + 3);
    local_50[0xd] = 0;
    local_50[0xc] = uVar1;
    FUN_00023f74(puVar33);
    puVar19 = local_50;
    puVar23 = local_58;
    pcVar15 = (char *)FUN_000a0398(0x1c);
    pcVar15[0] = '\0';
    pcVar15[1] = '\0';
    pcVar15[2] = '\0';
    pcVar15[3] = '\0';
    *(undefined4 *)(pcVar15 + 4) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    *(undefined4 *)(pcVar15 + 8) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    *(undefined4 *)(pcVar15 + 0xc) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *pcVar15 = '(';
    pcVar15[1] = 'L';
    pcVar15[2] = 'a';
    pcVar15[3] = 'n';
    pcVar15[4] = 'd';
    pcVar15[5] = 'r';
    pcVar15[6] = 'o';
    pcVar15[7] = 'i';
    pcVar15[8] = 'd';
    pcVar15[9] = '/';
    pcVar15[10] = 'c';
    pcVar15[0xb] = 'o';
    pcVar15[0xc] = '\0';
    pcVar15[0xd] = '\0';
    pcVar15[0xe] = '\0';
    pcVar15[0xf] = '\0';
    *(undefined4 *)(pcVar15 + 0x10) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4)
    ;
    *(undefined4 *)(pcVar15 + 0x14) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8)
    ;
    *(undefined4 *)(pcVar15 + 0x18) = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc)
    ;
    pcVar15[0xc] = 'n';
    pcVar15[0xd] = 't';
    pcVar15[0xe] = 'e';
    pcVar15[0xf] = 'n';
    pcVar15[0x10] = 't';
    pcVar15[0x11] = '/';
    pcVar15[0x12] = 'I';
    pcVar15[0x13] = 'n';
    pcVar15[0x14] = 't';
    pcVar15[0x15] = 'e';
    pcVar15[0x16] = 'n';
    pcVar15[0x17] = 't';
    pcVar15[0x18] = ';';
    pcVar15[0x19] = ')';
    pcVar15[0x1a] = 'V';
    pcVar15[0x1b] = '\0';
    local_2c = (char *)FUN_000a0370(0x20);
    *local_2c = *pcVar15;
    local_2c[1] = pcVar15[1];
    local_2c[2] = pcVar15[2];
    local_2c[3] = pcVar15[3];
    local_2c[4] = pcVar15[4];
    local_2c[5] = pcVar15[5];
    local_2c[6] = pcVar15[6];
    local_30 = 0x1b;
    local_34 = (undefined1 *)0x21;
    local_2c[7] = pcVar15[7];
    local_2c[8] = pcVar15[8];
    local_2c[9] = pcVar15[9];
    local_2c[10] = pcVar15[10];
    local_2c[0xb] = pcVar15[0xb];
    local_2c[0xc] = pcVar15[0xc];
    local_2c[0xd] = pcVar15[0xd];
    local_2c[0xe] = pcVar15[0xe];
    cVar6 = pcVar15[0x10];
    local_2c[0xf] = pcVar15[0xf];
    cVar7 = pcVar15[0x11];
    local_2c[0x10] = cVar6;
    cVar6 = pcVar15[0x12];
    local_2c[0x11] = cVar7;
    cVar7 = pcVar15[0x13];
    local_2c[0x12] = cVar6;
    cVar6 = pcVar15[0x14];
    local_2c[0x13] = cVar7;
    cVar7 = pcVar15[0x15];
    local_2c[0x14] = cVar6;
    cVar6 = pcVar15[0x16];
    local_2c[0x15] = cVar7;
    cVar7 = pcVar15[0x17];
    local_2c[0x16] = cVar6;
    cVar6 = pcVar15[0x18];
    local_2c[0x17] = cVar7;
    cVar7 = pcVar15[0x19];
    local_2c[0x18] = cVar6;
    cVar6 = pcVar15[0x1a];
    local_2c[0x19] = cVar7;
    local_2c[0x1b] = '\0';
    local_2c[0x1a] = cVar6;
    FUN_00023f74(pcVar15);
    if (((uint)puVar23 & 1) == 0) {
      puVar19 = (undefined1 *)((uint)&local_58 | 1);
    }
    pcVar15 = local_2c;
    if (((uint)local_34 & 1) == 0) {
      pcVar15 = (char *)((uint)&local_34 | 1);
    }
    uVar28 = (**(code **)(*piVar32 + 0x84))(piVar32,uVar28,puVar19,pcVar15);
    *(undefined4 *)(DAT_0009d608 + 0x9c72c) = uVar28;
    if (((uint)local_34 & 1) != 0) {
      FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
    }
    if (((uint)local_58 & 1) != 0) {
      FUN_00023f68(local_50,(uint)local_58 & 0xfffffffe);
    }
    (**(code **)(*piVar32 + 0x44))(piVar32);
    uVar28 = *(undefined4 *)(DAT_0009d60c + 0x9c704);
    pcVar15 = (char *)FUN_000a0398(0xe);
    builtin_strncpy(pcVar15,"startActivity",0xe);
    local_2c = (char *)FUN_000a0370(0x10);
    *local_2c = *pcVar15;
    local_2c[1] = pcVar15[1];
    local_2c[2] = pcVar15[2];
    local_2c[3] = pcVar15[3];
    local_2c[4] = pcVar15[4];
    local_2c[5] = pcVar15[5];
    local_2c[6] = pcVar15[6];
    local_30 = 0xd;
    local_34 = (undefined1 *)0x11;
    local_2c[7] = pcVar15[7];
    local_2c[8] = pcVar15[8];
    local_2c[9] = pcVar15[9];
    local_2c[10] = pcVar15[10];
    local_2c[0xb] = pcVar15[0xb];
    cVar6 = pcVar15[0xc];
    local_2c[0xd] = '\0';
    local_2c[0xc] = cVar6;
    FUN_00023f74(pcVar15);
    pcVar15 = local_2c;
    puVar23 = local_34;
    puVar18 = (undefined4 *)FUN_000a0398(0x1c);
    *puVar18 = 0;
    puVar18[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar18[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar18[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *(undefined1 *)puVar18 = 0x28;
    *(undefined1 *)((int)puVar18 + 1) = 0x4c;
    *(undefined1 *)((int)puVar18 + 2) = 0x61;
    *(undefined1 *)((int)puVar18 + 3) = 0x6e;
    *(undefined1 *)(puVar18 + 1) = 100;
    *(undefined1 *)((int)puVar18 + 5) = 0x72;
    *(undefined1 *)((int)puVar18 + 6) = 0x6f;
    *(undefined1 *)((int)puVar18 + 7) = 0x69;
    *(undefined1 *)(puVar18 + 2) = 100;
    *(undefined1 *)((int)puVar18 + 9) = 0x2f;
    *(undefined1 *)((int)puVar18 + 10) = 99;
    *(undefined1 *)((int)puVar18 + 0xb) = 0x6f;
    puVar18[3] = 0;
    puVar18[4] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar18[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar18[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *(undefined1 *)(puVar18 + 3) = 0x6e;
    *(undefined1 *)((int)puVar18 + 0xd) = 0x74;
    *(undefined1 *)((int)puVar18 + 0xe) = 0x65;
    *(undefined1 *)((int)puVar18 + 0xf) = 0x6e;
    *(undefined1 *)(puVar18 + 4) = 0x74;
    *(undefined1 *)((int)puVar18 + 0x11) = 0x2f;
    *(undefined1 *)((int)puVar18 + 0x12) = 0x49;
    *(undefined1 *)((int)puVar18 + 0x13) = 0x6e;
    *(undefined1 *)(puVar18 + 5) = 0x74;
    *(undefined1 *)((int)puVar18 + 0x15) = 0x65;
    *(undefined1 *)((int)puVar18 + 0x16) = 0x6e;
    *(undefined1 *)((int)puVar18 + 0x17) = 0x74;
    *(undefined1 *)(puVar18 + 6) = 0x3b;
    *(undefined1 *)((int)puVar18 + 0x19) = 0x29;
    *(undefined1 *)((int)puVar18 + 0x1a) = 0x56;
    *(undefined1 *)((int)puVar18 + 0x1b) = 0;
    local_50 = (undefined1 *)FUN_000a0370(0x20);
    *local_50 = *(undefined1 *)puVar18;
    local_50[1] = *(undefined1 *)((int)puVar18 + 1);
    local_50[2] = *(undefined1 *)((int)puVar18 + 2);
    local_50[3] = *(undefined1 *)((int)puVar18 + 3);
    local_50[4] = *(undefined1 *)(puVar18 + 1);
    local_50[5] = *(undefined1 *)((int)puVar18 + 5);
    local_50[6] = *(undefined1 *)((int)puVar18 + 6);
    local_54 = 0x1b;
    local_58 = (undefined1 *)0x21;
    local_50[7] = *(undefined1 *)((int)puVar18 + 7);
    local_50[8] = *(undefined1 *)(puVar18 + 2);
    local_50[9] = *(undefined1 *)((int)puVar18 + 9);
    local_50[10] = *(undefined1 *)((int)puVar18 + 10);
    local_50[0xb] = *(undefined1 *)((int)puVar18 + 0xb);
    local_50[0xc] = *(undefined1 *)(puVar18 + 3);
    local_50[0xd] = *(undefined1 *)((int)puVar18 + 0xd);
    local_50[0xe] = *(undefined1 *)((int)puVar18 + 0xe);
    local_50[0xf] = *(undefined1 *)((int)puVar18 + 0xf);
    local_50[0x10] = *(undefined1 *)(puVar18 + 4);
    local_50[0x11] = *(undefined1 *)((int)puVar18 + 0x11);
    local_50[0x12] = *(undefined1 *)((int)puVar18 + 0x12);
    local_50[0x13] = *(undefined1 *)((int)puVar18 + 0x13);
    local_50[0x14] = *(undefined1 *)(puVar18 + 5);
    local_50[0x15] = *(undefined1 *)((int)puVar18 + 0x15);
    local_50[0x16] = *(undefined1 *)((int)puVar18 + 0x16);
    local_50[0x17] = *(undefined1 *)((int)puVar18 + 0x17);
    local_50[0x18] = *(undefined1 *)(puVar18 + 6);
    local_50[0x19] = *(undefined1 *)((int)puVar18 + 0x19);
    uVar1 = *(undefined1 *)((int)puVar18 + 0x1a);
    local_50[0x1b] = 0;
    iVar21 = DAT_0009d9c0;
    local_50[0x1a] = uVar1;
    puVar33 = (undefined4 *)(iVar21 + 0x9c9f0);
    FUN_00023f74(puVar18);
    if (((uint)puVar23 & 1) == 0) {
      pcVar15 = (char *)((uint)&local_34 | 1);
    }
    puVar23 = local_50;
    if (((uint)local_58 & 1) == 0) {
      puVar23 = (undefined1 *)((uint)&local_58 | 1);
    }
    uVar28 = (**(code **)(*piVar32 + 0x84))(piVar32,uVar28,pcVar15,puVar23);
    *puVar33 = uVar28;
    if (((uint)local_58 & 1) != 0) {
      FUN_00023f68(local_50,(uint)local_58 & 0xfffffffe);
    }
    iVar14 = DAT_0009da18;
    iVar25 = DAT_0009da14;
    iVar31 = DAT_0009da14 + 0x9ca64;
    if (((uint)local_34 & 1) != 0) {
      FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
    }
    iVar16 = (**(code **)(*piVar32 + 0x44))(piVar32);
    iVar26 = *(int *)(iVar21 + 0x9c9f4);
    if (iVar26 != 0) {
      iVar16 = *(int *)((int)&DAT_0009cae0 + iVar14);
    }
    if (iVar26 != 0 && iVar16 != 0) {
      bVar35 = *(int *)(DAT_0009da1c + 0x9cac4) != 0;
      *(bool *)(iVar25 + 0x9ca66) = bVar35;
      if (bVar35) goto LAB_0009cad0;
      *(undefined4 *)((int)&DAT_0009cae0 + iVar14) = 0;
LAB_0009cb08:
      (**(code **)(*piVar32 + 0x58))(piVar32);
      *(undefined4 *)(iVar21 + 0x9c9f4) = 0;
    }
    else {
      *(undefined4 *)((int)&DAT_0009cae0 + iVar14) = 0;
      *(undefined1 *)(iVar25 + 0x9ca66) = 0;
      *puVar33 = 0;
      if (iVar26 != 0) goto LAB_0009cb08;
    }
    *(undefined1 *)(iVar25 + 0x9ca66) = 0;
    cVar6 = *(char *)(iVar25 + 0x9ca68);
  }
  else {
LAB_0009cad0:
    cVar6 = *(char *)(iVar31 + 4);
  }
  if (cVar6 == '\0') {
    pcVar15 = (char *)FUN_00025e6c(DAT_0009da20 + 0x9cb3c);
    if (*pcVar15 == '\x01') {
      puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009da24 + 0x9cb54);
      piVar34 = (int *)*puVar18;
    }
    else {
      puVar18 = (undefined4 *)FUN_00025e6c(DAT_0009da28 + 0x9d9d0);
      piVar34 = (int *)FUN_00076fc0();
      iVar21 = DAT_0009da2c;
      *puVar18 = piVar34;
      puVar23 = (undefined1 *)FUN_00025e6c(iVar21 + 0x9d9ec);
      *puVar23 = 1;
    }
    FUN_0009f240(&local_58);
    if (local_58 != (undefined1 *)0x0) {
      uVar20 = (**(code **)(*piVar34 + 0x54))(piVar34);
      puVar33[3] = uVar20;
      puVar33 = (undefined4 *)FUN_000a0398(7);
      uVar29 = 0;
      *puVar33 = 0;
      *(undefined1 *)puVar33 = 0x69;
      *(undefined1 *)((int)puVar33 + 1) = 0x6e;
      *(undefined4 *)((int)puVar33 + 3) = 0;
      *(undefined1 *)((int)puVar33 + 2) = 0x76;
      *(undefined1 *)((int)puVar33 + 3) = 0x6f;
      *(undefined1 *)(puVar33 + 1) = 0x6b;
      *(undefined1 *)((int)puVar33 + 5) = 0x65;
      *(undefined1 *)((int)puVar33 + 6) = 0;
      local_34._0_2_ = CONCAT11(*(undefined1 *)puVar33,0xc);
      local_34._0_3_ = CONCAT12(*(undefined1 *)((int)puVar33 + 1),(undefined2)local_34);
      local_34 = (undefined1 *)CONCAT13(*(undefined1 *)((int)puVar33 + 2),(undefined3)local_34);
      local_30 = (uint)*(uint3 *)((int)puVar33 + 3);
      FUN_00023f74();
      pcVar15 = local_2c;
      puVar23 = local_34;
      puVar33 = (undefined4 *)FUN_000a0398(0x3a);
      uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
      uVar12 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
      uVar13 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
      *puVar33 = 0;
      puVar33[1] = uVar28;
      puVar33[2] = uVar12;
      puVar33[3] = uVar13;
      puVar33[4] = 0;
      puVar33[5] = uVar28;
      puVar33[6] = uVar12;
      puVar33[7] = uVar13;
      puVar33[8] = 0;
      puVar33[9] = uVar28;
      puVar33[10] = uVar12;
      puVar33[0xb] = uVar13;
      *(undefined4 *)((int)puVar33 + 0x2a) = 0;
      *(undefined4 *)((int)puVar33 + 0x2e) = uVar28;
      *(undefined4 *)((int)puVar33 + 0x32) = uVar12;
      *(undefined4 *)((int)puVar33 + 0x36) = uVar13;
      iVar21 = DAT_0009da30 + 0x9cc54;
      do {
        *(byte *)((int)puVar33 + uVar29) =
             *(byte *)(iVar21 + (uVar29 & 7)) ^ *(byte *)(iVar21 + uVar29 + 8);
        uVar29 = uVar29 + 1;
      } while (uVar29 != 0x3a);
      local_5c = (undefined1 *)FUN_000a0370(0x40);
      uVar1 = *(undefined1 *)((int)puVar33 + 1);
      uVar2 = *(undefined1 *)((int)puVar33 + 2);
      uVar3 = *(undefined1 *)((int)puVar33 + 3);
      uVar4 = *(undefined1 *)(puVar33 + 1);
      uVar5 = *(undefined1 *)((int)puVar33 + 5);
      *local_5c = *(undefined1 *)puVar33;
      uVar8 = *(undefined1 *)((int)puVar33 + 6);
      local_5c[1] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 7);
      local_5c[4] = uVar4;
      local_5c[5] = uVar5;
      local_5c[2] = uVar2;
      local_5c[3] = uVar3;
      local_5c[6] = uVar8;
      uVar2 = *(undefined1 *)(puVar33 + 2);
      uVar3 = *(undefined1 *)((int)puVar33 + 9);
      local_60 = 0x39;
      uVar4 = *(undefined1 *)((int)puVar33 + 10);
      uVar5 = *(undefined1 *)((int)puVar33 + 0xb);
      local_64 = 0x41;
      uVar8 = *(undefined1 *)(puVar33 + 3);
      local_5c[7] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0xd);
      local_5c[8] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0xe);
      local_5c[9] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0xf);
      local_5c[10] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 4);
      local_5c[0xb] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x11);
      local_5c[0xc] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x12);
      local_5c[0xd] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x13);
      local_5c[0xe] = uVar2;
      uVar2 = *(undefined1 *)(puVar33 + 5);
      local_5c[0xf] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x15);
      local_5c[0x10] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar33 + 0x16);
      local_5c[0x11] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x17);
      local_5c[0x12] = uVar8;
      uVar8 = *(undefined1 *)(puVar33 + 6);
      local_5c[0x13] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x19);
      local_5c[0x14] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0x1a);
      local_5c[0x15] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x1b);
      local_5c[0x16] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 7);
      local_5c[0x17] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x1d);
      local_5c[0x18] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x1e);
      local_5c[0x19] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x1f);
      local_5c[0x1a] = uVar2;
      uVar2 = *(undefined1 *)(puVar33 + 8);
      local_5c[0x1b] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x21);
      local_5c[0x1c] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar33 + 0x22);
      local_5c[0x1d] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x23);
      local_5c[0x1e] = uVar8;
      uVar8 = *(undefined1 *)(puVar33 + 9);
      local_5c[0x1f] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x25);
      local_5c[0x20] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0x26);
      local_5c[0x21] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x27);
      local_5c[0x22] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 10);
      local_5c[0x23] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x29);
      local_5c[0x24] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x2a);
      local_5c[0x25] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x2b);
      local_5c[0x26] = uVar2;
      uVar2 = *(undefined1 *)(puVar33 + 0xb);
      local_5c[0x27] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x2d);
      local_5c[0x28] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar33 + 0x2e);
      local_5c[0x29] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x2f);
      local_5c[0x2a] = uVar8;
      uVar8 = *(undefined1 *)(puVar33 + 0xc);
      local_5c[0x2b] = uVar1;
      uVar1 = *(undefined1 *)((int)puVar33 + 0x31);
      local_5c[0x2c] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar33 + 0x32);
      local_5c[0x2d] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar33 + 0x33);
      local_5c[0x2e] = uVar4;
      uVar4 = *(undefined1 *)(puVar33 + 0xd);
      local_5c[0x2f] = uVar5;
      uVar5 = *(undefined1 *)((int)puVar33 + 0x35);
      local_5c[0x30] = uVar8;
      uVar8 = *(undefined1 *)((int)puVar33 + 0x36);
      local_5c[0x31] = uVar1;
      local_5c[0x37] = *(undefined1 *)((int)puVar33 + 0x37);
      local_5c[0x32] = uVar2;
      local_5c[0x33] = uVar3;
      local_5c[0x34] = uVar4;
      local_5c[0x35] = uVar5;
      local_5c[0x36] = uVar8;
      uVar1 = *(undefined1 *)(puVar33 + 0xe);
      local_5c[0x39] = 0;
      local_5c[0x38] = uVar1;
      FUN_00023f74(puVar33);
      if (((uint)puVar23 & 1) == 0) {
        pcVar15 = (char *)((uint)&local_34 | 1);
      }
      puVar23 = local_5c;
      if ((local_64 & 1) == 0) {
        puVar23 = (undefined1 *)((uint)&local_64 | 1);
      }
      uVar28 = (**(code **)(*piVar34 + 0x1c4))(piVar34,uVar20,pcVar15,puVar23);
      iVar21 = DAT_0009da34;
      *(undefined4 *)(DAT_0009da34 + 0x9cecc) = uVar28;
      if ((local_64 & 1) == 0) {
        if (((uint)local_34 & 1) != 0) goto LAB_0009d258;
LAB_0009cec8:
        if (*(int *)(iVar21 + 0x9cecc) == 0) goto LAB_0009d274;
LAB_0009ced4:
        uVar28 = *(undefined4 *)(iVar21 + 0x9cec4);
        puVar33 = (undefined4 *)FUN_000a0398(0xb);
        *puVar33 = 0;
        *(undefined1 *)puVar33 = 0x67;
        *(undefined1 *)((int)puVar33 + 1) = 0x65;
        *(undefined1 *)((int)puVar33 + 2) = 0x74;
        puVar33[1] = 0;
        *(undefined1 *)((int)puVar33 + 3) = 0x43;
        *(undefined1 *)(puVar33 + 1) = 0x6f;
        *(undefined1 *)((int)puVar33 + 5) = 0x6e;
        *(undefined4 *)((int)puVar33 + 7) = 0;
        *(undefined1 *)((int)puVar33 + 6) = 0x74;
        *(undefined1 *)((int)puVar33 + 7) = 0x65;
        *(undefined1 *)(puVar33 + 2) = 0x78;
        *(undefined1 *)((int)puVar33 + 9) = 0x74;
        *(undefined1 *)((int)puVar33 + 10) = 0;
        local_34._0_2_ = CONCAT11(*(undefined1 *)puVar33,0x14);
        local_34._0_3_ = CONCAT12(*(undefined1 *)((int)puVar33 + 1),(undefined2)local_34);
        local_34 = (undefined1 *)CONCAT13(*(undefined1 *)((int)puVar33 + 2),(undefined3)local_34);
        local_30 = *(uint *)((int)puVar33 + 3);
        local_2c = (char *)(uint)*(uint3 *)((int)puVar33 + 7);
        FUN_00023f74();
        pcVar15 = local_2c;
        puVar23 = local_34;
        puVar33 = (undefined4 *)FUN_000a0398(0x1c);
        *puVar33 = 0;
        puVar33[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        puVar33[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        puVar33[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        *(undefined1 *)puVar33 = 0x28;
        *(undefined1 *)((int)puVar33 + 1) = 0x29;
        *(undefined1 *)((int)puVar33 + 2) = 0x4c;
        *(undefined1 *)((int)puVar33 + 3) = 0x61;
        *(undefined1 *)(puVar33 + 1) = 0x6e;
        *(undefined1 *)((int)puVar33 + 5) = 100;
        *(undefined1 *)((int)puVar33 + 6) = 0x72;
        *(undefined1 *)((int)puVar33 + 7) = 0x6f;
        *(undefined1 *)(puVar33 + 2) = 0x69;
        *(undefined1 *)((int)puVar33 + 9) = 100;
        *(undefined1 *)((int)puVar33 + 10) = 0x2f;
        *(undefined1 *)((int)puVar33 + 0xb) = 99;
        puVar33[3] = 0;
        puVar33[4] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        puVar33[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        puVar33[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        *(undefined1 *)(puVar33 + 3) = 0x6f;
        *(undefined1 *)((int)puVar33 + 0xd) = 0x6e;
        *(undefined1 *)((int)puVar33 + 0xe) = 0x74;
        *(undefined1 *)((int)puVar33 + 0xf) = 0x65;
        *(undefined1 *)(puVar33 + 4) = 0x6e;
        *(undefined1 *)((int)puVar33 + 0x11) = 0x74;
        *(undefined1 *)((int)puVar33 + 0x12) = 0x2f;
        *(undefined1 *)((int)puVar33 + 0x13) = 0x43;
        *(undefined1 *)(puVar33 + 5) = 0x6f;
        *(undefined1 *)((int)puVar33 + 0x15) = 0x6e;
        *(undefined1 *)((int)puVar33 + 0x16) = 0x74;
        *(undefined1 *)((int)puVar33 + 0x17) = 0x65;
        *(undefined1 *)(puVar33 + 6) = 0x78;
        *(undefined1 *)((int)puVar33 + 0x19) = 0x74;
        *(undefined1 *)((int)puVar33 + 0x1a) = 0x3b;
        *(undefined1 *)((int)puVar33 + 0x1b) = 0;
        local_5c = (undefined1 *)FUN_000a0370(0x20);
        *local_5c = *(undefined1 *)puVar33;
        local_5c[1] = *(undefined1 *)((int)puVar33 + 1);
        local_5c[2] = *(undefined1 *)((int)puVar33 + 2);
        local_5c[3] = *(undefined1 *)((int)puVar33 + 3);
        local_5c[4] = *(undefined1 *)(puVar33 + 1);
        local_5c[5] = *(undefined1 *)((int)puVar33 + 5);
        local_5c[6] = *(undefined1 *)((int)puVar33 + 6);
        local_60 = 0x1b;
        local_64 = 0x21;
        local_5c[7] = *(undefined1 *)((int)puVar33 + 7);
        local_5c[8] = *(undefined1 *)(puVar33 + 2);
        local_5c[9] = *(undefined1 *)((int)puVar33 + 9);
        local_5c[10] = *(undefined1 *)((int)puVar33 + 10);
        local_5c[0xb] = *(undefined1 *)((int)puVar33 + 0xb);
        local_5c[0xc] = *(undefined1 *)(puVar33 + 3);
        local_5c[0xd] = *(undefined1 *)((int)puVar33 + 0xd);
        local_5c[0xe] = *(undefined1 *)((int)puVar33 + 0xe);
        local_5c[0xf] = *(undefined1 *)((int)puVar33 + 0xf);
        iVar21 = DAT_0009da38;
        local_5c[0x10] = *(undefined1 *)(puVar33 + 4);
        local_5c[0x11] = *(undefined1 *)((int)puVar33 + 0x11);
        local_5c[0x12] = *(undefined1 *)((int)puVar33 + 0x12);
        local_5c[0x13] = *(undefined1 *)((int)puVar33 + 0x13);
        local_5c[0x14] = *(undefined1 *)(puVar33 + 5);
        local_5c[0x15] = *(undefined1 *)((int)puVar33 + 0x15);
        local_5c[0x16] = *(undefined1 *)((int)puVar33 + 0x16);
        local_5c[0x17] = *(undefined1 *)((int)puVar33 + 0x17);
        local_5c[0x18] = *(undefined1 *)(puVar33 + 6);
        local_5c[0x19] = *(undefined1 *)((int)puVar33 + 0x19);
        uVar1 = *(undefined1 *)((int)puVar33 + 0x1a);
        local_5c[0x1b] = 0;
        local_5c[0x1a] = uVar1;
        FUN_00023f74(puVar33);
        if (((uint)puVar23 & 1) == 0) {
          pcVar15 = (char *)((uint)&local_34 | 1);
        }
        puVar23 = local_5c;
        if ((local_64 & 1) == 0) {
          puVar23 = (undefined1 *)((uint)&local_64 | 1);
        }
        uVar28 = (**(code **)(*piVar34 + 0x1c4))(piVar34,uVar28,pcVar15,puVar23);
        *(undefined4 *)(iVar21 + 0x9d144) = uVar28;
        if ((local_64 & 1) != 0) {
          FUN_00023f68(local_5c,local_64 & 0xfffffffe);
        }
        iVar25 = DAT_0009da3c;
        if (((uint)local_34 & 1) != 0) {
          FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
        }
        if (*(int *)(iVar21 + 0x9d144) == 0) {
          (**(code **)(*piVar34 + 0x44))(piVar34);
        }
        *(undefined1 *)(iVar25 + 0x9d1fc) = 1;
      }
      else {
        FUN_00023f68(local_5c,local_64 & 0xfffffffe);
        if (((uint)local_34 & 1) == 0) goto LAB_0009cec8;
LAB_0009d258:
        FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
        if (*(int *)(iVar21 + 0x9cecc) != 0) goto LAB_0009ced4;
LAB_0009d274:
        iVar21 = (**(code **)(*piVar34 + 0x390))(piVar34);
        if (iVar21 != 0) {
          (**(code **)(*piVar34 + 0x44))(piVar34);
        }
      }
      puVar23 = local_58;
      bVar35 = local_58 != (undefined1 *)0x0;
      local_58 = (undefined1 *)0x0;
      if (bVar35) {
        local_34 = puVar23;
        if (local_40 == (undefined1 **)0x0) goto LAB_0009d9fc;
        (**(code **)(*local_40 + 0x18))(local_40,&local_34);
      }
    }
    if (local_40 == &local_50) {
      iVar21 = 0x10;
    }
    else {
      iVar21 = 0x14;
      if (local_40 == (undefined1 **)0x0) goto LAB_0009d304;
    }
    (**(code **)(*local_40 + iVar21))();
  }
LAB_0009d304:
  pcVar15 = (char *)FUN_00025e6c(DAT_0009da40 + 0x9d310);
  if (*pcVar15 == '\x01') {
    puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da44 + 0x9d328);
    local_7c = (int *)*puVar33;
  }
  else {
    puVar33 = (undefined4 *)FUN_00025e6c(DAT_0009da48 + 0x9d960);
    local_7c = (int *)FUN_00076fc0();
    iVar21 = DAT_0009da4c + 0x9d97c;
    *puVar33 = local_7c;
    puVar23 = (undefined1 *)FUN_00025e6c(iVar21);
    *puVar23 = 1;
  }
  FUN_0009f240(&local_58);
  pcVar15 = (char *)FUN_000a0398(0x2a);
  uVar28 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uVar12 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uVar13 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  pcVar15[0] = '\0';
  pcVar15[1] = '\0';
  pcVar15[2] = '\0';
  pcVar15[3] = '\0';
  *(undefined4 *)(pcVar15 + 4) = uVar28;
  *(undefined4 *)(pcVar15 + 8) = uVar12;
  *(undefined4 *)(pcVar15 + 0xc) = uVar13;
  pcVar30 = pcVar15 + 0x10;
  *pcVar15 = '(';
  pcVar15[1] = '[';
  pcVar15[2] = 'B';
  pcVar15[3] = '[';
  pcVar15[4] = 'L';
  pcVar15[5] = 'j';
  pcVar15[6] = 'a';
  pcVar15[7] = 'v';
  pcVar15[8] = 'a';
  pcVar15[9] = '/';
  pcVar15[10] = 'l';
  pcVar15[0xb] = 'a';
  pcVar15[0xc] = 'n';
  pcVar15[0xd] = 'g';
  pcVar15[0xe] = '/';
  pcVar15[0xf] = 'O';
  pcVar30[0] = '\0';
  pcVar30[1] = '\0';
  pcVar30[2] = '\0';
  pcVar30[3] = '\0';
  *(undefined4 *)(pcVar15 + 0x14) = uVar28;
  *(undefined4 *)(pcVar15 + 0x18) = uVar12;
  *(undefined4 *)(pcVar15 + 0x1c) = uVar13;
  *pcVar30 = 'b';
  pcVar15[0x11] = 'j';
  pcVar15[0x12] = 'e';
  pcVar15[0x13] = 'c';
  pcVar15[0x14] = 't';
  pcVar15[0x15] = ';';
  pcVar15[0x16] = ')';
  pcVar15[0x17] = 'L';
  pcVar15[0x1a] = '\0';
  pcVar15[0x1b] = '\0';
  pcVar15[0x1c] = '\0';
  pcVar15[0x1d] = '\0';
  *(undefined4 *)(pcVar15 + 0x1e) = uVar28;
  *(undefined4 *)(pcVar15 + 0x22) = uVar12;
  *(undefined4 *)(pcVar15 + 0x26) = uVar13;
  pcVar15[0x18] = 'j';
  pcVar15[0x19] = 'a';
  pcVar15[0x1a] = 'v';
  pcVar15[0x1b] = 'a';
  pcVar15[0x1c] = '/';
  pcVar15[0x1d] = 'l';
  pcVar15[0x1e] = 'a';
  pcVar15[0x1f] = 'n';
  pcVar15[0x20] = 'g';
  pcVar15[0x21] = '/';
  pcVar15[0x22] = 'O';
  pcVar15[0x23] = 'b';
  pcVar15[0x24] = 'j';
  pcVar15[0x25] = 'e';
  pcVar15[0x26] = 'c';
  pcVar15[0x27] = 't';
  pcVar15[0x28] = ';';
  pcVar15[0x29] = '\0';
  __s = (char *)FUN_000a0370(0x30);
  cVar6 = pcVar15[1];
  *__s = *pcVar15;
  cVar7 = pcVar15[2];
  __s[1] = cVar6;
  cVar6 = pcVar15[3];
  __s[2] = cVar7;
  cVar7 = pcVar15[4];
  __s[3] = cVar6;
  cVar6 = pcVar15[5];
  __s[4] = cVar7;
  cVar7 = pcVar15[6];
  __s[5] = cVar6;
  cVar6 = pcVar15[7];
  __s[6] = cVar7;
  cVar7 = pcVar15[8];
  __s[7] = cVar6;
  cVar6 = pcVar15[9];
  __s[8] = cVar7;
  cVar7 = pcVar15[10];
  __s[9] = cVar6;
  cVar6 = pcVar15[0xb];
  __s[10] = cVar7;
  cVar7 = pcVar15[0xc];
  __s[0xb] = cVar6;
  cVar6 = pcVar15[0xd];
  __s[0xc] = cVar7;
  cVar7 = pcVar15[0xe];
  __s[0xd] = cVar6;
  cVar6 = pcVar15[0xf];
  cVar9 = *pcVar30;
  __s[0xe] = cVar7;
  cVar7 = pcVar15[0x11];
  __s[0xf] = cVar6;
  cVar6 = pcVar15[0x12];
  __s[0x10] = cVar9;
  cVar9 = pcVar15[0x13];
  __s[0x11] = cVar7;
  cVar7 = pcVar15[0x14];
  __s[0x12] = cVar6;
  cVar6 = pcVar15[0x15];
  __s[0x13] = cVar9;
  cVar9 = pcVar15[0x16];
  __s[0x14] = cVar7;
  cVar7 = pcVar15[0x17];
  __s[0x15] = cVar6;
  cVar6 = pcVar15[0x18];
  __s[0x16] = cVar9;
  cVar9 = pcVar15[0x19];
  __s[0x17] = cVar7;
  cVar7 = pcVar15[0x1a];
  cVar10 = pcVar15[0x1b];
  __s[0x18] = cVar6;
  cVar6 = pcVar15[0x1c];
  __s[0x19] = cVar9;
  cVar9 = pcVar15[0x1d];
  __s[0x1a] = cVar7;
  cVar7 = pcVar15[0x1e];
  __s[0x1b] = cVar10;
  cVar10 = pcVar15[0x1f];
  cVar11 = pcVar15[0x20];
  __s[0x1c] = cVar6;
  cVar6 = pcVar15[0x21];
  __s[0x1d] = cVar9;
  cVar9 = pcVar15[0x22];
  __s[0x1e] = cVar7;
  cVar7 = pcVar15[0x23];
  __s[0x1f] = cVar10;
  cVar10 = pcVar15[0x24];
  __s[0x20] = cVar11;
  cVar11 = pcVar15[0x25];
  __s[0x21] = cVar6;
  cVar6 = pcVar15[0x26];
  __s[0x22] = cVar9;
  cVar9 = pcVar15[0x27];
  __s[0x23] = cVar7;
  __s[0x28] = pcVar15[0x28];
  __s[0x24] = cVar10;
  __s[0x25] = cVar11;
  __s[0x26] = cVar6;
  __s[0x27] = cVar9;
  __s[0x29] = '\0';
  FUN_00023f74(pcVar15);
  sVar22 = strlen(__s);
  if (0xfffffff7 < sVar22) goto LAB_0009d9f8;
  if (sVar22 < 0xb) {
    uVar29 = (uint)&local_70 | 1;
    local_70 = CONCAT31(local_70._1_3_,(char)(sVar22 << 1));
    if (sVar22 != 0) goto LAB_0009d634;
  }
  else {
    uVar29 = FUN_000a0370((sVar22 | 7) + 1);
    local_70 = (sVar22 | 7) + 2;
    local_6c = sVar22;
    local_68 = uVar29;
LAB_0009d634:
    __aeabi_memcpy(uVar29,__s,sVar22);
  }
  *(undefined1 *)(uVar29 + sVar22) = 0;
  FUN_00023f68(__s,0x30);
  puVar33 = (undefined4 *)FUN_000a0398(10);
  *puVar33 = 0;
  *(undefined1 *)puVar33 = 0x65;
  *(undefined1 *)((int)puVar33 + 1) = 0x78;
  puVar33[1] = 0;
  *(undefined1 *)((int)puVar33 + 2) = 0x65;
  *(undefined1 *)((int)puVar33 + 3) = 99;
  *(undefined1 *)(puVar33 + 1) = 0x75;
  *(undefined1 *)((int)puVar33 + 5) = 0x74;
  *(undefined1 *)((int)puVar33 + 6) = 0x65;
  *(undefined2 *)(puVar33 + 2) = 0;
  *(undefined1 *)((int)puVar33 + 7) = 0x56;
  *(undefined1 *)(puVar33 + 2) = 0x4d;
  *(undefined1 *)((int)puVar33 + 9) = 0;
  local_34._0_2_ = CONCAT11(*(undefined1 *)puVar33,0x12);
  local_30 = *(uint *)((int)puVar33 + 3);
  local_34._0_3_ = CONCAT12(*(undefined1 *)((int)puVar33 + 1),(undefined2)local_34);
  local_34 = (undefined1 *)CONCAT13(*(undefined1 *)((int)puVar33 + 2),(undefined3)local_34);
  local_2c = (char *)(CONCAT22((short)((uint)local_2c >> 0x10),*(undefined2 *)((int)puVar33 + 7)) &
                     0xff00ffff);
  FUN_00023f74();
  pcVar15 = local_2c;
  if (((uint)local_34 & 1) == 0) {
    pcVar15 = (char *)((uint)&local_34 | 1);
  }
  sVar22 = strlen(pcVar15);
  if (0xfffffff7 < sVar22) {
LAB_0009d9f8:
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar22 < 0xb) {
    local_64 = CONCAT31(local_64._1_3_,(char)(sVar22 << 1));
    puVar23 = (undefined1 *)((uint)&local_64 | 1);
    if (sVar22 != 0) goto LAB_0009d774;
  }
  else {
    puVar23 = (undefined1 *)FUN_000a0370((sVar22 | 7) + 1);
    local_64 = (sVar22 | 7) + 2;
    local_60 = sVar22;
    local_5c = puVar23;
LAB_0009d774:
    __aeabi_memmove(puVar23,pcVar15,sVar22);
  }
  puVar23[sVar22] = 0;
  if (((uint)local_34 & 1) != 0) {
    FUN_00023f68(local_2c,(uint)local_34 & 0xfffffffe);
  }
  local_2c = (char *)(DAT_0009da50 + 0x9d7bc);
  local_34 = local_5c;
  if ((local_64 & 1) == 0) {
    local_34 = (undefined1 *)((uint)&local_64 | 1);
  }
  local_30 = local_68;
  if ((local_70 & 1) == 0) {
    local_30 = (uint)&local_70 | 1;
  }
  (**(code **)(*local_7c + 0x35c))(local_7c,local_58,&local_34,1);
  if ((local_64 & 1) != 0) {
    FUN_00023f68(local_5c,local_64 & 0xfffffffe);
  }
  iVar21 = DAT_0009da54;
  if ((local_70 & 1) != 0) {
    FUN_00023f68(local_68,local_70 & 0xfffffffe);
  }
  puVar23 = local_58;
  local_58 = (undefined1 *)0x0;
  if (puVar23 != (undefined1 *)0x0) {
    local_34 = puVar23;
    if (local_40 == (undefined1 **)0x0) {
LAB_0009d9fc:
      local_58 = (undefined1 *)0x0;
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_40 + 0x18))(local_40,&local_34);
  }
  if (local_40 == &local_50) {
    iVar25 = 0x10;
LAB_0009d89c:
    (**(code **)(*local_40 + iVar25))();
  }
  else {
    iVar25 = 0x14;
    if (local_40 != (undefined1 **)0x0) goto LAB_0009d89c;
  }
  *(undefined1 *)(iVar21 + 0x9d833) = 1;
LAB_0009d8b0:
  (**(code **)(*piVar32 + 0x10))(piVar32);
  FUN_0001ae3c(iVar27);
  if (**(int **)(DAT_0009da58 + 0x9d8dc) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_28);
  }
  return;
}




// ============================================================
// Function #688
// Name: JNI_OnUnload
// Address: 0009da5c
// JNI: NO
// ============================================================


void JNI_OnUnload(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  char *pcVar4;
  undefined4 *puVar5;
  undefined1 *puVar6;
  int iVar7;
  undefined4 uVar8;
  int *piVar9;
  char *pcVar10;
  int iVar11;
  undefined4 *puVar12;
  
  iVar1 = DAT_0009ddd0;
  puVar12 = (undefined4 *)(DAT_0009ddd0 + 0x9da6c);
  iVar11 = DAT_0009ddd0 + 0x9da74;
  FUN_0001ae24(iVar11);
  iVar2 = DAT_0009ddd4;
  pcVar10 = (char *)(DAT_0009ddd4 + 0x9da80);
  if (*(char *)(DAT_0009ddd4 + 0x9da83) == '\x01') {
    pcVar4 = (char *)FUN_00025e6c(DAT_0009ddd8 + 0x9da94);
    if (*pcVar4 == '\x01') {
      puVar5 = (undefined4 *)FUN_00025e6c(DAT_0009dddc + 0x9daac);
      piVar9 = (int *)*puVar5;
    }
    else {
      puVar5 = (undefined4 *)FUN_00025e6c(DAT_0009dde0 + 0x9dd38);
      piVar9 = (int *)FUN_00076fc0();
      iVar3 = DAT_0009dde4;
      *puVar5 = piVar9;
      puVar6 = (undefined1 *)FUN_00025e6c(iVar3 + 0x9dd54);
      *puVar6 = 1;
    }
    iVar3 = DAT_0009dde8;
    puVar5 = (undefined4 *)(DAT_0009dde8 + 0x9dac0);
    iVar7 = *(int *)(DAT_0009dde8 + 0x9db18);
    *(undefined4 *)(DAT_0009dde8 + 0x9db24) = 0;
    *(undefined4 *)(iVar3 + 0x9db28) = 0;
    *(undefined4 *)(iVar3 + 0x9db2c) = 0;
    *(undefined4 *)(iVar3 + 0x9db30) = 0;
    *(undefined4 *)(iVar3 + 0x9db34) = 0;
    *(undefined4 *)(iVar3 + 0x9db1c) = 0;
    *(undefined4 *)(iVar3 + 0x9db04) = 0;
    *(undefined4 *)(iVar3 + 0x9db08) = 0;
    *(undefined4 *)(iVar3 + 0x9db0c) = 0;
    *(undefined4 *)(iVar3 + 0x9db10) = 0;
    *(undefined4 *)(iVar3 + 0x9db14) = 0;
    *(undefined4 *)(iVar3 + 0x9dae4) = 0;
    *(undefined4 *)(iVar3 + 0x9dae8) = 0;
    *(undefined4 *)(iVar3 + 0x9daec) = 0;
    *(undefined4 *)(iVar3 + 0x9daf0) = 0;
    *(undefined4 *)(iVar3 + 0x9daf4) = 0;
    *(undefined4 *)(iVar3 + 0x9daf8) = 0;
    *(undefined4 *)(iVar3 + 0x9dafc) = 0;
    *(undefined4 *)(iVar3 + 0x9db00) = 0;
    if (iVar7 != 0) {
      (**(code **)(*piVar9 + 0x58))(piVar9);
      *(undefined4 *)(iVar3 + 0x9db18) = 0;
    }
    if (*(int *)(iVar3 + 0x9db20) != 0) {
      (**(code **)(*piVar9 + 0x58))(piVar9);
      *(undefined4 *)(iVar3 + 0x9db20) = 0;
    }
    iVar7 = *(int *)(iVar1 + 0x9da70);
    *(undefined4 *)(iVar3 + 0x9db38) = 0;
    *(undefined1 *)(iVar2 + 0x9da81) = 0;
    *puVar12 = 0;
    if (iVar7 != 0) {
      (**(code **)(*piVar9 + 0x58))(piVar9);
      *(undefined4 *)(iVar1 + 0x9da70) = 0;
    }
    *(undefined1 *)(iVar2 + 0x9da82) = 0;
    if (*(char *)(iVar2 + 0x9da84) == '\x01') {
      pcVar4 = (char *)FUN_00025e6c(DAT_0009ddec + 0x9db98);
      if (*pcVar4 == '\x01') {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009ddf0 + 0x9dbb0);
        piVar9 = (int *)*puVar12;
      }
      else {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009ddf4 + 0x9dd6c);
        piVar9 = (int *)FUN_00076fc0();
        iVar7 = DAT_0009ddf8;
        *puVar12 = piVar9;
        puVar6 = (undefined1 *)FUN_00025e6c(iVar7 + 0x9dd88);
        *puVar6 = 1;
      }
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar1 + 0x9da78));
      *(undefined4 *)(iVar1 + 0x9da80) = 0;
      *(undefined4 *)(iVar1 + 0x9da78) = 0;
      *(undefined1 *)(iVar2 + 0x9da84) = 0;
    }
    if (*pcVar10 == '\x01') {
      pcVar4 = (char *)FUN_00025e6c(DAT_0009ddfc + 0x9dbec);
      if (*pcVar4 == '\x01') {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009de00 + 0x9dc04);
        piVar9 = (int *)*puVar12;
      }
      else {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009de04 + 0x9dda8);
        piVar9 = (int *)FUN_00076fc0();
        iVar1 = DAT_0009de08;
        *puVar12 = piVar9;
        puVar6 = (undefined1 *)FUN_00025e6c(iVar1 + 0x9ddc4);
        *puVar6 = 1;
      }
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9daf4));
      uVar8 = *(undefined4 *)(iVar3 + 0x9dad0);
      *(undefined4 *)(iVar2 + 0x9daf4) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,uVar8);
      *(undefined4 *)(iVar3 + 0x9dad0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar3 + 0x9dac4));
      *(undefined4 *)(iVar3 + 0x9dac4) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dac0));
      *(undefined4 *)(iVar2 + 0x9dac0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9daec));
      *(undefined4 *)(iVar2 + 0x9daec) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dae0));
      *(undefined4 *)(iVar2 + 0x9dae0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dad0));
      *(undefined4 *)(iVar2 + 0x9dad0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dae8));
      *(undefined4 *)(iVar3 + 0x9dac8) = 0;
      *(undefined4 *)(iVar3 + 0x9dacc) = 0;
      *puVar5 = 0;
      *(undefined4 *)(iVar2 + 0x9dae4) = 0;
      *(undefined4 *)(iVar2 + 0x9dae8) = 0;
      *(undefined4 *)(iVar2 + 0x9dad4) = 0;
      *(undefined4 *)(iVar2 + 0x9dad8) = 0;
      *(undefined4 *)(iVar2 + 0x9dadc) = 0;
      *(undefined4 *)(iVar2 + 0x9daf0) = 0;
      *(undefined4 *)(iVar2 + 0x9daf8) = 0;
      *(undefined4 *)(iVar2 + 0x9dac4) = 0;
      *(undefined4 *)(iVar2 + 0x9dac8) = 0;
      *(undefined4 *)(iVar2 + 0x9dacc) = 0;
      *(undefined4 *)(iVar2 + 0x9dab8) = 0;
      *(undefined4 *)(iVar2 + 0x9dabc) = 0;
      *(undefined4 *)(iVar3 + 0x9dad4) = 0;
      *(undefined4 *)(iVar3 + 0x9dad8) = 0;
      *pcVar10 = '\0';
    }
    *(undefined4 *)(iVar3 + 0x9dadc) = 0;
    *(undefined4 *)(iVar3 + 0x9dae0) = 0;
    *(undefined1 *)(iVar2 + 0x9da83) = 0;
  }
  FUN_0001ae3c(iVar11);
  return;
}




// ============================================================
// Function #689
// Name: FUN_0009de18
// Address: 0009de18
// JNI: NO
// ============================================================


void FUN_0009de18(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0009de40 + DAT_0009de40;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #690
// Name: FUN_0009de44
// Address: 0009de44
// JNI: NO
// ============================================================


void FUN_0009de44(int param_1,int *param_2)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + 4);
  *param_2 = (int)&DAT_0009de5c + DAT_0009de5c;
  param_2[1] = iVar1;
  return;
}




// ============================================================
// Function #691
// Name: FUN_0009de60
// Address: 0009de60
// JNI: NO
// ============================================================


void FUN_0009de60(void)

{
  return;
}




// ============================================================
// Function #692
// Name: FUN_0009de64
// Address: 0009de64
// JNI: NO
// ============================================================


void FUN_0009de64(undefined4 param_1)

{
  FUN_00023f68(param_1,8);
  return;
}




// ============================================================
// Function #693
// Name: FUN_0009de6c
// Address: 0009de6c
// JNI: NO
// ============================================================


void FUN_0009de6c(int param_1,int *param_2)

{
  if (*param_2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0009de84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 4) + 0x5c))();
  return;
}




// ============================================================
// Function #694
// Name: FUN_0009de88
// Address: 0009de88
// JNI: NO
// ============================================================


/* WARNING: Type propagation algorithm not settling */

void FUN_0009de88(int *param_1,int *param_2,int *param_3,int *param_4,uint param_5,int *param_6)

{
  uint uVar1;
  undefined4 *puVar2;
  uint *puVar3;
  uint *puVar4;
  uint uVar5;
  int iVar6;
  undefined1 uVar7;
  uint extraout_r1;
  int iVar8;
  undefined4 *puVar9;
  uint uVar10;
  uint uVar11;
  uint *puVar12;
  byte *pbVar13;
  uint *puVar14;
  undefined4 *puVar15;
  undefined4 uVar16;
  uint uVar17;
  ushort *puVar18;
  uint *puVar19;
  undefined4 *puVar20;
  int iVar21;
  byte *pbVar22;
  uint *puVar23;
  uint *puVar24;
  int local_8c;
  uint *local_80;
  uint local_54;
  uint local_50;
  uint local_4c [2];
  int local_44;
  uint local_40 [2];
  uint local_38;
  uint local_34 [2];
  uint local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0009eb1c + 0x9deb4);
  FUN_000732f8(local_4c,*(undefined4 *)*param_6,((undefined4 *)*param_6)[1],param_6[0xf]);
  puVar20 = (undefined4 *)0x0;
  pbVar13 = (byte *)(local_44 + 1);
  if ((local_4c[0] & 1) == 0) {
    pbVar13 = (byte *)((uint)local_4c | 2);
  }
  puVar15 = (undefined4 *)0x0;
  puVar2 = (undefined4 *)0x0;
LAB_0009df14:
  puVar9 = puVar2;
  pbVar22 = pbVar13;
  puVar2 = puVar9;
  if (*pbVar22 == 0x5b) {
    uVar1 = pbVar22[1] - 0x42;
    if (uVar1 < 0x1a) goto code_r0x0009df38;
    goto switchD_0009df7c_caseD_2a;
  }
  switch(*pbVar22) {
  case 0x29:
    local_8c = 0x55;
    uVar1 = pbVar22[1] - 0x42 & 0xff;
    if (uVar1 < 0x1a) {
      local_8c = *(int *)(DAT_0009eb20 + 0x9e2b0 + uVar1 * 4);
    }
switchD_0009df7c_caseD_2a:
    puVar23 = (uint *)0x0;
    iVar21 = *param_3;
    puVar18 = (ushort *)(iVar21 + param_5);
    param_5 = *puVar18 ^ param_5;
    if ((param_5 & 0xffff) == 0xffff) {
      puVar3 = (uint *)0x0;
      local_80 = (uint *)0x0;
      puVar19 = (uint *)0x0;
      uVar1 = 0;
    }
    else {
      if (-1 < (short)param_5) {
LAB_0009eb18:
                    /* WARNING: Subroutine does not return */
        FUN_00026950();
      }
      local_54 = (uint)(short)~param_5;
      iVar6 = local_54 * 4;
      puVar3 = (uint *)FUN_000a0370(iVar6);
      __aeabi_memclr4(puVar3,iVar6);
      uVar1 = 0;
      uVar10 = param_3[1];
      do {
        FUN_000264a4(*(uint *)(puVar18 + uVar1 * 2 + 1) ^ ~uVar10,uVar10);
        puVar3[uVar1] = extraout_r1;
        uVar1 = uVar1 + 1;
      } while ((~param_5 & 0xffff) != uVar1);
      puVar23 = (uint *)0x0;
      local_80 = puVar3 + local_54;
      puVar19 = (uint *)0x0;
      uVar1 = iVar6 >> 2;
      if (iVar6 != 0) {
        if (0x1fffffff < uVar1) {
LAB_0009eb0c:
          FUN_0009eb28();
          goto LAB_0009eb10;
        }
        puVar23 = (uint *)FUN_000a0370(local_54 << 3);
        puVar19 = puVar23 + uVar1 * 2;
      }
    }
    uVar10 = (int)puVar15 - (int)puVar9 >> 2;
    puVar4 = puVar23;
    if (uVar10 + 1 == uVar1) {
      uVar1 = *(uint *)(*param_4 + (~((uint)*(ushort *)(iVar21 + *puVar3) ^ *puVar3) & 0xffff) * 8);
      if (puVar23 < puVar19) {
        *puVar23 = uVar1;
        iVar21 = 1;
      }
      else {
        uVar11 = (int)puVar19 - (int)puVar23;
        iVar21 = 1;
        uVar5 = 1;
        if (1 < (uint)((int)uVar11 >> 2)) {
          uVar5 = (int)uVar11 >> 2;
        }
        if (0x7ffffff7 < uVar11) {
          uVar5 = 0x1fffffff;
        }
        if (0x1fffffff < uVar5) {
LAB_0009eb10:
                    /* WARNING: Subroutine does not return */
          FUN_00026984();
        }
        puVar4 = (uint *)FUN_000a0370(uVar5 << 3);
        *puVar4 = uVar1;
        puVar19 = puVar4 + uVar5 * 2;
        if (puVar23 != (uint *)0x0) {
          FUN_00023f68(puVar23,uVar11);
        }
      }
joined_r0x0009e480:
      puVar23 = puVar4;
      puVar4 = puVar23 + 2;
      if (puVar15 != puVar9) {
        if (uVar10 < 2) {
          uVar10 = 1;
        }
        uVar1 = 0;
        local_50 = 0;
        puVar14 = puVar3 + iVar21;
        puVar24 = puVar23;
LAB_0009e554:
        do {
          uVar5 = *puVar14;
          uVar11 = 0;
          switch(*puVar2) {
          case 0x42:
            uVar11 = (uint)*(byte *)(*param_3 + uVar5);
            break;
          case 0x43:
          case 0x53:
            uVar11 = (uint)*(ushort *)(*param_3 + uVar5);
            uVar1 = (uint)(*(ushort *)(*param_3 + uVar5) >> 8);
            break;
          case 0x44:
          case 0x4a:
            uVar11 = *(uint *)(*param_3 + uVar5);
            local_54 = ((uint *)(*param_3 + uVar5))[1];
            goto LAB_0009e654;
          case 0x45:
          case 0x47:
          case 0x48:
          case 0x4b:
          case 0x4d:
          case 0x4e:
          case 0x4f:
          case 0x50:
          case 0x51:
          case 0x52:
          case 0x54:
          case 0x55:
          case 0x56:
          case 0x57:
          case 0x58:
          case 0x59:
            break;
          case 0x46:
          case 0x49:
            uVar11 = *(uint *)(*param_3 + uVar5);
            goto LAB_0009e654;
          case 0x4c:
            uVar11 = *(uint *)(*param_4 + (~(*(ushort *)(*param_3 + uVar5) ^ uVar5) & 0xffff) * 8);
LAB_0009e654:
            local_50 = uVar11 >> 0x10;
            uVar1 = (uVar11 & 0xffff) >> 8;
            break;
          case 0x5a:
            uVar11 = (uint)(*(int *)(*param_3 + uVar5) != 0);
            break;
          default:
            uVar11 = 0;
          }
          if (puVar19 <= puVar4) {
            iVar21 = (int)puVar4 - (int)puVar24 >> 3;
            uVar5 = iVar21 + 1;
            if (0x1fffffff < uVar5) goto LAB_0009eb0c;
            uVar17 = (int)puVar19 - (int)puVar24;
            if (uVar5 < (uint)((int)uVar17 >> 2)) {
              uVar5 = (int)uVar17 >> 2;
            }
            if (0x7ffffff7 < uVar17) {
              uVar5 = 0x1fffffff;
            }
            if (uVar5 == 0) {
              puVar23 = (uint *)0x0;
            }
            else {
              if (0x1fffffff < uVar5) goto LAB_0009eb10;
              puVar23 = (uint *)FUN_000a0370(uVar5 << 3);
            }
            puVar12 = puVar23 + iVar21 * 2;
            *puVar12 = uVar11 & 0xff | uVar1 << 8 | local_50 << 0x10;
            puVar12[1] = local_54;
            __aeabi_memcpy(puVar23,puVar24,(int)puVar4 - (int)puVar24);
            puVar19 = puVar23 + uVar5 * 2;
            puVar4 = puVar12 + 2;
            if (puVar24 != (uint *)0x0) {
              FUN_00023f68(puVar24,uVar17);
            }
            uVar10 = uVar10 - 1;
            puVar2 = puVar2 + 1;
            puVar14 = puVar14 + 1;
            puVar24 = puVar23;
            if (uVar10 == 0) break;
            goto LAB_0009e554;
          }
          *puVar4 = uVar11 & 0xff | uVar1 << 8 | local_50 << 0x10;
          puVar4[1] = local_54;
          puVar4 = puVar4 + 2;
          uVar10 = uVar10 - 1;
          puVar2 = puVar2 + 1;
          puVar14 = puVar14 + 1;
          puVar23 = puVar24;
        } while (uVar10 != 0);
      }
      iVar21 = *(int *)(*(int *)*param_6 + param_6[0x10]);
      if (iVar21 == 0) {
        iVar6 = FUN_0009eea8(param_6 + 2,param_2);
        if (iVar6 == 0) goto LAB_0009ea74;
        if (param_6[0x11] == 0) {
          FUN_000732f8(local_34,*(undefined4 *)*param_6,((undefined4 *)*param_6)[1],param_6[0xe]);
          uVar10 = local_2c;
          uVar1 = local_34[0];
          FUN_000732f8(local_40,*(undefined4 *)*param_6,((undefined4 *)*param_6)[1],param_6[0xf]);
          if ((uVar1 & 1) == 0) {
            uVar10 = (uint)local_34 | 1;
          }
          uVar1 = local_38;
          if ((local_40[0] & 1) == 0) {
            uVar1 = (uint)local_40 | 1;
          }
          iVar21 = (**(code **)(*param_2 + 0x84))(param_2,iVar6,uVar10,uVar1);
          if ((local_40[0] & 1) != 0) {
            FUN_00023f68(local_38,local_40[0] & 0xfffffffe);
          }
          if ((local_34[0] & 1) != 0) {
            FUN_00023f68(local_2c,local_34[0] & 0xfffffffe);
          }
        }
        else {
          iVar21 = 0;
          if (param_6[0x11] == 1) {
            FUN_000732f8(local_34,*(undefined4 *)*param_6,((undefined4 *)*param_6)[1],param_6[0xe]);
            uVar10 = local_2c;
            uVar1 = local_34[0];
            FUN_000732f8(local_40,*(undefined4 *)*param_6,((undefined4 *)*param_6)[1],param_6[0xf]);
            if ((uVar1 & 1) == 0) {
              uVar10 = (uint)local_34 | 1;
            }
            uVar1 = local_38;
            if ((local_40[0] & 1) == 0) {
              uVar1 = (uint)local_40 | 1;
            }
            iVar21 = (**(code **)(*param_2 + 0x1c4))(param_2,iVar6,uVar10,uVar1);
            if ((local_40[0] & 1) != 0) {
              FUN_00023f68(local_38,local_40[0] & 0xfffffffe);
            }
            if ((local_34[0] & 1) != 0) {
              FUN_00023f68(local_2c,local_34[0] & 0xfffffffe);
            }
          }
        }
        iVar8 = param_6[0x10];
        iVar6 = *(int *)*param_6;
        *(int *)(iVar6 + iVar8) = iVar21;
        ((int *)(iVar6 + iVar8))[1] = 0;
      }
      if (iVar21 != 0) {
        *(undefined1 *)(param_1 + 8) = 1;
        param_1[4] = (int)puVar9;
        param_1[5] = (int)puVar15;
        param_1[6] = (int)puVar20;
        puVar20 = (undefined4 *)0x0;
        *param_1 = iVar21;
        param_1[1] = (int)puVar23;
        param_1[2] = (int)puVar4;
        param_1[3] = (int)puVar19;
        param_1[7] = local_8c;
        puVar9 = (undefined4 *)0x0;
        goto LAB_0009ea9c;
      }
    }
    else {
      uVar1 = FUN_0009eea8(param_6 + 2,param_2);
      if (uVar1 != 0) {
        if (puVar23 < puVar19) {
          *puVar23 = uVar1;
          iVar21 = 0;
        }
        else {
          uVar11 = (int)puVar19 - (int)puVar23;
          uVar5 = 1;
          if (1 < (uint)((int)uVar11 >> 2)) {
            uVar5 = (int)uVar11 >> 2;
          }
          if (0x7ffffff7 < uVar11) {
            uVar5 = 0x1fffffff;
          }
          if (0x1fffffff < uVar5) goto LAB_0009eb10;
          puVar4 = (uint *)FUN_000a0370(uVar5 << 3);
          *puVar4 = uVar1;
          iVar21 = 0;
          puVar19 = puVar4 + uVar5 * 2;
          if (puVar23 != (uint *)0x0) {
            FUN_00023f68(puVar23,uVar11);
          }
        }
        goto joined_r0x0009e480;
      }
    }
LAB_0009ea74:
    *(undefined1 *)(param_1 + 8) = 0;
    *(undefined1 *)param_1 = 0;
    if (puVar23 != (uint *)0x0) {
      FUN_00023f68(puVar23,(int)puVar19 - (int)puVar23);
    }
LAB_0009ea9c:
    if (puVar3 != (uint *)0x0) {
      FUN_00023f68(puVar3,(int)local_80 - (int)puVar3);
    }
    if (puVar9 != (undefined4 *)0x0) {
      FUN_00023f68(puVar9,(int)puVar20 - (int)puVar9);
    }
    if ((local_4c[0] & 1) != 0) {
      FUN_00023f68(local_44,local_4c[0] & 0xfffffffe);
    }
    if (**(int **)(DAT_0009eb24 + 0x9eaf8) == local_28) {
      return;
    }
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  default:
    goto switchD_0009df7c_caseD_2a;
  case 0x42:
    uVar16 = 0x42;
    uVar7 = false;
    break;
  case 0x43:
    uVar16 = 0x43;
    uVar7 = false;
    break;
  case 0x44:
    uVar16 = 0x44;
    goto joined_r0x0009e0b8;
  case 0x46:
    uVar16 = 0x46;
    goto joined_r0x0009e0b8;
  case 0x49:
    uVar16 = 0x49;
    goto joined_r0x0009e0b8;
  case 0x4a:
    uVar16 = 0x4a;
joined_r0x0009e0b8:
    uVar7 = false;
    break;
  case 0x4c:
    uVar16 = 0x4c;
    uVar7 = true;
    break;
  case 0x53:
    uVar16 = 0x53;
    goto joined_r0x0009e0e0;
  case 0x56:
    uVar16 = 0x56;
joined_r0x0009e0e0:
    uVar7 = false;
    break;
  case 0x5a:
    uVar16 = 0x5a;
    uVar7 = false;
  }
  if (puVar20 <= puVar15) {
    iVar6 = (int)puVar15 - (int)puVar9;
    iVar21 = iVar6 >> 2;
    uVar1 = iVar21 + 1;
    if (0x3fffffff < uVar1) goto LAB_0009eb14;
    uVar10 = (int)puVar20 - (int)puVar9;
    if (uVar1 < (uint)((int)uVar10 >> 1)) {
      uVar1 = (int)uVar10 >> 1;
    }
    if (0x7ffffffb < uVar10) {
      uVar1 = 0x3fffffff;
    }
    if (uVar1 == 0) {
      puVar2 = (undefined4 *)0x0;
    }
    else {
      if (0x3fffffff < uVar1) goto LAB_0009eb10;
      puVar2 = (undefined4 *)FUN_000a0370(uVar1 << 2);
    }
    puVar15 = puVar2 + iVar21;
    *puVar15 = uVar16;
    __aeabi_memcpy(puVar2,puVar9,iVar6);
    puVar20 = puVar2 + uVar1;
    if (puVar9 != (undefined4 *)0x0) {
      FUN_00023f68(puVar9,uVar10);
    }
    goto joined_r0x0009e1c8;
  }
  *puVar15 = uVar16;
joined_r0x0009e1c8:
  puVar15 = (undefined4 *)((int)puVar15 + 4);
  if ((bool)uVar7) {
    pbVar22 = pbVar22 + -1;
    do {
      pbVar22 = pbVar22 + 1;
    } while (*pbVar22 != 0x3b);
  }
  pbVar13 = pbVar22 + 1;
  goto LAB_0009df14;
code_r0x0009df38:
  pbVar13 = pbVar22 + 1;
  if ((1 << (uVar1 & 0xff) & 0x2000400U) == 0) {
    if ((1 << (uVar1 & 0xff) & 0x1120197U) == 0) goto switchD_0009df7c_caseD_2a;
    pbVar13 = pbVar22 + 2;
    if (puVar15 < puVar20) {
      *puVar15 = 0x4c;
      puVar15 = puVar15 + 1;
    }
    else {
      iVar21 = (int)puVar15 - (int)puVar9 >> 2;
      uVar1 = iVar21 + 1;
      if (0x3fffffff < uVar1) {
LAB_0009eb14:
        FUN_00026974();
        goto LAB_0009eb18;
      }
      uVar10 = (int)puVar20 - (int)puVar9;
      if (uVar1 < (uint)((int)uVar10 >> 1)) {
        uVar1 = (int)uVar10 >> 1;
      }
      if (0x7ffffffb < uVar10) {
        uVar1 = 0x3fffffff;
      }
      if (uVar1 == 0) {
        puVar2 = (undefined4 *)0x0;
      }
      else {
        if (0x3fffffff < uVar1) goto LAB_0009eb10;
        puVar2 = (undefined4 *)FUN_000a0370(uVar1 << 2);
      }
      puVar2[iVar21] = 0x4c;
      __aeabi_memcpy(puVar2,puVar9,(int)puVar15 - (int)puVar9);
      puVar15 = puVar2 + iVar21 + 1;
      puVar20 = puVar2 + uVar1;
      if (puVar9 != (undefined4 *)0x0) {
        FUN_00023f68(puVar9,uVar10);
      }
    }
  }
  goto LAB_0009df14;
}




// ============================================================
// Function #695
// Name: FUN_0009eb28
// Address: 0009eb28
// JNI: NO
// ============================================================


void FUN_0009eb28(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0009eb34 + DAT_0009eb34);
}




// ============================================================
// Function #696
// Name: FUN_0009eb38
// Address: 0009eb38
// JNI: NO
// ============================================================


int * FUN_0009eb38(int *param_1,int *param_2,int param_3,int param_4)

{
  int *piVar1;
  int *piVar2;
  int *piVar3;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int extraout_r1_02;
  int extraout_r1_03;
  int extraout_r1_04;
  int extraout_r1_05;
  int extraout_r1_06;
  int extraout_r1_07;
  int extraout_r1_08;
  int iVar4;
  uint uVar5;
  int iVar6;
  uint uVar7;
  uint *puVar8;
  uint uVar9;
  
  iVar6 = *param_2;
  uVar9 = param_2[1];
  uVar5 = *(uint *)(iVar6 + param_3);
  piVar1 = (int *)FUN_000a0370(0x14);
  uVar7 = ~uVar9;
  *piVar1 = 0;
  piVar1[1] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  piVar1[2] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  piVar1[3] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  piVar3 = piVar1 + 4;
  *piVar3 = 0;
  FUN_000264a4(uVar7 ^ uVar5,uVar9);
  puVar8 = (uint *)(iVar6 + extraout_r1);
  FUN_000264a4(*puVar8 ^ uVar7,uVar9);
  *piVar1 = extraout_r1_00;
  FUN_000264a4(puVar8[1] ^ uVar7,uVar9);
  piVar1[1] = extraout_r1_01;
  FUN_000264a4(puVar8[2] ^ uVar7,uVar9);
  piVar1[2] = extraout_r1_02;
  FUN_000264a4(puVar8[3] ^ uVar7,uVar9);
  piVar1[3] = extraout_r1_03;
  uVar5 = puVar8[4];
  param_1[1] = extraout_r1_00;
  FUN_000264a4(uVar5 ^ uVar7,uVar9);
  *param_1 = (int)param_2;
  *piVar3 = extraout_r1_04;
  uVar5 = *(uint *)(iVar6 + extraout_r1_01);
  piVar2 = (int *)FUN_000a0370(0xc);
  *piVar2 = 0;
  piVar2[1] = 0;
  piVar2[2] = 0;
  FUN_000264a4(uVar7 ^ uVar5,uVar9);
  puVar8 = (uint *)(iVar6 + extraout_r1_05);
  FUN_000264a4(*puVar8 ^ uVar7,uVar9);
  *piVar2 = extraout_r1_06;
  FUN_000264a4(puVar8[1] ^ uVar7,uVar9);
  piVar2[1] = extraout_r1_07;
  uVar5 = puVar8[2];
  param_1[4] = extraout_r1_07;
  param_1[6] = 0;
  param_1[0xc] = 0;
  param_1[2] = (int)param_2;
  param_1[3] = extraout_r1_06;
  FUN_000264a4(uVar5 ^ uVar7,uVar9);
  piVar2[2] = extraout_r1_08;
  FUN_00023f68(piVar2,0xc);
  iVar6 = piVar1[3];
  iVar4 = *piVar3;
  param_1[0xe] = piVar1[2];
  param_1[0xf] = iVar6;
  param_1[0x10] = iVar4;
  param_1[0x11] = param_4;
  FUN_00023f68(piVar1,0x14);
  return param_1;
}




// ============================================================
// Function #697
// Name: FUN_0009ecc8
// Address: 0009ecc8
// JNI: NO
// ============================================================


void FUN_0009ecc8(int *param_1,int *param_2)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  code *pcVar6;
  uint local_3c [2];
  uint local_34;
  uint local_30 [2];
  uint local_28;
  int local_24;
  
  local_24 = **(int **)(DAT_0009eea0 + 0x9ece0);
  iVar1 = *(int *)(*(int *)*param_1 + param_1[0x10]);
  if (iVar1 != 0) goto LAB_0009ee7c;
  iVar2 = FUN_0009eea8(param_1 + 2);
  if (iVar2 == 0) {
    iVar1 = 0;
    goto LAB_0009ee7c;
  }
  if (param_1[0x11] == 1) {
    FUN_000732f8(local_3c,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xe]);
    FUN_000732f8(local_30,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xf]);
    uVar3 = local_34;
    if ((local_3c[0] & 1) == 0) {
      uVar3 = (uint)local_3c | 1;
    }
    pcVar6 = *(code **)(*param_2 + 0x240);
LAB_0009ee04:
    uVar5 = local_28;
    if (((byte)local_30[0] & 1) == 0) {
      uVar5 = (uint)local_30 | 1;
    }
    iVar1 = (*pcVar6)(param_2,iVar2,uVar3,uVar5);
    if ((local_30[0] & 1) != 0) {
      FUN_00023f68(local_28,local_30[0] & 0xfffffffe);
    }
    if ((local_3c[0] & 1) != 0) {
      FUN_00023f68(local_34,local_3c[0] & 0xfffffffe);
    }
  }
  else {
    iVar1 = 0;
    if (param_1[0x11] == 0) {
      FUN_000732f8(local_3c,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xe]);
      FUN_000732f8(local_30,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xf]);
      uVar3 = local_34;
      if ((local_3c[0] & 1) == 0) {
        uVar3 = (uint)local_3c | 1;
      }
      pcVar6 = *(code **)(*param_2 + 0x178);
      goto LAB_0009ee04;
    }
  }
  iVar4 = param_1[0x10];
  iVar2 = *(int *)*param_1;
  *(int *)(iVar2 + iVar4) = iVar1;
  ((int *)(iVar2 + iVar4))[1] = 0;
LAB_0009ee7c:
  if (**(int **)(DAT_0009eea4 + 0x9ee8c) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar1);
  }
  return;
}




// ============================================================
// Function #698
// Name: FUN_0009eea8
// Address: 0009eea8
// JNI: NO
// ============================================================


void FUN_0009eea8(int *param_1,int *param_2)

{
  int iVar1;
  int *piVar2;
  uint uVar3;
  int iVar4;
  int *piVar5;
  uint local_50 [2];
  uint local_48;
  int local_44;
  int local_40;
  int local_38;
  int *local_34;
  int *local_28;
  int local_1c;
  
  local_1c = **(int **)(DAT_0009f0a4 + 0x9eec0);
  iVar1 = param_1[4];
  if (iVar1 != 0) goto LAB_0009f05c;
  FUN_000732f8(local_50,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[2]);
  uVar3 = local_48;
  if ((local_50[0] & 1) == 0) {
    uVar3 = (uint)local_50 | 1;
  }
  iVar1 = (**(code **)(*param_2 + 0x18))(param_2,uVar3);
  local_38 = DAT_0009f0a8;
  iVar4 = param_1[4];
  param_1[4] = iVar1;
  local_38 = local_38 + 0x9ef30;
  local_40 = 0;
  local_34 = param_2;
  local_28 = &local_38;
  if (iVar4 != 0) {
    piVar2 = (int *)param_1[10];
    local_44 = iVar4;
    if (piVar2 == (int *)0x0) goto LAB_0009f0a0;
    (**(code **)(*piVar2 + 0x18))(piVar2,&local_44);
  }
  piVar2 = (int *)param_1[10];
  param_1[10] = 0;
  piVar5 = param_1 + 6;
  if (piVar2 == piVar5) {
    iVar1 = 0x10;
LAB_0009efb8:
    (**(code **)(*piVar2 + iVar1))();
    if (local_28 != (int *)0x0) goto LAB_0009ef9c;
LAB_0009efd0:
    piVar2 = (int *)0x0;
    param_1[10] = 0;
  }
  else {
    iVar1 = 0x14;
    if (piVar2 != (int *)0x0) goto LAB_0009efb8;
    if (local_28 == (int *)0x0) goto LAB_0009efd0;
LAB_0009ef9c:
    if (local_28 == &local_38) {
      iVar1 = *local_28;
      param_1[10] = (int)piVar5;
      (**(code **)(iVar1 + 0xc))(local_28,piVar5);
      piVar2 = local_28;
    }
    else {
      param_1[10] = (int)local_28;
      local_28 = (int *)0x0;
      piVar2 = (int *)0x0;
    }
  }
  iVar1 = local_40;
  local_40 = 0;
  if (iVar1 != 0) {
    local_44 = iVar1;
    if (piVar2 == (int *)0x0) {
LAB_0009f0a0:
      local_40 = 0;
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*piVar2 + 0x18))(piVar2,&local_44);
    piVar2 = local_28;
  }
  if (piVar2 == &local_38) {
    iVar1 = 0x10;
LAB_0009f084:
    (**(code **)(*piVar2 + iVar1))();
  }
  else {
    iVar1 = 0x14;
    if (piVar2 != (int *)0x0) goto LAB_0009f084;
  }
  if ((local_50[0] & 1) != 0) {
    FUN_00023f68(local_48,local_50[0] & 0xfffffffe);
  }
  iVar1 = param_1[4];
LAB_0009f05c:
  if (**(int **)(DAT_0009f0ac + 0x9f06c) == local_1c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(iVar1);
}




// ============================================================
// Function #699
// Name: FUN_0009f0b0
// Address: 0009f0b0
// JNI: NO
// ============================================================


int * FUN_0009f0b0(int *param_1,int *param_2,int param_3,int param_4)

{
  int *piVar1;
  int *piVar2;
  int *piVar3;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int extraout_r1_02;
  int extraout_r1_03;
  int extraout_r1_04;
  int extraout_r1_05;
  int extraout_r1_06;
  int extraout_r1_07;
  int extraout_r1_08;
  int iVar4;
  uint uVar5;
  int iVar6;
  uint uVar7;
  uint *puVar8;
  uint uVar9;
  
  iVar6 = *param_2;
  uVar9 = param_2[1];
  uVar5 = *(uint *)(iVar6 + param_3);
  piVar1 = (int *)FUN_000a0370(0x14);
  uVar7 = ~uVar9;
  *piVar1 = 0;
  piVar1[1] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  piVar1[2] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  piVar1[3] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  piVar3 = piVar1 + 4;
  *piVar3 = 0;
  FUN_000264a4(uVar7 ^ uVar5,uVar9);
  puVar8 = (uint *)(iVar6 + extraout_r1);
  FUN_000264a4(*puVar8 ^ uVar7,uVar9);
  *piVar1 = extraout_r1_00;
  FUN_000264a4(puVar8[1] ^ uVar7,uVar9);
  piVar1[1] = extraout_r1_01;
  FUN_000264a4(puVar8[2] ^ uVar7,uVar9);
  piVar1[2] = extraout_r1_02;
  FUN_000264a4(puVar8[3] ^ uVar7,uVar9);
  piVar1[3] = extraout_r1_03;
  uVar5 = puVar8[4];
  param_1[1] = extraout_r1_00;
  FUN_000264a4(uVar5 ^ uVar7,uVar9);
  *param_1 = (int)param_2;
  *piVar3 = extraout_r1_04;
  uVar5 = *(uint *)(iVar6 + extraout_r1_01);
  piVar2 = (int *)FUN_000a0370(0xc);
  *piVar2 = 0;
  piVar2[1] = 0;
  piVar2[2] = 0;
  FUN_000264a4(uVar7 ^ uVar5,uVar9);
  puVar8 = (uint *)(iVar6 + extraout_r1_05);
  FUN_000264a4(*puVar8 ^ uVar7,uVar9);
  *piVar2 = extraout_r1_06;
  FUN_000264a4(puVar8[1] ^ uVar7,uVar9);
  piVar2[1] = extraout_r1_07;
  uVar5 = puVar8[2];
  param_1[4] = extraout_r1_07;
  param_1[6] = 0;
  param_1[0xc] = 0;
  param_1[2] = (int)param_2;
  param_1[3] = extraout_r1_06;
  FUN_000264a4(uVar5 ^ uVar7,uVar9);
  piVar2[2] = extraout_r1_08;
  FUN_00023f68(piVar2,0xc);
  iVar6 = piVar1[3];
  iVar4 = *piVar3;
  param_1[0xe] = piVar1[2];
  param_1[0xf] = iVar6;
  param_1[0x10] = iVar4;
  param_1[0x11] = param_4;
  FUN_00023f68(piVar1,0x14);
  return param_1;
}




// ============================================================
// Function #700
// Name: FUN_0009f240
// Address: 0009f240
// JNI: NO
// ============================================================


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




