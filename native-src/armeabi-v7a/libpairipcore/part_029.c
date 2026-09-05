// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 561-580
// ============================================================

// ============================================================
// Function #561
// Name: FUN_0002d48c
// Address: 0002d48c
// JNI: NO
// ============================================================


/* WARNING: Type propagation algorithm not settling */

void FUN_0002d48c(undefined4 param_1,undefined4 *param_2)

{
  ulonglong uVar1;
  size_t sVar2;
  ulonglong *puVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  char *pcVar7;
  uint uVar8;
  ulonglong uVar9;
  undefined8 local_d8;
  char *local_d0;
  uint local_cc;
  size_t local_c8;
  uint local_c4;
  ulonglong local_c0;
  undefined4 local_b8;
  uint local_b0;
  uint local_ac;
  uint local_a8;
  char acStack_a0 [32];
  char acStack_80 [92];
  int local_24;
  
  local_24 = **(int **)(DAT_0002d780 + 0x2d4a4);
  if ((code *)*param_2 != (code *)0x0) {
    if (**(int **)(DAT_0002d784 + 0x2d4cc) == local_24) {
                    /* WARNING: Could not recover jumptable at 0x0002d4e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*param_2)(param_1,DAT_0002d788 + 0x2d4e4,param_2[1]);
      return;
    }
    goto LAB_0002d724;
  }
  __system_property_read(param_1,acStack_a0,acStack_80);
  sVar2 = strlen(acStack_a0);
  if (0xfffffff7 < sVar2) goto LAB_0002d77c;
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_cc | 1;
    local_cc = CONCAT31(local_cc._1_3_,(char)(sVar2 << 1));
    if (sVar2 != 0) goto LAB_0002d554;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_cc = (sVar2 | 7) + 2;
    local_c8 = sVar2;
    local_c4 = uVar8;
LAB_0002d554:
    __aeabi_memcpy(uVar8,acStack_a0,sVar2);
  }
  iVar4 = DAT_0002d78c + 0x2d578;
  *(undefined1 *)(uVar8 + sVar2) = 0;
  puVar3 = (ulonglong *)FUN_0001a414(&local_cc,iVar4);
  local_c0 = *puVar3;
  local_b8 = (undefined4)puVar3[1];
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  sVar2 = strlen(acStack_80);
  if (0xfffffff7 < sVar2) {
LAB_0002d77c:
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_b0 | 1;
    local_b0 = CONCAT31(local_b0._1_3_,(char)(sVar2 << 1));
    if (sVar2 != 0) goto LAB_0002d5f0;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_b0 = (sVar2 | 7) + 2;
    local_ac = sVar2;
    local_a8 = uVar8;
LAB_0002d5f0:
    __aeabi_memcpy(uVar8,acStack_80,sVar2);
  }
  *(undefined1 *)(uVar8 + sVar2) = 0;
  uVar5 = local_a8;
  uVar8 = local_ac;
  if ((local_b0 & 1) == 0) {
    uVar8 = local_b0 >> 1 & 0x7f;
    uVar5 = (uint)&local_b0 | 1;
  }
  puVar3 = (ulonglong *)FUN_0001a178(&local_c0,uVar5,uVar8);
  uVar9 = *puVar3;
  local_d0 = *(char **)(puVar3 + 1);
  local_d8._0_1_ = (byte)uVar9;
  uVar8 = 0xcbf29ce4;
  uVar5 = 0x84222325;
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  local_d8._4_4_ = (uint)(uVar9 >> 0x20);
  pcVar7 = local_d0;
  if ((uVar9 & 1) == 0) {
    pcVar7 = (char *)((uint)&local_d8 | 1);
    local_d8._4_4_ = (uint)((byte)local_d8 >> 1);
  }
  for (; local_d8._4_4_ != 0; local_d8._4_4_ = local_d8._4_4_ - 1) {
    uVar1 = (ulonglong)uVar5;
    iVar4 = uVar5 * 0x100;
    uVar5 = (uint)(uVar1 * 0x1b3) ^ (int)*pcVar7;
    uVar8 = uVar8 * 0x1b3 + (int)(uVar1 * 0x1b3 >> 0x20) + iVar4 ^ (int)*pcVar7 >> 0x1f;
    pcVar7 = pcVar7 + 1;
  }
  local_d8 = uVar9;
  if ((uVar9 & 1) != 0) {
    local_d8._0_4_ = (uint)uVar9;
    uVar6 = (uint)local_d8 & 0xfffffffe;
    FUN_00023f68(local_d0,uVar6);
  }
  if ((local_b0 & 1) != 0) {
    FUN_00023f68(local_a8,local_b0 & 0xfffffffe);
  }
  if ((local_c0 & 1) != 0) {
    FUN_00023f68(local_b8,(uint)local_c0 & 0xfffffffe);
  }
  if ((local_cc & 1) != 0) {
    FUN_00023f68(local_c4,local_cc & 0xfffffffe);
  }
  local_a8 = 0;
  local_b0 = uVar5;
  local_ac = uVar8;
  FUN_00028a34(&local_c0,param_2[1],uVar5,uVar8);
  if (**(int **)(DAT_0002d790 + 0x2d714) == local_24) {
    return;
  }
LAB_0002d724:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #562
// Name: FUN_0002d794
// Address: 0002d794
// JNI: NO
// ============================================================


/* WARNING: Type propagation algorithm not settling */

void FUN_0002d794(undefined4 param_1,char *param_2,char *param_3)

{
  ulonglong uVar1;
  size_t sVar2;
  ulonglong *puVar3;
  int iVar4;
  uint uVar5;
  uint uVar6;
  char *pcVar7;
  uint uVar8;
  ulonglong uVar9;
  uint local_5c;
  size_t local_58;
  uint local_54;
  undefined8 local_50;
  char *local_48;
  uint local_44;
  uint local_40;
  uint local_3c;
  undefined8 local_38;
  undefined4 local_30;
  int local_24;
  
  local_24 = **(int **)(DAT_0002da44 + 0x2d7b4);
  sVar2 = strlen(param_2);
  if (0xfffffff7 < sVar2) goto LAB_0002da40;
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_5c | 1;
    local_5c = CONCAT31(local_5c._1_3_,(char)(sVar2 << 1));
    if (sVar2 != 0) goto LAB_0002d814;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_5c = (sVar2 | 7) + 2;
    local_58 = sVar2;
    local_54 = uVar8;
LAB_0002d814:
    __aeabi_memcpy(uVar8,param_2,sVar2);
  }
  iVar4 = DAT_0002da48 + 0x2d838;
  *(undefined1 *)(uVar8 + sVar2) = 0;
  puVar3 = (ulonglong *)FUN_0001a414(&local_5c,iVar4);
  local_38 = *puVar3;
  local_30 = (undefined4)puVar3[1];
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  sVar2 = strlen(param_3);
  if (0xfffffff7 < sVar2) {
LAB_0002da40:
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  if (sVar2 < 0xb) {
    uVar8 = (uint)&local_44 | 1;
    local_44 = CONCAT31(local_44._1_3_,(char)(sVar2 << 1));
    if (sVar2 == 0) goto LAB_0002d8c0;
  }
  else {
    uVar8 = FUN_000a0370((sVar2 | 7) + 1);
    local_44 = (sVar2 | 7) + 2;
    local_40 = sVar2;
    local_3c = uVar8;
  }
  __aeabi_memcpy(uVar8,param_3,sVar2);
LAB_0002d8c0:
  *(undefined1 *)(uVar8 + sVar2) = 0;
  uVar8 = local_40;
  uVar5 = local_3c;
  if ((local_44 & 1) == 0) {
    uVar5 = (uint)&local_44 | 1;
    uVar8 = local_44 >> 1 & 0x7f;
  }
  puVar3 = (ulonglong *)FUN_0001a178(&local_38,uVar5,uVar8);
  uVar9 = *puVar3;
  local_48 = *(char **)(puVar3 + 1);
  local_50._0_1_ = (byte)uVar9;
  uVar8 = 0xcbf29ce4;
  local_50._4_4_ = (uint)(uVar9 >> 0x20);
  pcVar7 = local_48;
  if ((uVar9 & 1) == 0) {
    local_50._4_4_ = (uint)((byte)local_50 >> 1);
    pcVar7 = (char *)((uint)&local_50 | 1);
  }
  uVar5 = 0x84222325;
  *(undefined4 *)puVar3 = 0;
  *(undefined4 *)((int)puVar3 + 4) = 0;
  *(undefined4 *)(puVar3 + 1) = 0;
  for (; local_50._4_4_ != 0; local_50._4_4_ = local_50._4_4_ - 1) {
    uVar1 = (ulonglong)uVar5;
    iVar4 = uVar5 * 0x100;
    uVar5 = (uint)(uVar1 * 0x1b3) ^ (int)*pcVar7;
    uVar8 = uVar8 * 0x1b3 + (int)(uVar1 * 0x1b3 >> 0x20) + iVar4 ^ (int)*pcVar7 >> 0x1f;
    pcVar7 = pcVar7 + 1;
  }
  local_50 = uVar9;
  if ((uVar9 & 1) != 0) {
    local_50._0_4_ = (uint)uVar9;
    uVar6 = (uint)local_50 & 0xfffffffe;
    FUN_00023f68(local_48,uVar6);
  }
  if ((local_44 & 1) != 0) {
    FUN_00023f68(local_3c,local_44 & 0xfffffffe);
  }
  if ((local_38 & 1) != 0) {
    FUN_00023f68(local_30,(uint)local_38 & 0xfffffffe);
  }
  if ((local_5c & 1) != 0) {
    FUN_00023f68(local_54,local_5c & 0xfffffffe);
  }
  local_30 = 0;
  local_38 = CONCAT44(uVar8,uVar5);
  FUN_00028a34(&local_44,param_1,uVar5,uVar8,&local_38);
  if (**(int **)(DAT_0002da4c + 0x2d9d8) == local_24) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #563
// Name: FUN_0002da50
// Address: 0002da50
// JNI: NO
// ============================================================


/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_0002da50(uint *param_1,undefined1 param_2,undefined1 *param_3,uint param_4,
                 undefined1 *param_5,uint param_6,undefined1 *param_7,uint param_8)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint *puVar11;
  uint uVar12;
  uint uVar13;
  uint *puVar14;
  int iVar15;
  bool bVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 *local_218;
  undefined8 *local_214;
  uint local_210;
  uint uStack_20c;
  uint uStack_208;
  uint uStack_204;
  uint local_200;
  uint uStack_1fc;
  uint uStack_1f8;
  uint uStack_1f4;
  undefined8 local_1f0;
  undefined8 local_1e8;
  longlong local_1e0;
  undefined8 uStack_1d8;
  longlong local_1d0;
  undefined4 uStack_1c8;
  undefined4 uStack_1c4;
  undefined4 local_1c0;
  uint uStack_1bc;
  undefined4 uStack_1b8;
  undefined4 uStack_1b4;
  undefined4 local_1b0;
  undefined4 local_1ac;
  undefined1 auStack_1a8 [32];
  uint local_188;
  uint uStack_184;
  uint uStack_180;
  uint uStack_17c;
  uint local_178;
  uint uStack_174;
  uint uStack_170;
  uint uStack_16c;
  uint local_168;
  uint uStack_164;
  uint local_160;
  uint local_15c;
  uint local_158;
  uint uStack_154;
  uint local_150;
  uint local_14c;
  uint local_148;
  uint *puStack_144;
  undefined4 local_140;
  undefined4 uStack_13c;
  undefined4 local_138;
  int iStack_134;
  undefined4 uStack_130;
  undefined4 uStack_12c;
  undefined4 local_128;
  int iStack_124;
  undefined4 uStack_120;
  undefined4 uStack_11c;
  undefined4 local_118;
  int iStack_114;
  undefined4 uStack_110;
  undefined4 uStack_10c;
  undefined4 local_108;
  undefined4 local_104;
  undefined1 auStack_100 [32];
  uint local_e0;
  uint uStack_dc;
  uint uStack_d8;
  uint uStack_d4;
  uint local_d0;
  uint uStack_cc;
  uint uStack_c8;
  uint uStack_c4;
  uint local_c0;
  uint uStack_bc;
  uint local_b8;
  uint local_b4;
  uint local_b0;
  uint uStack_ac;
  uint local_a8;
  uint local_a4;
  uint local_a0;
  uint uStack_9c;
  uint uStack_98;
  uint uStack_94;
  uint local_90;
  uint uStack_8c;
  uint uStack_88;
  uint uStack_84;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  int local_54;
  
  puStack_144 = *(uint **)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  local_140 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_13c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  uVar17 = *(undefined8 *)(DAT_0002ea5c + 0x2da88);
  uVar18 = *(undefined8 *)(DAT_0002ea5c + 0x2da90);
  uVar19 = *(undefined8 *)(DAT_0002ea5c + 0x2da98);
  uVar20 = *(undefined8 *)(DAT_0002ea5c + 0x2daa0);
  local_54 = **(int **)(DAT_0002ea60 + 0x2da90);
  local_148 = 0;
  local_138 = 0;
  local_128 = 0;
  local_a0 = *param_1;
  uStack_9c = param_1[1];
  uStack_98 = param_1[2];
  uStack_94 = param_1[3];
  local_118 = 0;
  local_90 = param_1[4];
  uStack_8c = param_1[5];
  uStack_88 = param_1[6];
  uStack_84 = param_1[7];
  local_108 = 0;
  uVar21 = *(undefined8 *)(DAT_0002ea5c + 0x2daa8);
  local_104 = 0;
  local_80 = CONCAT44(&local_1e8,&local_1f0);
  local_1f0 = uVar17;
  local_1e8 = uVar18;
  local_1e0 = uVar19;
  uStack_1d8 = uVar20;
  local_1d0 = uVar21;
  iStack_134 = (int)puStack_144;
  uStack_130 = local_140;
  uStack_12c = uStack_13c;
  iStack_124 = (int)puStack_144;
  uStack_120 = local_140;
  uStack_11c = uStack_13c;
  iStack_114 = (int)puStack_144;
  uStack_110 = local_140;
  uStack_10c = uStack_13c;
  FUN_0002737c(auStack_100,&local_80);
  auVar1._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
  auVar1._0_8_ = 0x3636363636363636;
  auVar1 = auVar1 << 0x40 | auVar1;
  local_e0 = local_a0 ^ *(uint *)auVar1;
  uStack_dc = uStack_9c ^ *(uint *)(auVar1 + (undefined1  [16])0x4);
  uStack_d8 = uStack_98 ^ *(uint *)(auVar1 + (undefined1  [16])0x8);
  uStack_d4 = uStack_94 ^ *(uint *)(auVar1 + (undefined1  [16])0xc);
  uStack_bc = 0x36363636;
  bVar16 = 0xffffffbf < local_148;
  uVar10 = local_148 & 0x3f;
  local_148 = local_148 + 0x40;
  puStack_144 = (uint *)((int)puStack_144 + (uint)bVar16);
  local_c0 = 0x36363636;
  iVar15 = 0x68;
  local_d0 = local_90 ^ *(uint *)auVar1;
  uStack_cc = uStack_8c ^ *(uint *)(auVar1 + (undefined1  [16])0x4);
  uStack_c8 = uStack_88 ^ *(uint *)(auVar1 + (undefined1  [16])0x8);
  uStack_c4 = uStack_84 ^ *(uint *)(auVar1 + (undefined1  [16])0xc);
  local_b8 = 0x36363636;
  local_b4 = 0x36363636;
  local_b0 = 0x36363636;
  uStack_ac = 0x36363636;
  local_a8 = 0x36363636;
  local_a4 = 0x36363636;
  do {
    *(undefined1 *)((int)&local_140 + uVar10) = *(undefined1 *)((int)&local_148 + iVar15);
    uVar10 = uVar10 + 1;
    if (uVar10 == 0x40) {
      FUN_000284f4(&local_148);
      uVar10 = 0;
    }
    iVar15 = iVar15 + 1;
  } while (iVar15 != 0xa8);
  auVar2._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
  auVar2._0_8_ = 0x6a6a6a6a6a6a6a6a;
  auVar2 = auVar2 << 0x40 | auVar2;
  uVar10 = *(uint *)auVar2;
  uVar12 = *(uint *)(auVar2 + (undefined1  [16])0x4);
  uVar5 = *(uint *)(auVar2 + (undefined1  [16])0x8);
  uVar6 = *(uint *)(auVar2 + (undefined1  [16])0xc);
  local_e0 = local_e0 ^ uVar10;
  uStack_dc = uStack_dc ^ uVar12;
  uStack_d8 = uStack_d8 ^ uVar5;
  uStack_d4 = uStack_d4 ^ uVar6;
  local_d0 = local_d0 ^ uVar10;
  uStack_cc = uStack_cc ^ uVar12;
  uStack_c8 = uStack_c8 ^ uVar5;
  uStack_c4 = uStack_c4 ^ uVar6;
  local_c0 = local_c0 ^ uVar10;
  uStack_bc = uStack_bc ^ uVar12;
  local_b8 = local_b8 ^ uVar5;
  local_b4 = local_b4 ^ uVar6;
  local_b0 = local_b0 ^ uVar10;
  uStack_ac = uStack_ac ^ uVar12;
  local_a8 = local_a8 ^ uVar5;
  local_a4 = local_a4 ^ uVar6;
  puVar14 = param_1 + 8;
  puVar11 = (uint *)FUN_000a0370(0x28);
  uVar10 = param_1[9];
  uVar12 = param_1[10];
  uVar5 = param_1[0xb];
  uVar6 = param_1[0xc];
  uVar7 = param_1[0xd];
  uVar8 = param_1[0xe];
  uVar9 = param_1[0xf];
  uVar13 = local_148 & 0x3f;
  *puVar11 = *puVar14;
  puVar11[1] = uVar10;
  puVar11[2] = uVar12;
  puVar11[3] = uVar5;
  puVar11[4] = uVar6;
  puVar11[5] = uVar7;
  puVar11[6] = uVar8;
  puVar11[7] = uVar9;
  *(char *)((int)&local_140 + uVar13) = (char)*puVar11;
  *(undefined1 *)(puVar11 + 8) = 0;
  bVar16 = 0xffffffdf < local_148;
  local_148 = local_148 + 0x20;
  puStack_144 = (uint *)((int)puStack_144 + (uint)bVar16);
  if (uVar13 == 0x3f) {
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 1));
    iVar15 = 1;
LAB_0002dcd0:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 2);
    iVar15 = iVar15 + 1;
LAB_0002dcdc:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 3);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002dd54;
    }
    *(char *)((int)&local_140 + iVar15 + 1) = (char)puVar11[1];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002dd60;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 5));
    iVar15 = 1;
