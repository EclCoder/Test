// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 621-640
// ============================================================

// ============================================================
// Function #621
// Name: FUN_00073780
// Address: 00073780
// JNI: NO
// ============================================================


void FUN_00073780(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000737e4 + 0x7379c);
  (**(code **)(*param_1 + 0xd4))();
  if (**(int **)(DAT_000737e8 + 0x737c8) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #622
// Name: FUN_000737ec
// Address: 000737ec
// JNI: NO
// ============================================================


void FUN_000737ec(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_00073850 + 0x73808);
  (**(code **)(*param_1 + 0xe0))();
  if (**(int **)(DAT_00073854 + 0x73834) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #623
// Name: FUN_00073858
// Address: 00073858
// JNI: NO
// ============================================================


void FUN_00073858(void)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  int iVar6;
  int iVar7;
  char *pcVar8;
  undefined4 *puVar9;
  undefined1 *puVar10;
  uint uVar11;
  undefined1 *puVar12;
  int iVar13;
  undefined1 *puVar14;
  undefined1 *puVar15;
  undefined4 *puVar16;
  undefined4 uVar17;
  undefined1 *puVar18;
  undefined1 *puVar19;
  int *piVar20;
  bool bVar21;
  int local_58;
  undefined4 local_54;
  uint local_50;
  undefined1 *local_4c;
  undefined4 local_48;
  undefined4 local_44;
  undefined1 *local_40;
  undefined4 local_3c;
  undefined1 **local_30;
  int local_28;
  
  local_28 = **(int **)(DAT_00073aa8 + 0x7387c);
  if (*(char *)(DAT_00073aa4 + 0x7386c) != '\0') goto LAB_0007622c;
  pcVar8 = (char *)FUN_00025e6c(DAT_00073aac + 0x73894);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00073ab0 + 0x738ac);
    piVar20 = (int *)*puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076508 + 0x7633c);
    piVar20 = (int *)FUN_00076fc0();
    iVar13 = DAT_0007650c;
    *puVar9 = piVar20;
    puVar10 = (undefined1 *)FUN_00025e6c(iVar13 + 0x76358);
    *puVar10 = 1;
  }
  puVar9 = (undefined4 *)FUN_000a0398(0x10);
  *puVar9 = 0;
  puVar9[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar9[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar9[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined1 *)((int)puVar9 + 10) = 0x46;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x6c;
  *(undefined1 *)(puVar9 + 3) = 0x6f;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x61;
  *(undefined1 *)((int)puVar9 + 0xe) = 0x74;
  *(undefined1 *)((int)puVar9 + 0xf) = 0;
  puVar10 = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  uVar4 = *(undefined1 *)(puVar9 + 1);
  *puVar10 = *(undefined1 *)puVar9;
  uVar5 = *(undefined1 *)((int)puVar9 + 5);
  puVar10[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 6);
  puVar10[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 7);
  puVar10[3] = uVar3;
  uVar3 = *(undefined1 *)(puVar9 + 2);
  puVar10[4] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar9 + 9);
  puVar10[5] = uVar5;
  uVar5 = *(undefined1 *)((int)puVar9 + 10);
  puVar10[6] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 0xb);
  puVar10[7] = uVar2;
  uVar2 = *(undefined1 *)(puVar9 + 3);
  puVar10[8] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar9 + 0xd);
  puVar10[9] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xe);
  puVar10[10] = uVar5;
  puVar10[0xb] = uVar1;
  puVar10[0xc] = uVar2;
  puVar10[0xd] = uVar3;
  puVar10[0xf] = 0;
  puVar10[0xe] = uVar4;
  FUN_00023f74(puVar9);
  uVar11 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar10);
  pcVar8 = (char *)FUN_00025e6c(DAT_00073ab4 + 0x739ec);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00073ab8 + 0x73a04);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076510 + 0x76370);
    uVar17 = FUN_00076fc0();
    iVar13 = DAT_00076514;
    *puVar9 = uVar17;
    puVar19 = (undefined1 *)FUN_00025e6c(iVar13 + 0x7638c);
    *puVar19 = 1;
  }
  puVar19 = (undefined1 *)(DAT_00073abc + 0x73a2c);
  local_48 = uVar11;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,uVar11);
  uVar11 = local_48;
  *(undefined4 *)((int)&DAT_00073ac0 + DAT_00073ac0) = uVar17;
  local_48 = 0;
  if (uVar11 != 0) {
    local_54 = uVar11;
    if (local_30 == (undefined1 **)0x0) goto LAB_00076504;
    (**(code **)(*local_30 + 0x18))(local_30,&local_54);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_00073b18:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_00073b18;
  }
  FUN_00023f68(puVar10,0x10);
  iVar13 = DAT_00073ac4;
  uVar17 = *(undefined4 *)(DAT_00073ac4 + 0x73bb4);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar10 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x46;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_44 = (uint)local_44._2_2_ << 0x10;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = CONCAT31(local_44._1_3_,*(undefined1 *)((int)puVar9 + 3));
  FUN_00023f74();
  puVar14 = (undefined1 *)((uint)&local_54 | 1);
  puVar18 = (undefined1 *)((uint)&local_48 | 1);
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar14;
  }
  puVar12 = local_40;
  if ((local_48 & 1) == 0) {
    puVar12 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)(iVar13 + 0x73b9c) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(DAT_00073ac8 + 0x73d28);
  puVar9 = (undefined4 *)FUN_000a0398(0xb);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x66;
  *(undefined1 *)((int)puVar9 + 1) = 0x6c;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x6f;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x56;
  *(undefined4 *)((int)puVar9 + 7) = 0;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6c;
  *(undefined1 *)(puVar9 + 2) = 0x75;
  *(undefined1 *)((int)puVar9 + 9) = 0x65;
  *(undefined1 *)((int)puVar9 + 10) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0x14);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_50 = *(undefined4 *)((int)puVar9 + 3);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_4c = (undefined1 *)(uint)*(uint3 *)((int)puVar9 + 7);
  FUN_00023f74();
  puVar10 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x46;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_44 = local_44 & 0xffffff00;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar14;
  }
  puVar12 = local_40;
  if ((local_48 & 1) == 0) {
    puVar12 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)(DAT_00073acc + 0x73e28) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  puVar9 = (undefined4 *)FUN_000a0398(0x11);
  *puVar9 = 0;
  puVar9[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar9[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar9[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined1 *)((int)puVar9 + 10) = 0x44;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x6f;
  *(undefined1 *)(puVar9 + 3) = 0x75;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x62;
  *(undefined1 *)(puVar9 + 4) = 0;
  *(undefined1 *)((int)puVar9 + 0xe) = 0x6c;
  *(undefined1 *)((int)puVar9 + 0xf) = 0x65;
  *(undefined1 *)(puVar9 + 4) = 0;
  local_4c = (undefined1 *)FUN_000a0370(0x18);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  uVar4 = *(undefined1 *)(puVar9 + 1);
  *local_4c = *(undefined1 *)puVar9;
  uVar5 = *(undefined1 *)((int)puVar9 + 5);
  local_4c[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 6);
  local_4c[2] = uVar2;
  local_4c[4] = uVar4;
  local_4c[3] = uVar3;
  local_4c[5] = uVar5;
  local_4c[6] = uVar1;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  local_50 = 0x10;
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_54 = 0x19;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xb);
  local_4c[7] = *(undefined1 *)((int)puVar9 + 7);
  uVar5 = *(undefined1 *)(puVar9 + 3);
  local_4c[8] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 0xd);
  local_4c[9] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 0xe);
  local_4c[10] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar9 + 0xf);
  local_4c[0xb] = uVar4;
  local_4c[0xc] = uVar5;
  local_4c[0xd] = uVar1;
  local_4c[0xe] = uVar2;
  local_4c[0x10] = 0;
  local_4c[0xf] = uVar3;
  FUN_00023f74(puVar9);
  puVar10 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar10 = puVar14;
  }
  iVar13 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar10);
  pcVar8 = (char *)FUN_00025e6c(DAT_00073ad0 + 0x73fb0);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00073ad4 + 0x73fc8);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076518 + 0x763a0);
    uVar17 = FUN_00076fc0();
    iVar6 = DAT_0007651c;
    *puVar9 = uVar17;
    puVar10 = (undefined1 *)FUN_00025e6c(iVar6 + 0x763bc);
    *puVar10 = 1;
  }
  local_48 = iVar13;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,iVar13);
  iVar13 = local_48;
  *(undefined4 *)(DAT_00073ad8 + 0x74010) = uVar17;
  local_48 = 0;
  if (iVar13 != 0) {
    local_58 = iVar13;
    if (local_30 == (undefined1 **)0x0) goto LAB_00076504;
    (**(code **)(*local_30 + 0x18))(local_30,&local_58);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_00076254:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_00076254;
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(DAT_00073adc + 0x74084);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar10 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x44;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = CONCAT31((int3)(local_44 >> 8),*(undefined1 *)((int)puVar9 + 3)) & 0xffff00ff;
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar14;
  }
  puVar12 = local_40;
  if ((local_48 & 1) == 0) {
    puVar12 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)(DAT_00073ae0 + 0x741ec) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(DAT_00073ae4 + 0x741f4);
  puVar9 = (undefined4 *)FUN_000a0398(0xc);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 100;
  *(undefined1 *)((int)puVar9 + 1) = 0x6f;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x75;
  *(undefined1 *)((int)puVar9 + 3) = 0x62;
  *(undefined1 *)(puVar9 + 1) = 0x6c;
  *(undefined1 *)((int)puVar9 + 5) = 0x65;
  puVar9[2] = 0;
  *(undefined1 *)((int)puVar9 + 6) = 0x56;
  *(undefined1 *)((int)puVar9 + 7) = 0x61;
  *(undefined1 *)(puVar9 + 2) = 0x6c;
  *(undefined1 *)((int)puVar9 + 9) = 0x75;
  *(undefined1 *)((int)puVar9 + 10) = 0x65;
  *(undefined1 *)((int)puVar9 + 0xb) = 0;
  local_40 = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  *local_40 = *(undefined1 *)puVar9;
  uVar4 = *(undefined1 *)(puVar9 + 1);
  local_40[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 5);
  local_40[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 6);
  local_40[3] = uVar3;
  local_40[5] = uVar1;
  local_40[4] = uVar4;
  local_40[6] = uVar2;
  local_44 = 0xb;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  local_48 = 0x11;
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_40[7] = *(undefined1 *)((int)puVar9 + 7);
  local_40[8] = uVar1;
  local_40[9] = uVar2;
  local_40[0xb] = 0;
  local_40[10] = uVar3;
  FUN_00023f74(puVar9);
  puVar10 = local_40;
  uVar11 = local_48;
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x44;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_50 = local_50 & 0xffffff00;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar18;
  }
  puVar12 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar12 = puVar14;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)(DAT_00073ae8 + 0x743a8) = uVar17;
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  puVar9 = (undefined4 *)FUN_000a0398(0xf);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined4 *)((int)puVar9 + 7) = 0;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined4 *)((int)puVar9 + 0xb) = 0;
  *(undefined1 *)((int)puVar9 + 10) = 0x4c;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x6f;
  *(undefined1 *)(puVar9 + 3) = 0x6e;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x67;
  *(undefined1 *)((int)puVar9 + 0xe) = 0;
  local_4c = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  uVar4 = *(undefined1 *)(puVar9 + 1);
  *local_4c = *(undefined1 *)puVar9;
  uVar5 = *(undefined1 *)((int)puVar9 + 5);
  local_4c[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 6);
  local_4c[2] = uVar2;
  local_4c[4] = uVar4;
  local_4c[3] = uVar3;
  local_4c[5] = uVar5;
  local_4c[6] = uVar1;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  local_50 = 0xe;
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_54 = 0x11;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xb);
  local_4c[7] = *(undefined1 *)((int)puVar9 + 7);
  uVar5 = *(undefined1 *)(puVar9 + 3);
  local_4c[8] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 0xd);
  local_4c[9] = uVar2;
  local_4c[10] = uVar3;
  local_4c[0xb] = uVar4;
  local_4c[0xc] = uVar5;
  local_4c[0xe] = 0;
  local_4c[0xd] = uVar1;
  FUN_00023f74(puVar9);
  puVar10 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar10 = puVar14;
  }
  iVar13 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar10);
  pcVar8 = (char *)FUN_00025e6c(DAT_00073aec + 0x744e4);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00073af0 + 0x744fc);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076520 + 0x763d4);
    uVar17 = FUN_00076fc0();
    iVar6 = DAT_00076524;
    *puVar9 = uVar17;
    puVar10 = (undefined1 *)FUN_00025e6c(iVar6 + 0x763f0);
    *puVar10 = 1;
  }
  local_48 = iVar13;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,iVar13);
  iVar13 = local_48;
  *(undefined4 *)(DAT_00073af4 + 0x74538) = uVar17;
  local_48 = 0;
  if (iVar13 != 0) {
    local_58 = iVar13;
    if (local_30 == (undefined1 **)0x0) goto LAB_00076504;
    (**(code **)(*local_30 + 0x18))(local_30,&local_58);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_00076274:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_00076274;
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  iVar13 = DAT_00073af8;
  uVar17 = *(undefined4 *)(DAT_00073af8 + 0x745b0);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar10 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x4a;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = CONCAT31((int3)(local_44 >> 8),*(undefined1 *)((int)puVar9 + 3)) & 0xffff00ff;
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar14;
  }
  puVar12 = local_40;
  if ((local_48 & 1) == 0) {
    puVar12 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)(iVar13 + 0x745b4) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(DAT_00073afc + 0x74714);
  puVar9 = (undefined4 *)FUN_000a0398(10);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x6c;
  *(undefined1 *)((int)puVar9 + 1) = 0x6f;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x67;
  *(undefined1 *)(puVar9 + 1) = 0x56;
  *(undefined1 *)((int)puVar9 + 5) = 0x61;
  *(undefined1 *)((int)puVar9 + 6) = 0x6c;
  *(undefined2 *)(puVar9 + 2) = 0;
  *(undefined1 *)((int)puVar9 + 7) = 0x75;
  *(undefined1 *)(puVar9 + 2) = 0x65;
  *(undefined1 *)((int)puVar9 + 9) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,0x12);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_44 = *(uint *)((int)puVar9 + 3);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_40 = (undefined1 *)
             (CONCAT22((short)((uint)local_40 >> 0x10),*(undefined2 *)((int)puVar9 + 7)) &
             0xff00ffff);
  FUN_00023f74();
  puVar10 = local_40;
  uVar11 = local_48;
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x4a;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_50 = local_50 & 0xffffff00;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar18;
  }
  puVar12 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar12 = puVar14;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)(DAT_00073b00 + 0x748b0) = uVar17;
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  puVar9 = (undefined4 *)FUN_000a0398(0x12);
  *puVar9 = 0;
  puVar9[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar9[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar9[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar16 = puVar9 + 4;
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined1 *)((int)puVar9 + 10) = 0x49;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x6e;
  *(undefined1 *)(puVar9 + 3) = 0x74;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x65;
  *(undefined1 *)((int)puVar9 + 0xe) = 0x67;
  *(undefined2 *)puVar16 = 0;
  *(undefined1 *)((int)puVar9 + 0xf) = 0x65;
  *(undefined1 *)puVar16 = 0x72;
  *(undefined1 *)((int)puVar9 + 0x11) = 0;
  local_4c = (undefined1 *)FUN_000a0370(0x18);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  *local_4c = *(undefined1 *)puVar9;
  uVar4 = *(undefined1 *)(puVar9 + 1);
  local_4c[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 5);
  local_4c[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 6);
  local_4c[3] = uVar3;
  local_4c[5] = uVar1;
  local_4c[4] = uVar4;
  local_4c[6] = uVar2;
  local_50 = 0x11;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  local_54 = 0x19;
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_4c[7] = *(undefined1 *)((int)puVar9 + 7);
  uVar4 = *(undefined1 *)((int)puVar9 + 0xb);
  local_4c[8] = uVar1;
  uVar1 = *(undefined1 *)(puVar9 + 3);
  local_4c[9] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 0xd);
  local_4c[10] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar9 + 0xe);
  local_4c[0xb] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xf);
  uVar5 = *(undefined1 *)puVar16;
  local_4c[0xc] = uVar1;
  local_4c[0xd] = uVar2;
  local_4c[0xe] = uVar3;
  local_4c[0xf] = uVar4;
  local_4c[0x11] = 0;
  local_4c[0x10] = uVar5;
  FUN_00023f74(puVar9);
  puVar10 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar10 = puVar14;
  }
  iVar13 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar10);
  pcVar8 = (char *)FUN_00025e6c(DAT_00073b04 + 0x74a0c);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00073b08 + 0x74a24);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076528 + 0x7640c);
    uVar17 = FUN_00076fc0();
    iVar6 = DAT_0007652c;
    *puVar9 = uVar17;
    puVar10 = (undefined1 *)FUN_00025e6c(iVar6 + 0x76428);
    *puVar10 = 1;
  }
  local_48 = iVar13;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,iVar13);
  iVar13 = local_48;
  *(undefined4 *)(DAT_00073b0c + 0x74a9c) = uVar17;
  local_48 = 0;
  if (iVar13 != 0) {
    local_58 = iVar13;
    if (local_30 == (undefined1 **)0x0) goto LAB_00076504;
    (**(code **)(*local_30 + 0x18))(local_30,&local_58);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_00076294:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_00076294;
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(DAT_00073b10 + 0x74b10);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar10 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x49;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = CONCAT31((int3)(local_44 >> 8),*(undefined1 *)((int)puVar9 + 3)) & 0xffff00ff;
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar14;
  }
  puVar12 = local_40;
  if ((local_48 & 1) == 0) {
    puVar12 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)((int)&DAT_00074c10 + DAT_00074c0c) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  iVar13 = DAT_00074c10;
  uVar17 = *(undefined4 *)(DAT_00074c10 + 0x74c9c);
  puVar9 = (undefined4 *)FUN_000a0398(9);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x69;
  *(undefined1 *)((int)puVar9 + 1) = 0x6e;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x74;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined1 *)(puVar9 + 2) = 0;
  *(undefined1 *)((int)puVar9 + 6) = 0x75;
  *(undefined1 *)((int)puVar9 + 7) = 0x65;
  *(undefined1 *)(puVar9 + 2) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0x10);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = *(undefined4 *)((int)puVar9 + 3);
  local_4c = (undefined1 *)
             (CONCAT31((int3)((uint)local_4c >> 8),*(undefined1 *)((int)puVar9 + 7)) & 0xffff00ff);
  FUN_00023f74();
  puVar10 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x49;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_44 = local_44 & 0xffffff00;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar10 = puVar14;
  }
  puVar12 = local_40;
  if ((local_48 & 1) == 0) {
    puVar12 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar10,puVar12);
  *(undefined4 *)(iVar13 + 0x74ca8) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  puVar9 = (undefined4 *)FUN_000a0398(0x10);
  *puVar9 = 0;
  puVar9[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar9[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar9[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined1 *)((int)puVar9 + 10) = 0x53;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x68;
  *(undefined1 *)(puVar9 + 3) = 0x6f;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x72;
  *(undefined1 *)((int)puVar9 + 0xe) = 0x74;
  *(undefined1 *)((int)puVar9 + 0xf) = 0;
  local_4c = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  uVar4 = *(undefined1 *)(puVar9 + 1);
  *local_4c = *(undefined1 *)puVar9;
  uVar5 = *(undefined1 *)((int)puVar9 + 5);
  local_4c[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 6);
  local_4c[2] = uVar2;
  local_4c[3] = uVar3;
  local_4c[4] = uVar4;
  local_4c[5] = uVar5;
  local_4c[6] = uVar1;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  local_50 = 0xf;
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_54 = 0x11;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xb);
  local_4c[7] = *(undefined1 *)((int)puVar9 + 7);
  uVar5 = *(undefined1 *)(puVar9 + 3);
  local_4c[8] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 0xd);
  local_4c[9] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 0xe);
  local_4c[10] = uVar3;
  local_4c[0xb] = uVar4;
  local_4c[0xc] = uVar5;
  local_4c[0xd] = uVar1;
  local_4c[0xf] = 0;
  local_4c[0xe] = uVar2;
  FUN_00023f74(puVar9);
  puVar10 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar10 = puVar14;
  }
  iVar13 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar10);
  pcVar8 = (char *)FUN_00025e6c(DAT_00074c14 + 0x74f2c);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00074c18 + 0x74f44);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076530 + 0x76444);
    uVar17 = FUN_00076fc0();
    iVar6 = DAT_00076534;
    *puVar9 = uVar17;
    puVar10 = (undefined1 *)FUN_00025e6c(iVar6 + 0x76460);
    *puVar10 = 1;
  }
  iVar6 = DAT_00074c1c;
  puVar10 = (undefined1 *)(DAT_00074c1c + 0x74f60);
  local_48 = iVar13;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,iVar13);
  iVar13 = local_48;
  *(undefined4 *)(iVar6 + 0x74fcc) = uVar17;
  bVar21 = local_48 != 0;
  local_48 = 0;
  if (bVar21) {
    local_58 = iVar13;
    if (local_30 == (undefined1 **)0x0) goto LAB_00076504;
    (**(code **)(*local_30 + 0x18))(local_30,&local_58);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_000762b4:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_000762b4;
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fcc);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar12 = local_40;
  uVar11 = local_48;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x53;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = CONCAT31((int3)(local_50 >> 8),*(undefined1 *)((int)puVar9 + 3)) & 0xffff00ff;
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar12 = puVar18;
  }
  puVar15 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar15 = puVar14;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar12,puVar15);
  *(undefined4 *)(iVar6 + 0x74fb4) = uVar17;
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fcc);
  puVar9 = (undefined4 *)FUN_000a0398(0xb);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x73;
  *(undefined1 *)((int)puVar9 + 1) = 0x68;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x6f;
  *(undefined1 *)((int)puVar9 + 3) = 0x72;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x56;
  *(undefined4 *)((int)puVar9 + 7) = 0;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6c;
  *(undefined1 *)(puVar9 + 2) = 0x75;
  *(undefined1 *)((int)puVar9 + 9) = 0x65;
  *(undefined1 *)((int)puVar9 + 10) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,0x14);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = *(uint *)((int)puVar9 + 3);
  local_40 = (undefined1 *)(uint)*(uint3 *)((int)puVar9 + 7);
  FUN_00023f74();
  puVar12 = local_40;
  uVar11 = local_48;
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x53;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_50 = local_50 & 0xffffff00;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar12 = puVar18;
  }
  puVar15 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar15 = puVar14;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar12,puVar15);
  *(undefined4 *)(iVar6 + 0x74fd0) = uVar17;
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  puVar9 = (undefined4 *)FUN_000a0398(0xf);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined4 *)((int)puVar9 + 7) = 0;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined4 *)((int)puVar9 + 0xb) = 0;
  *(undefined1 *)((int)puVar9 + 10) = 0x42;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x79;
  *(undefined1 *)(puVar9 + 3) = 0x74;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x65;
  *(undefined1 *)((int)puVar9 + 0xe) = 0;
  local_4c = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  uVar4 = *(undefined1 *)(puVar9 + 1);
  *local_4c = *(undefined1 *)puVar9;
  uVar5 = *(undefined1 *)((int)puVar9 + 5);
  local_4c[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 6);
  local_4c[2] = uVar2;
  local_4c[4] = uVar4;
  local_4c[3] = uVar3;
  local_4c[5] = uVar5;
  local_4c[6] = uVar1;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  local_50 = 0xe;
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_54 = 0x11;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xb);
  local_4c[7] = *(undefined1 *)((int)puVar9 + 7);
  uVar5 = *(undefined1 *)(puVar9 + 3);
  local_4c[8] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 0xd);
  local_4c[9] = uVar2;
  local_4c[10] = uVar3;
  local_4c[0xb] = uVar4;
  local_4c[0xc] = uVar5;
  local_4c[0xe] = 0;
  local_4c[0xd] = uVar1;
  FUN_00023f74(puVar9);
  puVar12 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar12 = puVar14;
  }
  iVar13 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar12);
  pcVar8 = (char *)FUN_00025e6c(DAT_000763fc + 0x75434);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076434 + 0x7544c);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076538 + 0x76474);
    uVar17 = FUN_00076fc0();
    iVar7 = DAT_0007653c;
    *puVar9 = uVar17;
    puVar12 = (undefined1 *)FUN_00025e6c(iVar7 + 0x76490);
    *puVar12 = 1;
  }
  local_48 = iVar13;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,iVar13);
  iVar13 = local_48;
  *(undefined4 *)(iVar6 + 0x74fc0) = uVar17;
  bVar21 = local_48 != 0;
  local_48 = 0;
  if (bVar21) {
    local_58 = iVar13;
    if (local_30 == (undefined1 **)0x0) goto LAB_00076504;
    (**(code **)(*local_30 + 0x18))(local_30,&local_58);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_000762d4:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_000762d4;
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fc0);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar12 = local_40;
  uVar11 = local_48;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x42;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = CONCAT31((int3)(local_50 >> 8),*(undefined1 *)((int)puVar9 + 3)) & 0xffff00ff;
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar12 = puVar18;
  }
  puVar15 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar15 = puVar14;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar12,puVar15);
  *(undefined4 *)(DAT_00076540 + 0x75620) = uVar17;
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fc0);
  puVar9 = (undefined4 *)FUN_000a0398(10);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x62;
  *(undefined1 *)((int)puVar9 + 1) = 0x79;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x74;
  *(undefined1 *)((int)puVar9 + 3) = 0x65;
  *(undefined1 *)(puVar9 + 1) = 0x56;
  *(undefined1 *)((int)puVar9 + 5) = 0x61;
  *(undefined2 *)(puVar9 + 2) = 0;
  *(undefined1 *)((int)puVar9 + 6) = 0x6c;
  *(undefined1 *)((int)puVar9 + 7) = 0x75;
  *(undefined1 *)(puVar9 + 2) = 0x65;
  *(undefined1 *)((int)puVar9 + 9) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,0x12);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = *(uint *)((int)puVar9 + 3);
  local_40 = (undefined1 *)
             (CONCAT22((short)((uint)local_40 >> 0x10),*(undefined2 *)((int)puVar9 + 7)) &
             0xff00ffff);
  FUN_00023f74();
  puVar12 = local_40;
  uVar11 = local_48;
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x42;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_50 = local_50 & 0xffffff00;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar12 = puVar18;
  }
  puVar15 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar15 = puVar14;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar12,puVar15);
  *(undefined4 *)(iVar6 + 0x74fd8) = uVar17;
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  puVar9 = (undefined4 *)FUN_000a0398(0x14);
  *puVar9 = 0;
  puVar9[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar9[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar9[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar16 = puVar9 + 4;
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined1 *)((int)puVar9 + 10) = 0x43;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x68;
  *(undefined1 *)(puVar9 + 3) = 0x61;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x72;
  *puVar16 = 0;
  *(undefined1 *)((int)puVar9 + 0xe) = 0x61;
  *(undefined1 *)((int)puVar9 + 0xf) = 99;
  *(undefined1 *)puVar16 = 0x74;
  *(undefined1 *)((int)puVar9 + 0x11) = 0x65;
  *(undefined1 *)((int)puVar9 + 0x12) = 0x72;
  *(undefined1 *)((int)puVar9 + 0x13) = 0;
  local_4c = (undefined1 *)FUN_000a0370(0x18);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  *local_4c = *(undefined1 *)puVar9;
  uVar4 = *(undefined1 *)(puVar9 + 1);
  local_4c[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 5);
  local_4c[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 6);
  local_4c[3] = uVar3;
  local_4c[5] = uVar1;
  local_4c[4] = uVar4;
  local_4c[6] = uVar2;
  local_50 = 0x13;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  local_54 = 0x19;
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_4c[7] = *(undefined1 *)((int)puVar9 + 7);
  uVar4 = *(undefined1 *)((int)puVar9 + 0xb);
  local_4c[8] = uVar1;
  uVar1 = *(undefined1 *)(puVar9 + 3);
  local_4c[9] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 0xd);
  local_4c[10] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar9 + 0xe);
  local_4c[0xb] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xf);
  uVar5 = *(undefined1 *)puVar16;
  local_4c[0xc] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 0x11);
  local_4c[0xd] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 0x12);
  local_4c[0xe] = uVar3;
  local_4c[0xf] = uVar4;
  local_4c[0x10] = uVar5;
  local_4c[0x11] = uVar1;
  local_4c[0x13] = 0;
  local_4c[0x12] = uVar2;
  FUN_00023f74(puVar9);
  puVar12 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar12 = puVar14;
  }
  iVar13 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar12);
  pcVar8 = (char *)FUN_00025e6c(DAT_00076544 + 0x75968);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076548 + 0x75980);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_0007654c + 0x764a8);
    uVar17 = FUN_00076fc0();
    iVar7 = DAT_00076550;
    *puVar9 = uVar17;
    puVar12 = (undefined1 *)FUN_00025e6c(iVar7 + 0x764c4);
    *puVar12 = 1;
  }
  local_48 = iVar13;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,iVar13);
  iVar13 = local_48;
  *(undefined4 *)(iVar6 + 0x74fb0) = uVar17;
  bVar21 = local_48 != 0;
  local_48 = 0;
  if (bVar21) {
    local_58 = iVar13;
    if (local_30 == (undefined1 **)0x0) goto LAB_00076504;
    (**(code **)(*local_30 + 0x18))(local_30,&local_58);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_000762f4:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_000762f4;
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fb0);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar12 = local_40;
  uVar11 = local_48;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x43;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = CONCAT31((int3)(local_50 >> 8),*(undefined1 *)((int)puVar9 + 3)) & 0xffff00ff;
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar12 = puVar18;
  }
  puVar15 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar15 = puVar14;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar12,puVar15);
  *(undefined4 *)(iVar6 + 0x74fc4) = uVar17;
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fb0);
  puVar9 = (undefined4 *)FUN_000a0398(10);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 99;
  *(undefined1 *)((int)puVar9 + 1) = 0x68;
  *(undefined1 *)((int)puVar9 + 2) = 0x61;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 3) = 0x72;
  *(undefined1 *)(puVar9 + 1) = 0x56;
  *(undefined1 *)((int)puVar9 + 5) = 0x61;
  *(undefined1 *)((int)puVar9 + 6) = 0x6c;
  *(undefined2 *)(puVar9 + 2) = 0;
  *(undefined1 *)((int)puVar9 + 7) = 0x75;
  *(undefined1 *)(puVar9 + 2) = 0x65;
  *(undefined1 *)((int)puVar9 + 9) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0x12);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = *(undefined4 *)((int)puVar9 + 3);
  local_4c = (undefined1 *)
             (CONCAT22((short)((uint)local_4c >> 0x10),*(undefined2 *)((int)puVar9 + 7)) &
             0xff00ffff);
  FUN_00023f74();
  puVar12 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x43;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_44 = local_44 & 0xffffff00;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar12 = puVar14;
  }
  puVar15 = local_40;
  if ((local_48 & 1) == 0) {
    puVar15 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar12,puVar15);
  *(undefined4 *)(iVar6 + 0x74f98) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  puVar9 = (undefined4 *)FUN_000a0398(0x12);
  *puVar9 = 0;
  puVar9[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar9[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar9[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar16 = puVar9 + 4;
  *(undefined1 *)puVar9 = 0x6a;
  *(undefined1 *)((int)puVar9 + 1) = 0x61;
  *(undefined1 *)((int)puVar9 + 2) = 0x76;
  *(undefined1 *)((int)puVar9 + 3) = 0x61;
  *(undefined1 *)(puVar9 + 1) = 0x2f;
  *(undefined1 *)((int)puVar9 + 5) = 0x6c;
  *(undefined1 *)((int)puVar9 + 6) = 0x61;
  *(undefined1 *)((int)puVar9 + 7) = 0x6e;
  *(undefined1 *)(puVar9 + 2) = 0x67;
  *(undefined1 *)((int)puVar9 + 9) = 0x2f;
  *(undefined1 *)((int)puVar9 + 10) = 0x42;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x6f;
  *(undefined1 *)(puVar9 + 3) = 0x6f;
  *(undefined1 *)((int)puVar9 + 0xd) = 0x6c;
  *(undefined1 *)((int)puVar9 + 0xe) = 0x65;
  *(undefined2 *)puVar16 = 0;
  *(undefined1 *)((int)puVar9 + 0xf) = 0x61;
  *(undefined1 *)puVar16 = 0x6e;
  *(undefined1 *)((int)puVar9 + 0x11) = 0;
  local_4c = (undefined1 *)FUN_000a0370(0x18);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  *local_4c = *(undefined1 *)puVar9;
  uVar4 = *(undefined1 *)(puVar9 + 1);
  local_4c[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 5);
  local_4c[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 6);
  local_4c[3] = uVar3;
  local_4c[5] = uVar1;
  local_4c[4] = uVar4;
  local_4c[6] = uVar2;
  local_50 = 0x11;
  uVar1 = *(undefined1 *)(puVar9 + 2);
  uVar2 = *(undefined1 *)((int)puVar9 + 9);
  local_54 = 0x19;
  uVar3 = *(undefined1 *)((int)puVar9 + 10);
  local_4c[7] = *(undefined1 *)((int)puVar9 + 7);
  uVar4 = *(undefined1 *)((int)puVar9 + 0xb);
  local_4c[8] = uVar1;
  uVar1 = *(undefined1 *)(puVar9 + 3);
  local_4c[9] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 0xd);
  local_4c[10] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar9 + 0xe);
  local_4c[0xb] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar9 + 0xf);
  uVar5 = *(undefined1 *)puVar16;
  local_4c[0xc] = uVar1;
  local_4c[0xd] = uVar2;
  local_4c[0xe] = uVar3;
  local_4c[0xf] = uVar4;
  local_4c[0x11] = 0;
  local_4c[0x10] = uVar5;
  FUN_00023f74(puVar9);
  puVar12 = local_4c;
  if ((local_54 & 1) == 0) {
    puVar12 = puVar14;
  }
  iVar13 = (**(code **)(*piVar20 + 0x18))(piVar20,puVar12);
  pcVar8 = (char *)FUN_00025e6c(DAT_00076554 + 0x75e70);
  if (*pcVar8 == '\x01') {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_00076558 + 0x75e88);
    uVar17 = *puVar9;
  }
  else {
    puVar9 = (undefined4 *)FUN_00025e6c(DAT_0007655c + 0x764dc);
    uVar17 = FUN_00076fc0();
    iVar7 = DAT_00076560;
    *puVar9 = uVar17;
    puVar12 = (undefined1 *)FUN_00025e6c(iVar7 + 0x764f8);
    *puVar12 = 1;
  }
  local_48 = iVar13;
  local_40 = puVar19;
  local_3c = uVar17;
  local_30 = &local_40;
  uVar17 = (**(code **)(*piVar20 + 0x54))(piVar20,iVar13);
  iVar13 = local_48;
  *(undefined4 *)(iVar6 + 0x74fc8) = uVar17;
  bVar21 = local_48 != 0;
  local_48 = 0;
  if (bVar21) {
    local_58 = iVar13;
    if (local_30 == (undefined1 **)0x0) {
LAB_00076504:
      local_48 = 0;
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_30 + 0x18))(local_30,&local_58);
  }
  if (local_30 == &local_40) {
    iVar13 = 0x10;
LAB_00076314:
    (**(code **)(*local_30 + iVar13))();
  }
  else {
    iVar13 = 0x14;
    if (local_30 != (undefined1 **)0x0) goto LAB_00076314;
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fc8);
  puVar9 = (undefined4 *)FUN_000a0398(7);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x3c;
  *(undefined4 *)((int)puVar9 + 3) = 0;
  *(undefined1 *)((int)puVar9 + 1) = 0x69;
  *(undefined1 *)((int)puVar9 + 2) = 0x6e;
  *(undefined1 *)((int)puVar9 + 3) = 0x69;
  *(undefined1 *)(puVar9 + 1) = 0x74;
  *(undefined1 *)((int)puVar9 + 5) = 0x3e;
  *(undefined1 *)((int)puVar9 + 6) = 0;
  local_54._0_2_ = CONCAT11(*(undefined1 *)puVar9,0xc);
  local_54._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_54);
  local_54 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_54);
  local_50 = (uint)*(uint3 *)((int)puVar9 + 3);
  FUN_00023f74();
  puVar19 = local_4c;
  uVar11 = local_54;
  puVar9 = (undefined4 *)FUN_000a0398(5);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x5a;
  *(undefined1 *)(puVar9 + 1) = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x29;
  *(undefined1 *)((int)puVar9 + 3) = 0x56;
  *(undefined1 *)(puVar9 + 1) = 0;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,8);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  local_44 = CONCAT31((int3)(local_44 >> 8),*(undefined1 *)((int)puVar9 + 3)) & 0xffff00ff;
  FUN_00023f74();
  if ((uVar11 & 1) == 0) {
    puVar19 = puVar14;
  }
  puVar14 = local_40;
  if ((local_48 & 1) == 0) {
    puVar14 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar19,puVar14);
  *(undefined4 *)(iVar6 + 0x74fb8) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  if ((local_54 & 1) != 0) {
    FUN_00023f68(local_4c,local_54 & 0xfffffffe);
  }
  uVar17 = *(undefined4 *)(iVar6 + 0x74fc8);
  puVar9 = (undefined4 *)FUN_000a0398(0xd);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x62;
  *(undefined1 *)((int)puVar9 + 1) = 0x6f;
  puVar9[1] = 0;
  *(undefined1 *)((int)puVar9 + 2) = 0x6f;
  *(undefined1 *)((int)puVar9 + 3) = 0x6c;
  *(undefined4 *)((int)puVar9 + 5) = 0;
  *(undefined1 *)(puVar9 + 1) = 0x65;
  *(undefined1 *)((int)puVar9 + 5) = 0x61;
  *(undefined1 *)((int)puVar9 + 6) = 0x6e;
  *(undefined1 *)((int)puVar9 + 7) = 0x56;
  *(undefined4 *)((int)puVar9 + 9) = 0;
  *(undefined1 *)(puVar9 + 2) = 0x61;
  *(undefined1 *)((int)puVar9 + 9) = 0x6c;
  *(undefined1 *)((int)puVar9 + 10) = 0x75;
  *(undefined1 *)((int)puVar9 + 0xb) = 0x65;
  *(undefined1 *)(puVar9 + 3) = 0;
  puVar14 = (undefined1 *)FUN_000a0370(0x10);
  uVar1 = *(undefined1 *)((int)puVar9 + 1);
  uVar2 = *(undefined1 *)((int)puVar9 + 2);
  uVar3 = *(undefined1 *)((int)puVar9 + 3);
  *puVar14 = *(undefined1 *)puVar9;
  uVar4 = *(undefined1 *)(puVar9 + 1);
  puVar14[1] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 5);
  puVar14[2] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 6);
  puVar14[3] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar9 + 7);
  puVar14[4] = uVar4;
  uVar4 = *(undefined1 *)(puVar9 + 2);
  puVar14[5] = uVar1;
  uVar1 = *(undefined1 *)((int)puVar9 + 9);
  puVar14[6] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar9 + 10);
  puVar14[7] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar9 + 0xb);
  puVar14[8] = uVar4;
  puVar14[9] = uVar1;
  puVar14[10] = uVar2;
  puVar14[0xc] = 0;
  puVar14[0xb] = uVar3;
  FUN_00023f74(puVar9);
  puVar9 = (undefined4 *)FUN_000a0398(4);
  *puVar9 = 0;
  *(undefined1 *)puVar9 = 0x28;
  *(undefined1 *)((int)puVar9 + 1) = 0x29;
  *(undefined1 *)((int)puVar9 + 2) = 0x5a;
  *(undefined1 *)((int)puVar9 + 3) = 0;
  local_44 = local_44 & 0xffffff00;
  local_48._0_2_ = CONCAT11(*(undefined1 *)puVar9,6);
  local_48._0_3_ = CONCAT12(*(undefined1 *)((int)puVar9 + 1),(undefined2)local_48);
  local_48 = CONCAT13(*(undefined1 *)((int)puVar9 + 2),(undefined3)local_48);
  FUN_00023f74();
  puVar19 = local_40;
  if ((local_48 & 1) == 0) {
    puVar19 = puVar18;
  }
  uVar17 = (**(code **)(*piVar20 + 0x84))(piVar20,uVar17,puVar14,puVar19);
  *(undefined4 *)(DAT_00076564 + 0x7621c) = uVar17;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  FUN_00023f68(puVar14,0x10);
  *puVar10 = 1;
