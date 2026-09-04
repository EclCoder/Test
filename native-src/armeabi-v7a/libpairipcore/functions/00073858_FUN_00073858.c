/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00073858
 * Address  : 00073858
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