LAB_0002dd80:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 6);
    iVar15 = iVar15 + 1;
LAB_0002ddbc:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 7);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002dddc;
    }
    *(char *)((int)&local_140 + iVar15 + 1) = (char)puVar11[2];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002de18;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 9));
    iVar15 = 1;
LAB_0002de38:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 10);
    iVar15 = iVar15 + 1;
LAB_0002de74:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0xb);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002de94;
    }
    *(char *)((int)&local_140 + iVar15 + 1) = (char)puVar11[3];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002ded0;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0xd));
    iVar15 = 1;
LAB_0002def0:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0xe);
    iVar15 = iVar15 + 1;
LAB_0002df2c:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0xf);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002df4c;
    }
    *(char *)((int)&local_140 + iVar15 + 1) = (char)puVar11[4];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002df88;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0x11));
    iVar15 = 1;
LAB_0002dfa8:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x12);
    iVar15 = iVar15 + 1;
LAB_0002dfe4:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x13);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002e004;
    }
    *(char *)((int)&local_140 + iVar15 + 1) = (char)puVar11[5];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e040;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0x15));
    iVar15 = 1;
LAB_0002e060:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x16);
    iVar15 = iVar15 + 1;
LAB_0002e09c:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x17);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002e0bc;
    }
    *(char *)((int)&local_140 + iVar15 + 1) = (char)puVar11[6];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e0f8;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0x19));
    iVar15 = 1;
LAB_0002e118:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1a);
    iVar15 = iVar15 + 1;
LAB_0002e154:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1b);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002e174;
    }
    *(char *)((int)&local_140 + iVar15 + 1) = (char)puVar11[7];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e1b0;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0x1d));
    iVar15 = 1;
LAB_0002e1d0:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1e);
    iVar15 = iVar15 + 1;
LAB_0002e208:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1f);
  }
  else {
    *(undefined1 *)((int)&local_140 + uVar13 + 1) = *(undefined1 *)((int)puVar11 + 1);
    if (uVar13 == 0x3e) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002dcd0;
    }
    *(undefined1 *)((int)&local_140 + uVar13 + 2) = *(undefined1 *)((int)puVar11 + 2);
    iVar15 = uVar13 + 3;
    if (iVar15 != 0x40) goto LAB_0002dcdc;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 3));
    iVar15 = 1;
LAB_0002dd54:
    *(char *)((int)&local_140 + iVar15) = (char)puVar11[1];
    iVar15 = iVar15 + 1;
LAB_0002dd60:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 5);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002dd80;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 6);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002ddbc;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 7));
    iVar15 = 1;
LAB_0002dddc:
    *(char *)((int)&local_140 + iVar15) = (char)puVar11[2];
    iVar15 = iVar15 + 1;
LAB_0002de18:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 9);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002de38;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 10);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002de74;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0xb));
    iVar15 = 1;
LAB_0002de94:
    *(char *)((int)&local_140 + iVar15) = (char)puVar11[3];
    iVar15 = iVar15 + 1;
LAB_0002ded0:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0xd);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002def0;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0xe);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002df2c;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0xf));
    iVar15 = 1;
LAB_0002df4c:
    *(char *)((int)&local_140 + iVar15) = (char)puVar11[4];
    iVar15 = iVar15 + 1;
LAB_0002df88:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x11);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002dfa8;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x12);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002dfe4;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0x13));
    iVar15 = 1;
LAB_0002e004:
    *(char *)((int)&local_140 + iVar15) = (char)puVar11[5];
    iVar15 = iVar15 + 1;
LAB_0002e040:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x15);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002e060;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x16);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e09c;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0x17));
    iVar15 = 1;
LAB_0002e0bc:
    *(char *)((int)&local_140 + iVar15) = (char)puVar11[6];
    iVar15 = iVar15 + 1;
LAB_0002e0f8:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x19);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002e118;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x1a);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e154;
    FUN_000284f4(&local_148);
    local_140 = CONCAT31(local_140._1_3_,*(undefined1 *)((int)puVar11 + 0x1b));
    iVar15 = 1;
LAB_0002e174:
    *(char *)((int)&local_140 + iVar15) = (char)puVar11[7];
    iVar15 = iVar15 + 1;