LAB_0007622c:
  if (**(int **)(DAT_00076568 + 0x7623c) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #624
// Name: FUN_0007656c
// Address: 0007656c
// JNI: NO
// ============================================================


void FUN_0007656c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000765d0 + 0x76588);
  (**(code **)(*param_1 + 0xf8))();
  if (**(int **)(DAT_000765d4 + 0x765b4) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #625
// Name: FUN_000765d8
// Address: 000765d8
// JNI: NO
// ============================================================


void FUN_000765d8(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0007663c + 0x765f4);
  (**(code **)(*param_1 + 0x8c))();
  if (**(int **)(DAT_00076640 + 0x76620) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #626
// Name: ExecuteProgram
// Address: 00076644
// JNI: NO
// ============================================================


void ExecuteProgram(char *param_1,undefined4 *param_2,uint param_3,uint param_4)

{
  uint uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  char *pcVar7;
  int *piVar8;
  size_t sVar9;
  undefined4 *puVar10;
  int *piVar11;
  uint uVar12;
  undefined4 uVar13;
  uint uVar14;
  undefined1 *puVar15;
  int iVar16;
  undefined4 uVar17;
  undefined1 *puVar18;
  undefined4 uVar19;
  undefined1 *puVar20;
  bool bVar21;
  undefined8 uVar22;
  uint local_ac;
  uint local_a8;
  undefined1 *local_a0;
  undefined4 local_9c;
  undefined1 **local_90;
  uint local_88;
  undefined1 *local_80;
  undefined4 local_7c;
  undefined1 **local_70;
  uint local_68;
  undefined1 *local_60;
  undefined4 local_5c;
  undefined1 **local_50;
  uint local_48;
  size_t local_44;
  undefined1 *local_40;
  undefined4 local_3c;
  undefined1 **local_30;
  int local_28;
  
  local_28 = **(int **)(DAT_00076e7c + 0x76670);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076e78 + 0x7666c);
  if (*pcVar7 == '\x01') {
    piVar8 = (int *)FUN_00025e6c(DAT_00076e80 + 0x76694);
    piVar8 = (int *)*piVar8;
  }
  else {
    piVar11 = (int *)FUN_00025e6c(DAT_00076e84 + 0x76d68);
    piVar8 = (int *)FUN_00076fc0();
    iVar16 = DAT_00076e88;
    *piVar11 = (int)piVar8;
    puVar18 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76d84);
    *puVar18 = 1;
  }
  if ((((piVar8 == (int *)0x0) || (*(char *)(DAT_00076e8c + 0x766b8) != '\x01')) ||
      (*(int *)(DAT_00076e90 + 0x766e8) == 0 || param_1 == (char *)0x0)) ||
     ((param_2 == (undefined4 *)0x0 && (param_3 != 0 || param_4 != 0) ||
      (*(int *)(DAT_00076e90 + 0x766e0) == 0)))) goto LAB_000766e0;
  sVar9 = strlen(param_1);
  if (0xfffffff7 < sVar9) {
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar9 < 0xb) {
    puVar18 = (undefined1 *)((uint)&local_48 | 1);
    local_48 = CONCAT31(local_48._1_3_,(char)(sVar9 << 1));
    if (sVar9 != 0) goto LAB_0007677c;
  }
  else {
    puVar18 = (undefined1 *)FUN_000a0370((sVar9 | 7) + 1);
    local_48 = (sVar9 | 7) + 2;
    local_44 = sVar9;
    local_40 = puVar18;
LAB_0007677c:
    __aeabi_memcpy(puVar18,param_1,sVar9);
  }
  iVar16 = DAT_00076e94;
  puVar18[sVar9] = 0;
  pcVar7 = (char *)FUN_00025e6c(iVar16 + 0x767a0);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076e98 + 0x767b8);
    piVar11 = (int *)*puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076e9c + 0x76da4);
    piVar11 = (int *)FUN_00076fc0();
    iVar16 = DAT_00076ea0;
    *puVar10 = piVar11;
    puVar18 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76dc0);
    *puVar18 = 1;
  }
  puVar20 = (undefined1 *)((uint)&local_48 | 1);
  puVar18 = local_40;
  if ((local_48 & 1) == 0) {
    puVar18 = puVar20;
  }
  uVar12 = (**(code **)(*piVar11 + 0x29c))(piVar11,puVar18);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076ea4 + 0x767ec);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ea8 + 0x76804);
    uVar17 = *puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076eac + 0x76de0);
    uVar17 = FUN_00076fc0();
    iVar16 = DAT_00076eb0;
    *puVar10 = uVar17;
    puVar18 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76dfc);
    *puVar18 = 1;
  }
  puVar18 = (undefined1 *)(DAT_00076eb4 + 0x76828);
  local_a8 = uVar12;
  local_a0 = puVar18;
  local_9c = uVar17;
  local_90 = &local_a0;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  puVar10 = (undefined4 *)FUN_000a0398(0x11);
  *puVar10 = 0;
  puVar10[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar10[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar10[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *(undefined1 *)puVar10 = 0x6a;
  *(undefined1 *)((int)puVar10 + 1) = 0x61;
  *(undefined1 *)((int)puVar10 + 2) = 0x76;
  *(undefined1 *)((int)puVar10 + 3) = 0x61;
  *(undefined1 *)(puVar10 + 1) = 0x2f;
  *(undefined1 *)((int)puVar10 + 5) = 0x6c;
  *(undefined1 *)((int)puVar10 + 6) = 0x61;
  *(undefined1 *)((int)puVar10 + 7) = 0x6e;
  *(undefined1 *)(puVar10 + 2) = 0x67;
  *(undefined1 *)((int)puVar10 + 9) = 0x2f;
  *(undefined1 *)((int)puVar10 + 10) = 0x4f;
  *(undefined1 *)((int)puVar10 + 0xb) = 0x62;
  *(undefined1 *)(puVar10 + 3) = 0x6a;
  *(undefined1 *)((int)puVar10 + 0xd) = 0x65;
  *(undefined1 *)(puVar10 + 4) = 0;
  *(undefined1 *)((int)puVar10 + 0xe) = 99;
  *(undefined1 *)((int)puVar10 + 0xf) = 0x74;
  *(undefined1 *)(puVar10 + 4) = 0;
  local_40 = (undefined1 *)FUN_000a0370(0x18);
  uVar2 = *(undefined1 *)((int)puVar10 + 1);
  uVar3 = *(undefined1 *)((int)puVar10 + 2);
  uVar4 = *(undefined1 *)((int)puVar10 + 3);
  uVar5 = *(undefined1 *)(puVar10 + 1);
  *local_40 = *(undefined1 *)puVar10;
  uVar6 = *(undefined1 *)((int)puVar10 + 5);
  local_40[1] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar10 + 6);
  local_40[2] = uVar3;
  local_40[4] = uVar5;
  local_40[3] = uVar4;
  local_40[5] = uVar6;
  local_40[6] = uVar2;
  uVar2 = *(undefined1 *)(puVar10 + 2);
  local_44 = 0x10;
  uVar3 = *(undefined1 *)((int)puVar10 + 9);
  uVar4 = *(undefined1 *)((int)puVar10 + 10);
  local_48 = 0x19;
  uVar5 = *(undefined1 *)((int)puVar10 + 0xb);
  local_40[7] = *(undefined1 *)((int)puVar10 + 7);
  uVar6 = *(undefined1 *)(puVar10 + 3);
  local_40[8] = uVar2;
  uVar2 = *(undefined1 *)((int)puVar10 + 0xd);
  local_40[9] = uVar3;
  uVar3 = *(undefined1 *)((int)puVar10 + 0xe);
  local_40[10] = uVar4;
  uVar4 = *(undefined1 *)((int)puVar10 + 0xf);
  local_40[0xb] = uVar5;
  local_40[0xc] = uVar6;
  local_40[0xd] = uVar2;
  local_40[0xe] = uVar3;
  local_40[0x10] = 0;
  local_40[0xf] = uVar4;
  FUN_00023f74(puVar10);
  puVar15 = local_40;
  if ((local_48 & 1) == 0) {
    puVar15 = puVar20;
  }
  uVar12 = (**(code **)(*piVar8 + 0x18))(piVar8,puVar15);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076eb8 + 0x769bc);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ebc + 0x769d4);
    uVar17 = *puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ec0 + 0x76e14);
    uVar17 = FUN_00076fc0();
    iVar16 = DAT_00076ec4;
    *puVar10 = uVar17;
    puVar20 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76e30);
    *puVar20 = 1;
  }
  local_68 = uVar12;
  local_60 = puVar18;
  local_5c = uVar17;
  local_50 = &local_60;
  if ((local_48 & 1) != 0) {
    FUN_00023f68(local_40,local_48 & 0xfffffffe);
  }
  uVar12 = (**(code **)(*piVar8 + 0x2b0))(piVar8,param_3,local_68,0);
  pcVar7 = (char *)FUN_00025e6c(DAT_00076ec8 + 0x76a40);
  if (*pcVar7 == '\x01') {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ecc + 0x76a58);
    uVar17 = *puVar10;
  }
  else {
    puVar10 = (undefined4 *)FUN_00025e6c(DAT_00076ed0 + 0x76e48);
    uVar17 = FUN_00076fc0();
    iVar16 = DAT_00076ed4;
    *puVar10 = uVar17;
    puVar20 = (undefined1 *)FUN_00025e6c(iVar16 + 0x76e64);
    *puVar20 = 1;
  }
  local_88 = uVar12;
  local_80 = puVar18;
  local_7c = uVar17;
  local_70 = &local_80;
  if (param_3 != 0 || param_4 != 0) {
    uVar22 = FUN_00025e6c(DAT_00076ed8 + 0x76a98);
    iVar16 = (int)((ulonglong)uVar22 >> 0x20);
    puVar10 = (undefined4 *)uVar22;
    uVar12 = 1;
    do {
      uVar1 = local_88;
      uVar17 = *param_2;
      uVar19 = param_2[1];
      pcVar7 = (char *)FUN_00025e6c(DAT_00076edc + 0x76ae8,iVar16);
      if (*pcVar7 == '\x01') {
        uVar13 = *puVar10;
      }
      else {
        uVar13 = FUN_00076fc0();
        *puVar10 = uVar13;
        puVar20 = (undefined1 *)FUN_00025e6c(DAT_00076ee8 + 0x76bcc);
        *puVar20 = 1;
      }
      uVar14 = FUN_00073564(uVar13,*(undefined4 *)(DAT_00076eec + 0x76b0c),
                            *(undefined4 *)(DAT_00076eec + 0x76b10),
                            *(undefined4 *)(DAT_00076eec + 0x76b10),uVar17,uVar19);
      pcVar7 = (char *)FUN_00025e6c(DAT_00076ef0 + 0x76b24);
      if (*pcVar7 == '\x01') {
        uVar17 = *puVar10;
      }
      else {
        uVar17 = FUN_00076fc0();
        *puVar10 = uVar17;
        puVar20 = (undefined1 *)FUN_00025e6c(DAT_00076ef4 + 0x76bf8);
        *puVar20 = 1;
      }
      local_48 = uVar14;
      local_40 = puVar18;
      local_3c = uVar17;
      local_30 = &local_40;
      (**(code **)(*piVar8 + 0x2b8))(piVar8,uVar1,uVar12 - 1,uVar14);
      uVar1 = local_48;
      local_48 = 0;
      if (uVar1 != 0) {
        local_ac = uVar1;
        if (local_30 == (undefined1 **)0x0) goto LAB_00076e70;
        (**(code **)(*local_30 + 0x18))(local_30,&local_ac);
      }
      if (local_30 == &local_40) {
        iVar16 = 0x10;
LAB_00076aa8:
        (**(code **)(*local_30 + iVar16))();
      }
      else {
        iVar16 = 0x14;
        if (local_30 != (undefined1 **)0x0) goto LAB_00076aa8;
      }
      param_2 = param_2 + 2;
      bVar21 = param_3 <= uVar12;
      uVar1 = (int)uVar12 >> 0x1f;
      iVar16 = uVar1 - (param_4 + !bVar21);
      uVar12 = uVar12 + 1;
    } while (uVar1 <= param_4 && (uint)bVar21 <= uVar1 - param_4);
  }
  FUN_0009ba5c(piVar8,*(undefined4 *)(DAT_00076ee0 + 0x76c30),
               *(undefined4 *)(DAT_00076ee0 + 0x76c38),local_a8,local_88);
  uVar12 = local_88;
  local_88 = 0;
  if (uVar12 != 0) {
    local_48 = uVar12;
    if (local_70 == (undefined1 **)0x0) goto LAB_00076e70;
    (**(code **)(*local_70 + 0x18))(local_70,&local_48);
  }
  if (local_70 == &local_80) {
    iVar16 = 0x10;
LAB_00076c88:
    (**(code **)(*local_70 + iVar16))();
  }
  else {
    iVar16 = 0x14;
    if (local_70 != (undefined1 **)0x0) goto LAB_00076c88;
  }
  uVar12 = local_68;
  local_68 = 0;
  if (uVar12 != 0) {
    local_48 = uVar12;
    if (local_50 == (undefined1 **)0x0) goto LAB_00076e70;
    (**(code **)(*local_50 + 0x18))(local_50,&local_48);
  }
  if (local_50 == &local_60) {
    iVar16 = 0x10;
LAB_00076ce8:
    (**(code **)(*local_50 + iVar16))();
  }
  else {
    iVar16 = 0x14;
    if (local_50 != (undefined1 **)0x0) goto LAB_00076ce8;
  }
  uVar12 = local_a8;
  local_a8 = 0;
  if (uVar12 != 0) {
    local_48 = uVar12;
    if (local_90 == (undefined1 **)0x0) {
LAB_00076e70:
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_90 + 0x18))(local_90,&local_48);
  }
  if (local_90 == &local_a0) {
    iVar16 = 0x10;
  }
  else {
    iVar16 = 0x14;
    if (local_90 == (undefined1 **)0x0) goto LAB_000766e0;
  }
  (**(code **)(*local_90 + iVar16))();
