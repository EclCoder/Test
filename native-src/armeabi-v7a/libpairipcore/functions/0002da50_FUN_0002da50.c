/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002da50
 * Address  : 0002da50
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