LAB_0002e1b0:
    *(undefined1 *)((int)&local_140 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1d);
    if (iVar15 == 0x3f) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002e1d0;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x1e);
    if (iVar15 == 0x3e) {
      FUN_000284f4(&local_148);
      iVar15 = 0;
      goto LAB_0002e208;
    }
    *(undefined1 *)((int)&local_140 + iVar15 + 2) = *(undefined1 *)((int)puVar11 + 0x1f);
    if (iVar15 == 0x3d) {
      FUN_000284f4(&local_148);
    }
  }
  FUN_00023f68(puVar11,0x28);
  uVar10 = local_148 & 0x3f;
  bVar16 = 0xfffffffe < local_148;
  local_148 = local_148 + 1;
  puStack_144 = (uint *)((int)puStack_144 + (uint)bVar16);
  puVar11 = puStack_144;
  if (uVar10 == 0x3f) {
    puVar11 = &local_148;
  }
  *(undefined1 *)((int)&local_140 + uVar10) = param_2;
  if (uVar10 == 0x3f) {
    FUN_000284f4(puVar11);
  }
  puStack_144 = (uint *)((int)puStack_144 + (uint)CARRY4(local_148,param_4));
  uVar10 = local_148 + param_4;
  if (param_4 != 0) {
    uVar12 = local_148 & 0x3f;
    local_148 = local_148 + param_4;
    do {
      *(undefined1 *)((int)&local_140 + uVar12) = *param_3;
      uVar12 = uVar12 + 1;
      if (uVar12 == 0x40) {
        FUN_000284f4(&local_148);
        uVar12 = 0;
      }
      param_4 = param_4 - 1;
      param_3 = param_3 + 1;
      uVar10 = local_148;
    } while (param_4 != 0);
  }
  local_148 = uVar10;
  puStack_144 = (uint *)((int)puStack_144 + (uint)CARRY4(local_148,param_6));
  uVar10 = local_148 + param_6;
  if (param_6 != 0) {
    uVar12 = local_148 & 0x3f;
    local_148 = local_148 + param_6;
    do {
      *(undefined1 *)((int)&local_140 + uVar12) = *param_5;
      uVar12 = uVar12 + 1;
      if (uVar12 == 0x40) {
        FUN_000284f4(&local_148);
        uVar12 = 0;
      }
      param_6 = param_6 - 1;
      param_5 = param_5 + 1;
      uVar10 = local_148;
    } while (param_6 != 0);
  }
  local_148 = uVar10;
  puStack_144 = (uint *)((int)puStack_144 + (uint)CARRY4(local_148,param_8));
  uVar10 = local_148 + param_8;
  if (param_8 != 0) {
    uVar12 = local_148 & 0x3f;
    local_148 = local_148 + param_8;
    do {
      *(undefined1 *)((int)&local_140 + uVar12) = *param_7;
      uVar12 = uVar12 + 1;
      if (uVar12 == 0x40) {
        FUN_000284f4(&local_148);
        uVar12 = 0;
      }
      param_8 = param_8 - 1;
      param_7 = param_7 + 1;
      uVar10 = local_148;
    } while (param_8 != 0);
  }
  local_148 = uVar10;
  FUN_0002747c(&local_210,&local_148);
  uStack_1bc = *(uint *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uStack_1c8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_1c4 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  *param_1 = local_210;
  param_1[1] = uStack_20c;
  param_1[2] = uStack_208;
  param_1[3] = uStack_204;
  param_1[4] = local_200;
  param_1[5] = uStack_1fc;
  param_1[6] = uStack_1f8;
  param_1[7] = uStack_1f4;
  local_1f0._0_4_ = 0;
  local_1e8 = CONCAT44(uStack_1c4,uStack_1c8);
  local_1e0 = (ulonglong)uStack_1bc << 0x20;
  uStack_1d8 = CONCAT44(uStack_1c4,uStack_1c8);
  local_1d0 = (ulonglong)uStack_1bc << 0x20;
  local_1c0 = 0;
  local_1b0 = 0;
  local_214 = &uStack_78;
  local_1ac = 0;
  local_218 = &local_80;
  uStack_1b8 = uStack_1c8;
  uStack_1b4 = uStack_1c4;
  local_80 = uVar17;
  uStack_78 = uVar18;
  local_70 = uVar19;
  uStack_68 = uVar20;
  local_60 = uVar21;
  local_1f0._4_4_ = uStack_1bc;
  FUN_0002737c(auStack_1a8,&local_218);
  auVar3._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
  auVar3._0_8_ = 0x3636363636363636;
  auVar3 = auVar3 << 0x40 | auVar3;
  local_158 = 0x36363636;
  local_188 = local_210 ^ *(uint *)auVar3;
  uStack_184 = uStack_20c ^ *(uint *)(auVar3 + (undefined1  [16])0x4);
  uStack_180 = uStack_208 ^ *(uint *)(auVar3 + (undefined1  [16])0x8);
  uStack_17c = uStack_204 ^ *(uint *)(auVar3 + (undefined1  [16])0xc);
  local_178 = local_200 ^ *(uint *)auVar3;
  uStack_174 = uStack_1fc ^ *(uint *)(auVar3 + (undefined1  [16])0x4);
  uStack_170 = uStack_1f8 ^ *(uint *)(auVar3 + (undefined1  [16])0x8);
  uStack_16c = uStack_1f4 ^ *(uint *)(auVar3 + (undefined1  [16])0xc);
  local_15c = 0x36363636;
  local_160 = 0x36363636;
  uVar10 = (uint)local_1f0 & 0x3f;
  uStack_154 = 0x36363636;
  local_150 = 0x36363636;
  local_14c = 0x36363636;
  uStack_164 = 0x36363636;
  local_168 = 0x36363636;
  iVar15 = 0x68;
  local_1f0 = CONCAT44(local_1f0._4_4_ + (0xffffffbf < (uint)local_1f0),(uint)local_1f0 + 0x40);
  do {
    *(undefined1 *)((int)&local_1e8 + uVar10) = *(undefined1 *)((int)&local_1f0 + iVar15);
    uVar10 = uVar10 + 1;
    if (uVar10 == 0x40) {
      FUN_000284f4(&local_1f0);
      uVar10 = 0;
    }
    iVar15 = iVar15 + 1;
  } while (iVar15 != 0xa8);
  auVar4._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
  auVar4._0_8_ = 0x6a6a6a6a6a6a6a6a;
  auVar4 = auVar4 << 0x40 | auVar4;
  uVar10 = *(uint *)auVar4;
  uVar12 = *(uint *)(auVar4 + (undefined1  [16])0x4);
  uVar5 = *(uint *)(auVar4 + (undefined1  [16])0x8);
  uVar6 = *(uint *)(auVar4 + (undefined1  [16])0xc);
  local_188 = local_188 ^ uVar10;
  uStack_184 = uStack_184 ^ uVar12;
  uStack_180 = uStack_180 ^ uVar5;
  uStack_17c = uStack_17c ^ uVar6;
  local_178 = local_178 ^ uVar10;
  uStack_174 = uStack_174 ^ uVar12;
  uStack_170 = uStack_170 ^ uVar5;
  uStack_16c = uStack_16c ^ uVar6;
  local_168 = local_168 ^ uVar10;
  uStack_164 = uStack_164 ^ uVar12;
  local_160 = local_160 ^ uVar5;
  local_15c = local_15c ^ uVar6;
  local_158 = local_158 ^ uVar10;
  uStack_154 = uStack_154 ^ uVar12;
  local_150 = local_150 ^ uVar5;
  local_14c = local_14c ^ uVar6;
  puVar11 = (uint *)FUN_000a0370(0x28);
  uVar13 = (uint)local_1f0 & 0x3f;
  uVar10 = param_1[9];
  uVar12 = param_1[10];
  uVar5 = param_1[0xb];
  uVar6 = param_1[0xc];
  uVar7 = param_1[0xd];
  uVar8 = param_1[0xe];
  uVar9 = param_1[0xf];
  *puVar11 = *puVar14;
  puVar11[1] = uVar10;
  puVar11[2] = uVar12;
  puVar11[3] = uVar5;
  puVar11[4] = uVar6;
  puVar11[5] = uVar7;
  puVar11[6] = uVar8;
  puVar11[7] = uVar9;
  *(char *)((int)&local_1e8 + uVar13) = (char)*puVar11;
  *(undefined1 *)(puVar11 + 8) = 0;
  local_1f0 = CONCAT44(local_1f0._4_4_ + (0xffffffdf < (uint)local_1f0),(uint)local_1f0 + 0x20);
  if (uVar13 + 1 == 0x40) {
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 1));
    iVar15 = 1;
LAB_0002e57c:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 2);
    iVar15 = iVar15 + 1;
LAB_0002e588:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 3);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e600;
    }
    *(char *)((int)&local_1e8 + iVar15 + 1) = (char)puVar11[1];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e60c;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 5));
    iVar15 = 1;
LAB_0002e62c:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 6);
    iVar15 = iVar15 + 1;
LAB_0002e668:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 7);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e688;
    }
    *(char *)((int)&local_1e8 + iVar15 + 1) = (char)puVar11[2];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e6c4;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 9));
    iVar15 = 1;
LAB_0002e6e4:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 10);
    iVar15 = iVar15 + 1;
LAB_0002e720:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0xb);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e740;
    }
    *(char *)((int)&local_1e8 + iVar15 + 1) = (char)puVar11[3];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e77c;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0xd));
    iVar15 = 1;
LAB_0002e79c:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0xe);
    iVar15 = iVar15 + 1;
LAB_0002e7d8:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0xf);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e7f8;
    }
    *(char *)((int)&local_1e8 + iVar15 + 1) = (char)puVar11[4];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e834;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0x11));
    iVar15 = 1;
LAB_0002e854:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x12);
    iVar15 = iVar15 + 1;
LAB_0002e890:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x13);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e8b0;
    }
    *(char *)((int)&local_1e8 + iVar15 + 1) = (char)puVar11[5];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e8ec;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0x15));
    iVar15 = 1;
LAB_0002e90c:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x16);
    iVar15 = iVar15 + 1;
LAB_0002e948:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x17);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e968;
    }
    *(char *)((int)&local_1e8 + iVar15 + 1) = (char)puVar11[6];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e9a4;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0x19));
    iVar15 = 1;
LAB_0002e9c4:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1a);
    iVar15 = iVar15 + 1;
LAB_0002ea00:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1b);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002ea20;
    }
    *(char *)((int)&local_1e8 + iVar15 + 1) = (char)puVar11[7];
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002ea64;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0x1d));
    iVar15 = 1;
LAB_0002ea84:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1e);
    iVar15 = iVar15 + 1;
  }
  else {
    *(undefined1 *)((int)&local_1e8 + uVar13 + 1) = *(undefined1 *)((int)puVar11 + 1);
    if (uVar13 + 2 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e57c;
    }
    *(undefined1 *)((int)&local_1e8 + uVar13 + 2) = *(undefined1 *)((int)puVar11 + 2);
    iVar15 = uVar13 + 3;
    if (iVar15 != 0x40) goto LAB_0002e588;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 3));
    iVar15 = 1;
LAB_0002e600:
    *(char *)((int)&local_1e8 + iVar15) = (char)puVar11[1];
    iVar15 = iVar15 + 1;
LAB_0002e60c:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 5);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e62c;
    }
    *(undefined1 *)((int)&local_1e8 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 6);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e668;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 7));
    iVar15 = 1;
LAB_0002e688:
    *(char *)((int)&local_1e8 + iVar15) = (char)puVar11[2];
    iVar15 = iVar15 + 1;
LAB_0002e6c4:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 9);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e6e4;
    }
    *(undefined1 *)((int)&local_1e8 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 10);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e720;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0xb));
    iVar15 = 1;
LAB_0002e740:
    *(char *)((int)&local_1e8 + iVar15) = (char)puVar11[3];
    iVar15 = iVar15 + 1;
LAB_0002e77c:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0xd);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e79c;
    }
    *(undefined1 *)((int)&local_1e8 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0xe);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e7d8;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0xf));
    iVar15 = 1;
LAB_0002e7f8:
    *(char *)((int)&local_1e8 + iVar15) = (char)puVar11[4];
    iVar15 = iVar15 + 1;