LAB_000766e0:
  if (**(int **)(DAT_00076ee4 + 0x766f0) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #627
// Name: FUN_00076ef8
// Address: 00076ef8
// JNI: NO
// ============================================================


void FUN_00076ef8(int *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 local_30;
  undefined4 local_2c;
  undefined4 local_28;
  int local_24;
  
  local_24 = **(int **)(DAT_00076fb8 + 0x76f18);
  uVar1 = (**(code **)(*param_1 + 0x2ac))(param_1,param_3);
  uVar2 = FUN_000a0398();
  __aeabi_memclr(uVar2,uVar1);
  (**(code **)(*param_1 + 800))(param_1,param_3,0,uVar1,uVar2);
  local_28 = 0;
  local_30 = uVar2;
  local_2c = uVar1;
  FUN_000609b0(&local_30,param_4);
  FUN_00023f74(uVar2);
  if (**(int **)(DAT_00076fbc + 0x76fa0) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_24);
  }
  return;
}




// ============================================================
// Function #628
// Name: FUN_00076fc0
// Address: 00076fc0
// JNI: NO
// ============================================================


void FUN_00076fc0(void)

{
  __pid_t _Var1;
  int *piVar2;
  int iVar3;
  undefined4 uVar4;
  int iVar5;
  int unaff_r5;
  bool bVar6;
  undefined4 local_28;
  undefined4 local_24;
  undefined8 local_20;
  undefined4 local_18;
  int local_14;
  
  iVar5 = DAT_000770b8;
  local_14 = **(int **)(DAT_000770bc + 0x76fdc);
  local_24 = 0;
  bVar6 = *(int *)(DAT_000770b8 + 0x76ff8) != 0;
  if (bVar6) {
    unaff_r5 = *(int *)(DAT_000770b8 + 0x76ff4);
  }
  uVar4 = 0;
  if (bVar6 && unaff_r5 != 0) {
    _Var1 = getpid();
    if (unaff_r5 == _Var1) {
      piVar2 = *(int **)(iVar5 + 0x76ff8);
      iVar3 = (**(code **)(*piVar2 + 0x18))(piVar2,&local_24,0x10006);
      if (iVar3 == -2) {
        piVar2 = *(int **)(iVar5 + 0x76ff8);
        local_28 = 0;
        local_20 = *(undefined8 *)(DAT_000770c0 + 0x77084);
        local_18 = *(undefined4 *)(DAT_000770c0 + 0x7708c);
        iVar5 = (**(code **)(*piVar2 + 0x1c))(piVar2,&local_28,&local_20);
        uVar4 = local_28;
        if (iVar5 != 0) {
          uVar4 = 0;
        }
      }
      else {
        uVar4 = 0;
        if (iVar3 == 0) {
          uVar4 = local_24;
        }
      }
    }
    else {
      uVar4 = 0;
    }
  }
  if (**(int **)(DAT_000770c4 + 0x77010) == local_14) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar4);
}