LAB_0002e834:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x11);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e854;
    }
    *(undefined1 *)((int)&local_1e8 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x12);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e890;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0x13));
    iVar15 = 1;
LAB_0002e8b0:
    *(char *)((int)&local_1e8 + iVar15) = (char)puVar11[5];
    iVar15 = iVar15 + 1;
LAB_0002e8ec:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x15);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e90c;
    }
    *(undefined1 *)((int)&local_1e8 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x16);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002e948;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0x17));
    iVar15 = 1;
LAB_0002e968:
    *(char *)((int)&local_1e8 + iVar15) = (char)puVar11[6];
    iVar15 = iVar15 + 1;
LAB_0002e9a4:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x19);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002e9c4;
    }
    *(undefined1 *)((int)&local_1e8 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x1a);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) goto LAB_0002ea00;
    FUN_000284f4(&local_1f0);
    local_1e8 = CONCAT71(local_1e8._1_7_,*(undefined1 *)((int)puVar11 + 0x1b));
    iVar15 = 1;
LAB_0002ea20:
    *(char *)((int)&local_1e8 + iVar15) = (char)puVar11[7];
    iVar15 = iVar15 + 1;
LAB_0002ea64:
    *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1d);
    if (iVar15 + 1 == 0x40) {
      FUN_000284f4(&local_1f0);
      iVar15 = 0;
      goto LAB_0002ea84;
    }
    *(undefined1 *)((int)&local_1e8 + iVar15 + 1) = *(undefined1 *)((int)puVar11 + 0x1e);
    iVar15 = iVar15 + 2;
    if (iVar15 != 0x40) {
      *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1f);
      if (iVar15 == 0x3f) {
        FUN_000284f4(&local_1f0);
      }
      goto LAB_0002eac4;
    }
    FUN_000284f4(&local_1f0);
    iVar15 = 0;
  }
  *(undefined1 *)((int)&local_1e8 + iVar15) = *(undefined1 *)((int)puVar11 + 0x1f);
LAB_0002eac4:
  FUN_00023f68(puVar11,0x28);
  FUN_0002747c(&local_80,&local_1f0);
  *puVar14 = (uint)local_80;
  param_1[9] = local_80._4_4_;
  param_1[10] = (uint)uStack_78;
  param_1[0xb] = uStack_78._4_4_;
  param_1[0xc] = (uint)local_70;
  param_1[0xd] = local_70._4_4_;
  param_1[0xe] = (uint)uStack_68;
  param_1[0xf] = uStack_68._4_4_;
  if (**(int **)(DAT_0002eb48 + 0x2eafc) == local_54) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #564
// Name: FUN_0002eb4c
// Address: 0002eb4c
// JNI: NO
// ============================================================


void FUN_0002eb4c(undefined4 *param_1,int param_2,uint *param_3)

{
  longlong lVar1;
  uint uVar2;
  undefined4 *puVar3;
  int *piVar4;
  uint *puVar5;
  int iVar6;
  int *piVar7;
  uint uVar8;
  uint extraout_r1;
  uint extraout_r1_00;
  uint extraout_r1_01;
  uint extraout_r1_02;
  uint extraout_r1_03;
  uint extraout_r1_04;
  uint uVar9;
  uint uVar10;
  int iVar11;
  int iVar12;
  int *piVar13;
  uint *puVar14;
  undefined4 uVar15;
  int local_30;
  uint local_2c;
  int local_28;
  
  uVar15 = 5;
  local_28 = **(int **)(DAT_0002ef8c + 0x2eb68);
  uVar10 = *(uint *)(param_2 + 8);
  if (uVar10 != 0) {
    uVar9 = *param_3;
    uVar2 = uVar10 - (uVar10 >> 1 & 0x55555555);
    uVar2 = (uVar2 & 0x33333333) + (uVar2 >> 2 & 0x33333333);
    uVar2 = (uVar2 + (uVar2 >> 4) & 0xf0f0f0f) * 0x1010101 >> 0x18;
    if (uVar2 < 2) {
      uVar8 = uVar10 - 1 & uVar9;
    }
    else {
      uVar8 = uVar9;
      if (uVar10 <= uVar9) {
        FUN_000264a4(uVar9,uVar10);
        uVar8 = extraout_r1;
      }
    }
    puVar3 = *(undefined4 **)(*(int *)(param_2 + 4) + uVar8 * 4);
    if ((puVar3 != (undefined4 *)0x0) && (piVar13 = (int *)*puVar3, piVar13 != (int *)0x0)) {
      if (uVar2 < 2) {
        do {
          if (piVar13[1] == uVar9) {
            if (piVar13[2] == uVar9) goto LAB_0002eca4;
          }
          else if ((piVar13[1] & uVar10 - 1) != uVar8) break;
          piVar13 = (int *)*piVar13;
        } while (piVar13 != (int *)0x0);
      }
      else {
        do {
          uVar2 = piVar13[1];
          if (uVar2 == uVar9) {
            if (piVar13[2] == uVar9) goto LAB_0002eca4;
          }
          else {
            if (uVar10 <= uVar2) {
              FUN_000264a4(uVar2,uVar10);
              uVar2 = extraout_r1_00;
            }
            if (uVar2 != uVar8) break;
          }
          piVar13 = (int *)*piVar13;
        } while (piVar13 != (int *)0x0);
      }
    }
  }
  goto LAB_0002ef5c;
LAB_0002eca4:
  uVar2 = piVar13[4];
  iVar11 = piVar13[5];
  uVar10 = FUN_00019718(0x107,1,&local_30);
  if (0xfffff000 < uVar10) {
    piVar4 = (int *)FUN_00025e6c(DAT_0002ef90 + 0x2ecd0);
    *piVar4 = -uVar10;
  }
  piVar4 = *(int **)(param_2 + 0x18);
  uVar10 = *param_3;
  lVar1 = (longlong)local_30 * 1000000000 +
          CONCAT44(((int)local_2c >> 0x1f) - (iVar11 + (uint)(local_2c < uVar2)),local_2c - uVar2);
  puVar5 = (uint *)piVar4[1];
  if (puVar5 < (uint *)piVar4[2]) {
    puVar5[2] = (uint)lVar1;
    puVar14 = puVar5 + 4;
    *puVar5 = uVar10;
    puVar5[3] = (uint)((ulonglong)lVar1 >> 0x20);
  }
  else {
    iVar12 = *piVar4;
    iVar11 = (int)puVar5 - iVar12 >> 4;
    uVar2 = iVar11 + 1;
    if (0xfffffff < uVar2) {
      FUN_0005d674();
LAB_0002ef88:
                    /* WARNING: Subroutine does not return */
      FUN_00026984();
    }
    uVar9 = piVar4[2] - iVar12;
    if (uVar2 < (uint)((int)uVar9 >> 3)) {
      uVar2 = (int)uVar9 >> 3;
    }
    if (0x7fffffef < uVar9) {
      uVar2 = 0xfffffff;
    }
    if (uVar2 == 0) {
      iVar6 = 0;
    }
    else {
      if (0xfffffff < uVar2) goto LAB_0002ef88;
      iVar6 = FUN_000a0370(uVar2 << 4);
    }
    puVar14 = (uint *)(iVar6 + iVar11 * 0x10);
    *puVar14 = uVar10;
    *(longlong *)(puVar14 + 2) = lVar1;
    __aeabi_memcpy(iVar6,iVar12);
    puVar14 = puVar14 + 4;
    *piVar4 = iVar6;
    piVar4[1] = (int)puVar14;
    piVar4[2] = iVar6 + uVar2 * 0x10;
    if (iVar12 != 0) {
      FUN_00023f68(iVar12,uVar9);
    }
  }
  uVar9 = *(uint *)(param_2 + 8);
  uVar10 = uVar9 - (uVar9 >> 1 & 0x55555555);
  uVar2 = piVar13[1];
  uVar10 = (uVar10 & 0x33333333) + (uVar10 >> 2 & 0x33333333);
  piVar4[1] = (int)puVar14;
  uVar10 = (uVar10 + (uVar10 >> 4) & 0xf0f0f0f) * 0x1010101 >> 0x18;
  if (uVar10 < 2) {
    uVar2 = uVar9 - 1 & uVar2;
  }
  else if (uVar9 <= uVar2) {
    FUN_000264a4(uVar2,uVar9);
    uVar2 = extraout_r1_01;
  }
  iVar11 = *(int *)(param_2 + 4);
  piVar4 = *(int **)(iVar11 + uVar2 * 4);
  do {
    piVar7 = piVar4;
    piVar4 = (int *)*piVar7;
  } while ((int *)*piVar7 != piVar13);
  if (piVar7 == (int *)(param_2 + 0xc)) {
LAB_0002ee9c:
    if (*piVar13 != 0) {
      uVar8 = *(uint *)(*piVar13 + 4);
      if (uVar10 < 2) {
        uVar8 = uVar8 & uVar9 - 1;
      }
      else if (uVar9 <= uVar8) {
        FUN_000264a4(uVar8,uVar9);
        uVar8 = extraout_r1_03;
      }
      if (uVar8 == uVar2) goto LAB_0002eee4;
    }
    *(undefined4 *)(iVar11 + uVar2 * 4) = 0;
  }
  else {
    uVar8 = piVar7[1];
    if (uVar10 < 2) {
      uVar8 = uVar8 & uVar9 - 1;
    }
    else if (uVar9 <= uVar8) {
      FUN_000264a4(uVar8,uVar9);
      uVar8 = extraout_r1_02;
    }
    if (uVar8 != uVar2) goto LAB_0002ee9c;
  }
LAB_0002eee4:
  iVar12 = *piVar13;
  uVar15 = 0;
  iVar11 = 0;
  if (iVar12 != 0) {
    uVar8 = *(uint *)(iVar12 + 4);
    if (uVar10 < 2) {
      uVar8 = uVar8 & uVar9 - 1;
    }
    else if (uVar9 <= uVar8) {
      FUN_000264a4(uVar8,uVar9);
      uVar8 = extraout_r1_04;
    }
    iVar11 = iVar12;
    if (uVar8 != uVar2) {
      *(int **)(*(int *)(param_2 + 4) + uVar8 * 4) = piVar7;
      iVar11 = *piVar13;
    }
  }
  iVar12 = *(int *)(param_2 + 0x10);
  *piVar7 = iVar11;
  *(int *)(param_2 + 0x10) = iVar12 + -1;
  *piVar13 = 0;
  FUN_00023f68(piVar13,0x18);
LAB_0002ef5c:
  *param_1 = uVar15;
  if (**(int **)(DAT_0002ef94 + 0x2ef70) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #565
// Name: FUN_0002ef98
// Address: 0002ef98
// JNI: NO
// ============================================================


void FUN_0002ef98(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)*(int *)(param_1 + 0xc);
  while (piVar1 != (int *)0x0) {
    iVar2 = *piVar1;
    FUN_00023f68(piVar1,0x18);
    piVar1 = (int *)iVar2;
  }
  iVar2 = *(int *)(param_1 + 4);
  *(undefined4 *)(param_1 + 4) = 0;
  if (iVar2 != 0) {
    FUN_00023f68(iVar2,*(int *)(param_1 + 8) << 2);
  }
  FUN_00023f68(param_1,0x1c);
  return;
}




// ============================================================
// Function #566
// Name: FUN_0002eff4
// Address: 0002eff4
// JNI: NO
// ============================================================


/* WARNING: Removing unreachable block (ram,0x0002f56c) */

void FUN_0002eff4(undefined4 *param_1,int param_2,uint *param_3)

{
  uint uVar1;
  int *piVar2;
  int iVar3;
  float extraout_r0;
  float extraout_r0_00;
  undefined4 uVar4;
  uint *extraout_r1;
  int *piVar5;
  uint *puVar6;
  uint uVar7;
  uint *extraout_r1_00;
  uint *extraout_r1_01;
  uint *extraout_r1_02;
  uint *extraout_r1_03;
  int iVar8;
  uint *extraout_r1_04;
  int *piVar9;
  uint uVar10;
  int *unaff_r6;
  uint *puVar11;
  int *piVar12;
  uint *puVar13;
  int *piVar14;
  bool bVar15;
  uint in_fpscr;
  float fVar16;
  uint *puVar17;
  float fVar18;
  float fVar19;
  int local_30;
  int local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0002f620 + 0x2f01c);
  uVar1 = FUN_00019718(0x107,1,&local_30);
  if (0xfffff000 < uVar1) {
    unaff_r6 = (int *)-uVar1;
    piVar2 = (int *)FUN_00025e6c(DAT_0002f624 + 0x2f044);
    *piVar2 = (int)unaff_r6;
  }
  puVar11 = *(uint **)(param_2 + 8);
  puVar13 = (uint *)*param_3;
  if (puVar11 != (uint *)0x0) {
    uVar1 = (int)puVar11 - ((uint)puVar11 >> 1 & 0x55555555);
    uVar1 = (uVar1 & 0x33333333) + (uVar1 >> 2 & 0x33333333);
    uVar1 = (uVar1 + (uVar1 >> 4) & 0xf0f0f0f) * 0x1010101 >> 0x18;
    if (uVar1 < 2) {
      param_3 = (uint *)((int)puVar11 - 1U & (uint)puVar13);
    }
    else {
      param_3 = puVar13;
      if (puVar11 <= puVar13) {
        FUN_000264a4(puVar13,puVar11);
        param_3 = extraout_r1;
      }
    }
    piVar2 = *(int **)(*(int *)(param_2 + 4) + (int)param_3 * 4);
    if (piVar2 != (int *)0x0) {
      unaff_r6 = (int *)*piVar2;
    }
    if (piVar2 != (int *)0x0 && unaff_r6 != (int *)0x0) {
      if (uVar1 < 2) {
        do {
          if ((uint *)unaff_r6[1] == puVar13) {
            if ((uint *)unaff_r6[2] == puVar13) goto LAB_0002f350;
          }
          else if ((uint *)(unaff_r6[1] & (int)puVar11 - 1U) != param_3) break;
          unaff_r6 = (int *)*unaff_r6;
        } while (unaff_r6 != (int *)0x0);
      }
      else {
        do {
          puVar17 = (uint *)unaff_r6[1];
          if (puVar17 == puVar13) {
            if ((uint *)unaff_r6[2] == puVar13) goto LAB_0002f350;
          }
          else {
            if (puVar11 <= puVar17) {
              FUN_000264a4(puVar17,puVar11);
              puVar17 = extraout_r1_00;
            }
            if (puVar17 != param_3) break;
          }
          unaff_r6 = (int *)*unaff_r6;
        } while (unaff_r6 != (int *)0x0);
      }
    }
  }
  piVar2 = (int *)FUN_000a0370(0x18);
  iVar3 = *(int *)(param_2 + 0x10);
  *(longlong *)(piVar2 + 4) = (longlong)local_30 * 1000000000 + (longlong)local_2c;
  piVar14 = (int *)(param_2 + 0xc);
  fVar16 = *(float *)(param_2 + 0x14);
  piVar2[2] = (int)puVar13;
  *piVar2 = 0;
  piVar2[1] = (int)puVar13;
  fVar18 = (float)VectorUnsignedToFloat(iVar3 + 1,(byte)(in_fpscr >> 0x16) & 3);
  if (puVar11 == (uint *)0x0) {
LAB_0002f17c:
    uVar1 = 1;
    if (((uint *)0x2 < puVar11) && (uVar1 = 0, ((uint)puVar11 & (int)puVar11 - 1U) != 0)) {
      uVar1 = 1;
    }
    ceilf(fVar18 / fVar16);
    puVar6 = (uint *)(uVar1 | (int)puVar11 << 1);
    puVar17 = (uint *)((uint)(0.0 < extraout_r0) * (int)extraout_r0);
    if (puVar17 < puVar6) {
      puVar17 = puVar6;
    }
    puVar6 = (uint *)0x2;
    if ((puVar17 != (uint *)0x1) && (puVar6 = puVar17, ((uint)puVar17 & (int)puVar17 - 1U) != 0)) {
      puVar6 = (uint *)FUN_0001974c();
      puVar11 = *(uint **)(param_2 + 8);
      bVar15 = puVar11 <= puVar6;
      puVar17 = puVar6;
      if (puVar6 <= puVar11) goto LAB_0002f370;
LAB_0002f1e4:
      if ((uint *)0x3fffffff < puVar6) {
                    /* WARNING: Subroutine does not return */
        FUN_00026984();
      }
      uVar4 = FUN_000a0370((int)puVar6 << 2);
      iVar3 = *(int *)(param_2 + 4);
      *(undefined4 *)(param_2 + 4) = uVar4;
      if (iVar3 != 0) {
        FUN_00023f68(iVar3,*(int *)(param_2 + 8) << 2);
      }
      puVar11 = (uint *)0x0;
      *(uint **)(param_2 + 8) = puVar6;
      do {
        *(undefined4 *)(*(int *)(param_2 + 4) + (int)puVar11 * 4) = 0;
        puVar11 = (uint *)((int)puVar11 + 1);
      } while (puVar6 != puVar11);
      piVar5 = (int *)*piVar14;
      if (piVar5 != (int *)0x0) {
        puVar11 = (uint *)piVar5[1];
        uVar1 = (int)puVar6 - 1;
        if (((uint)puVar6 & uVar1) == 0) {
          uVar7 = (uint)puVar11 & uVar1;
          *(int **)(*(int *)(param_2 + 4) + uVar7 * 4) = piVar14;
          piVar9 = (int *)*piVar5;
          if (piVar9 != (int *)0x0) {
            do {
              uVar10 = piVar9[1] & uVar1;
              piVar12 = piVar9;
              if (uVar10 != uVar7) {
                iVar3 = *(int *)(param_2 + 4);
                if (*(int *)(iVar3 + uVar10 * 4) == 0) {
                  *(int **)(iVar3 + uVar10 * 4) = piVar5;
                  uVar7 = uVar10;
                }
                else {
                  *piVar5 = *piVar9;
                  *piVar9 = **(int **)(iVar3 + uVar10 * 4);
                  **(undefined4 **)(iVar3 + uVar10 * 4) = piVar9;
                  piVar12 = piVar5;
                }
              }
              piVar9 = (int *)*piVar12;
              piVar5 = piVar12;
            } while (piVar9 != (int *)0x0);
            goto LAB_0002f574;
          }
        }
        else {
          if (puVar6 <= puVar11) {
            FUN_000264a4(puVar11,puVar6);
            puVar11 = extraout_r1_01;
          }
          *(int **)(*(int *)(param_2 + 4) + (int)puVar11 * 4) = piVar14;
          for (piVar9 = (int *)*piVar5; piVar9 != (int *)0x0; piVar9 = (int *)*piVar9) {
            puVar17 = (uint *)piVar9[1];
            if (puVar6 <= puVar17) {
              FUN_000264a4(puVar17,puVar6);
              puVar17 = extraout_r1_02;
            }
            if (puVar17 != puVar11) {
              iVar3 = *(int *)(param_2 + 4);
              if (*(int *)(iVar3 + (int)puVar17 * 4) == 0) {
                *(int **)(iVar3 + (int)puVar17 * 4) = piVar5;
                puVar11 = puVar17;
              }
              else {
                *piVar5 = *piVar9;
                *piVar9 = **(undefined4 **)(iVar3 + (int)puVar17 * 4);
                **(int **)(iVar3 + (int)puVar17 * 4) = (int)piVar9;
                piVar9 = piVar5;
              }
            }
            piVar5 = piVar9;
          }
        }
      }
      uVar7 = (int)puVar6 - 1;
      uVar1 = (uint)puVar6 & uVar7;
      goto joined_r0x0002f420;
    }
    bVar15 = puVar11 <= puVar6;
    puVar17 = puVar6;
    if (puVar11 < puVar6) goto LAB_0002f1e4;
LAB_0002f370:
    puVar6 = puVar11;
    if (!bVar15) {
      fVar16 = (float)VectorUnsignedToFloat
                                (*(undefined4 *)(param_2 + 0x10),(byte)(in_fpscr >> 0x16) & 3);
      ceilf(fVar16 / *(float *)(param_2 + 0x14));
      puVar6 = (uint *)((uint)(0.0 < extraout_r0_00) * (int)extraout_r0_00);
      if (((uint *)0x2 < puVar11) &&
         (uVar1 = (int)puVar11 - ((uint)puVar11 >> 1 & 0x55555555),
         uVar1 = (uVar1 & 0x33333333) + (uVar1 >> 2 & 0x33333333),
         (uVar1 + (uVar1 >> 4) & 0xf0f0f0f) * 0x1010101 >> 0x18 < 2)) {
        if ((uint *)0x1 < puVar6) {
          puVar6 = (uint *)(1 << (0x20U - LZCOUNT((int)puVar6 + -1) & 0xff));
        }
        if (puVar6 < puVar17) {
          puVar6 = puVar17;
        }
        if (puVar6 < puVar11) goto LAB_0002f534;
LAB_0002f414:
        puVar6 = *(uint **)(param_2 + 8);
        uVar7 = (int)puVar6 - 1;
        uVar1 = (uint)puVar6 & uVar7;
        goto joined_r0x0002f420;
      }
      puVar6 = (uint *)FUN_0001974c(puVar6);
      if (puVar6 < puVar17) {
        puVar6 = puVar17;
      }
      if (puVar11 <= puVar6) goto LAB_0002f414;
LAB_0002f534:
      if (puVar6 != (uint *)0x0) goto LAB_0002f1e4;
      iVar3 = *(int *)(param_2 + 4);
      puVar6 = (uint *)0x0;
      *(undefined4 *)(param_2 + 4) = 0;
      if (iVar3 != 0) {
        FUN_00023f68(iVar3,*(int *)(param_2 + 8) << 2);
      }
      *(undefined4 *)(param_2 + 8) = 0;
      uVar7 = 0xffffffff;
LAB_0002f580:
      iVar3 = *(int *)(param_2 + 4);
      piVar5 = *(int **)(iVar3 + (int)(uVar7 & (uint)puVar13) * 4);
      puVar13 = (uint *)(uVar7 & (uint)puVar13);
      goto joined_r0x0002f510;
    }
LAB_0002f574:
    uVar7 = (int)puVar6 - 1;
    uVar1 = (uint)puVar6 & uVar7;
joined_r0x0002f420:
    if (uVar1 == 0) goto LAB_0002f580;
    if (puVar6 <= puVar13) {
      FUN_000264a4(puVar13,puVar6);
      iVar3 = *(int *)(param_2 + 4);
      piVar5 = *(int **)(iVar3 + (int)extraout_r1_03 * 4);
      puVar13 = extraout_r1_03;
      goto joined_r0x0002f510;
    }
    iVar3 = *(int *)(param_2 + 4);
    piVar5 = *(int **)(iVar3 + (int)puVar13 * 4);
    if (piVar5 != (int *)0x0) goto LAB_0002f168;
LAB_0002f594:
    iVar8 = *piVar14;
    *piVar2 = iVar8;
    *piVar14 = (int)piVar2;
    *(int **)(iVar3 + (int)puVar13 * 4) = piVar14;
    if (iVar8 != 0) {
      puVar13 = *(uint **)(iVar8 + 4);
      if (((uint)puVar6 & (int)puVar6 - 1U) == 0) {
        puVar13 = (uint *)((uint)puVar13 & (int)puVar6 - 1U);
      }
      else if (puVar6 <= puVar13) {
        FUN_000264a4(puVar13,puVar6);
        puVar13 = extraout_r1_04;
      }
      *(int **)(*(int *)(param_2 + 4) + (int)puVar13 * 4) = piVar2;
    }
  }
  else {
    fVar19 = (float)VectorUnsignedToFloat(puVar11,(byte)(in_fpscr >> 0x16) & 3);
    in_fpscr = in_fpscr & 0xfffffff | (uint)(fVar16 * fVar19 < fVar18) << 0x1f;
    if (SUB41(in_fpscr >> 0x1f,0)) goto LAB_0002f17c;
    iVar3 = *(int *)(param_2 + 4);
    piVar5 = *(int **)(iVar3 + (int)param_3 * 4);
    puVar13 = param_3;
    puVar6 = puVar11;
joined_r0x0002f510:
    if (piVar5 == (int *)0x0) goto LAB_0002f594;
LAB_0002f168:
    *piVar2 = *piVar5;
    *piVar5 = (int)piVar2;
  }
  *(int *)(param_2 + 0x10) = *(int *)(param_2 + 0x10) + 1;
  uVar4 = 0;
LAB_0002f5f4:
  *param_1 = uVar4;
  if (**(int **)(DAT_0002f628 + 0x2f608) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
LAB_0002f350:
  uVar4 = 5;
  goto LAB_0002f5f4;
}




// ============================================================
// Function #567
// Name: FUN_0002f62c
// Address: 0002f62c
// JNI: NO
// ============================================================


int FUN_0002f62c(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)*(int *)(param_1 + 0xc);
  while (piVar1 != (int *)0x0) {
    iVar2 = *piVar1;
    FUN_00023f68(piVar1,0x18);
    piVar1 = (int *)iVar2;
  }
  iVar2 = *(int *)(param_1 + 4);
  *(undefined4 *)(param_1 + 4) = 0;
  if (iVar2 != 0) {
    FUN_00023f68(iVar2,*(int *)(param_1 + 8) << 2);
  }
  return param_1;
}