// ============================================================
// Function #629
// Name: FUN_000770c8
// Address: 000770c8
// JNI: NO
// ============================================================


void FUN_000770c8(int *param_1,uint param_2)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint extraout_r1;
  uint extraout_r1_00;
  uint uVar5;
  int *piVar6;
  int *piVar7;
  
  if (param_2 == 0) {
    iVar1 = *param_1;
    *param_1 = 0;
    if (iVar1 != 0) {
      FUN_00023f68(iVar1,param_1[1] << 2);
    }
    param_1[1] = 0;
  }
  else {
    if (0x3fffffff < param_2) {
                    /* WARNING: Subroutine does not return */
      FUN_00026984();
    }
    iVar1 = FUN_000a0370(param_2 << 2);
    iVar2 = *param_1;
    *param_1 = iVar1;
    if (iVar2 != 0) {
      FUN_00023f68(iVar2,param_1[1] << 2);
    }
    uVar4 = 0;
    param_1[1] = param_2;
    do {
      *(undefined4 *)(*param_1 + uVar4 * 4) = 0;
      uVar4 = uVar4 + 1;
    } while (param_2 != uVar4);
    piVar7 = param_1 + 2;
    piVar6 = (int *)*piVar7;
    if (piVar6 != (int *)0x0) {
      uVar4 = piVar6[1];
      uVar3 = param_2 - 1;
      if ((param_2 & uVar3) == 0) {
        *(int **)(*param_1 + (uVar4 & uVar3) * 4) = piVar7;
        uVar4 = uVar4 & uVar3;
        while (piVar7 = piVar6, piVar6 = (int *)*piVar7, piVar6 != (int *)0x0) {
          uVar5 = piVar6[1] & uVar3;
          if (uVar5 != uVar4) {
            iVar1 = *param_1;
            if (*(int *)(iVar1 + uVar5 * 4) == 0) {
              *(int **)(iVar1 + uVar5 * 4) = piVar7;
              uVar4 = uVar5;
            }
            else {
              *piVar7 = *piVar6;
              *piVar6 = **(undefined4 **)(iVar1 + uVar5 * 4);
              **(int **)(iVar1 + uVar5 * 4) = (int)piVar6;
              piVar6 = piVar7;
            }
          }
        }
      }
      else {
        if (param_2 <= uVar4) {
          FUN_000264a4(uVar4,param_2);
          uVar4 = extraout_r1;
        }
        *(int **)(*param_1 + uVar4 * 4) = piVar7;
        while (piVar7 = piVar6, piVar6 = (int *)*piVar7, piVar6 != (int *)0x0) {
          uVar3 = piVar6[1];
          if (param_2 <= uVar3) {
            FUN_000264a4(uVar3,param_2);
            uVar3 = extraout_r1_00;
          }
          if (uVar3 != uVar4) {
            iVar1 = *param_1;
            if (*(int *)(iVar1 + uVar3 * 4) == 0) {
              *(int **)(iVar1 + uVar3 * 4) = piVar7;
              uVar4 = uVar3;
            }
            else {
              *piVar7 = *piVar6;
              *piVar6 = **(int **)(iVar1 + uVar3 * 4);
              **(undefined4 **)(iVar1 + uVar3 * 4) = piVar6;
              piVar6 = piVar7;
            }
          }
        }
      }
    }
  }
  return;
}