// ============================================================
// Function #568
// Name: FUN_0002f680
// Address: 0002f680
// JNI: NO
// ============================================================


undefined4 FUN_0002f680(int param_1,int *param_2)

{
  int iVar1;
  uint uVar2;
  ulonglong uVar3;
  uint uVar4;
  int iVar5;
  char *pcVar6;
  uint uVar7;
  uint uVar8;
  
  iVar5 = (int)(short)param_2[5];
  uVar7 = 0xcbf29ce4;
  uVar8 = 0x84222325;
  if (iVar5 != 0) {
    pcVar6 = (char *)(param_1 + param_2[4]);
    do {
      uVar3 = (ulonglong)uVar8;
      iVar5 = iVar5 + -1;
      iVar1 = uVar8 * 0x100;
      uVar8 = (uint)(uVar3 * 0x1b3) ^ (int)*pcVar6;
      uVar7 = uVar7 * 0x1b3 + (int)(uVar3 * 0x1b3 >> 0x20) + iVar1 ^ (int)*pcVar6 >> 0x1f;
      pcVar6 = pcVar6 + 1;
    } while (iVar5 != 0);
  }
  uVar4 = *(uint *)(param_1 + *param_2);
  uVar2 = (uVar8 | uVar4) * 2;
  iVar5 = 0x1c;
  if (uVar2 - (uVar8 + uVar4) == param_2[2] &&
      ((uVar7 | (int)uVar4 >> 0x1f) << 1 | (uVar8 | uVar4) >> 0x1f) -
      (uVar7 + ((int)uVar4 >> 0x1f) + (uint)CARRY4(uVar8,uVar4) + (uint)(uVar2 < uVar8 + uVar4)) ==
      param_2[3]) {
    iVar5 = 0x18;
  }
  return *(undefined4 *)((int)param_2 + iVar5);
}




// ============================================================
// Function #569
// Name: FUN_0002f714
// Address: 0002f714
// JNI: NO
// ============================================================

/*
 * DECOMPILATION FAILED
 * Function: FUN_0002f714
 * Address: 0002f714
 */


// ============================================================
// Function #570
// Name: FUN_0005c1a0
// Address: 0005c1a0
// JNI: NO
// ============================================================


void FUN_0005c1a0(int *param_1,undefined4 *param_2,uint param_3)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  int iVar13;
  int *piVar14;
  uint *puVar15;
  uint uVar16;
  uint *puVar17;
  uint uVar18;
  uint uVar19;
  int iVar20;
  uint *puVar21;
  uint uVar22;
  uint uVar23;
  int iVar24;
  uint uVar25;
  uint *puVar26;
  int iVar27;
  bool bVar28;
  uint uVar29;
  uint uVar30;
  uint uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined4 uVar34;
  undefined4 uVar35;
  undefined8 uVar36;
  uint *local_160;
  uint *local_15c;
  uint local_158 [2];
  undefined4 local_150;
  undefined4 uStack_14c;
  uint local_148;
  int iStack_144;
  undefined4 uStack_140;
  undefined4 uStack_13c;
  uint local_138;
  int iStack_134;
  undefined4 uStack_130;
  undefined4 uStack_12c;
  uint local_128;
  int iStack_124;
  undefined4 uStack_120;
  undefined4 uStack_11c;
  undefined4 local_118;
  undefined4 local_114;
  undefined1 auStack_110 [32];
  uint local_f0;
  uint uStack_ec;
  uint uStack_e8;
  uint uStack_e4;
  uint local_e0;
  uint uStack_dc;
  uint uStack_d8;
  uint uStack_d4;
  uint local_d0;
  uint uStack_cc;
  uint local_c8;
  uint local_c4;
  uint local_c0;
  uint uStack_bc;
  uint local_b8;
  uint local_b4;
  uint local_b0;
  uint uStack_ac;
  uint uStack_a8;
  uint uStack_a4;
  uint local_a0;
  uint uStack_9c;
  uint uStack_98;
  uint uStack_94;
  uint local_90;
  uint uStack_8c;
  uint uStack_88;
  uint uStack_84;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  int local_64;
  
  local_64 = **(int **)(DAT_0005cbdc + 0x5c1c8);
  puVar26 = (uint *)*param_2;
  if (param_3 == 0) {
    puVar21 = puVar26 + 0x10;
    if (-puVar26[0x11] < (uint)(*puVar21 != 0xffffffff)) {
      iVar13 = DAT_0005cbe0 + 0x5cb7c;
      FUN_0002da50(puVar26,0,iVar13,0,iVar13,0,iVar13,0);
      uVar18 = *puVar21;
      uVar19 = puVar26[0x11];
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      *puVar21 = uVar18 + 1;
      puVar26[0x11] = uVar19 + (0xfffffffe < uVar18);
      goto LAB_0005cba8;
    }
  }
  else {
    iVar13 = FUN_000a0370(param_3);
    __aeabi_memclr(iVar13,param_3);
    puVar21 = puVar26 + 0x10;
    if (-puVar26[0x11] < (uint)(*puVar21 != 0xffffffff)) {
      puVar15 = puVar26 + 8;
      uVar18 = 0;
      iVar20 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
      uVar34 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
      uVar35 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
      auVar1._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
      auVar1._0_8_ = 0x6a6a6a6a6a6a6a6a;
      auVar1 = auVar1 << 0x40 | auVar1;
      uVar19 = *(uint *)auVar1;
      uVar29 = *(uint *)(auVar1 + (undefined1  [16])0x4);
      uVar30 = *(uint *)(auVar1 + (undefined1  [16])0x8);
      uVar31 = *(uint *)(auVar1 + (undefined1  [16])0xc);
      uVar25 = 0;
      uVar3 = *(uint *)(DAT_0005cbe4 + 0x5c2e0);
      uVar4 = *(uint *)(DAT_0005cbe4 + 0x5c2e4);
      uVar5 = *(uint *)(DAT_0005cbe4 + 0x5c2e8);
      uVar6 = *(uint *)(DAT_0005cbe4 + 0x5c2ec);
      uVar32 = *(undefined8 *)(DAT_0005cbe4 + 0x5c2f0);
      uVar33 = *(undefined8 *)(DAT_0005cbe4 + 0x5c2f8);
      uVar36 = *(undefined8 *)(DAT_0005cbe4 + 0x5c300);
      iVar27 = iVar13;
      do {
        local_160 = &local_90;
        local_b0 = *puVar26;
        uStack_ac = puVar26[1];
        uStack_a8 = puVar26[2];
        uStack_a4 = puVar26[3];
        local_a0 = puVar26[4];
        uStack_9c = puVar26[5];
        uStack_98 = puVar26[6];
        uStack_94 = puVar26[7];
        local_118 = 0;
        local_114 = 0;
        local_15c = &uStack_88;
        local_158[0] = uVar18;
        local_158[1] = iVar20;
        local_150 = uVar34;
        uStack_14c = uVar35;
        local_148 = uVar18;
        iStack_144 = iVar20;
        uStack_140 = uVar34;
        uStack_13c = uVar35;
        local_138 = uVar18;
        iStack_134 = iVar20;
        uStack_130 = uVar34;
        uStack_12c = uVar35;
        local_128 = uVar18;
        iStack_124 = iVar20;
        uStack_120 = uVar34;
        uStack_11c = uVar35;
        local_90 = uVar3;
        uStack_8c = uVar4;
        uStack_88 = uVar5;
        uStack_84 = uVar6;
        local_80 = uVar32;
        uStack_78 = uVar33;
        local_70 = uVar36;
        FUN_0002737c(auStack_110,&local_160);
        auVar2._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
        auVar2._0_8_ = 0x3636363636363636;
        auVar2 = auVar2 << 0x40 | auVar2;
        uVar23 = param_3 - uVar25;
        iVar24 = 0x68;
        local_f0 = local_b0 ^ *(uint *)auVar2;
        uStack_ec = uStack_ac ^ *(uint *)(auVar2 + (undefined1  [16])0x4);
        uStack_e8 = uStack_a8 ^ *(uint *)(auVar2 + (undefined1  [16])0x8);
        uStack_e4 = uStack_a4 ^ *(uint *)(auVar2 + (undefined1  [16])0xc);
        local_e0 = local_a0 ^ *(uint *)auVar2;
        uStack_dc = uStack_9c ^ *(uint *)(auVar2 + (undefined1  [16])0x4);
        uStack_d8 = uStack_98 ^ *(uint *)(auVar2 + (undefined1  [16])0x8);
        uStack_d4 = uStack_94 ^ *(uint *)(auVar2 + (undefined1  [16])0xc);
        local_d0 = 0x36363636;
        uStack_cc = 0x36363636;
        local_c8 = 0x36363636;
        local_c4 = 0x36363636;
        local_c0 = 0x36363636;
        uStack_bc = 0x36363636;
        local_b8 = 0x36363636;
        local_b4 = 0x36363636;
        uVar16 = local_158[0] & 0x3f;
        local_158[1] = local_158[1] + (0xffffffbf < local_158[0]);
        local_158[0] = local_158[0] + 0x40;
        do {
          *(undefined1 *)((int)&local_150 + uVar16) = *(undefined1 *)((int)local_158 + iVar24);
          uVar16 = uVar16 + 1;
          if (uVar16 == 0x40) {
            FUN_000284f4(local_158);
            uVar16 = 0;
          }
          iVar24 = iVar24 + 1;
        } while (iVar24 != 0xa8);
        local_f0 = local_f0 ^ uVar19;
        uStack_ec = uStack_ec ^ uVar29;
        uStack_e8 = uStack_e8 ^ uVar30;
        uStack_e4 = uStack_e4 ^ uVar31;
        local_c0 = local_c0 ^ uVar19;
        uStack_bc = uStack_bc ^ uVar29;
        local_b8 = local_b8 ^ uVar30;
        local_b4 = local_b4 ^ uVar31;
        local_d0 = local_d0 ^ uVar19;
        uStack_cc = uStack_cc ^ uVar29;
        local_c8 = local_c8 ^ uVar30;
        local_c4 = local_c4 ^ uVar31;
        local_e0 = local_e0 ^ uVar19;
        uStack_dc = uStack_dc ^ uVar29;
        uStack_d8 = uStack_d8 ^ uVar30;
        uStack_d4 = uStack_d4 ^ uVar31;
        puVar17 = (uint *)FUN_000a0370(0x28);
        *(undefined1 *)(puVar17 + 8) = 0;
        uVar16 = puVar26[9];
        uVar7 = puVar26[10];
        uVar8 = puVar26[0xb];
        uVar22 = local_158[0] & 0x3f;
        uVar9 = puVar26[0xc];
        uVar10 = puVar26[0xd];
        uVar11 = puVar26[0xe];
        uVar12 = puVar26[0xf];
        *puVar17 = *puVar15;
        puVar17[1] = uVar16;
        puVar17[2] = uVar7;
        puVar17[3] = uVar8;
        puVar17[4] = uVar9;
        puVar17[5] = uVar10;
        puVar17[6] = uVar11;
        puVar17[7] = uVar12;
        bVar28 = 0xffffffdf < local_158[0];
        local_158[0] = local_158[0] + 0x20;
        local_158[1] = local_158[1] + bVar28;
        *(char *)((int)&local_150 + uVar22) = (char)*puVar17;
        if (uVar22 == 0x3f) {
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 1));
          iVar24 = 1;
LAB_0005c574:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 2);
          iVar24 = iVar24 + 1;
LAB_0005c580:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 3);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c5f8;
          }
          *(char *)((int)&local_150 + iVar24 + 1) = (char)puVar17[1];
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c604;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 5));
          iVar24 = 1;
LAB_0005c624:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 6);
          iVar24 = iVar24 + 1;
LAB_0005c660:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 7);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c680;
          }
          *(char *)((int)&local_150 + iVar24 + 1) = (char)puVar17[2];
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c6bc;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 9));
          iVar24 = 1;
LAB_0005c6dc:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 10);
          iVar24 = iVar24 + 1;
LAB_0005c718:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0xb);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c738;
          }
          *(char *)((int)&local_150 + iVar24 + 1) = (char)puVar17[3];
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c774;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0xd));
          iVar24 = 1;
LAB_0005c794:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0xe);
          iVar24 = iVar24 + 1;
LAB_0005c7d0:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0xf);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c7f0;
          }
          *(char *)((int)&local_150 + iVar24 + 1) = (char)puVar17[4];
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c82c;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0x11));
          iVar24 = 1;
LAB_0005c84c:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x12);
          iVar24 = iVar24 + 1;
LAB_0005c888:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x13);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c8a8;
          }
          *(char *)((int)&local_150 + iVar24 + 1) = (char)puVar17[5];
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c8e4;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0x15));
          iVar24 = 1;
LAB_0005c904:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x16);
          iVar24 = iVar24 + 1;
LAB_0005c940:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x17);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c960;
          }
          *(char *)((int)&local_150 + iVar24 + 1) = (char)puVar17[6];
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c99c;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0x19));
          iVar24 = 1;
LAB_0005c9bc:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x1a);
          iVar24 = iVar24 + 1;
LAB_0005c9f8:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x1b);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005ca18;
          }
          *(char *)((int)&local_150 + iVar24 + 1) = (char)puVar17[7];
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005ca54;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0x1d));
          iVar24 = 1;
LAB_0005ca74:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x1e);
          iVar24 = iVar24 + 1;
LAB_0005caac:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x1f);
        }
        else {
          *(undefined1 *)((int)&local_150 + uVar22 + 1) = *(undefined1 *)((int)puVar17 + 1);
          if (uVar22 == 0x3e) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c574;
          }
          *(undefined1 *)((int)&local_150 + uVar22 + 2) = *(undefined1 *)((int)puVar17 + 2);
          iVar24 = uVar22 + 3;
          if (iVar24 != 0x40) goto LAB_0005c580;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 3));
          iVar24 = 1;
LAB_0005c5f8:
          *(char *)((int)&local_150 + iVar24) = (char)puVar17[1];
          iVar24 = iVar24 + 1;
LAB_0005c604:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 5);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c624;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 1) = *(undefined1 *)((int)puVar17 + 6);
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c660;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 7));
          iVar24 = 1;
LAB_0005c680:
          *(char *)((int)&local_150 + iVar24) = (char)puVar17[2];
          iVar24 = iVar24 + 1;
LAB_0005c6bc:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 9);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c6dc;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 1) = *(undefined1 *)((int)puVar17 + 10);
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c718;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0xb));
          iVar24 = 1;
LAB_0005c738:
          *(char *)((int)&local_150 + iVar24) = (char)puVar17[3];
          iVar24 = iVar24 + 1;
LAB_0005c774:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0xd);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c794;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 1) = *(undefined1 *)((int)puVar17 + 0xe);
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c7d0;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0xf));
          iVar24 = 1;
LAB_0005c7f0:
          *(char *)((int)&local_150 + iVar24) = (char)puVar17[4];
          iVar24 = iVar24 + 1;
LAB_0005c82c:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x11);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c84c;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 1) = *(undefined1 *)((int)puVar17 + 0x12);
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c888;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0x13));
          iVar24 = 1;
LAB_0005c8a8:
          *(char *)((int)&local_150 + iVar24) = (char)puVar17[5];
          iVar24 = iVar24 + 1;
LAB_0005c8e4:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x15);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c904;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 1) = *(undefined1 *)((int)puVar17 + 0x16);
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c940;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0x17));
          iVar24 = 1;
LAB_0005c960:
          *(char *)((int)&local_150 + iVar24) = (char)puVar17[6];
          iVar24 = iVar24 + 1;
LAB_0005c99c:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x19);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005c9bc;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 1) = *(undefined1 *)((int)puVar17 + 0x1a);
          iVar24 = iVar24 + 2;
          if (iVar24 != 0x40) goto LAB_0005c9f8;
          FUN_000284f4(local_158);
          local_150 = CONCAT31(local_150._1_3_,*(undefined1 *)((int)puVar17 + 0x1b));
          iVar24 = 1;
LAB_0005ca18:
          *(char *)((int)&local_150 + iVar24) = (char)puVar17[7];
          iVar24 = iVar24 + 1;
LAB_0005ca54:
          *(undefined1 *)((int)&local_150 + iVar24) = *(undefined1 *)((int)puVar17 + 0x1d);
          if (iVar24 == 0x3f) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005ca74;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 1) = *(undefined1 *)((int)puVar17 + 0x1e);
          if (iVar24 == 0x3e) {
            FUN_000284f4(local_158);
            iVar24 = 0;
            goto LAB_0005caac;
          }
          *(undefined1 *)((int)&local_150 + iVar24 + 2) = *(undefined1 *)((int)puVar17 + 0x1f);
          if (iVar24 == 0x3d) {
            FUN_000284f4(local_158);
          }
        }
        FUN_00023f68(puVar17,0x28);
        FUN_0002747c(&local_90,local_158);
        if (0x1f < uVar23) {
          uVar23 = 0x20;
        }
        *puVar15 = local_90;
        puVar26[9] = uStack_8c;
        puVar26[10] = uStack_88;
        puVar26[0xb] = uStack_84;
        puVar26[0xc] = (uint)local_80;
        puVar26[0xd] = local_80._4_4_;
        puVar26[0xe] = (uint)uStack_78;
        puVar26[0xf] = uStack_78._4_4_;
        __aeabi_memmove(iVar27,puVar15,uVar23);
        iVar27 = iVar27 + uVar23;
        uVar25 = uVar23 + uVar25;
      } while (uVar25 < param_3);
      iVar20 = DAT_0005cbe8 + 0x5cad0;
      FUN_0002da50(puVar26,0,iVar20,0,iVar20,0,iVar20,0);
      uVar18 = *puVar21;
      uVar19 = puVar26[0x11];
      *param_1 = 0;
      param_1[1] = 0;
      param_1[2] = 0;
      *puVar21 = uVar18 + 1;
      puVar26[0x11] = uVar19 + (0xfffffffe < uVar18);
      if (param_3 != 0) {
        if ((int)param_3 < 0) {
                    /* WARNING: Subroutine does not return */
          FUN_0002d020();
        }
        iVar20 = FUN_000a0370(param_3);
        param_1[2] = iVar20 + param_3;
        *param_1 = iVar20;
        __aeabi_memcpy(iVar20,iVar13,param_3);
        param_1[1] = iVar20 + param_3;
      }
      if (iVar13 != 0) {
        FUN_00023f68(iVar13,param_3);
      }
      goto LAB_0005cba8;
    }
    FUN_00023f68(iVar13,param_3);
  }
  piVar14 = (int *)param_2[6];
  if (piVar14 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*piVar14 + 0x18))(piVar14,*param_2,param_2[1]);
  FUN_0005c1a0(param_1,param_2,param_3);
LAB_0005cba8:
  if (**(int **)(DAT_0005cbec + 0x5cbb8) != local_64) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #571
// Name: FUN_0005cbf0
// Address: 0005cbf0
// JNI: NO
// ============================================================


undefined4 FUN_0005cbf0(int param_1,undefined4 param_2,undefined4 *param_3)

{
  char *pcVar1;
  undefined8 *puVar2;
  uint uVar3;
  int iVar4;
  char *pcVar5;
  int iVar6;
  uint extraout_r1;
  uint uVar7;
  int extraout_r1_00;
  char *pcVar8;
  undefined8 *puVar9;
  int *piVar10;
  char *pcVar11;
  ushort *puVar12;
  uint __size;
  bool bVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  pcVar11 = *(char **)(param_1 + 4);
  if (pcVar11 == (char *)0x0) {
    return 0;
  }
  pcVar1 = (char *)*param_3;
  pcVar5 = pcVar1 + -1;
  do {
    pcVar5 = pcVar5 + 1;
  } while (*pcVar5 != '\0');
  pcVar8 = pcVar11 + -1;
  do {
    pcVar8 = pcVar8 + 1;
  } while (*pcVar8 != '\0');
  if ((uint)((int)pcVar8 - (int)pcVar11) < (uint)((int)pcVar5 - (int)pcVar1)) {
    return 0;
  }
  pcVar5 = pcVar1 + -1;
  iVar6 = 1;
  do {
    pcVar5 = pcVar5 + 1;
    iVar6 = iVar6 + -1;
  } while (*pcVar5 != '\0');
  pcVar8 = pcVar11;
  if (pcVar5 != pcVar1) {
    do {
      if (*pcVar8 != *pcVar1) {
        return 0;
      }
      bVar13 = iVar6 != -1;
      iVar6 = iVar6 + 1;
      pcVar1 = pcVar1 + 1;
      pcVar8 = pcVar8 + 1;
    } while (bVar13);
  }
  piVar10 = (int *)param_3[2];
  iVar6 = param_3[1];
  puVar12 = (ushort *)(*piVar10 + param_3[3]);
  if ((short)~(*puVar12 ^ (ushort)param_3[3]) <= iVar6) {
    return 0;
  }
  __size = 0;
  do {
    uVar7 = __size;
    __size = uVar7 + 1;
  } while (pcVar11[uVar7] != '\0');
  puVar2 = malloc(__size);
  if ((puVar2 != (undefined8 *)0x0) && (uVar7 != 0xffffffff)) {
    uVar3 = 0;
    uVar7 = extraout_r1;
    if (0xf < __size) {
      uVar7 = (int)puVar2 - (int)pcVar11;
    }
    if (0xf < __size && 0xf < uVar7) {
      uVar7 = __size & 0xfffffff0;
      uVar3 = __size & 0xfffffff0;
      pcVar1 = pcVar11;
      puVar9 = puVar2;
      do {
        uVar14 = *(undefined8 *)pcVar1;
        uVar15 = *(undefined8 *)(pcVar1 + 8);
        pcVar1 = pcVar1 + 0x10;
        uVar7 = uVar7 - 0x10;
        *puVar9 = uVar14;
        puVar9[1] = uVar15;
        puVar9 = puVar9 + 2;
      } while (uVar7 != 0);
      if (__size == uVar3) goto LAB_0005cd20;
    }
    iVar4 = uVar3 - __size;
    pcVar11 = pcVar11 + uVar3;
    pcVar1 = (char *)((int)puVar2 + uVar3);
    do {
      bVar13 = iVar4 != -1;
      iVar4 = iVar4 + 1;
      *pcVar1 = *pcVar11;
      pcVar11 = pcVar11 + 1;
      pcVar1 = pcVar1 + 1;
    } while (bVar13);
  }
LAB_0005cd20:
  FUN_000264a4(~(*(uint *)((int)puVar12 + ((iVar6 << 0x10) >> 0xe) + 2) ^ piVar10[1]));
  iVar6 = *(int *)param_3[4];
  *(undefined4 *)(iVar6 + extraout_r1_00) = puVar2;
  ((undefined4 *)(iVar6 + extraout_r1_00))[1] = 0;
  param_3[1] = param_3[1] + 1;
  return 0;
}