// ============================================================
// Function #630
// Name: FUN_0007727c
// Address: 0007727c
// JNI: NO
// ============================================================


void FUN_0007727c(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026994((int)&DAT_00077288 + DAT_00077288);
}




// ============================================================
// Function #631
// Name: FUN_00077818
// Address: 00077818
// JNI: NO
// ============================================================


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




// ============================================================
// Function #632
// Name: FUN_00077e90
// Address: 00077e90
// JNI: NO
// ============================================================


void FUN_00077e90(int param_1,undefined4 param_2,undefined4 param_3)

{
  byte bVar1;
  ulonglong uVar2;
  char *pcVar3;
  byte *pbVar4;
  size_t sVar5;
  undefined4 *puVar6;
  void *pvVar7;
  uint uVar8;
  uint uVar9;
  void *pvVar10;
  void *pvVar11;
  char *pcVar12;
  void *pvVar13;
  uint uVar14;
  byte *__s;
  void *pvVar15;
  int iVar16;
  uint local_58;
  uint local_54;
  void *local_50;
  uint local_4c;
  uint local_48;
  char *local_44;
  undefined4 local_40;
  uint local_3c;
  byte *local_38;
  undefined1 auStack_30 [8];
  int local_28;
  
  local_28 = **(int **)(DAT_00078278 + 0x77ea4);
  pcVar12 = *(char **)(param_1 + 4);
  if (pcVar12 == (char *)0x0) goto LAB_00078248;
  sVar5 = strlen(pcVar12);
  if (0xfffffff7 < sVar5) goto LAB_00078270;
  if (sVar5 < 0xb) {
    pvVar10 = (void *)((uint)&local_58 | 1);
    local_58 = CONCAT31(local_58._1_3_,(char)(sVar5 << 1));
    if (sVar5 != 0) goto LAB_00077f18;
  }
  else {
    pvVar10 = (void *)FUN_000a0370((sVar5 | 7) + 1);
    local_58 = (sVar5 | 7) + 2;
    local_54 = sVar5;
    local_50 = pvVar10;
LAB_00077f18:
    __aeabi_memcpy(pvVar10,pcVar12,sVar5);
  }
  iVar16 = 0;
  *(undefined1 *)((int)pvVar10 + sVar5) = 0;
  puVar6 = (undefined4 *)FUN_000a0398(4);
  *puVar6 = 0;
  *(undefined1 *)puVar6 = 0x2e;
  *(undefined1 *)((int)puVar6 + 1) = 0x73;
  *(undefined1 *)((int)puVar6 + 2) = 0x6f;
  *(undefined1 *)((int)puVar6 + 3) = 0;
  local_3c = local_3c & 0xffffff00;
  local_40 = CONCAT13(*(undefined1 *)((int)puVar6 + 2),
                      CONCAT12(*(undefined1 *)((int)puVar6 + 1),CONCAT11(*(undefined1 *)puVar6,6)));
  FUN_00023f74();
  pbVar4 = local_38;
  uVar14 = local_40;
  pvVar11 = (void *)((uint)&local_58 | 1);
  pvVar10 = local_50;
  uVar8 = local_54;
  if ((local_58 & 1) == 0) {
    uVar8 = local_58 >> 1 & 0x7f;
    pvVar10 = pvVar11;
  }
  __s = local_38;
  if ((local_40 & 1) == 0) {
    __s = (byte *)((uint)&local_40 | 1);
  }
  sVar5 = strlen((char *)__s);
  if (sVar5 != 0) {
    pvVar15 = (void *)((int)pvVar10 + uVar8);
    pvVar13 = pvVar15;
    if ((int)sVar5 <= (int)uVar8) {
      bVar1 = *__s;
      pvVar7 = pvVar10;
      do {
        pvVar13 = pvVar15;
        if (((0xfffffffe < uVar8 - sVar5) ||
            (pvVar7 = memchr(pvVar7,(uint)bVar1,(uVar8 - sVar5) + 1), pvVar7 == (void *)0x0)) ||
           (iVar16 = memcmp(pvVar7,__s,sVar5), pvVar13 = pvVar7, iVar16 == 0)) break;
        pvVar7 = (void *)((int)pvVar7 + 1);
        uVar8 = (int)pvVar15 - (int)pvVar7;
        pvVar13 = pvVar15;
      } while ((int)sVar5 <= (int)uVar8);
    }
    iVar16 = (int)pvVar13 - (int)pvVar10;
    if (pvVar13 == pvVar15) {
      iVar16 = -1;
    }
  }
  if ((uVar14 & 1) != 0) {
    FUN_00023f68(pbVar4,local_40 & 0xfffffffe);
  }
  if (iVar16 != -1) {
    uVar8 = FUN_0001a3b0(&local_58,0x2f,0xffffffff);
    if (uVar8 == 0xffffffff) {
      pvVar10 = local_50;
      uVar14 = local_54;
      if ((local_58 & 1) == 0) {
        uVar14 = (uint)((byte)local_58 >> 1);
        pvVar10 = pvVar11;
      }
      if (iVar16 + 3U <= uVar14) {
        uVar14 = iVar16 + 3U;
      }
      if (0xfffffff7 < uVar14) goto LAB_00078270;
      if (uVar14 < 0xb) {
        local_4c = CONCAT31(local_4c._1_3_,(char)(uVar14 << 1));
        pcVar12 = (char *)((uint)&local_4c | 1);
        if (uVar14 == 0) goto LAB_00078190;
      }
      else {
        pcVar12 = (char *)FUN_000a0370((uVar14 | 7) + 1);
        local_4c = (uVar14 | 7) + 2;
        local_48 = uVar14;
        local_44 = pcVar12;
      }
LAB_00078188:
      __aeabi_memmove(pcVar12,pvVar10,uVar14);
    }
    else {
      uVar9 = local_54;
      if ((local_58 & 1) == 0) {
        uVar9 = (uint)((byte)local_58 >> 1);
      }
      if (uVar9 <= uVar8) {
                    /* WARNING: Subroutine does not return */
        FUN_0007727c();
      }
      uVar9 = uVar9 - (uVar8 + 1);
      uVar14 = (iVar16 - uVar8) + 2;
      if (uVar9 < uVar14) {
        uVar14 = uVar9;
      }
      pvVar10 = local_50;
      if ((local_58 & 1) == 0) {
        pvVar10 = pvVar11;
      }
      if (0xfffffff7 < uVar14) {
LAB_00078270:
                    /* WARNING: Subroutine does not return */
        FUN_00026b08();
      }
      if (10 < uVar14) {
        pcVar12 = (char *)FUN_000a0370((uVar14 | 7) + 1);
        local_4c = (uVar14 | 7) + 2;
        local_48 = uVar14;
        local_44 = pcVar12;
LAB_00078154:
        pvVar10 = (void *)((int)pvVar10 + uVar8 + 1);
        goto LAB_00078188;
      }
      local_4c = CONCAT31(local_4c._1_3_,(char)(uVar14 << 1));
      pcVar12 = (char *)((uint)&local_4c | 1);
      if (uVar14 != 0) goto LAB_00078154;
    }
LAB_00078190:
    pcVar3 = local_44;
    uVar9 = local_4c;
    pcVar12[uVar14] = '\0';
    local_3c = 0xcbf29ce4;
    pcVar12 = local_44;
    uVar8 = local_48;
    if ((local_4c & 1) == 0) {
      uVar8 = local_4c >> 1 & 0x7f;
      pcVar12 = (char *)((uint)&local_4c | 1);
    }
    local_40 = 0x84222325;
    for (; uVar8 != 0; uVar8 = uVar8 - 1) {
      uVar2 = (ulonglong)local_40;
      iVar16 = local_40 * 0x100;
      local_40 = (uint)(uVar2 * 0x1b3) ^ (int)*pcVar12;
      local_3c = local_3c * 0x1b3 + (int)(uVar2 * 0x1b3 >> 0x20) + iVar16 ^ (int)*pcVar12 >> 0x1f;
      pcVar12 = pcVar12 + 1;
    }
    local_38 = (byte *)0x0;
    FUN_00028a34(auStack_30,param_3,local_40,local_3c,&local_40);
    if ((uVar9 & 1) != 0) {
      FUN_00023f68(pcVar3,local_4c & 0xfffffffe);
    }
  }
  if ((local_58 & 1) != 0) {
    FUN_00023f68(local_50,local_58 & 0xfffffffe);
  }
LAB_00078248:
  if (**(int **)(DAT_0007827c + 0x78258) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(local_28);
}




// ============================================================
// Function #633
// Name: FUN_00078280
// Address: 00078280
// JNI: NO
// ============================================================


/* WARNING: Type propagation algorithm not settling */

void FUN_00078280(int param_1,byte *param_2)

{
  char cVar1;
  char cVar2;
  char cVar3;
  char cVar4;
  char cVar5;
  char cVar6;
  byte bVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  int ******ppppppiVar11;
  int ******ppppppiVar12;
  char *pcVar13;
  undefined4 *puVar14;
  uint uVar15;
  char *pcVar16;
  int *******pppppppiVar17;
  size_t sVar18;
  undefined1 *puVar19;
  int *piVar20;
  int iVar21;
  byte *pbVar22;
  int *******pppppppiVar23;
  int *******pppppppiVar24;
  uint uVar25;
  undefined4 uVar26;
  uint uVar27;
  int *******pppppppiVar28;
  bool bVar29;
  uint local_128;
  size_t local_124;
  uint local_120;
  uint local_11c;
  int ******local_118 [2];
  int aiStack_110 [4];
  int *local_100;
  int ******local_f8 [2];
  int *local_f0;
  int ******local_e8;
  int *******local_d0;
  char local_c8;
  int ******local_c0 [2];
  int ******local_b8 [2];
  uint local_b0;
  int *******local_98;
  char local_90;
  uint local_88;
  int *******local_80;
  undefined4 local_7c;
  int *******local_70;
  uint local_68 [2];
  int *******local_60;
  undefined4 local_5c;
  int *******local_50;
  uint local_48;
  int *******local_44;
  int *******local_40;
  undefined4 local_3c;
  int *******local_30;
  int local_28;
  
  pcVar13 = (char *)FUN_00025e6c(DAT_000791e0 + 0x7829c);
  local_28 = **(int **)(DAT_000791e4 + 0x782b0);
  if (*pcVar13 == '\x01') {
    puVar14 = (undefined4 *)FUN_00025e6c(DAT_000791e8 + 0x782c8);
    uVar26 = *puVar14;
    piVar20 = *(int **)(param_1 + 0x18);
  }
  else {
    puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079c9c + 0x79b24);
    uVar26 = FUN_00076fc0();
    iVar21 = DAT_00079ca0;
    *puVar14 = uVar26;
    puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79b40);
    *puVar19 = 1;
    piVar20 = *(int **)(param_1 + 0x18);
  }
  if (piVar20 == (int *)0x0) goto LAB_00079b54;
  (**(code **)(*piVar20 + 0x18))(local_118);
  pppppppiVar28 = local_f8;
  FUN_0009bd30(pppppppiVar28,uVar26,local_118);
  ppppppiVar11 = local_118[0];
  local_118[0] = (int ******)0x0;
  if (ppppppiVar11 != (int ******)0x0) {
    local_c0[0] = ppppppiVar11;
    if (local_100 == (int *)0x0) goto LAB_00079b54;
    (**(code **)(*local_100 + 0x18))(local_100,local_c0);
  }
  if (local_100 == aiStack_110) {
    iVar21 = 0x10;
LAB_00078364:
    (**(code **)(*local_100 + iVar21))();
  }
  else {
    iVar21 = 0x14;
    if (local_100 != (int *)0x0) goto LAB_00078364;
  }
  ppppppiVar12 = local_e8;
  ppppppiVar11 = local_c0[0];
  if (local_f8[0] == (int ******)0x0) {
    pcVar13 = (char *)FUN_000a0398(0x40);
    uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    uVar10 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    pcVar13[0] = '\0';
    pcVar13[1] = '\0';
    pcVar13[2] = '\0';
    pcVar13[3] = '\0';
    *(undefined4 *)(pcVar13 + 4) = uVar8;
    *(undefined4 *)(pcVar13 + 8) = uVar9;
    *(undefined4 *)(pcVar13 + 0xc) = uVar10;
    pcVar13[0x10] = '\0';
    pcVar13[0x11] = '\0';
    pcVar13[0x12] = '\0';
    pcVar13[0x13] = '\0';
    *(undefined4 *)(pcVar13 + 0x14) = uVar8;
    *(undefined4 *)(pcVar13 + 0x18) = uVar9;
    *(undefined4 *)(pcVar13 + 0x1c) = uVar10;
    pcVar13[0x20] = '\0';
    pcVar13[0x21] = '\0';
    pcVar13[0x22] = '\0';
    pcVar13[0x23] = '\0';
    *(undefined4 *)(pcVar13 + 0x24) = uVar8;
    *(undefined4 *)(pcVar13 + 0x28) = uVar9;
    *(undefined4 *)(pcVar13 + 0x2c) = uVar10;
    pcVar13[0x30] = '\0';
    pcVar13[0x31] = '\0';
    pcVar13[0x32] = '\0';
    pcVar13[0x33] = '\0';
    *(undefined4 *)(pcVar13 + 0x34) = uVar8;
    *(undefined4 *)(pcVar13 + 0x38) = uVar9;
    *(undefined4 *)(pcVar13 + 0x3c) = uVar10;
    uVar15 = 0;
    iVar21 = DAT_000791ec + 0x783ac;
    do {
      pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
      uVar15 = uVar15 + 1;
    } while (uVar15 != 0x40);
    pcVar16 = (char *)FUN_000a0370(0x40);
    cVar1 = pcVar13[1];
    cVar2 = pcVar13[2];
    cVar3 = pcVar13[3];
    cVar4 = pcVar13[4];
    cVar5 = pcVar13[5];
    *pcVar16 = *pcVar13;
    cVar6 = pcVar13[6];
    pcVar16[1] = cVar1;
    cVar1 = pcVar13[7];
    pcVar16[2] = cVar2;
    cVar2 = pcVar13[8];
    pcVar16[3] = cVar3;
    cVar3 = pcVar13[9];
    pcVar16[4] = cVar4;
    cVar4 = pcVar13[10];
    pcVar16[5] = cVar5;
    cVar5 = pcVar13[0xb];
    pcVar16[6] = cVar6;
    cVar6 = pcVar13[0xc];
    pcVar16[7] = cVar1;
    cVar1 = pcVar13[0xd];
    pcVar16[8] = cVar2;
    cVar2 = pcVar13[0xe];
    pcVar16[9] = cVar3;
    cVar3 = pcVar13[0xf];
    pcVar16[10] = cVar4;
    cVar4 = pcVar13[0x10];
    pcVar16[0xb] = cVar5;
    cVar5 = pcVar13[0x11];
    pcVar16[0xc] = cVar6;
    cVar6 = pcVar13[0x12];
    pcVar16[0xd] = cVar1;
    cVar1 = pcVar13[0x13];
    pcVar16[0xe] = cVar2;
    cVar2 = pcVar13[0x14];
    pcVar16[0xf] = cVar3;
    cVar3 = pcVar13[0x15];
    pcVar16[0x10] = cVar4;
    cVar4 = pcVar13[0x16];
    pcVar16[0x11] = cVar5;
    cVar5 = pcVar13[0x17];
    pcVar16[0x12] = cVar6;
    cVar6 = pcVar13[0x18];
    pcVar16[0x13] = cVar1;
    cVar1 = pcVar13[0x19];
    pcVar16[0x14] = cVar2;
    cVar2 = pcVar13[0x1a];
    pcVar16[0x15] = cVar3;
    cVar3 = pcVar13[0x1b];
    pcVar16[0x16] = cVar4;
    cVar4 = pcVar13[0x1c];
    pcVar16[0x17] = cVar5;
    cVar5 = pcVar13[0x1d];
    pcVar16[0x18] = cVar6;
    cVar6 = pcVar13[0x1e];
    pcVar16[0x19] = cVar1;
    cVar1 = pcVar13[0x1f];
    pcVar16[0x1a] = cVar2;
    cVar2 = pcVar13[0x20];
    pcVar16[0x1b] = cVar3;
    cVar3 = pcVar13[0x21];
    pcVar16[0x1c] = cVar4;
    cVar4 = pcVar13[0x22];
    pcVar16[0x1d] = cVar5;
    cVar5 = pcVar13[0x23];
    pcVar16[0x1e] = cVar6;
    cVar6 = pcVar13[0x24];
    pcVar16[0x1f] = cVar1;
    cVar1 = pcVar13[0x25];
    pcVar16[0x20] = cVar2;
    cVar2 = pcVar13[0x26];
    pcVar16[0x21] = cVar3;
    cVar3 = pcVar13[0x27];
    pcVar16[0x22] = cVar4;
    cVar4 = pcVar13[0x28];
    pcVar16[0x23] = cVar5;
    cVar5 = pcVar13[0x29];
    pcVar16[0x24] = cVar6;
    cVar6 = pcVar13[0x2a];
    pcVar16[0x25] = cVar1;
    cVar1 = pcVar13[0x2b];
    pcVar16[0x26] = cVar2;
    cVar2 = pcVar13[0x2c];
    pcVar16[0x27] = cVar3;
    cVar3 = pcVar13[0x2d];
    pcVar16[0x28] = cVar4;
    cVar4 = pcVar13[0x2e];
    pcVar16[0x29] = cVar5;
    cVar5 = pcVar13[0x2f];
    pcVar16[0x2a] = cVar6;
    cVar6 = pcVar13[0x30];
    pcVar16[0x2b] = cVar1;
    cVar1 = pcVar13[0x31];
    pcVar16[0x2c] = cVar2;
    cVar2 = pcVar13[0x32];
    pcVar16[0x2d] = cVar3;
    cVar3 = pcVar13[0x33];
    pcVar16[0x2e] = cVar4;
    cVar4 = pcVar13[0x34];
    pcVar16[0x2f] = cVar5;
    cVar5 = pcVar13[0x35];
    pcVar16[0x30] = cVar6;
    cVar6 = pcVar13[0x36];
    pcVar16[0x31] = cVar1;
    cVar1 = pcVar13[0x37];
    pcVar16[0x32] = cVar2;
    cVar2 = pcVar13[0x38];
    pcVar16[0x33] = cVar3;
    cVar3 = pcVar13[0x39];
    pcVar16[0x34] = cVar4;
    cVar4 = pcVar13[0x3a];
    pcVar16[0x35] = cVar5;
    cVar5 = pcVar13[0x3b];
    pcVar16[0x36] = cVar6;
    cVar6 = pcVar13[0x3c];
    pcVar16[0x37] = cVar1;
    pcVar16[0x3d] = pcVar13[0x3d];
    pcVar16[0x38] = cVar2;
    pcVar16[0x39] = cVar3;
    pcVar16[0x3a] = cVar4;
    pcVar16[0x3b] = cVar5;
    pcVar16[0x3c] = cVar6;
    pcVar16[0x3e] = pcVar13[0x3e];
    pcVar16[0x3f] = '\0';
    FUN_00023f74(pcVar13);
    pppppppiVar17 = (int *******)strlen(pcVar16);
    if ((int *******)0xfffffff7 < pppppppiVar17) goto LAB_00079c98;
    if (pppppppiVar17 < (int *******)0xb) {
      pppppppiVar23 = (int *******)((uint)&local_48 | 1);
      local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar17 << 1));
      if (pppppppiVar17 != (int *******)0x0) goto LAB_00078638;
    }
    else {
      pppppppiVar23 = (int *******)FUN_000a0370(((uint)pppppppiVar17 | 7) + 1);
      local_48 = ((uint)pppppppiVar17 | 7) + 2;
      local_44 = pppppppiVar17;
      local_40 = pppppppiVar23;
LAB_00078638:
      __aeabi_memcpy(pppppppiVar23,pcVar16,pppppppiVar17);
    }
    *(undefined1 *)((int)pppppppiVar23 + (int)pppppppiVar17) = 0;
    pppppppiVar17 = local_c0;
    FUN_000970d8(pppppppiVar17,uVar26,&local_48);
    if ((local_48 & 1) != 0) {
      FUN_00023f68(local_40,local_48 & 0xfffffffe);
    }
    FUN_00023f68(pcVar16,0x40);
    if (local_c0[0] == (int ******)0x0) {
      if (*(char *)(param_1 + 4) == '\x01') {
        if (local_90 != '\0') {
          pcVar13 = (char *)FUN_000a0398(0x17);
          pcVar13[0] = '\0';
          pcVar13[1] = '\0';
          pcVar13[2] = '\0';
          pcVar13[3] = '\0';
          *(undefined4 *)(pcVar13 + 4) =
               *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
          *(undefined4 *)(pcVar13 + 8) =
               *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
          *(undefined4 *)(pcVar13 + 0xc) =
               *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
          *pcVar13 = 'c';
          pcVar13[1] = 'o';
          pcVar13[2] = 'm';
          pcVar13[3] = '.';
          pcVar13[4] = 'g';
          pcVar13[5] = 'o';
          pcVar13[6] = 'o';
          pcVar13[7] = 'g';
          pcVar13[8] = 'l';
          pcVar13[9] = 'e';
          pcVar13[10] = '.';
          pcVar13[0xb] = 'a';
          pcVar13[0xc] = 'n';
          pcVar13[0xd] = 'd';
          pcVar13[0xe] = 'r';
          pcVar13[0xf] = '\0';
          pcVar13[0x10] = '\0';
          pcVar13[0x11] = '\0';
          pcVar13[0x12] = '\0';
          pcVar13[0xf] = 'o';
          pcVar13[0x10] = 'i';
          pcVar13[0x11] = 'd';
          pcVar13[0x13] = '\0';
          pcVar13[0x14] = '\0';
          pcVar13[0x15] = '\0';
          pcVar13[0x16] = '\0';
          pcVar13[0x12] = '.';
          pcVar13[0x13] = 'g';
          pcVar13[0x14] = 'm';
          pcVar13[0x15] = 's';
          pcVar13[0x16] = '\0';
          pcVar16 = (char *)FUN_000a0370(0x18);
          cVar1 = pcVar13[1];
          cVar2 = pcVar13[2];
          cVar3 = pcVar13[3];
          *pcVar16 = *pcVar13;
          cVar4 = pcVar13[4];
          pcVar16[1] = cVar1;
          cVar1 = pcVar13[5];
          pcVar16[2] = cVar2;
          cVar2 = pcVar13[6];
          pcVar16[3] = cVar3;
          cVar3 = pcVar13[7];
          pcVar16[4] = cVar4;
          cVar4 = pcVar13[8];
          pcVar16[5] = cVar1;
          cVar1 = pcVar13[9];
          pcVar16[6] = cVar2;
          cVar2 = pcVar13[10];
          pcVar16[7] = cVar3;
          cVar3 = pcVar13[0xb];
          pcVar16[8] = cVar4;
          cVar4 = pcVar13[0xc];
          pcVar16[9] = cVar1;
          cVar1 = pcVar13[0xd];
          pcVar16[10] = cVar2;
          cVar2 = pcVar13[0xe];
          pcVar16[0xb] = cVar3;
          cVar3 = pcVar13[0xf];
          cVar5 = pcVar13[0x10];
          pcVar16[0xc] = cVar4;
          cVar4 = pcVar13[0x11];
          pcVar16[0xd] = cVar1;
          cVar1 = pcVar13[0x12];
          pcVar16[0xe] = cVar2;
          cVar2 = pcVar13[0x13];
          pcVar16[0xf] = cVar3;
          cVar3 = pcVar13[0x14];
          pcVar16[0x10] = cVar5;
          bVar7 = pcVar13[0x15];
          pppppppiVar17 = (int *******)(uint)bVar7;
          pcVar16[0x11] = cVar4;
          pcVar16[0x12] = cVar1;
          pcVar16[0x13] = cVar2;
          pcVar16[0x14] = cVar3;
          pcVar16[0x16] = '\0';
          pcVar16[0x15] = bVar7;
          FUN_00023f74(pcVar13);
          pppppppiVar23 = (int *******)strlen(pcVar16);
          if ((int *******)0xfffffff7 < pppppppiVar23) goto LAB_00079c98;
          if (pppppppiVar23 < (int *******)0xb) {
            local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar23 << 1));
            pppppppiVar24 = (int *******)((uint)&local_48 | 1);
            if (pppppppiVar23 != (int *******)0x0) goto LAB_0007899c;
          }
          else {
            pppppppiVar17 = (int *******)((uint)pppppppiVar23 | 7);
            pppppppiVar24 = (int *******)FUN_000a0370((int)pppppppiVar17 + 1);
            local_48 = (int)pppppppiVar17 + 2;
            local_44 = pppppppiVar23;
            local_40 = pppppppiVar24;
LAB_0007899c:
            __aeabi_memcpy(pppppppiVar24,pcVar16,pppppppiVar23);
          }
          *(undefined1 *)((int)pppppppiVar24 + (int)pppppppiVar23) = 0;
          FUN_00097470(local_b8,&local_48);
          if ((local_48 & 1) != 0) {
            FUN_00023f68(local_40,local_48 & 0xfffffffe);
          }
          FUN_00023f68(pcVar16,0x18);
          goto LAB_000789e8;
        }
LAB_00079ad4:
        FUN_000289c4();
      }
      else {
LAB_000789e8:
        if (local_90 == '\0') goto LAB_00079ad4;
        pcVar13 = (char *)FUN_000a0398(0x3e);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2e] = '\0';
        pcVar13[0x2f] = '\0';
        pcVar13[0x30] = '\0';
        pcVar13[0x31] = '\0';
        *(undefined4 *)(pcVar13 + 0x32) = uVar26;
        *(undefined4 *)(pcVar13 + 0x36) = uVar8;
        *(undefined4 *)(pcVar13 + 0x3a) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_000799c0 + 0x78a28;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3e);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        cVar1 = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        cVar2 = pcVar13[0x38];
        pcVar16[0x33] = cVar3;
        cVar3 = pcVar13[0x39];
        pcVar16[0x34] = cVar4;
        cVar4 = pcVar13[0x3a];
        pcVar16[0x35] = cVar5;
        cVar5 = pcVar13[0x3b];
        pcVar16[0x37] = cVar1;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = cVar2;
        pcVar16[0x39] = cVar3;
        pcVar16[0x3a] = cVar4;
        pcVar16[0x3b] = cVar5;
        pcVar16[0x3c] = pcVar13[0x3c];
        pcVar16[0x3d] = '\0';
        FUN_00023f74(pcVar13);
        sVar18 = strlen(pcVar16);
        if (0xfffffff7 < sVar18) goto LAB_00079c98;
        if (sVar18 < 0xb) {
          uVar15 = (uint)&local_128 | 1;
          local_128 = CONCAT31(local_128._1_3_,(char)(sVar18 << 1));
          if (sVar18 != 0) goto LAB_00078ca4;
        }
        else {
          uVar15 = FUN_000a0370((sVar18 | 7) + 1);
          local_128 = (sVar18 | 7) + 2;
          local_124 = sVar18;
          local_120 = uVar15;
LAB_00078ca4:
          __aeabi_memcpy(uVar15,pcVar16,sVar18);
        }
        uVar25 = (uint)&local_128 | 1;
        *(undefined1 *)(uVar15 + sVar18) = 0;
        uVar15 = local_120;
        if ((local_128 & 1) == 0) {
          uVar15 = uVar25;
        }
        uVar15 = (*(code *)(*local_b8[0])[0xa7])(local_b8[0],uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079ca4 + 0x78cf4);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079ca8 + 0x78d0c);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cac + 0x79b64);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cb0;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79b80);
          *puVar19 = 1;
        }
        pppppppiVar23 = (int *******)(DAT_00079cb4 + 0x78d30);
        pbVar22 = *(byte **)(param_2 + 8);
        if ((*param_2 & 1) == 0) {
          pbVar22 = param_2 + 1;
        }
        local_88 = uVar15;
        local_80 = pppppppiVar23;
        local_7c = uVar26;
        local_70 = (int *******)&local_80;
        uVar15 = (*(code *)(*local_b8[0])[0xa7])(local_b8[0],pbVar22);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079cb8 + 0x78d64);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cbc + 0x78d7c);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cc0 + 0x79b98);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cc4;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79bb4);
          *puVar19 = 1;
        }
        local_68[0] = uVar15;
        local_60 = pppppppiVar23;
        local_5c = uVar26;
        local_50 = (int *******)&local_60;
        uVar15 = FUN_000765d8(local_b8[0],local_b0,*(undefined4 *)(DAT_00079cc8 + 0x78dc0),local_88,
                              uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079ccc + 0x78dc8);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cd0 + 0x78de0);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cd4 + 0x79bcc);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cd8;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79be8);
          *puVar19 = 1;
        }
        local_3c = uVar26;
        pppppppiVar17 = (int *******)&local_40;
        iVar21 = 0x10;
        local_30 = pppppppiVar17;
        local_48 = 0;
        local_40 = pppppppiVar23;
        if (((uVar15 == 0) ||
            (local_11c = uVar15, FUN_0009de6c(pppppppiVar17,&local_11c), local_30 == pppppppiVar17))
           || (iVar21 = 0x14, local_30 != (int *******)0x0)) {
          (**(code **)((int)*local_30 + iVar21))();
        }
        uVar15 = local_68[0];
        local_68[0] = 0;
        if (uVar15 != 0) {
          local_11c = uVar15;
          if (local_50 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_50)[6])(local_50,&local_11c);
        }
        if ((int ********)local_50 == &local_60) {
          iVar21 = 0x10;
LAB_00078ea4:
          (**(code **)((int)*local_50 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_50 != (int *******)0x0) goto LAB_00078ea4;
        }
        uVar15 = local_88;
        local_88 = 0;
        if (uVar15 != 0) {
          local_68[0] = uVar15;
          if (local_70 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_70)[6])(local_70,local_68);
        }
        if ((int ********)local_70 == &local_80) {
          iVar21 = 0x10;
LAB_00078f04:
          (**(code **)((int)*local_70 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_70 != (int *******)0x0) goto LAB_00078f04;
        }
        if ((local_128 & 1) != 0) {
          FUN_00023f68(local_120,local_128 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        pppppppiVar28 = pppppppiVar23;
        if (local_90 == '\0') goto LAB_00079ad4;
        pppppppiVar28 = local_b8;
        pcVar13 = (char *)FUN_000a0398(0x3e);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2e] = '\0';
        pcVar13[0x2f] = '\0';
        pcVar13[0x30] = '\0';
        pcVar13[0x31] = '\0';
        *(undefined4 *)(pcVar13 + 0x32) = uVar26;
        *(undefined4 *)(pcVar13 + 0x36) = uVar8;
        *(undefined4 *)(pcVar13 + 0x3a) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_00079cdc + 0x78f84;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3e);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        cVar1 = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        cVar2 = pcVar13[0x38];
        pcVar16[0x33] = cVar3;
        cVar3 = pcVar13[0x39];
        pcVar16[0x34] = cVar4;
        cVar4 = pcVar13[0x3a];
        pcVar16[0x35] = cVar5;
        cVar5 = pcVar13[0x3b];
        pcVar16[0x37] = cVar1;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = cVar2;
        pcVar16[0x39] = cVar3;
        pcVar16[0x3a] = cVar4;
        pcVar16[0x3b] = cVar5;
        pcVar16[0x3c] = pcVar13[0x3c];
        pcVar16[0x3d] = '\0';
        FUN_00023f74(pcVar13);
        pppppppiVar24 = (int *******)strlen(pcVar16);
        if ((int *******)0xfffffff7 < pppppppiVar24) goto LAB_00079c98;
        if (pppppppiVar24 < (int *******)0xb) {
          local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar24 << 1));
          pppppppiVar17 = (int *******)((uint)&local_48 | 1);
          if (pppppppiVar24 != (int *******)0x0) goto LAB_00079210;
        }
        else {
          pppppppiVar17 = (int *******)FUN_000a0370(((uint)pppppppiVar24 | 7) + 1);
          local_48 = ((uint)pppppppiVar24 | 7) + 2;
          local_44 = pppppppiVar24;
          local_40 = pppppppiVar17;
LAB_00079210:
          __aeabi_memcpy(pppppppiVar17,pcVar16,pppppppiVar24);
        }
        *(undefined1 *)((int)pppppppiVar17 + (int)pppppppiVar24) = 0;
        FUN_0009bac8(pppppppiVar28,&local_48,*(undefined4 *)(param_2 + 0x10));
        if ((local_48 & 1) != 0) {
          FUN_00023f68(local_40,local_48 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        if (local_90 == '\0') goto LAB_00079ad4;
        pcVar13 = (char *)FUN_000a0398(0x3c);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2c] = '\0';
        pcVar13[0x2d] = '\0';
        pcVar13[0x2e] = '\0';
        pcVar13[0x2f] = '\0';
        *(undefined4 *)(pcVar13 + 0x30) = uVar26;
        *(undefined4 *)(pcVar13 + 0x34) = uVar8;
        *(undefined4 *)(pcVar13 + 0x38) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_00079ce0 + 0x792a4;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3c);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        cVar1 = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        cVar2 = pcVar13[0x38];
        pcVar16[0x33] = cVar3;
        cVar3 = pcVar13[0x39];
        pcVar16[0x37] = cVar1;
        pcVar16[0x34] = cVar4;
        pcVar16[0x35] = cVar5;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = cVar2;
        pcVar16[0x39] = cVar3;
        pcVar16[0x3a] = pcVar13[0x3a];
        pcVar16[0x3b] = '\0';
        FUN_00023f74(pcVar13);
        pppppppiVar17 = (int *******)strlen(pcVar16);
        if ((int *******)0xfffffff7 < pppppppiVar17) goto LAB_00079c98;
        if (pppppppiVar17 < (int *******)0xb) {
          pppppppiVar24 = (int *******)((uint)&local_48 | 1);
          local_48 = CONCAT31(local_48._1_3_,(char)((int)pppppppiVar17 << 1));
          if (pppppppiVar17 != (int *******)0x0) goto LAB_00079510;
        }
        else {
          pppppppiVar24 = (int *******)FUN_000a0370(((uint)pppppppiVar17 | 7) + 1);
          local_48 = ((uint)pppppppiVar17 | 7) + 2;
          local_44 = pppppppiVar17;
          local_40 = pppppppiVar24;
LAB_00079510:
          __aeabi_memcpy(pppppppiVar24,pcVar16,pppppppiVar17);
        }
        *(undefined1 *)((int)pppppppiVar24 + (int)pppppppiVar17) = 0;
        FUN_0009bac8(pppppppiVar28,&local_48,1);
        if ((local_48 & 1) != 0) {
          FUN_00023f68(local_40,local_48 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        if (local_90 == '\0') goto LAB_00079ad4;
        pcVar13 = (char *)FUN_000a0398(0x3a);
        uVar26 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        uVar8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        uVar9 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        pcVar13[0] = '\0';
        pcVar13[1] = '\0';
        pcVar13[2] = '\0';
        pcVar13[3] = '\0';
        *(undefined4 *)(pcVar13 + 4) = uVar26;
        *(undefined4 *)(pcVar13 + 8) = uVar8;
        *(undefined4 *)(pcVar13 + 0xc) = uVar9;
        pcVar13[0x10] = '\0';
        pcVar13[0x11] = '\0';
        pcVar13[0x12] = '\0';
        pcVar13[0x13] = '\0';
        *(undefined4 *)(pcVar13 + 0x14) = uVar26;
        *(undefined4 *)(pcVar13 + 0x18) = uVar8;
        *(undefined4 *)(pcVar13 + 0x1c) = uVar9;
        pcVar13[0x20] = '\0';
        pcVar13[0x21] = '\0';
        pcVar13[0x22] = '\0';
        pcVar13[0x23] = '\0';
        *(undefined4 *)(pcVar13 + 0x24) = uVar26;
        *(undefined4 *)(pcVar13 + 0x28) = uVar8;
        *(undefined4 *)(pcVar13 + 0x2c) = uVar9;
        pcVar13[0x2a] = '\0';
        pcVar13[0x2b] = '\0';
        pcVar13[0x2c] = '\0';
        pcVar13[0x2d] = '\0';
        *(undefined4 *)(pcVar13 + 0x2e) = uVar26;
        *(undefined4 *)(pcVar13 + 0x32) = uVar8;
        *(undefined4 *)(pcVar13 + 0x36) = uVar9;
        uVar15 = 0;
        iVar21 = DAT_00079ce4 + 0x795a4;
        do {
          pcVar13[uVar15] = *(byte *)(iVar21 + (uVar15 & 7)) ^ *(byte *)(iVar21 + uVar15 + 8);
          uVar15 = uVar15 + 1;
        } while (uVar15 != 0x3a);
        pcVar16 = (char *)FUN_000a0370(0x40);
        cVar1 = pcVar13[1];
        cVar2 = pcVar13[2];
        cVar3 = pcVar13[3];
        cVar4 = pcVar13[4];
        cVar5 = pcVar13[5];
        *pcVar16 = *pcVar13;
        cVar6 = pcVar13[6];
        pcVar16[1] = cVar1;
        cVar1 = pcVar13[7];
        pcVar16[2] = cVar2;
        cVar2 = pcVar13[8];
        pcVar16[3] = cVar3;
        cVar3 = pcVar13[9];
        pcVar16[4] = cVar4;
        cVar4 = pcVar13[10];
        pcVar16[5] = cVar5;
        cVar5 = pcVar13[0xb];
        pcVar16[6] = cVar6;
        cVar6 = pcVar13[0xc];
        pcVar16[7] = cVar1;
        cVar1 = pcVar13[0xd];
        pcVar16[8] = cVar2;
        cVar2 = pcVar13[0xe];
        pcVar16[9] = cVar3;
        cVar3 = pcVar13[0xf];
        pcVar16[10] = cVar4;
        cVar4 = pcVar13[0x10];
        pcVar16[0xb] = cVar5;
        cVar5 = pcVar13[0x11];
        pcVar16[0xc] = cVar6;
        cVar6 = pcVar13[0x12];
        pcVar16[0xd] = cVar1;
        cVar1 = pcVar13[0x13];
        pcVar16[0xe] = cVar2;
        cVar2 = pcVar13[0x14];
        pcVar16[0xf] = cVar3;
        cVar3 = pcVar13[0x15];
        pcVar16[0x10] = cVar4;
        cVar4 = pcVar13[0x16];
        pcVar16[0x11] = cVar5;
        cVar5 = pcVar13[0x17];
        pcVar16[0x12] = cVar6;
        cVar6 = pcVar13[0x18];
        pcVar16[0x13] = cVar1;
        cVar1 = pcVar13[0x19];
        pcVar16[0x14] = cVar2;
        cVar2 = pcVar13[0x1a];
        pcVar16[0x15] = cVar3;
        cVar3 = pcVar13[0x1b];
        pcVar16[0x16] = cVar4;
        cVar4 = pcVar13[0x1c];
        pcVar16[0x17] = cVar5;
        cVar5 = pcVar13[0x1d];
        pcVar16[0x18] = cVar6;
        cVar6 = pcVar13[0x1e];
        pcVar16[0x19] = cVar1;
        cVar1 = pcVar13[0x1f];
        pcVar16[0x1a] = cVar2;
        cVar2 = pcVar13[0x20];
        pcVar16[0x1b] = cVar3;
        cVar3 = pcVar13[0x21];
        pcVar16[0x1c] = cVar4;
        cVar4 = pcVar13[0x22];
        pcVar16[0x1d] = cVar5;
        cVar5 = pcVar13[0x23];
        pcVar16[0x1e] = cVar6;
        cVar6 = pcVar13[0x24];
        pcVar16[0x1f] = cVar1;
        cVar1 = pcVar13[0x25];
        pcVar16[0x20] = cVar2;
        cVar2 = pcVar13[0x26];
        pcVar16[0x21] = cVar3;
        cVar3 = pcVar13[0x27];
        pcVar16[0x22] = cVar4;
        cVar4 = pcVar13[0x28];
        pcVar16[0x23] = cVar5;
        cVar5 = pcVar13[0x29];
        pcVar16[0x24] = cVar6;
        cVar6 = pcVar13[0x2a];
        pcVar16[0x25] = cVar1;
        cVar1 = pcVar13[0x2b];
        pcVar16[0x26] = cVar2;
        cVar2 = pcVar13[0x2c];
        pcVar16[0x27] = cVar3;
        cVar3 = pcVar13[0x2d];
        pcVar16[0x28] = cVar4;
        cVar4 = pcVar13[0x2e];
        pcVar16[0x29] = cVar5;
        cVar5 = pcVar13[0x2f];
        pcVar16[0x2a] = cVar6;
        cVar6 = pcVar13[0x30];
        pcVar16[0x2b] = cVar1;
        cVar1 = pcVar13[0x31];
        pcVar16[0x2c] = cVar2;
        cVar2 = pcVar13[0x32];
        pcVar16[0x2d] = cVar3;
        cVar3 = pcVar13[0x33];
        pcVar16[0x2e] = cVar4;
        cVar4 = pcVar13[0x34];
        pcVar16[0x2f] = cVar5;
        cVar5 = pcVar13[0x35];
        pcVar16[0x30] = cVar6;
        cVar6 = pcVar13[0x36];
        pcVar16[0x31] = cVar1;
        pcVar16[0x37] = pcVar13[0x37];
        pcVar16[0x32] = cVar2;
        pcVar16[0x33] = cVar3;
        pcVar16[0x34] = cVar4;
        pcVar16[0x35] = cVar5;
        pcVar16[0x36] = cVar6;
        pcVar16[0x38] = pcVar13[0x38];
        pcVar16[0x39] = '\0';
        FUN_00023f74(pcVar13);
        sVar18 = strlen(pcVar16);
        if (0xfffffff7 < sVar18) {
LAB_00079c98:
                    /* WARNING: Subroutine does not return */
          FUN_00026b08();
        }
        if (sVar18 < 0xb) {
          local_128 = CONCAT31(local_128._1_3_,(char)(sVar18 << 1));
          uVar15 = uVar25;
          if (sVar18 != 0) goto LAB_000797fc;
        }
        else {
          uVar15 = FUN_000a0370((sVar18 | 7) + 1);
          local_128 = (sVar18 | 7) + 2;
          local_124 = sVar18;
          local_120 = uVar15;
LAB_000797fc:
          __aeabi_memcpy(uVar15,pcVar16,sVar18);
        }
        *(undefined1 *)(uVar15 + sVar18) = 0;
        uVar15 = *(uint *)(param_2 + 0x1c);
        if ((param_2[0x18] & 1) == 0) {
          uVar15 = (uint)(param_2[0x18] >> 1);
        }
        uVar15 = (*(code *)(*local_b8[0])[0xb0])(local_b8[0],uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079ce8 + 0x79844);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cec + 0x7985c);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cf0 + 0x79c00);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079cf4;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79c1c);
          *puVar19 = 1;
        }
        bVar7 = param_2[0x18];
        pbVar22 = *(byte **)(param_2 + 0x20);
        if ((bVar7 & 1) == 0) {
          pbVar22 = param_2 + 0x19;
        }
        uVar27 = *(uint *)(param_2 + 0x1c);
        if ((bVar7 & 1) == 0) {
          uVar27 = (uint)(bVar7 >> 1);
        }
        local_88 = uVar15;
        local_80 = pppppppiVar23;
        local_7c = uVar26;
        local_70 = (int *******)&local_80;
        (*(code *)(*local_b8[0])[0xd0])(local_b8[0],uVar15,0,uVar27,pbVar22);
        uVar15 = local_120;
        if ((local_128 & 1) == 0) {
          uVar15 = uVar25;
        }
        uVar15 = (*(code *)(*local_b8[0])[0xa7])(local_b8[0],uVar15);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079cf8 + 0x798e4);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079cfc + 0x798fc);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079d00 + 0x79c34);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079d04;
          *puVar14 = uVar26;
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79c50);
          *puVar19 = 1;
        }
        pppppppiVar28 = local_f8;
        param_2 = (byte *)(DAT_00079d08 + 0x79918);
        local_48 = uVar15;
        local_40 = pppppppiVar23;
        local_3c = uVar26;
        local_30 = (int *******)&local_40;
        uVar15 = FUN_000765d8(local_b8[0],local_b0,*(undefined4 *)(DAT_00079d08 + 0x7997c),uVar15,
                              local_88);
        pcVar13 = (char *)FUN_00025e6c(DAT_00079d0c + 0x79950);
        if (*pcVar13 == '\x01') {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079d10 + 0x79968);
          uVar26 = *puVar14;
        }
        else {
          puVar14 = (undefined4 *)FUN_00025e6c(DAT_00079d14 + 0x79c68);
          uVar26 = FUN_00076fc0();
          iVar21 = DAT_00079d18;
          *puVar14 = uVar26;
          param_2 = (byte *)(DAT_00079d1c + 0x79c8c);
          puVar19 = (undefined1 *)FUN_00025e6c(iVar21 + 0x79c88);
          *puVar19 = 1;
        }
        iVar21 = 0x10;
        local_68[0] = 0;
        local_60 = pppppppiVar23;
        local_5c = uVar26;
        local_50 = (int *******)&local_60;
        if (((uVar15 == 0) ||
            (local_11c = uVar15, FUN_0009de6c(&local_60,&local_11c),
            (int ********)local_50 == &local_60)) || (iVar21 = 0x14, local_50 != (int *******)0x0))
        {
          (**(code **)((int)*local_50 + iVar21))();
        }
        uVar15 = local_48;
        pppppppiVar17 = local_c0;
        bVar29 = local_48 != 0;
        local_48 = 0;
        if (bVar29) {
          local_11c = uVar15;
          if (local_30 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_30)[6])(local_30,&local_11c);
        }
        if ((int ********)local_30 == &local_40) {
          iVar21 = 0x10;
LAB_00079a2c:
          (**(code **)((int)*local_30 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_30 != (int *******)0x0) goto LAB_00079a2c;
        }
        uVar15 = local_88;
        local_88 = 0;
        if (uVar15 != 0) {
          local_48 = uVar15;
          if (local_70 == (int *******)0x0) goto LAB_00079b54;
          (*(code *)(*local_70)[6])(local_70,&local_48);
        }
        if ((int ********)local_70 == &local_80) {
          iVar21 = 0x10;
LAB_00079a8c:
          (**(code **)((int)*local_70 + iVar21))();
        }
        else {
          iVar21 = 0x14;
          if (local_70 != (int *******)0x0) goto LAB_00079a8c;
        }
        if ((local_128 & 1) != 0) {
          FUN_00023f68(local_120,local_128 & 0xfffffffe);
        }
        FUN_00023f68(pcVar16,0x40);
        cVar1 = '\0';
        if (local_c8 != '\0') {
          cVar1 = local_90;
        }
        if (local_c8 == '\0' || cVar1 == '\0') goto LAB_00079ad4;
      }
      FUN_0007656c(local_f0,local_e8,*(undefined4 *)(param_2 + 0x78),local_b0);
      iVar21 = (**(code **)(*local_f0 + 0x3c))();
      if (iVar21 != 0) {
        (**(code **)(*local_f0 + 0x44))();
      }
    }
    uVar15 = local_b0;
    ppppppiVar12 = local_e8;
    ppppppiVar11 = local_c0[0];
    if (local_90 == '\x01') {
      local_b0 = 0;
      if (uVar15 != 0) {
        local_48 = uVar15;
        if (local_98 == (int *******)0x0) goto LAB_00079b54;
        (*(code *)(*local_98)[6])(local_98,&local_48);
      }
      if (local_98 == pppppppiVar17 + 6) {
        iVar21 = 0x10;
      }
      else {
        iVar21 = 0x14;
        ppppppiVar12 = local_e8;
        ppppppiVar11 = local_c0[0];
        if (local_98 == (int *******)0x0) goto joined_r0x00078974;
      }
      (**(code **)((int)*local_98 + iVar21))();
      ppppppiVar12 = local_e8;
      ppppppiVar11 = local_c0[0];
    }
  }