// ============================================================
// Function #572
// Name: FUN_0005cd98
// Address: 0005cd98
// JNI: NO
// ============================================================


void FUN_0005cd98(void)

{
  undefined4 *puVar1;
  undefined4 uVar2;
  uint uVar3;
  undefined4 local_20;
  undefined1 local_1c;
  undefined1 local_1b;
  undefined1 local_1a;
  undefined1 local_19;
  uint local_18;
  int local_14;
  
  local_14 = **(int **)(DAT_0005cea4 + 0x5cdac);
  puVar1 = (undefined4 *)FUN_000a0398(7);
  *puVar1 = 0;
  *(undefined1 *)puVar1 = 100;
  *(undefined1 *)((int)puVar1 + 1) = 0x6c;
  *(undefined4 *)((int)puVar1 + 3) = 0;
  *(undefined1 *)((int)puVar1 + 2) = 0x76;
  *(undefined1 *)((int)puVar1 + 3) = 0x73;
  *(undefined1 *)(puVar1 + 1) = 0x79;
  *(undefined1 *)((int)puVar1 + 5) = 0x6d;
  *(undefined1 *)((int)puVar1 + 6) = 0;
  local_1c = *(undefined1 *)((int)puVar1 + 3);
  local_1b = *(undefined1 *)(puVar1 + 1);
  local_1a = *(undefined1 *)((int)puVar1 + 5);
  local_20 = CONCAT13(*(undefined1 *)((int)puVar1 + 2),
                      CONCAT12(*(undefined1 *)((int)puVar1 + 1),CONCAT11(*(undefined1 *)puVar1,0xc))
                     );
  local_19 = 0;
  FUN_00023f74();
  uVar3 = local_18;
  if ((local_20 & 1) == 0) {
    uVar3 = (uint)&local_20 | 1;
  }
  uVar2 = dlsym(0xffffffff,uVar3);
  if ((local_20 & 1) != 0) {
    FUN_00023f68(local_18,local_20 & 0xfffffffe);
  }
  if (**(int **)(DAT_0005cea8 + 0x5ce90) != local_14) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}




// ============================================================
// Function #573
// Name: FUN_0005ceb0
// Address: 0005ceb0
// JNI: NO
// ============================================================


void FUN_0005ceb0(int *param_1,uint param_2)

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
// Function #574
// Name: FUN_0005d064
// Address: 0005d064
// JNI: NO
// ============================================================


void FUN_0005d064(undefined4 param_1,uint *param_2)

{
  if ((param_2[6] & 1) != 0) {
    FUN_00023f68(param_2[8],param_2[6] & 0xfffffffe);
  }
  if ((*param_2 & 1) == 0) {
    return;
  }
  FUN_00023f68(param_2[2],*param_2 & 0xfffffffe);
  return;
}




// ============================================================
// Function #575
// Name: FUN_0005d0a8
// Address: 0005d0a8
// JNI: NO
// ============================================================


void FUN_0005d0a8(undefined4 param_1,uint *param_2)

{
  if ((param_2[6] & 1) != 0) {
    FUN_00023f68(param_2[8],param_2[6] & 0xfffffffe);
  }
  if ((*param_2 & 1) == 0) {
    return;
  }
  FUN_00023f68(param_2[2],*param_2 & 0xfffffffe);
  return;
}




// ============================================================
// Function #576
// Name: FUN_0005d0ec
// Address: 0005d0ec
// JNI: NO
// ============================================================


void FUN_0005d0ec(void)

{
  return;
}




// ============================================================
// Function #577
// Name: FUN_0005d100
// Address: 0005d100
// JNI: NO
// ============================================================


void FUN_0005d100(int *param_1,int *param_2)

{
  char *pcVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  uint uVar5;
  char *pcVar6;
  char *pcVar7;
  uint uVar8;
  
  uVar8 = param_2[2];
  pcVar1 = (char *)FUN_000a0398(uVar8);
  __aeabi_memclr(pcVar1,uVar8);
  if (uVar8 != 0) {
    iVar2 = *param_2;
    iVar4 = param_2[1];
    uVar5 = 0;
    do {
      pcVar1[uVar5] = *(byte *)(iVar2 + (uVar5 & 7)) ^ *(byte *)(iVar4 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar8 != uVar5);
  }
  uVar8 = uVar8 - 1;
  if (uVar8 < 0xfffffff8) {
    if (uVar8 < 0xb) {
      pcVar6 = (char *)((int)param_1 + 1);
      *(char *)param_1 = (char)uVar8 * '\x02';
    }
    else {
      pcVar6 = (char *)FUN_000a0370((uVar8 | 7) + 1);
      param_1[2] = (int)pcVar6;
      *param_1 = (uVar8 | 7) + 2;
      param_1[1] = uVar8;
    }
    pcVar3 = pcVar1;
    pcVar7 = pcVar6;
    if (pcVar1 != pcVar1 + uVar8) {
      do {
        uVar8 = uVar8 - 1;
        pcVar6 = pcVar7 + 1;
        *pcVar7 = *pcVar3;
        pcVar3 = pcVar3 + 1;
        pcVar7 = pcVar6;
      } while (uVar8 != 0);
    }
    *pcVar6 = '\0';
    FUN_00023f74(pcVar1);
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}




// ============================================================
// Function #578
// Name: FUN_0005d1d0
// Address: 0005d1d0
// JNI: NO
// ============================================================


int FUN_0005d1d0(int param_1)

{
  int iVar1;
  int *piVar2;
  uint uVar3;
  bool bVar4;
  
  if (-1 < *(int *)(param_1 + 4)) {
    piVar2 = (int *)FUN_00025e6c(DAT_0005d238 + 0x5d1f0);
    do {
      uVar3 = FUN_00019718(6,*(undefined4 *)(param_1 + 4));
      if (0xfffff000 < uVar3) {
        iVar1 = -uVar3;
        bVar4 = uVar3 != 0xfffffffc;
        uVar3 = 0;
        if (bVar4) {
          uVar3 = 0xffffffff;
        }
        *piVar2 = iVar1;
      }
    } while ((0x7fffffff < uVar3) && (*piVar2 == 4));
  }
  return param_1;
}




// ============================================================
// Function #579
// Name: FUN_0005d23c
// Address: 0005d23c
// JNI: NO
// ============================================================


void FUN_0005d23c(int param_1)

{
  int iVar1;
  int *piVar2;
  uint uVar3;
  bool bVar4;
  
  if (-1 < *(int *)(param_1 + 4)) {
    piVar2 = (int *)FUN_00025e6c(DAT_0005d2ac + 0x5d25c);
    do {
      uVar3 = FUN_00019718(6,*(undefined4 *)(param_1 + 4));
      if (0xfffff000 < uVar3) {
        iVar1 = -uVar3;
        bVar4 = uVar3 != 0xfffffffc;
        uVar3 = 0;
        if (bVar4) {
          uVar3 = 0xffffffff;
        }
        *piVar2 = iVar1;
      }
    } while ((0x7fffffff < uVar3) && (*piVar2 == 4));
  }
  FUN_00023f68(param_1,0xc);
  return;
}




// ============================================================
// Function #580
// Name: FUN_0005d2b0
// Address: 0005d2b0
// JNI: NO
// ============================================================


void FUN_0005d2b0(int *param_1,int param_2,uint param_3)

{
  longlong lVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  bool bVar9;
  undefined8 uVar10;
  int local_30;
  int local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005d4d0 + 0x5d2cc);
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if (param_3 != 0) {
    if ((int)param_3 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0002d020();
    }
    iVar3 = FUN_000a0370(param_3);
    param_1[2] = iVar3 + param_3;
    *param_1 = iVar3;
    __aeabi_memclr(iVar3,param_3);
    iVar2 = DAT_0005d4d4;
    param_1[1] = iVar3 + param_3;
    piVar4 = (int *)FUN_00025e6c(iVar2 + 0x5d328);
    uVar6 = 0;
    do {
      uVar8 = 0;
      uVar7 = 0;
      do {
        while( true ) {
          while (uVar5 = FUN_00019718(3,*(undefined4 *)(param_2 + 4),iVar3 + uVar8,param_3 - uVar8),
                0xfffff000 < uVar5) {
            *piVar4 = -uVar5;
            if (uVar5 != 0xfffffffc) goto LAB_0005d3e0;
          }
          if (uVar5 < 0x80000000) break;
          if (*piVar4 != 4) goto LAB_0005d3e0;
        }
        if (uVar5 == 0) break;
        bVar9 = CARRY4(uVar8,uVar5);
        uVar8 = uVar8 + uVar5;
        uVar7 = uVar7 + bVar9;
      } while (uVar7 == 0 && (param_3 <= uVar8) <= uVar7);
    } while ((uVar8 != 0) && (uVar6 = uVar8 + uVar6, uVar6 < param_3));
LAB_0005d3e0:
    if (uVar6 < param_3) {
      uVar7 = FUN_00019718(0x107,0,&local_30);
      if (0xfffff000 < uVar7) {
        *piVar4 = -uVar7;
      }
      uVar5 = 0;
      iVar3 = uVar6 + iVar3;
      lVar1 = (longlong)local_30 * 1000000000 + (longlong)local_2c;
      uVar10 = FUN_00026020((int)lVar1,(int)((ulonglong)lVar1 >> 0x20),1000000,0);
      uVar7 = (uint)uVar10 * 0x10000;
      uVar8 = FUN_00019718(0x14);
      if (0xfffff000 < uVar8) {
        *piVar4 = -uVar8;
        uVar8 = 0xffffffff;
      }
      local_30 = uVar7 + uVar8;
      local_2c = ((int)((ulonglong)uVar10 >> 0x20) << 0x10 | (uint)uVar10 >> 0x10) +
                 ((int)uVar8 >> 0x1f) + (uint)CARRY4(uVar7,uVar8);
      uVar7 = param_3 - uVar6;
      do {
        uVar8 = uVar7;
        if (7 < uVar7) {
          uVar8 = 8;
        }
        __aeabi_memcpy(iVar3,&local_30,uVar8);
        uVar5 = uVar5 + 8;
        iVar3 = iVar3 + uVar8;
        uVar7 = uVar7 - 8;
      } while (uVar5 < param_3 - uVar6);
    }
  }
  if (**(int **)(DAT_0005d4d8 + 0x5d4b8) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