joined_r0x00078974:
  local_c0[0] = ppppppiVar12;
  local_e8 = local_c0[0];
  if (local_c8 == '\x01') {
    local_e8 = (int ******)0x0;
    if (local_c0[0] != (int ******)0x0) {
      if (local_d0 == (int *******)0x0) {
LAB_00079b54:
                    /* WARNING: Subroutine does not return */
        FUN_000269a8();
      }
      (*(code *)(*local_d0)[6])(local_d0,local_c0);
      ppppppiVar11 = local_c0[0];
    }
    local_c0[0] = ppppppiVar11;
    if (local_d0 == pppppppiVar28 + 6) {
      iVar21 = 0x10;
    }
    else {
      iVar21 = 0x14;
      ppppppiVar11 = local_c0[0];
      if (local_d0 == (int *******)0x0) goto LAB_00078764;
    }
    (**(code **)((int)*local_d0 + iVar21))();
    ppppppiVar11 = local_c0[0];
  }
LAB_00078764:
  local_c0[0] = ppppppiVar11;
  if (**(int **)(DAT_000794ec + 0x78774) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #634
// Name: FUN_00079d20
// Address: 00079d20
// JNI: NO
// ============================================================


int * FUN_00079d20(int *param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)param_1[6];
  *param_1 = DAT_00079d74 + 0x79d40;
  if (piVar1 == param_1 + 2) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) {
      return param_1;
    }
  }
  (**(code **)(*piVar1 + iVar2))();
  return param_1;
}




// ============================================================
// Function #635
// Name: FUN_00079d78
// Address: 00079d78
// JNI: NO
// ============================================================


void FUN_00079d78(int *param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)param_1[6];
  *param_1 = DAT_00079ddc + 0x79d98;
  if (piVar1 == param_1 + 2) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_000a0320;
  }
  (**(code **)(*piVar1 + iVar2))();
LAB_000a0320:
  FUN_00023f68(param_1,0x20);
  return;
}




// ============================================================
// Function #636
// Name: FUN_00079de0
// Address: 00079de0
// JNI: NO
// ============================================================


void FUN_00079de0(int *param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)param_1[10];
  *param_1 = DAT_00079e3c + 0x79e00;
  if (piVar1 == param_1 + 6) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_000a0360;
  }
  (**(code **)(*piVar1 + iVar2))();
LAB_000a0360:
  FUN_00019df8(param_1);
  return;
}




// ============================================================
// Function #637
// Name: FUN_00079e40
// Address: 00079e40
// JNI: NO
// ============================================================


void FUN_00079e40(int *param_1)

{
  int *piVar1;
  undefined4 uVar2;
  int iVar3;
  
  piVar1 = (int *)param_1[10];
  *param_1 = DAT_00079e9c + 0x79e60;
  if (piVar1 == param_1 + 6) {
    iVar3 = 0x10;
  }
  else {
    iVar3 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_00079e88;
  }
  (**(code **)(*piVar1 + iVar3))();
LAB_00079e88:
  uVar2 = FUN_00019df8(param_1);
  FUN_00023f68(uVar2,0x30);
  return;
}




// ============================================================
// Function #638
// Name: FUN_00079ea0
// Address: 00079ea0
// JNI: NO
// ============================================================


void FUN_00079ea0(int param_1)

{
  int *piVar1;
  int iVar2;
  undefined4 local_10;
  int local_c;
  
  local_c = **(int **)(DAT_00079f3c + 0x79eb8);
  piVar1 = *(int **)(param_1 + 0x28);
  local_10 = *(undefined4 *)(param_1 + 0x10);
  if (piVar1 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*piVar1 + 0x18))(piVar1,&local_10);
  piVar1 = *(int **)(param_1 + 0x28);
  if (piVar1 == (int *)(param_1 + 0x18)) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (piVar1 == (int *)0x0) goto LAB_00079f14;
  }
  (**(code **)(*piVar1 + iVar2))();
LAB_00079f14:
  if (**(int **)(DAT_00079f40 + 0x79f24) == local_c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #639
// Name: FUN_00079f4c
// Address: 00079f4c
// JNI: NO
// ============================================================


void FUN_00079f4c(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x00079f78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #640
// Name: FUN_00079f88
// Address: 00079f88
// JNI: NO
// ============================================================


void FUN_00079f88(undefined4 param_1,undefined4 param_2,undefined4 *param_3,int *param_4)

{
  undefined4 uStack_1c;
  undefined4 uStack_18;
  undefined4 *puStack_14;
  undefined4 uStack_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007a004 + 0x79fa0);
  puStack_14 = param_3 + 2;
  uStack_10 = *param_3;
  uStack_1c = param_1;
  uStack_18 = param_2;
  if (param_4 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*param_4 + 0x18))(param_4,&uStack_1c,&uStack_10,&uStack_18,&puStack_14);
  if (**(int **)(DAT_0007a008 + 0x79fec) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




