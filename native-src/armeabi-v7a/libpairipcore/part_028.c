// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 541-560
// ============================================================

// ============================================================
// Function #541
// Name: FUN_00027468
// Address: 00027468
// JNI: NO
// ============================================================


void FUN_00027468(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = param_2[1];
  uVar2 = param_2[2];
  uVar3 = param_2[3];
  *param_1 = *param_2;
  param_1[1] = uVar1;
  param_1[2] = uVar2;
  param_1[3] = uVar3;
  return;
}




// ============================================================
// Function #542
// Name: FUN_0002747c
// Address: 0002747c
// JNI: NO
// ============================================================


void FUN_0002747c(undefined4 param_1,int param_2)

{
  uint uVar1;
  int iVar2;
  bool bVar3;
  undefined8 *local_d8;
  undefined8 *puStack_d4;
  undefined1 local_d0;
  undefined1 local_cf;
  undefined1 local_ce;
  undefined1 local_cd;
  undefined1 local_cc;
  undefined1 local_cb;
  undefined1 local_ca;
  undefined1 local_c9;
  undefined1 local_c8;
  undefined1 local_c7;
  undefined1 local_c6;
  undefined1 local_c5;
  undefined1 local_c4;
  undefined1 local_c3;
  undefined1 local_c2;
  undefined1 local_c1;
  undefined1 local_c0;
  undefined1 local_bf;
  undefined1 local_be;
  undefined1 local_bd;
  undefined1 local_bc;
  undefined1 local_bb;
  undefined1 local_ba;
  undefined1 local_b9;
  undefined1 local_b8;
  undefined1 local_b7;
  undefined1 local_b6;
  undefined1 local_b5;
  undefined1 local_b4;
  undefined1 local_b3;
  undefined1 local_b2;
  undefined1 local_b1;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  uint local_88;
  int iStack_84;
  undefined4 local_80;
  undefined4 uStack_7c;
  undefined4 local_78;
  int iStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 local_68;
  int iStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 local_58;
  int iStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined4 local_48;
  undefined4 local_44;
  undefined1 auStack_40 [36];
  int local_1c;
  
  local_1c = **(int **)(DAT_00027b4c + 0x27498);
  FUN_00028788(&local_d0);
  iStack_84 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  local_80 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_7c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  iVar2 = 0;
  local_44 = 0;
  local_b0 = *(undefined8 *)(DAT_00027b50 + 0x274c0);
  uStack_a8 = *(undefined8 *)(DAT_00027b50 + 0x274c8);
  local_a0 = *(undefined8 *)(DAT_00027b50 + 0x274d0);
  uStack_98 = *(undefined8 *)(DAT_00027b50 + 0x274d8);
  local_90 = *(undefined8 *)(DAT_00027b50 + 0x274e0);
  local_88 = 0;
  local_78 = 0;
  local_68 = 0;
  local_58 = 0;
  local_48 = 0;
  local_d8 = &local_b0;
  puStack_d4 = &uStack_a8;
  iStack_74 = iStack_84;
  uStack_70 = local_80;
  uStack_6c = uStack_7c;
  iStack_64 = iStack_84;
  uStack_60 = local_80;
  uStack_5c = uStack_7c;
  iStack_54 = iStack_84;
  uStack_50 = local_80;
  uStack_4c = uStack_7c;
  FUN_0002737c(auStack_40,&local_d8);
  uVar1 = local_88 & 0x3f;
  iStack_84 = iStack_84 + (uint)(0xffffffbf < local_88);
  local_88 = local_88 + 0x40;
  do {
    *(undefined1 *)((int)&local_80 + uVar1) = *(undefined1 *)(param_2 + 0x68 + iVar2);
    uVar1 = uVar1 + 1;
    if (uVar1 == 0x40) {
      FUN_000284f4(&local_88);
      uVar1 = 0;
    }
    iVar2 = iVar2 + 1;
  } while (iVar2 != 0x40);
  uVar1 = local_88 & 0x3f;
  bVar3 = 0xffffffdf < local_88;
  local_88 = local_88 + 0x20;
  iStack_84 = iStack_84 + (uint)bVar3;
  *(undefined1 *)((int)&local_80 + uVar1) = local_d0;
  if (uVar1 == 0x3f) {
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_cf);
    iVar2 = 1;
LAB_000275cc:
    *(undefined1 *)((int)&local_80 + iVar2) = local_ce;
    iVar2 = iVar2 + 1;
LAB_000275d8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_cd;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027650;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_cc;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_0002765c;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_cb);
    iVar2 = 1;
LAB_0002767c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_ca;
    iVar2 = iVar2 + 1;
LAB_000276b8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c9;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000276d8;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c8;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027714;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c7);
    iVar2 = 1;
LAB_00027734:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c6;
    iVar2 = iVar2 + 1;
LAB_00027770:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c5;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027790;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c4;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000277cc;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c3);
    iVar2 = 1;
LAB_000277ec:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c2;
    iVar2 = iVar2 + 1;
LAB_00027828:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c1;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027848;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c0;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027884;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_bf);
    iVar2 = 1;
LAB_000278a4:
    *(undefined1 *)((int)&local_80 + iVar2) = local_be;
    iVar2 = iVar2 + 1;
LAB_000278e0:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bd;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027900;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_bc;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_0002793c;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_bb);
    iVar2 = 1;
LAB_0002795c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_ba;
    iVar2 = iVar2 + 1;
LAB_00027998:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b9;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000279b8;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b8;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000279f4;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b7);
    iVar2 = 1;
LAB_00027a14:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b6;
    iVar2 = iVar2 + 1;
LAB_00027a50:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b5;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027a70;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b4;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027aac;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b3);
    iVar2 = 1;
LAB_00027acc:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b2;
    iVar2 = iVar2 + 1;
  }
  else {
    *(undefined1 *)((int)&local_80 + uVar1 + 1) = local_cf;
    if (uVar1 == 0x3e) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000275cc;
    }
    *(undefined1 *)((int)&local_80 + uVar1 + 2) = local_ce;
    iVar2 = uVar1 + 3;
    if (iVar2 != 0x40) goto LAB_000275d8;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_cd);
    iVar2 = 1;
LAB_00027650:
    *(undefined1 *)((int)&local_80 + iVar2) = local_cc;
    iVar2 = iVar2 + 1;
LAB_0002765c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_cb;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_0002767c;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_ca;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000276b8;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c9);
    iVar2 = 1;
LAB_000276d8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c8;
    iVar2 = iVar2 + 1;
LAB_00027714:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c7;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027734;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c6;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027770;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c5);
    iVar2 = 1;
LAB_00027790:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c4;
    iVar2 = iVar2 + 1;
LAB_000277cc:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c3;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000277ec;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_c2;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027828;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_c1);
    iVar2 = 1;
LAB_00027848:
    *(undefined1 *)((int)&local_80 + iVar2) = local_c0;
    iVar2 = iVar2 + 1;
LAB_00027884:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bf;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_000278a4;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_be;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_000278e0;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_bd);
    iVar2 = 1;
LAB_00027900:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bc;
    iVar2 = iVar2 + 1;
LAB_0002793c:
    *(undefined1 *)((int)&local_80 + iVar2) = local_bb;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_0002795c;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_ba;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027998;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b9);
    iVar2 = 1;
LAB_000279b8:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b8;
    iVar2 = iVar2 + 1;
LAB_000279f4:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b7;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027a14;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b6;
    iVar2 = iVar2 + 2;
    if (iVar2 != 0x40) goto LAB_00027a50;
    FUN_000284f4(&local_88);
    local_80 = CONCAT31(local_80._1_3_,local_b5);
    iVar2 = 1;
LAB_00027a70:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b4;
    iVar2 = iVar2 + 1;
LAB_00027aac:
    *(undefined1 *)((int)&local_80 + iVar2) = local_b3;
    if (iVar2 == 0x3f) {
      FUN_000284f4(&local_88);
      iVar2 = 0;
      goto LAB_00027acc;
    }
    *(undefined1 *)((int)&local_80 + iVar2 + 1) = local_b2;
    if (iVar2 != 0x3e) {
      *(undefined1 *)((int)&local_80 + iVar2 + 2) = local_b1;
      if (iVar2 == 0x3d) {
        FUN_000284f4(&local_88);
      }
      goto LAB_00027b04;
    }
    FUN_000284f4(&local_88);
    iVar2 = 0;
  }
  *(undefined1 *)((int)&local_80 + iVar2) = local_b1;
LAB_00027b04:
  FUN_00028788(param_1,&local_88);
  if (**(int **)(DAT_00027b54 + 0x27b20) == local_1c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #543
// Name: FUN_00027b58
// Address: 00027b58
// JNI: NO
// ============================================================


/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_00027b58(undefined4 param_1,uint *param_2,undefined1 *param_3,uint param_4)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 *local_1b8;
  undefined8 *local_1b4;
  undefined8 local_1b0;
  undefined8 uStack_1a8;
  undefined8 local_1a0;
  undefined8 uStack_198;
  undefined8 local_190;
  undefined1 local_188;
  undefined1 local_187;
  undefined1 local_186;
  undefined1 local_185;
  undefined1 local_184;
  undefined1 local_183;
  undefined1 local_182;
  undefined1 local_181;
  undefined1 local_180;
  undefined1 local_17f;
  undefined1 local_17e;
  undefined1 local_17d;
  undefined1 local_17c;
  undefined1 local_17b;
  undefined1 local_17a;
  undefined1 local_179;
  undefined1 local_178;
  undefined1 local_177;
  undefined1 local_176;
  undefined1 local_175;
  undefined1 local_174;
  undefined1 local_173;
  undefined1 local_172;
  undefined1 local_171;
  undefined1 local_170;
  undefined1 local_16f;
  undefined1 local_16e;
  undefined1 local_16d;
  undefined1 local_16c;
  undefined1 local_16b;
  undefined1 local_16a;
  undefined1 local_169;
  undefined8 local_168;
  undefined8 local_160;
  longlong local_158;
  undefined8 uStack_150;
  longlong local_148;
  undefined4 uStack_140;
  undefined4 uStack_13c;
  undefined4 local_138;
  uint uStack_134;
  undefined4 uStack_130;
  undefined4 uStack_12c;
  undefined4 local_128;
  undefined4 local_124;
  undefined1 auStack_120 [32];
  uint local_100 [2];
  undefined4 local_f8;
  undefined4 uStack_f4;
  undefined4 local_f0;
  int iStack_ec;
  undefined4 uStack_e8;
  undefined4 uStack_e4;
  undefined4 local_e0;
  int iStack_dc;
  undefined4 uStack_d8;
  undefined4 uStack_d4;
  undefined4 local_d0;
  int iStack_cc;
  undefined4 uStack_c8;
  undefined4 uStack_c4;
  undefined4 local_c0;
  undefined4 local_bc;
  undefined1 auStack_b8 [32];
  uint local_98;
  uint uStack_94;
  uint uStack_90;
  uint uStack_8c;
  uint local_88;
  uint uStack_84;
  uint uStack_80;
  uint uStack_7c;
  uint local_78;
  uint uStack_74;
  uint local_70;
  uint local_6c;
  uint local_68;
  uint uStack_64;
  uint local_60;
  uint local_5c;
  int local_54;
  
  local_100[1] = *(uint *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  local_f8 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_f4 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  uVar8 = *(undefined8 *)(DAT_000283fc + 0x27b88);
  uVar9 = *(undefined8 *)(DAT_000283fc + 0x27b90);
  uVar10 = *(undefined8 *)(DAT_000283fc + 0x27b98);
  uVar11 = *(undefined8 *)(DAT_000283fc + 0x27ba0);
  local_54 = **(int **)(DAT_00028400 + 0x27b90);
  local_100[0] = 0;
  local_f0 = 0;
  local_e0 = 0;
  local_d0 = 0;
  uVar12 = *(undefined8 *)(DAT_000283fc + 0x27ba8);
  local_c0 = 0;
  local_bc = 0;
  local_1b0 = CONCAT44(&local_160,&local_168);
  local_168 = uVar8;
  local_160 = uVar9;
  local_158 = uVar10;
  uStack_150 = uVar11;
  local_148 = uVar12;
  iStack_ec = local_100[1];
  uStack_e8 = local_f8;
  uStack_e4 = uStack_f4;
  iStack_dc = local_100[1];
  uStack_d8 = local_f8;
  uStack_d4 = uStack_f4;
  iStack_cc = local_100[1];
  uStack_c8 = local_f8;
  uStack_c4 = uStack_f4;
  FUN_0002737c(auStack_b8,&local_1b0);
  auVar1._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
  auVar1._0_8_ = 0x3636363636363636;
  auVar1 = auVar1 << 0x40 | auVar1;
  iVar7 = 0x68;
  local_98 = *param_2 ^ *(uint *)auVar1;
  uStack_94 = param_2[1] ^ *(uint *)(auVar1 + (undefined1  [16])0x4);
  uStack_90 = param_2[2] ^ *(uint *)(auVar1 + (undefined1  [16])0x8);
  uStack_8c = param_2[3] ^ *(uint *)(auVar1 + (undefined1  [16])0xc);
  uStack_74 = 0x36363636;
  uVar5 = local_100[0] & 0x3f;
  local_100[1] = local_100[1] + (0xffffffbf < local_100[0]);
  local_78 = 0x36363636;
  local_88 = param_2[4] ^ *(uint *)auVar1;
  uStack_84 = param_2[5] ^ *(uint *)(auVar1 + (undefined1  [16])0x4);
  uStack_80 = param_2[6] ^ *(uint *)(auVar1 + (undefined1  [16])0x8);
  uStack_7c = param_2[7] ^ *(uint *)(auVar1 + (undefined1  [16])0xc);
  local_70 = 0x36363636;
  local_6c = 0x36363636;
  local_68 = 0x36363636;
  uStack_64 = 0x36363636;
  local_60 = 0x36363636;
  local_5c = 0x36363636;
  local_100[0] = local_100[0] + 0x40;
  do {
    *(undefined1 *)((int)&local_f8 + uVar5) = *(undefined1 *)((int)local_100 + iVar7);
    uVar5 = uVar5 + 1;
    if (uVar5 == 0x40) {
      FUN_000284f4(local_100);
      uVar5 = 0;
    }
    iVar7 = iVar7 + 1;
  } while (iVar7 != 0xa8);
  auVar2._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
  auVar2._0_8_ = 0x6a6a6a6a6a6a6a6a;
  auVar2 = auVar2 << 0x40 | auVar2;
  uVar5 = *(uint *)auVar2;
  uVar6 = *(uint *)(auVar2 + (undefined1  [16])0x4);
  uVar3 = *(uint *)(auVar2 + (undefined1  [16])0x8);
  uVar4 = *(uint *)(auVar2 + (undefined1  [16])0xc);
  local_98 = local_98 ^ uVar5;
  uStack_94 = uStack_94 ^ uVar6;
  uStack_90 = uStack_90 ^ uVar3;
  uStack_8c = uStack_8c ^ uVar4;
  local_78 = local_78 ^ uVar5;
  uStack_74 = uStack_74 ^ uVar6;
  local_70 = local_70 ^ uVar3;
  local_6c = local_6c ^ uVar4;
  local_88 = local_88 ^ uVar5;
  uStack_84 = uStack_84 ^ uVar6;
  uStack_80 = uStack_80 ^ uVar3;
  uStack_7c = uStack_7c ^ uVar4;
  local_68 = local_68 ^ uVar5;
  uStack_64 = uStack_64 ^ uVar6;
  local_60 = local_60 ^ uVar3;
  local_5c = local_5c ^ uVar4;
  local_100[1] = local_100[1] + CARRY4(local_100[0],param_4);
  uVar5 = local_100[0] + param_4;
  if (param_4 != 0) {
    uVar6 = local_100[0] & 0x3f;
    local_100[0] = local_100[0] + param_4;
    do {
      *(undefined1 *)((int)&local_f8 + uVar6) = *param_3;
      uVar6 = uVar6 + 1;
      if (uVar6 == 0x40) {
        FUN_000284f4(local_100);
        uVar6 = 0;
      }
      param_4 = param_4 - 1;
      param_3 = param_3 + 1;
      uVar5 = local_100[0];
    } while (param_4 != 0);
  }
  local_100[0] = uVar5;
  FUN_00028788(&local_188,local_100);
  uStack_134 = *(uint *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uStack_140 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_13c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  local_124 = 0;
  local_168._0_4_ = 0;
  local_160 = CONCAT44(uStack_13c,uStack_140);
  local_158 = (ulonglong)uStack_134 << 0x20;
  uStack_150 = CONCAT44(uStack_13c,uStack_140);
  local_148 = (ulonglong)uStack_134 << 0x20;
  local_138 = 0;
  local_128 = 0;
  local_1b8 = &local_1b0;
  local_1b4 = &uStack_1a8;
  local_1b0 = uVar8;
  uStack_1a8 = uVar9;
  local_1a0 = uVar10;
  uStack_198 = uVar11;
  local_190 = uVar12;
  uStack_130 = uStack_140;
  uStack_12c = uStack_13c;
  local_168._4_4_ = uStack_134;
  FUN_0002737c(auStack_120,&local_1b8);
  iVar7 = 0x68;
  uVar5 = (uint)local_168 & 0x3f;
  local_168 = CONCAT44(local_168._4_4_ + (0xffffffbf < (uint)local_168),(uint)local_168 + 0x40);
  do {
    *(undefined1 *)((int)&local_160 + uVar5) = *(undefined1 *)((int)local_100 + iVar7);
    uVar5 = uVar5 + 1;
    if (uVar5 == 0x40) {
      FUN_000284f4(&local_168);
      uVar5 = 0;
    }
    iVar7 = iVar7 + 1;
  } while (iVar7 != 0xa8);
  uVar5 = (uint)local_168 & 0x3f;
  local_168 = CONCAT44(local_168._4_4_ + (0xffffffdf < (uint)local_168),(uint)local_168 + 0x20);
  *(undefined1 *)((int)&local_160 + uVar5) = local_188;
  if (uVar5 + 1 == 0x40) {
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_187);
    iVar7 = 1;
LAB_00027e74:
    *(undefined1 *)((int)&local_160 + iVar7) = local_186;
    iVar7 = iVar7 + 1;
LAB_00027e80:
    *(undefined1 *)((int)&local_160 + iVar7) = local_185;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00027ef8;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_184;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00027f04;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_183);
    iVar7 = 1;
LAB_00027f24:
    *(undefined1 *)((int)&local_160 + iVar7) = local_182;
    iVar7 = iVar7 + 1;
LAB_00027f60:
    *(undefined1 *)((int)&local_160 + iVar7) = local_181;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00027f80;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_180;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00027fbc;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_17f);
    iVar7 = 1;
LAB_00027fdc:
    *(undefined1 *)((int)&local_160 + iVar7) = local_17e;
    iVar7 = iVar7 + 1;
LAB_00028018:
    *(undefined1 *)((int)&local_160 + iVar7) = local_17d;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00028038;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_17c;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00028074;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_17b);
    iVar7 = 1;
LAB_00028094:
    *(undefined1 *)((int)&local_160 + iVar7) = local_17a;
    iVar7 = iVar7 + 1;
LAB_000280d0:
    *(undefined1 *)((int)&local_160 + iVar7) = local_179;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_000280f0;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_178;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_0002812c;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_177);
    iVar7 = 1;
LAB_0002814c:
    *(undefined1 *)((int)&local_160 + iVar7) = local_176;
    iVar7 = iVar7 + 1;
LAB_00028188:
    *(undefined1 *)((int)&local_160 + iVar7) = local_175;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_000281a8;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_174;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_000281e4;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_173);
    iVar7 = 1;
LAB_00028204:
    *(undefined1 *)((int)&local_160 + iVar7) = local_172;
    iVar7 = iVar7 + 1;
LAB_00028240:
    *(undefined1 *)((int)&local_160 + iVar7) = local_171;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00028260;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_170;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_0002829c;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_16f);
    iVar7 = 1;
LAB_000282bc:
    *(undefined1 *)((int)&local_160 + iVar7) = local_16e;
    iVar7 = iVar7 + 1;
LAB_000282f8:
    *(undefined1 *)((int)&local_160 + iVar7) = local_16d;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00028318;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_16c;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00028354;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_16b);
    iVar7 = 1;
LAB_00028374:
    *(undefined1 *)((int)&local_160 + iVar7) = local_16a;
    iVar7 = iVar7 + 1;
  }
  else {
    *(undefined1 *)((int)&local_160 + uVar5 + 1) = local_187;
    if (uVar5 + 2 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00027e74;
    }
    *(undefined1 *)((int)&local_160 + uVar5 + 2) = local_186;
    iVar7 = uVar5 + 3;
    if (iVar7 != 0x40) goto LAB_00027e80;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_185);
    iVar7 = 1;
LAB_00027ef8:
    *(undefined1 *)((int)&local_160 + iVar7) = local_184;
    iVar7 = iVar7 + 1;
LAB_00027f04:
    *(undefined1 *)((int)&local_160 + iVar7) = local_183;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00027f24;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_182;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00027f60;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_181);
    iVar7 = 1;
LAB_00027f80:
    *(undefined1 *)((int)&local_160 + iVar7) = local_180;
    iVar7 = iVar7 + 1;
LAB_00027fbc:
    *(undefined1 *)((int)&local_160 + iVar7) = local_17f;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00027fdc;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_17e;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00028018;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_17d);
    iVar7 = 1;
LAB_00028038:
    *(undefined1 *)((int)&local_160 + iVar7) = local_17c;
    iVar7 = iVar7 + 1;
LAB_00028074:
    *(undefined1 *)((int)&local_160 + iVar7) = local_17b;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00028094;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_17a;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_000280d0;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_179);
    iVar7 = 1;
LAB_000280f0:
    *(undefined1 *)((int)&local_160 + iVar7) = local_178;
    iVar7 = iVar7 + 1;
LAB_0002812c:
    *(undefined1 *)((int)&local_160 + iVar7) = local_177;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_0002814c;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_176;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00028188;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_175);
    iVar7 = 1;
LAB_000281a8:
    *(undefined1 *)((int)&local_160 + iVar7) = local_174;
    iVar7 = iVar7 + 1;
LAB_000281e4:
    *(undefined1 *)((int)&local_160 + iVar7) = local_173;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00028204;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_172;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_00028240;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_171);
    iVar7 = 1;
LAB_00028260:
    *(undefined1 *)((int)&local_160 + iVar7) = local_170;
    iVar7 = iVar7 + 1;
LAB_0002829c:
    *(undefined1 *)((int)&local_160 + iVar7) = local_16f;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_000282bc;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_16e;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) goto LAB_000282f8;
    FUN_000284f4(&local_168);
    local_160 = CONCAT71(local_160._1_7_,local_16d);
    iVar7 = 1;
LAB_00028318:
    *(undefined1 *)((int)&local_160 + iVar7) = local_16c;
    iVar7 = iVar7 + 1;
LAB_00028354:
    *(undefined1 *)((int)&local_160 + iVar7) = local_16b;
    if (iVar7 + 1 == 0x40) {
      FUN_000284f4(&local_168);
      iVar7 = 0;
      goto LAB_00028374;
    }
    *(undefined1 *)((int)&local_160 + iVar7 + 1) = local_16a;
    iVar7 = iVar7 + 2;
    if (iVar7 != 0x40) {
      *(undefined1 *)((int)&local_160 + iVar7) = local_169;
      if (iVar7 == 0x3f) {
        FUN_000284f4(&local_168);
      }
      goto LAB_000283ac;
    }
    FUN_000284f4(&local_168);
    iVar7 = 0;
  }
  *(undefined1 *)((int)&local_160 + iVar7) = local_169;
LAB_000283ac:
  FUN_00028788(param_1,&local_168);
  if (**(int **)(DAT_00028404 + 0x283c8) == local_54) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #544
// Name: FUN_00028408
// Address: 00028408
// JNI: NO
// ============================================================


void FUN_00028408(undefined4 *param_1)

{
  byte bVar1;
  byte bVar2;
  byte *pbVar3;
  uint local_11c;
  undefined1 auStack_114 [256];
  int local_14;
  
  local_14 = **(int **)(DAT_000284d4 + 0x2842c);
  for (local_11c = 0; local_11c < 0x100; local_11c = local_11c + 1) {
    pbVar3 = (byte *)FUN_00026f24(param_1[1],local_11c);
    bVar1 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f2c(*param_1,local_11c & 7);
    bVar2 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f34(auStack_114,local_11c);
    *pbVar3 = bVar1 ^ bVar2;
  }
  FUN_000284dc(auStack_114);
  if (**(int **)(DAT_000284d8 + 0x284b4) == local_14) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #545
// Name: FUN_000284dc
// Address: 000284dc
// JNI: NO
// ============================================================


void FUN_000284dc(undefined4 param_1)

{
  __aeabi_memcpy((int)&DAT_000284f0 + DAT_000284f0,param_1,0x100);
  return;
}




// ============================================================
// Function #546
// Name: FUN_000284f4
// Address: 000284f4
// JNI: NO
// ============================================================


void FUN_000284f4(int param_1)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint local_128 [64];
  int local_28;
  
  local_28 = **(int **)(DAT_0002877c + 0x28514);
  uVar2 = *(uint *)(param_1 + 8);
  uVar3 = *(uint *)(param_1 + 0xc);
  uVar4 = *(uint *)(param_1 + 0x10);
  uVar5 = *(uint *)(param_1 + 0x14);
  uVar10 = *(uint *)(param_1 + 0x18);
  local_128[0] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
                 uVar2 >> 0x18;
  local_128[1] = uVar3 << 0x18 | (uVar3 >> 8 & 0xff) << 0x10 | (uVar3 >> 0x10 & 0xff) << 8 |
                 uVar3 >> 0x18;
  local_128[2] = uVar4 << 0x18 | (uVar4 >> 8 & 0xff) << 0x10 | (uVar4 >> 0x10 & 0xff) << 8 |
                 uVar4 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x1c);
  local_128[3] = uVar5 << 0x18 | (uVar5 >> 8 & 0xff) << 0x10 | (uVar5 >> 0x10 & 0xff) << 8 |
                 uVar5 >> 0x18;
  uVar5 = *(uint *)(param_1 + 0x20);
  local_128[4] = uVar10 << 0x18 | (uVar10 >> 8 & 0xff) << 0x10 | (uVar10 >> 0x10 & 0xff) << 8 |
                 uVar10 >> 0x18;
  uVar10 = *(uint *)(param_1 + 0x24);
  local_128[5] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
                 uVar2 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x28);
  uVar3 = *(uint *)(param_1 + 0x2c);
  uVar4 = *(uint *)(param_1 + 0x30);
  uVar14 = *(uint *)(param_1 + 0x34);
  local_128[6] = uVar5 << 0x18 | (uVar5 >> 8 & 0xff) << 0x10 | (uVar5 >> 0x10 & 0xff) << 8 |
                 uVar5 >> 0x18;
  local_128[7] = uVar10 << 0x18 | (uVar10 >> 8 & 0xff) << 0x10 | (uVar10 >> 0x10 & 0xff) << 8 |
                 uVar10 >> 0x18;
  local_128[8] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
                 uVar2 >> 0x18;
  local_128[9] = uVar3 << 0x18 | (uVar3 >> 8 & 0xff) << 0x10 | (uVar3 >> 0x10 & 0xff) << 8 |
                 uVar3 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x38);
  uVar3 = *(uint *)(param_1 + 0x3c);
  uVar5 = *(uint *)(param_1 + 0x40);
  local_128[10] =
       uVar4 << 0x18 | (uVar4 >> 8 & 0xff) << 0x10 | (uVar4 >> 0x10 & 0xff) << 8 | uVar4 >> 0x18;
  local_128[0xb] =
       uVar14 << 0x18 | (uVar14 >> 8 & 0xff) << 0x10 | (uVar14 >> 0x10 & 0xff) << 8 | uVar14 >> 0x18
  ;
  local_128[0xc] =
       uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 | uVar2 >> 0x18;
  uVar2 = *(uint *)(param_1 + 0x44);
  local_128[0xd] =
       uVar3 << 0x18 | (uVar3 >> 8 & 0xff) << 0x10 | (uVar3 >> 0x10 & 0xff) << 8 | uVar3 >> 0x18;
  local_128[0xe] =
       uVar5 << 0x18 | (uVar5 >> 8 & 0xff) << 0x10 | (uVar5 >> 0x10 & 0xff) << 8 | uVar5 >> 0x18;
  local_128[0xf] =
       uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 | uVar2 >> 0x18;
  iVar7 = 0;
  uVar2 = local_128[0];
  do {
    iVar6 = iVar7 + -1;
    uVar4 = local_128[0xe - iVar7];
    uVar3 = local_128[1 - iVar7];
    local_128[0x10 - iVar7] =
         ((uVar3 >> 7 | uVar3 << 0x19) ^ (uVar3 >> 0x12 | uVar3 << 0xe) ^ uVar3 >> 3) + uVar2 +
         local_128[9 - iVar7] +
         ((uVar4 >> 0x11 | uVar4 << 0xf) ^ (uVar4 >> 0x13 | uVar4 << 0xd) ^ uVar4 >> 10);
    iVar7 = iVar6;
    uVar2 = uVar3;
  } while (iVar6 != -0x30);
  iVar7 = 0;
  uVar2 = *(uint *)(param_1 + 0x4c);
  uVar3 = *(uint *)(param_1 + 0x5c);
  uVar4 = *(uint *)(param_1 + 0x58);
  uVar5 = *(uint *)(param_1 + 100);
  uVar10 = *(uint *)(param_1 + 0x50);
  uVar14 = *(uint *)(param_1 + 0x54);
  uVar13 = *(uint *)(param_1 + 0x48);
  uVar8 = *(uint *)(param_1 + 0x60);
  do {
    uVar15 = uVar8;
    uVar12 = uVar13;
    uVar11 = uVar10;
    uVar9 = uVar4;
    uVar8 = uVar3;
    uVar10 = uVar2;
    puVar1 = local_128 + iVar7;
    iVar6 = iVar7 * 4;
    iVar7 = iVar7 + 1;
    iVar6 = uVar5 + ((uVar9 >> 6 | uVar9 << 0x1a) ^ (uVar9 >> 0xb | uVar9 << 0x15) ^
                    (uVar9 >> 0x19 | uVar9 << 7)) + (uVar15 & ~uVar9 | uVar8 & uVar9) +
            *(int *)(DAT_00028780 + 0x286ac + iVar6) + *puVar1;
    uVar4 = iVar6 + uVar14;
    uVar13 = ((uVar12 >> 2 | uVar12 << 0x1e) ^ (uVar12 >> 0xd | uVar12 << 0x13) ^
             (uVar12 >> 0x16 | uVar12 << 10)) + (uVar12 & (uVar10 ^ uVar11) ^ uVar10 & uVar11) +
             iVar6;
    uVar2 = uVar12;
    uVar3 = uVar9;
    uVar5 = uVar15;
    uVar14 = uVar11;
  } while (iVar7 != 0x40);
  *(uint *)(param_1 + 0x4c) = uVar12 + *(uint *)(param_1 + 0x4c);
  *(uint *)(param_1 + 0x48) = uVar13 + *(uint *)(param_1 + 0x48);
  *(uint *)(param_1 + 0x50) = uVar10 + *(uint *)(param_1 + 0x50);
  *(uint *)(param_1 + 0x54) = uVar11 + *(uint *)(param_1 + 0x54);
  *(uint *)(param_1 + 0x58) = uVar4 + *(uint *)(param_1 + 0x58);
  *(uint *)(param_1 + 0x5c) = uVar9 + *(uint *)(param_1 + 0x5c);
  *(uint *)(param_1 + 0x60) = uVar8 + *(uint *)(param_1 + 0x60);
  *(uint *)(param_1 + 100) = uVar15 + *(uint *)(param_1 + 100);
  if (**(int **)(DAT_00028784 + 0x28768) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #547
// Name: FUN_00028788
// Address: 00028788
// JNI: NO
// ============================================================


void FUN_00028788(undefined8 *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  uint *puVar3;
  uint uVar4;
  uint *puVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  bool bVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  uVar7 = *param_2;
  uVar8 = param_2[1];
  puVar5 = param_2 + 2;
  *(undefined1 *)((int)puVar5 + (uVar7 & 0x3f)) = 0x80;
  uVar1 = uVar7 + 1;
  uVar4 = uVar8 + (0xfffffffe < uVar7);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar7 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  while ((uVar1 & 0x3f) != 0x38) {
    uVar2 = uVar1 & 0x3f;
    bVar11 = 0xfffffffe < uVar1;
    uVar1 = uVar1 + 1;
    uVar4 = uVar4 + bVar11;
    *(undefined1 *)((int)puVar5 + uVar2) = 0;
    *param_2 = uVar1;
    param_2[1] = uVar4;
    if (uVar2 == 0x3f) {
      FUN_000284f4(param_2);
      uVar1 = *param_2;
      uVar4 = param_2[1];
    }
  }
  uVar2 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar8 >> 0x15);
  *param_2 = uVar2;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar2 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar2 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar2);
  *(char *)((int)puVar5 + (uVar2 & 0x3f)) = (char)(uVar8 >> 0xd);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar2 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  uVar2 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar8 >> 5);
  *param_2 = uVar2;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar2 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar2 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar2);
  *(byte *)((int)puVar5 + (uVar2 & 0x3f)) = (byte)(uVar7 >> 0x1d) | (byte)(uVar8 << 3);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar2 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  uVar8 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar7 >> 0x15);
  *param_2 = uVar8;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar8 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar8 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar8);
  *(char *)((int)puVar5 + (uVar8 & 0x3f)) = (char)(uVar7 >> 0xd);
  *param_2 = uVar1;
  param_2[1] = uVar4;
  if ((uVar8 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar1 = *param_2;
    uVar4 = param_2[1];
  }
  uVar8 = uVar1 + 1;
  uVar4 = uVar4 + (0xfffffffe < uVar1);
  *(char *)((int)puVar5 + (uVar1 & 0x3f)) = (char)(uVar7 >> 5);
  *param_2 = uVar8;
  param_2[1] = uVar4;
  if ((uVar1 & 0x3f) == 0x3f) {
    FUN_000284f4(param_2);
    uVar8 = *param_2;
    uVar4 = param_2[1];
  }
  uVar1 = uVar8 & 0x3f;
  *param_2 = uVar8 + 1;
  param_2[1] = uVar4 + (0xfffffffe < uVar8);
  puVar3 = (uint *)(uVar8 + 1);
  if (uVar1 == 0x3f) {
    puVar3 = param_2;
  }
  *(char *)((int)puVar5 + uVar1) = (char)(uVar7 << 3);
  if (uVar1 == 0x3f) {
    FUN_000284f4(puVar3);
  }
  uVar1 = param_2[0x12];
  uVar4 = param_2[0x13];
  uVar7 = param_2[0x14];
  uVar8 = param_2[0x15];
  uVar6 = param_2[0x16];
  uVar2 = param_2[0x17];
  uVar9 = param_2[0x18];
  uVar10 = param_2[0x19];
  param_2[2] = uVar1 << 0x18 | (uVar1 >> 8 & 0xff) << 0x10 | (uVar1 >> 0x10 & 0xff) << 8 |
               uVar1 >> 0x18;
  param_2[3] = uVar4 << 0x18 | (uVar4 >> 8 & 0xff) << 0x10 | (uVar4 >> 0x10 & 0xff) << 8 |
               uVar4 >> 0x18;
  param_2[4] = uVar7 << 0x18 | (uVar7 >> 8 & 0xff) << 0x10 | (uVar7 >> 0x10 & 0xff) << 8 |
               uVar7 >> 0x18;
  param_2[5] = uVar8 << 0x18 | (uVar8 >> 8 & 0xff) << 0x10 | (uVar8 >> 0x10 & 0xff) << 8 |
               uVar8 >> 0x18;
  param_2[6] = uVar6 << 0x18 | (uVar6 >> 8 & 0xff) << 0x10 | (uVar6 >> 0x10 & 0xff) << 8 |
               uVar6 >> 0x18;
  uVar12 = *(undefined8 *)(param_2 + 4);
  param_2[7] = uVar2 << 0x18 | (uVar2 >> 8 & 0xff) << 0x10 | (uVar2 >> 0x10 & 0xff) << 8 |
               uVar2 >> 0x18;
  param_2[8] = uVar9 << 0x18 | (uVar9 >> 8 & 0xff) << 0x10 | (uVar9 >> 0x10 & 0xff) << 8 |
               uVar9 >> 0x18;
  param_2[9] = uVar10 << 0x18 | (uVar10 >> 8 & 0xff) << 0x10 | (uVar10 >> 0x10 & 0xff) << 8 |
               uVar10 >> 0x18;
  uVar13 = *(undefined8 *)(param_2 + 6);
  uVar14 = *(undefined8 *)(param_2 + 8);
  *param_1 = *(undefined8 *)puVar5;
  param_1[1] = uVar12;
  param_1[2] = uVar13;
  param_1[3] = uVar14;
  return;
}




// ============================================================
// Function #548
// Name: FUN_000289c4
// Address: 000289c4
// JNI: NO
// ============================================================


void FUN_000289c4(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001ad48((int)&DAT_000289d0 + DAT_000289d0);
}




// ============================================================
// Function #549
// Name: FUN_000289d4
// Address: 000289d4
// JNI: NO
// ============================================================


void FUN_000289d4(int *param_1,undefined4 param_2,uint param_3)

{
  int iVar1;
  
  if (param_3 < 0xb) {
    *(char *)param_1 = (char)(param_3 << 1);
    __aeabi_memmove((undefined1 *)((int)param_1 + 1),param_2,param_3 + 1);
    return;
  }
  if (param_3 < 0xfffffff8) {
    iVar1 = FUN_000a0370((param_3 | 7) + 1);
    param_1[2] = iVar1;
    *param_1 = (param_3 | 7) + 2;
    param_1[1] = param_3;
    __aeabi_memmove(iVar1,param_2,param_3 + 1);
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}




// ============================================================
// Function #550
// Name: FUN_00028a34
// Address: 00028a34
// JNI: NO
// ============================================================


void FUN_00028a34(undefined4 *param_1,int *param_2,int param_3,int param_4,undefined8 *param_5)

{
  uint uVar1;
  int *piVar2;
  int iVar3;
  float extraout_r0;
  float extraout_r0_00;
  int iVar4;
  uint uVar5;
  uint extraout_r1;
  uint extraout_r1_00;
  uint extraout_r1_01;
  uint extraout_r1_02;
  uint extraout_r1_03;
  int *piVar6;
  uint extraout_r1_04;
  uint uVar7;
  uint uVar8;
  int *unaff_r6;
  undefined4 *puVar9;
  undefined4 *puVar10;
  int *piVar11;
  uint unaff_r11;
  bool bVar12;
  uint in_fpscr;
  float fVar13;
  uint uVar14;
  float fVar15;
  float fVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  uVar8 = param_2[1];
  uVar5 = ((param_3 * 0x5bd1e995 ^ (uint)(param_3 * 0x5bd1e995) >> 0x18) * 0x5bd1e995 ^ 0xde8f4ca8)
          * 0x5bd1e995 ^ (param_4 * 0x5bd1e995 ^ (uint)(param_4 * 0x5bd1e995) >> 0x18) * 0x5bd1e995;
  uVar5 = (uVar5 ^ uVar5 >> 0xd) * 0x5bd1e995;
  uVar5 = uVar5 ^ uVar5 >> 0xf;
  if (uVar8 != 0) {
    uVar1 = uVar8 - (uVar8 >> 1 & 0x55555555);
    uVar1 = (uVar1 & 0x33333333) + (uVar1 >> 2 & 0x33333333);
    uVar1 = (uVar1 + (uVar1 >> 4) & 0xf0f0f0f) * 0x1010101 >> 0x18;
    if (uVar1 < 2) {
      unaff_r11 = uVar5 & uVar8 - 1;
    }
    else {
      unaff_r11 = uVar5;
      if (uVar8 <= uVar5) {
        FUN_000264a4(uVar5,uVar8);
        unaff_r11 = extraout_r1;
      }
    }
    piVar2 = *(int **)(*param_2 + unaff_r11 * 4);
    if (piVar2 != (int *)0x0) {
      unaff_r6 = (int *)*piVar2;
    }
    if (piVar2 != (int *)0x0 && unaff_r6 != (int *)0x0) {
      if (uVar1 < 2) {
        do {
          if (unaff_r6[1] == uVar5) {
            if (unaff_r6[2] == param_3 && unaff_r6[3] == param_4) {
LAB_00028d54:
              *(undefined1 *)(param_1 + 1) = 0;
              *param_1 = unaff_r6;
              return;
            }
          }
          else if ((unaff_r6[1] & uVar8 - 1) != unaff_r11) break;
          unaff_r6 = (int *)*unaff_r6;
        } while (unaff_r6 != (int *)0x0);
      }
      else {
        do {
          uVar1 = unaff_r6[1];
          if (uVar1 == uVar5) {
            if (unaff_r6[2] == param_3 && unaff_r6[3] == param_4) goto LAB_00028d54;
          }
          else {
            if (uVar8 <= uVar1) {
              FUN_000264a4(uVar1,uVar8);
              uVar1 = extraout_r1_00;
            }
            if (uVar1 != unaff_r11) break;
          }
          unaff_r6 = (int *)*unaff_r6;
        } while (unaff_r6 != (int *)0x0);
      }
    }
  }
  piVar2 = (int *)FUN_000a0370(0x18);
  iVar3 = param_2[3];
  piVar11 = param_2 + 2;
  uVar17 = *param_5;
  uVar18 = param_5[1];
  *piVar2 = 0;
  piVar2[1] = uVar5;
  fVar15 = (float)VectorUnsignedToFloat(iVar3 + 1,(byte)(in_fpscr >> 0x16) & 3);
  fVar13 = (float)param_2[4];
  *(undefined8 *)(piVar2 + 2) = uVar17;
  *(undefined8 *)(piVar2 + 4) = uVar18;
  if (uVar8 != 0) {
    fVar16 = (float)VectorUnsignedToFloat(uVar8,(byte)(in_fpscr >> 0x16) & 3);
    in_fpscr = in_fpscr & 0xfffffff | (uint)(fVar13 * fVar16 < fVar15) << 0x1f;
    if (!SUB41(in_fpscr >> 0x1f,0)) goto LAB_00028f80;
  }
  uVar1 = 1;
  if ((2 < uVar8) && (uVar1 = 0, (uVar8 & uVar8 - 1) != 0)) {
    uVar1 = 1;
  }
  ceilf(fVar15 / fVar13);
  uVar1 = uVar1 | uVar8 << 1;
  uVar14 = (uint)(0.0 < extraout_r0) * (int)extraout_r0;
  if (uVar14 < uVar1) {
    uVar14 = uVar1;
  }
  if (uVar14 == 1) {
    bVar12 = uVar8 < 3;
    uVar14 = 2;
    if (1 < uVar8) goto LAB_00028c04;
LAB_00028d84:
    uVar8 = uVar14;
    if (0x3fffffff < uVar8) {
                    /* WARNING: Subroutine does not return */
      FUN_00026984();
    }
    iVar3 = FUN_000a0370(uVar8 << 2);
    iVar4 = *param_2;
    *param_2 = iVar3;
    if (iVar4 != 0) {
      FUN_00023f68(iVar4,param_2[1] << 2);
    }
    uVar1 = 0;
    param_2[1] = uVar8;
    do {
      *(undefined4 *)(*param_2 + uVar1 * 4) = 0;
      uVar1 = uVar1 + 1;
    } while (uVar8 != uVar1);
    puVar9 = (undefined4 *)*piVar11;
    if (puVar9 != (undefined4 *)0x0) {
      uVar1 = puVar9[1];
      uVar14 = uVar8 - 1;
      if ((uVar8 & uVar14) == 0) {
        *(int **)(*param_2 + (uVar1 & uVar14) * 4) = piVar11;
        uVar1 = uVar1 & uVar14;
        while (puVar10 = puVar9, puVar9 = (undefined4 *)*puVar10, puVar9 != (undefined4 *)0x0) {
          uVar7 = puVar9[1] & uVar14;
          if (uVar7 != uVar1) {
            iVar3 = *param_2;
            if (*(int *)(iVar3 + uVar7 * 4) == 0) {
              *(undefined4 **)(iVar3 + uVar7 * 4) = puVar10;
              uVar1 = uVar7;
            }
            else {
              *puVar10 = *puVar9;
              *puVar9 = **(undefined4 **)(iVar3 + uVar7 * 4);
              **(undefined4 **)(iVar3 + uVar7 * 4) = puVar9;
              puVar9 = puVar10;
            }
          }
        }
      }
      else {
        if (uVar8 <= uVar1) {
          FUN_000264a4(uVar1,uVar8);
          uVar1 = extraout_r1_01;
        }
        *(int **)(*param_2 + uVar1 * 4) = piVar11;
        while (puVar10 = puVar9, puVar9 = (undefined4 *)*puVar10, puVar9 != (undefined4 *)0x0) {
          uVar14 = puVar9[1];
          if (uVar8 <= uVar14) {
            FUN_000264a4(uVar14,uVar8);
            uVar14 = extraout_r1_02;
          }
          if (uVar14 != uVar1) {
            iVar3 = *param_2;
            if (*(int *)(iVar3 + uVar14 * 4) == 0) {
              *(undefined4 **)(iVar3 + uVar14 * 4) = puVar10;
              uVar1 = uVar14;
            }
            else {
              *puVar10 = *puVar9;
              *puVar9 = **(undefined4 **)(iVar3 + uVar14 * 4);
              **(undefined4 **)(iVar3 + uVar14 * 4) = puVar9;
              puVar9 = puVar10;
            }
          }
        }
      }
    }
LAB_00028efc:
    uVar1 = uVar8 - 1;
    if ((uVar8 & uVar1) != 0) {
LAB_00028f68:
      unaff_r11 = uVar5;
      if (uVar8 <= uVar5) {
        FUN_000264a4(uVar5,uVar8);
        unaff_r11 = extraout_r1_03;
      }
      goto LAB_00028f80;
    }
  }
  else {
    if ((uVar14 & uVar14 - 1) != 0) {
      uVar14 = FUN_0001974c();
      uVar8 = param_2[1];
      bVar12 = uVar8 <= uVar14;
      if (!bVar12 || uVar14 == uVar8) goto LAB_00028c04;
      goto LAB_00028d84;
    }
    bVar12 = uVar8 <= uVar14;
    if (uVar8 < uVar14) goto LAB_00028d84;
LAB_00028c04:
    if (bVar12) goto LAB_00028efc;
    fVar13 = (float)VectorUnsignedToFloat(param_2[3],(byte)(in_fpscr >> 0x16) & 3);
    ceilf(fVar13 / (float)param_2[4]);
    uVar1 = (uint)(0.0 < extraout_r0_00) * (int)extraout_r0_00;
    if ((uVar8 < 3) ||
       (uVar7 = uVar8 - (uVar8 >> 1 & 0x55555555),
       uVar7 = (uVar7 & 0x33333333) + (uVar7 >> 2 & 0x33333333),
       1 < (uVar7 + (uVar7 >> 4) & 0xf0f0f0f) * 0x1010101 >> 0x18)) {
      uVar1 = FUN_0001974c(uVar1);
      if (uVar1 < uVar14) {
        uVar1 = uVar14;
      }
      if (uVar1 < uVar8) goto LAB_00028f2c;
LAB_00028ca8:
      uVar8 = param_2[1];
      uVar1 = uVar8 - 1;
      if ((uVar8 & uVar1) == 0) goto LAB_00028f08;
      goto LAB_00028f68;
    }
    if (1 < uVar1) {
      uVar1 = 1 << (0x20U - LZCOUNT(uVar1 - 1) & 0xff);
    }
    if (uVar1 < uVar14) {
      uVar1 = uVar14;
    }
    if (uVar8 <= uVar1) goto LAB_00028ca8;
LAB_00028f2c:
    uVar14 = uVar1;
    if (uVar1 != 0) goto LAB_00028d84;
    iVar3 = *param_2;
    uVar8 = 0;
    *param_2 = 0;
    if (iVar3 != 0) {
      FUN_00023f68(iVar3,param_2[1] << 2);
    }
    param_2[1] = 0;
    uVar1 = 0xffffffff;
  }
LAB_00028f08:
  unaff_r11 = uVar1 & uVar5;
LAB_00028f80:
  iVar3 = *param_2;
  piVar6 = *(int **)(iVar3 + unaff_r11 * 4);
  if (piVar6 == (int *)0x0) {
    *piVar2 = *piVar11;
    *piVar11 = (int)piVar2;
    *(int **)(iVar3 + unaff_r11 * 4) = piVar11;
    if (*piVar2 != 0) {
      uVar5 = *(uint *)(*piVar2 + 4);
      if ((uVar8 & uVar8 - 1) == 0) {
        uVar5 = uVar5 & uVar8 - 1;
      }
      else if (uVar8 <= uVar5) {
        FUN_000264a4(uVar5,uVar8);
        uVar5 = extraout_r1_04;
      }
      *(int **)(*param_2 + uVar5 * 4) = piVar2;
    }
  }
  else {
    *piVar2 = *piVar6;
    *piVar6 = (int)piVar2;
  }
  param_2[3] = param_2[3] + 1;
  *(undefined1 *)(param_1 + 1) = 1;
  *param_1 = piVar2;
  return;
}




// ============================================================
// Function #551
// Name: FUN_0002901c
// Address: 0002901c
// JNI: NO
// ============================================================


void FUN_0002901c(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_00029028 + DAT_00029028);
}




// ============================================================
// Function #552
// Name: FUN_00029030
// Address: 00029030
// JNI: NO
// ============================================================


void FUN_00029030(byte *param_1,uint param_2,int *param_3,byte *param_4)

{
  char cVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  byte bVar5;
  bool bVar6;
  byte *pbVar7;
  size_t sVar8;
  uint uVar9;
  int iVar10;
  byte *pbVar11;
  byte *pbVar12;
  char *pcVar13;
  int *piVar14;
  undefined1 *puVar15;
  void *pvVar16;
  int iVar17;
  uint uVar18;
  byte *pbVar19;
  undefined4 *puVar20;
  uint uVar21;
  uint extraout_r1;
  int extraout_r1_00;
  undefined4 extraout_r1_01;
  uint extraout_r1_02;
  uint extraout_r1_03;
  byte *pbVar22;
  uint uVar23;
  uint uVar24;
  uint uVar25;
  char *pcVar26;
  uint *puVar27;
  int extraout_r2;
  uint uVar28;
  undefined4 uVar29;
  byte *pbVar30;
  uint unaff_r4;
  byte *pbVar31;
  byte *unaff_r5;
  int iVar32;
  uint uVar33;
  uint uVar34;
  uint unaff_r6;
  char *pcVar35;
  int *piVar36;
  char *pcVar37;
  byte *pbVar38;
  int *piVar39;
  uint unaff_r8;
  uint uVar40;
  int *piVar41;
  uint unaff_r9;
  uint uVar42;
  uint unaff_r10;
  undefined4 uVar43;
  int iVar44;
  uint in_r12;
  bool bVar45;
  bool bVar46;
  undefined8 uVar47;
  ulonglong uVar48;
  ulonglong uVar49;
  undefined8 uVar50;
  ulonglong uVar51;
  byte *local_b4;
  byte *local_b0;
  undefined4 local_ac;
  undefined4 local_a8;
  uint local_a4;
  uint local_a0;
  uint local_9c;
  int local_98;
  uint local_94;
  uint local_90;
  uint local_8c;
  uint local_88;
  uint local_84;
  uint local_80;
  uint local_7c;
  byte *local_70;
  byte *local_6c;
  undefined4 *local_68;
  undefined4 local_64;
  undefined8 local_60;
  byte *local_58;
  byte *pbStack_54;
  byte *local_50;
  byte *local_4c;
  uint local_48;
  uint local_44;
  uint local_40;
  int *local_3c;
  undefined8 local_38;
  undefined4 local_30 [2];
  int local_28;
  
  uVar49 = CONCAT44(local_ac,local_a8);
  uVar51 = CONCAT44(local_b4,local_b0);
  uVar48 = CONCAT44(unaff_r6,unaff_r9);
  local_28 = **(int **)(DAT_0002a004 + 0x29050);
  if ((int)(-0x13cb4880 - (param_2 + ((byte *)0xdf4f6f28 < param_1))) < 0 ==
      (SBORROW4(-0x13cb4880,param_2) !=
      SBORROW4(-0x13cb4880 - param_2,(uint)((byte *)0xdf4f6f28 < param_1)))) {
    if ((int)(-0x53210ca7 - (param_2 + ((byte *)0x1f6a0588 < param_1))) < 0 !=
        (SBORROW4(-0x53210ca7,param_2) !=
        SBORROW4(-0x53210ca7 - param_2,(uint)((byte *)0x1f6a0588 < param_1)))) {
      if ((int)(-0x3ee943cb - (param_2 + ((byte *)0xcf870e80 < param_1))) < 0 ==
          (SBORROW4(-0x3ee943cb,param_2) !=
          SBORROW4(-0x3ee943cb - param_2,(uint)((byte *)0xcf870e80 < param_1)))) {
        if ((int)(-0x492a34f5 - (param_2 + ((byte *)0xb02b1903 < param_1))) < 0 ==
            (SBORROW4(-0x492a34f5,param_2) !=
            SBORROW4(-0x492a34f5 - param_2,(uint)((byte *)0xb02b1903 < param_1)))) {
          if (param_1 == (byte *)0x1f6a0589 && param_2 == 0xacdef359) {
            puVar27 = (uint *)(*(int *)param_4 + param_3[1]);
            *puVar27 = (uint)*(byte *)(*(int *)param_4 + *param_3 + 1);
            puVar27[1] = 0;
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          }
          else {
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
            if (param_1 == (byte *)0xd0782ca8 && param_2 == 0xad3d0200) {
              *(undefined4 *)(*(int *)(*(int *)param_4 + *param_3) + 4) =
                   *(undefined4 *)(*(int *)param_4 + param_3[1]);
              uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
            }
          }
        }
        else {
          if (param_1 == (byte *)0xb02b1904 && param_2 == 0xb6d5cb0b) {
            iVar32 = param_3[1];
            iVar17 = *(int *)param_4;
            uVar28 = (uint)*(byte *)(iVar17 + *param_3 + 1);
            goto LAB_0002b060;
          }
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          if (param_1 == (byte *)0xbc66b560 && param_2 == 0xbd55dd4d) {
            iVar32 = *param_3;
            if (*(int *)(DAT_0002b09c + 0x2a168) == 0) {
              uVar29 = 0;
            }
            else {
              uVar29 = FUN_0005eb00();
            }
            *(undefined4 *)(*(int *)param_4 + iVar32) = uVar29;
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          }
        }
      }
      else if ((int)(-0x362888a9 - (param_2 + ((byte *)0xbfa777ae < param_1))) < 0 ==
               (SBORROW4(-0x362888a9,param_2) !=
               SBORROW4(-0x362888a9 - param_2,(uint)((byte *)0xbfa777ae < param_1)))) {
        uVar28 = param_2 ^ 0xc116bc35;
        if (param_1 == (byte *)0xcf870e81 && uVar28 == 0) {
          uVar21 = 0xa9a7de6b;
LAB_0002b458:
          uVar23 = 0x7946bc42;
          if (0x283b8c4f < (int)uVar21) {
            if ((int)uVar21 < 0x74941a64) {
              if (uVar21 == 0x283b8c50) {
                local_7c = 0;
                uVar23 = unaff_r8;
                if (unaff_r6 < unaff_r8) {
                  uVar23 = unaff_r6;
                }
                uVar21 = 0x3a183c72;
                if (uVar23 != 0) {
                  uVar24 = 0;
                  do {
                    if (local_70[uVar24] == 0x2d) {
                      local_7c = 0;
                      uVar21 = 0x3a183c72;
                      if (uVar24 == 0xffffffff) goto LAB_0002b458;
                      local_60._0_4_ = (byte *)0x0;
                      local_6c = (byte *)0x0;
                      uVar49 = strtoull((char *)local_70,(char **)&local_60,0x10);
                      uVar51 = strtoull((char *)(local_70 + uVar24 + 1),(char **)&local_6c,0x10);
                      local_7c = (uint)((byte *)local_60 == local_70 + uVar24 &&
                                       local_6c == local_70 + uVar23);
                      goto LAB_0002b894;
                    }
                    uVar24 = uVar24 + 1;
                  } while (uVar23 != uVar24);
                  local_7c = 0;
LAB_0002b894:
                  uVar21 = 0x3a183c72;
                }
              }
              else {
                if (uVar21 != 0x3a183c72) goto LAB_0002b98c;
                bVar45 = (uVar28 & 1) != 0;
                if (bVar45) {
                  uVar23 = 0x7a75;
                }
                unaff_r9 = 0;
                uVar21 = uVar23;
                if (bVar45) {
                  uVar21 = uVar23 & 0xffff | 0x922c0000;
                }
              }
            }
            else {
              if (uVar21 == 0x74941a64) {
                if ((uVar28 & 1) != 0) goto code_r0x0002b738;
                goto LAB_0002c6c8;
              }
              if (uVar21 != 0x7946bc42) goto LAB_0002b98c;
              bVar45 = (unaff_r9 & 1) != 0;
              uVar21 = 0xd3515b13;
              if (bVar45) {
                uVar21 = 0x1a64;
              }
              local_8c = 0;
              if (bVar45) {
                uVar21 = uVar21 & 0xffff | 0x74940000;
              }
              local_90 = 0;
            }
            goto LAB_0002b458;
          }
          if ((int)uVar21 < -0x34a24608) {
            if (uVar21 == 0x8d34a35c) {
              if ((uVar28 & 1) == 0) goto LAB_0002c6c8;
              unaff_r9 = 0;
              uVar28 = 1;
              uVar21 = 0x7946bc42;
              if (local_94 < unaff_r6) {
                pbVar7 = local_70 + local_94;
                uVar21 = 0x7946bc42;
                if (0xfffffff5 < *pbVar7 - 0x3a) {
                  uVar21 = unaff_r6 - local_94;
                  uVar28 = 0;
                  do {
                    uVar23 = (uint)pbVar7[uVar28];
                    if ((4 < uVar23 - 9) && (uVar23 != 0x20)) {
                      bVar45 = uVar23 != 0x2d;
                      if (bVar45) {
                        uVar28 = uVar28 + (uVar23 == 0x2b);
                      }
                      else {
                        uVar28 = uVar28 + 1;
                      }
                      if (uVar21 <= uVar28) {
                        local_a0 = 0;
                        local_a4 = 0;
                        bVar46 = false;
                        uVar24 = uVar28;
                        goto LAB_0002beb0;
                      }
                      bVar46 = false;
                      local_a0 = 0;
                      local_a4 = 0;
                      uVar23 = uVar28;
                      goto LAB_0002bde8;
                    }
                    uVar28 = uVar28 + 1;
                  } while (uVar21 != uVar28);
                  bVar46 = false;
                  bVar6 = true;
                  local_a0 = 0;
                  local_a4 = 0;
                  goto LAB_0002bb20;
                }
              }
            }
            else {
              if (uVar21 != 0x922c7a75) goto LAB_0002b98c;
              unaff_r9 = 0;
              uVar21 = uVar23;
              if ((local_7c & 1) != 0) {
                uVar21 = 0xcb5db9f8;
              }
            }
            goto LAB_0002b458;
          }
          if (uVar21 == 0xcb5db9f8) {
            if ((uVar28 & 1) == 0) goto LAB_0002c6c8;
            unaff_r9 = 0;
            uVar28 = 1;
            uVar21 = 0x7946bc42;
            if (local_98 + 4U < unaff_r6) {
              pbVar7 = local_70 + local_98;
              local_9c = (uint)(*pbVar7 == 0x72) << 3;
              if (pbVar7[1] == 0x77) {
                local_9c = (uint)(*pbVar7 == 0x72) << 3 | 4;
              }
              if (pbVar7[2] == 0x78) {
                local_9c = local_9c | 2;
              }
              if (pbVar7[3] == 0x70) {
                local_9c = local_9c | 1;
              }
              uVar28 = 1;
              uVar21 = 0x8d34a35c;
            }
            goto LAB_0002b458;
          }
          if (uVar21 != 0x2322e1d0) {
            if (uVar21 != 0xd3515b13) {
LAB_0002b98c:
              local_70 = *(byte **)(*(int *)param_4 + *param_3);
              pbVar7 = local_70 + -1;
              uVar28 = 0;
              do {
                uVar23 = uVar28;
                pbVar7 = pbVar7 + 1;
                uVar28 = uVar23 + 1;
              } while (*pbVar7 != 0);
              unaff_r6 = (int)pbVar7 - (int)local_70;
              uVar28 = uVar23;
              pbVar22 = local_70;
              if (unaff_r6 == 0) {
joined_r0x0002ba18:
                uVar28 = 0;
                if (pbVar22 != pbVar7) {
                  do {
                    uVar28 = 0;
                    pbVar19 = pbVar22;
                    if ((*pbVar22 == 0x20) || (0xfffffffa < *pbVar22 - 0xe)) break;
                    pbVar22 = pbVar22 + 1;
                    pbVar19 = pbVar7;
                  } while (pbVar22 != pbVar7);
                  do {
                    if (pbVar19 == pbVar7) break;
                    if ((*pbVar19 != 0x20) && (*pbVar19 - 0xe < 0xfffffffb)) {
                      if (pbVar19 != pbVar7) {
                        iVar32 = (int)pbVar19 - (int)local_70;
                        goto LAB_0002bc00;
                      }
                      break;
                    }
                    pbVar19 = pbVar19 + 1;
                  } while( true );
                }
              }
              else {
                do {
                  if ((*pbVar22 != 0x20) && (*pbVar22 - 0xe < 0xfffffffb)) goto joined_r0x0002ba18;
                  uVar28 = uVar28 - 1;
                  pbVar22 = pbVar22 + 1;
                } while (uVar28 != 0);
                uVar28 = 0;
              }
              goto LAB_0002ba84;
            }
            *(uint *)(*(int *)param_4 + param_3[1]) = unaff_r9 & 1;
            *(ulonglong *)(*(int *)param_4 + param_3[2]) = uVar49;
            *(ulonglong *)(*(int *)param_4 + param_3[3]) = uVar51;
            *(uint *)(*(int *)param_4 + param_3[4]) = local_9c;
            iVar32 = *(int *)param_4;
            iVar17 = param_3[5];
            *(uint *)(iVar32 + iVar17) = local_a0;
            ((uint *)(iVar32 + iVar17))[1] = local_a4;
            *(uint *)(*(int *)param_4 + param_3[6]) = local_80 & 1;
            iVar32 = *(int *)param_4;
            iVar17 = param_3[7];
            *(uint *)(iVar32 + iVar17) = local_84;
            ((uint *)(iVar32 + iVar17))[1] = unaff_r10;
            iVar32 = *(int *)param_4;
            iVar17 = param_3[8];
            *(uint *)(iVar32 + iVar17) = local_8c;
            ((uint *)(iVar32 + iVar17))[1] = local_90;
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
            goto LAB_0002c680;
          }
          if ((uVar28 & 1) != 0) {
            puVar20 = (undefined4 *)FUN_000a0398(4);
            *puVar20 = 0;
            *(undefined1 *)puVar20 = 0x2e;
            *(undefined1 *)((int)puVar20 + 1) = 0x73;
            *(undefined1 *)((int)puVar20 + 2) = 0x6f;
            *(undefined1 *)((int)puVar20 + 3) = 0;
            local_60._4_4_ = local_60._4_4_ & 0xffffff00;
            local_60._0_2_ = CONCAT11(*(undefined1 *)puVar20,6);
            local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar20 + 1),(undefined2)local_60);
            local_60._0_4_ =
                 (byte *)CONCAT13(*(undefined1 *)((int)puVar20 + 2),(undefined3)local_60);
            FUN_00023f74();
            pbVar22 = local_58;
            pbVar7 = (byte *)local_60;
            pbVar19 = local_58;
            if (((uint)(byte *)local_60 & 1) == 0) {
              pbVar19 = (byte *)((uint)&local_60 | 1);
            }
            sVar8 = strlen((char *)pbVar19);
            uVar23 = 0xffffffff;
            if ((local_88 <= unaff_r6) && (uVar23 = local_88, sVar8 != 0)) {
              iVar32 = unaff_r6 - local_88;
              pbVar38 = local_70 + unaff_r6;
              pbVar31 = pbVar38;
              if ((int)sVar8 <= iVar32) {
                bVar5 = *pbVar19;
                pbVar30 = local_70 + local_88;
                do {
                  pbVar31 = pbVar38;
                  if (((0xfffffffe < iVar32 - sVar8) ||
                      (pbVar30 = memchr(pbVar30,(uint)bVar5,(iVar32 - sVar8) + 1),
                      pbVar30 == (byte *)0x0)) ||
                     (iVar32 = memcmp(pbVar30,pbVar19,sVar8), pbVar31 = pbVar30, iVar32 == 0))
                  break;
                  pbVar30 = pbVar30 + 1;
                  iVar32 = (int)pbVar38 - (int)pbVar30;
                  pbVar31 = pbVar38;
                } while ((int)sVar8 <= iVar32);
              }
              uVar23 = (int)pbVar31 - (int)local_70;
              if (pbVar31 == pbVar38) {
                uVar23 = 0xffffffff;
              }
            }
            if (((uint)pbVar7 & 1) != 0) {
              FUN_00023f68(pbVar22,(uint)(byte *)local_60 & 0xfffffffe);
            }
            pbVar7 = (byte *)0x0;
            uVar21 = 0x7946bc42;
            uVar28 = unaff_r6;
            if (unaff_r6 != 0) {
              do {
                if (local_70[uVar28 - 1] == 0x2f) {
                  pbVar7 = local_70 + (uVar28 - 1);
                  goto LAB_0002b8a8;
                }
                uVar28 = uVar28 - 1;
              } while (uVar28 != 0);
              pbVar7 = (byte *)0x0;
            }
LAB_0002b8a8:
            uVar24 = (int)pbVar7 - (int)local_70;
            local_84 = 0;
            if (pbVar7 == (byte *)0x0) {
              uVar24 = 0xffffffff;
            }
            local_80 = 0;
            uVar28 = 1;
            unaff_r10 = 0;
            unaff_r9 = 1;
            if ((uVar23 != 0xffffffff) && (local_80 = 0, uVar24 < uVar23)) {
              local_80 = 1;
              local_84 = 0x84222325;
              unaff_r10 = 0xcbf29ce4;
              if (uVar23 + 2 != uVar24) {
                local_84 = 0x84222325;
                do {
                  uVar48 = (ulonglong)local_84;
                  uVar28 = uVar24 + 1;
                  iVar32 = local_84 * 0x100;
                  local_84 = (uint)(uVar48 * 0x1b3) ^ (int)(char)local_70[uVar24 + 1];
                  unaff_r10 = unaff_r10 * 0x1b3 + iVar32 + (int)(uVar48 * 0x1b3 >> 0x20) ^
                              (int)(char)local_70[uVar24 + 1] >> 0x1f;
                  uVar24 = uVar28;
                } while (uVar23 + 2 != uVar28);
                uVar28 = 1;
                unaff_r9 = 1;
                uVar21 = 0x7946bc42;
              }
            }
            goto LAB_0002b458;
          }
          goto LAB_0002c6c8;
        }
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (param_1 == (byte *)0x5d36bd47 && param_2 == 0xc67dd4ea) {
          iVar32 = *(int *)param_4;
          pcVar26 = *(char **)(iVar32 + *param_3);
          sVar8 = strlen(pcVar26);
          uVar28 = 0;
          uVar21 = *(uint *)(iVar32 + param_3[1]);
          if (uVar21 <= sVar8) {
            uVar28 = 0xcbf29ce4;
            uVar23 = 0x84222325;
            for (; uVar21 != 0; uVar21 = uVar21 - 1) {
              uVar48 = (ulonglong)uVar23;
              iVar17 = uVar23 * 0x100;
              uVar23 = (uint)(uVar48 * 0x1b3) ^ (int)*pcVar26;
              uVar28 = uVar28 * 0x1b3 + iVar17 + (int)(uVar48 * 0x1b3 >> 0x20) ^
                       (int)*pcVar26 >> 0x1f;
              pcVar26 = pcVar26 + 1;
            }
            uVar23 = uVar23 ^ *(uint *)(iVar32 + param_3[2]);
            uVar28 = uVar28 ^ ((uint *)(iVar32 + param_3[2]))[1];
            goto LAB_0002ad58;
          }
          goto LAB_0002ad68;
        }
      }
      else if (param_1 == (byte *)0xbfa777af && param_2 == 0xc9d77757) {
        puVar20 = (undefined4 *)FUN_000a0370(0x14);
        iVar17 = *(int *)param_4;
        iVar32 = *param_3;
        *puVar20 = 0;
        puVar20[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        puVar20[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        puVar20[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        puVar20[4] = 0;
        *(undefined4 *)(iVar17 + iVar32) = puVar20;
        ((undefined4 *)(iVar17 + iVar32))[1] = 0;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      }
      else {
        if (param_1 == (byte *)0x6a662229 && param_2 == 0xd5727bbe) {
          if (**(int **)(DAT_0002bf0c + 0x2af78) == local_28) {
            FUN_0001ae24(DAT_0002bf10 + 0x2afa4);
            return;
          }
          goto LAB_0002c6a0;
        }
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (param_1 == (byte *)0x9ac54efd && param_2 == 0xe3a7cc2b) {
          iVar32 = *(int *)param_4;
          iVar17 = *(int *)(iVar32 + *param_3);
          if (iVar17 == 0 && ((int *)(iVar32 + *param_3))[1] == 0) {
            iVar17 = param_3[1];
            *(undefined4 *)(iVar32 + iVar17) = 0;
            ((undefined4 *)(iVar32 + iVar17))[1] = 0;
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          }
          else {
            iVar10 = param_3[1];
            uVar29 = *(undefined4 *)(iVar17 + 100);
            *(undefined4 *)(iVar32 + iVar10) = *(undefined4 *)(iVar17 + 0x60);
            ((undefined4 *)(iVar32 + iVar10))[1] = uVar29;
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          }
        }
      }
      goto LAB_0002c680;
    }
    if ((int)(-0x71fb6c8f - (param_2 + ((byte *)0xbdb2cef < param_1))) < 0 !=
        (SBORROW4(-0x71fb6c8f,param_2) !=
        SBORROW4(-0x71fb6c8f - param_2,(uint)((byte *)0xbdb2cef < param_1)))) {
      if ((int)(-0x6ee8b36a - (param_2 + ((byte *)0x3daf6271 < param_1))) < 0 ==
          (SBORROW4(-0x6ee8b36a,param_2) !=
          SBORROW4(-0x6ee8b36a - param_2,(uint)((byte *)0x3daf6271 < param_1)))) {
        if (param_1 == (byte *)0xbdb2cf0 && param_2 == 0x8e049371) {
          piVar41 = *(int **)(*(int *)param_4 + *param_3);
          iVar32 = -1;
          if ((char)piVar41[1] == '\x01') {
            iVar32 = *piVar41;
          }
          piVar41 = (int *)(*(int *)param_4 + param_3[1]);
          *piVar41 = iVar32;
          piVar41[1] = iVar32 >> 0x1f;
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        }
        else {
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          if (param_1 == (byte *)0x5bfd911c && param_2 == 0x8f7eeb5d) {
            iVar32 = param_3[1];
            iVar17 = *(int *)param_4;
            uVar28 = *(uint *)(iVar17 + *param_3) & 0x7f;
            goto LAB_0002b058;
          }
        }
      }
      else if (param_1 == (byte *)0x3daf6272 && param_2 == 0x91174c96) {
        iVar32 = param_3[1];
        iVar17 = *(int *)param_4;
        uVar28 = *(byte *)(iVar17 + *param_3) - 0x7f;
LAB_0002b058:
        uVar28 = (uint)(uVar28 == 0);
LAB_0002b060:
        *(uint *)(iVar17 + iVar32) = uVar28;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      }
      else if (param_1 == (byte *)0xce4fe0d3 && param_2 == 0xa307e57b) {
        FUN_000732f8(&local_60,*(undefined4 *)param_4,*(undefined4 *)(param_4 + 4),*param_3);
        uVar21 = (uint)(byte *)local_60 & 1;
        uVar23 = (uint)(byte *)local_60 & 1;
        uVar28 = local_60._4_4_;
        if (((uint)(byte *)local_60 & 1) == 0) {
          uVar28 = (uint)(byte *)local_60 >> 1 & 0x7f;
        }
        pvVar16 = malloc(uVar28 + 1);
        pbVar7 = local_58;
        pbVar22 = local_58;
        if (uVar21 == 0) {
          pbVar22 = (byte *)((uint)&local_60 | 1);
        }
        __aeabi_memcpy(pvVar16,pbVar22,uVar28 + 1);
        iVar32 = param_3[1];
        iVar17 = *(int *)param_4;
        *(undefined4 *)(iVar17 + iVar32) = pvVar16;
        ((undefined4 *)(iVar17 + iVar32))[1] = 0;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (uVar23 != 0) {
          FUN_00023f68(pbVar7,(uint)(byte *)local_60 & 0xfffffffe);
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        }
      }
      else {
        uVar28 = 0xacbcaefc;
        param_2 = param_2 ^ 0xacbcaefc;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (param_1 == (byte *)0xdd878798 && param_2 == 0) {
          iVar32 = 0x2457553b;
          uVar21 = 0;
          do {
            if (iVar32 == -0x720f3b5f) {
              uVar23 = uVar21 & 1;
              if (uVar23 == 0) {
                unaff_r4 = uVar21 >> 1;
              }
              uVar29 = 1;
              if (unaff_r4 == 0) goto LAB_0002c070;
              pbVar7 = local_58;
              if (uVar23 == 0) {
                pbVar7 = (byte *)((uint)&local_60 | 1);
              }
              goto LAB_0002c054;
            }
            FUN_000732f8(&local_60,*(undefined4 *)param_4,*(undefined4 *)(param_4 + 4),param_3[1]);
            param_2 = *(uint *)(*(int *)param_4 + *param_3);
            pcVar26 = (char *)(param_2 - 1);
            do {
              pcVar26 = pcVar26 + 1;
            } while (*pcVar26 != '\0');
            uVar28 = (int)pcVar26 - param_2;
            uVar21 = (uint)(byte *)local_60 & 0xff;
            uVar23 = local_60._4_4_;
            if (((uint)(byte *)local_60 & 1) == 0) {
              uVar23 = (uint)(byte *)local_60 >> 1 & 0x7f;
            }
            iVar17 = 0x69996f66;
            if (uVar28 < uVar23) {
              iVar17 = -0x4e9f6931;
            }
            iVar32 = iVar32 + iVar17;
            unaff_r4 = local_60._4_4_;
          } while (iVar32 != -0x2a4813f6);
          uVar23 = (uint)(byte *)local_60 & 1;
LAB_00029330:
          uVar29 = 0;
          goto LAB_0002c070;
        }
      }
      goto LAB_0002c680;
    }
    if ((int)(-0x7c431367 - (param_2 + ((byte *)0x5c153cc2 < param_1))) < 0 ==
        (SBORROW4(-0x7c431367,param_2) !=
        SBORROW4(-0x7c431367 - param_2,(uint)((byte *)0x5c153cc2 < param_1)))) {
      if (param_1 == (byte *)0x1c16f30e && param_2 == 0x80835e07) {
        iVar32 = *(int *)param_4;
        pcVar26 = *(char **)(iVar32 + *param_3);
        sVar8 = strlen(pcVar26);
        uVar28 = 0;
        uVar21 = *(uint *)(iVar32 + param_3[1]);
        if (uVar21 <= sVar8) {
          uVar28 = 0xcbf29ce4;
          uVar23 = 0x84222325;
          if (uVar21 != 0) {
            pcVar26 = pcVar26 + (sVar8 - uVar21);
            do {
              uVar48 = (ulonglong)uVar23;
              uVar21 = uVar21 - 1;
              iVar17 = uVar23 * 0x100;
              uVar23 = (uint)(uVar48 * 0x1b3) ^ (int)*pcVar26;
              uVar28 = uVar28 * 0x1b3 + iVar17 + (int)(uVar48 * 0x1b3 >> 0x20) ^
                       (int)*pcVar26 >> 0x1f;
              pcVar26 = pcVar26 + 1;
            } while (uVar21 != 0);
          }
          uVar23 = uVar23 ^ *(uint *)(iVar32 + param_3[2]);
          uVar28 = uVar28 ^ ((uint *)(iVar32 + param_3[2]))[1];
LAB_0002ad58:
          uVar28 = (uint)(uVar23 == 0 && uVar28 == 0);
        }
LAB_0002ad68:
        *(uint *)(iVar32 + param_3[3]) = uVar28;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      }
      else {
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (param_1 == (byte *)0x5d7a5452 && param_2 == 0x83287e66) {
          unaff_r5 = (byte *)(DAT_0002ae94 + 0x29ed0);
          DataMemoryBarrier(0xb);
          if ((*(byte *)(DAT_0002ae94 + 0x29ed8) & 1) == 0) goto LAB_0002c6f4;
          goto LAB_00029edc;
        }
      }
      goto LAB_0002c680;
    }
    if (param_1 != (byte *)0x5c153cc3 || param_2 != 0x83bcec99) {
      uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      if (param_1 == (byte *)0x5d7cde44 && param_2 == 0x896be033) {
        iVar32 = *(int *)(*(int *)param_4 + param_3[1]);
        if (-1 < iVar32) {
          piVar41 = *(int **)(*(int *)param_4 + *param_3);
          local_58 = (byte *)CONCAT31(local_58._1_3_,1);
          local_60._0_4_ = (byte *)0x0;
          local_60._4_4_ = iVar32;
          if ((char)piVar41[1] == '\x01') {
            piVar41 = (int *)FUN_00026c9c();
          }
          *piVar41 = local_60._4_4_;
          *(undefined1 *)(piVar41 + 1) = 1;
          goto LAB_0002aff0;
        }
        goto LAB_0002c6dc;
      }
      goto LAB_0002c680;
    }
    pcVar26 = *(char **)(*(int *)param_4 + *param_3);
    sVar8 = strlen(pcVar26);
    if (0xfffffff7 < sVar8) {
                    /* WARNING: Subroutine does not return */
      FUN_00026b08();
    }
    if (sVar8 < 0xb) {
      local_60._0_4_ = (byte *)CONCAT31(local_60._1_3_,(char)(sVar8 << 1));
      pbVar7 = (byte *)((uint)&local_60 | 1);
      if (sVar8 != 0) goto LAB_0002c0f4;
    }
    else {
      pbVar7 = (byte *)FUN_000a0370((sVar8 | 7) + 1);
      local_60._0_4_ = (byte *)((sVar8 | 7) + 2);
      local_60._4_4_ = sVar8;
      local_58 = pbVar7;
LAB_0002c0f4:
      __aeabi_memmove(pbVar7,pcVar26,sVar8);
    }
    pbVar7[sVar8] = 0;
    FUN_0002cab8(&local_60);
LAB_0002c114:
    uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
    if (((uint)(byte *)local_60 & 1) == 0) goto LAB_0002c680;
    goto LAB_0002c120;
  }
  if ((int)(0x581b18dc - (param_2 + ((byte *)0x97d362fe < param_1))) < 0 !=
      (SBORROW4(0x581b18dc,param_2) !=
      SBORROW4(0x581b18dc - param_2,(uint)((byte *)0x97d362fe < param_1)))) {
    if ((int)(0x6e257681 - (param_2 + ((byte *)0x2ddd9630 < param_1))) < 0 ==
        (SBORROW4(0x6e257681,param_2) !=
        SBORROW4(0x6e257681 - param_2,(uint)((byte *)0x2ddd9630 < param_1)))) {
      if ((int)(0x647105bf - (param_2 + ((byte *)0xe419a906 < param_1))) < 0 ==
          (SBORROW4(0x647105bf,param_2) !=
          SBORROW4(0x647105bf - param_2,(uint)((byte *)0xe419a906 < param_1)))) {
        if (param_1 == (byte *)0x97d362ff && (byte *)(param_2 ^ 0x581b18dc) == (byte *)0x0) {
          iVar32 = -0x2e148520;
LAB_0002b268:
          if (iVar32 == 0xd4a5ef) {
            *(undefined4 *)(*(int *)param_4 + param_3[2]) = 0xffffffff;
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
            goto LAB_0002c680;
          }
          if (iVar32 != -0xc8e7486) goto code_r0x0002b278;
          iVar32 = 1;
          pbVar7 = param_1 + -1;
          do {
            pbVar22 = pbVar7;
            pbVar7 = pbVar22 + 1;
            iVar32 = iVar32 + -1;
          } while (*pbVar7 != 0);
          pbVar19 = (byte *)0x0;
          if (pbVar7 != param_1) {
            do {
              pbVar19 = pbVar22;
              if ((uint)*pbVar22 == (param_2 & 0xff)) break;
              pbVar22 = pbVar22 + -1;
              bVar45 = iVar32 != -1;
              iVar32 = iVar32 + 1;
              pbVar19 = (byte *)0x0;
            } while (bVar45);
          }
          iVar32 = (int)pbVar19 - (int)param_1;
          if (pbVar19 == (byte *)0x0) {
            iVar32 = -1;
          }
          *(int *)(*(int *)param_4 + param_3[2]) = iVar32;
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          goto LAB_0002c680;
        }
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (param_1 == (byte *)0x47e601ad && param_2 == 0x59c078bb) {
          uVar28 = 0;
          iVar32 = 0x17e53049;
          pbVar7 = (byte *)(param_2 ^ 0x581b18dc);
LAB_0002a258:
          pbVar22 = pbVar7;
          iVar17 = iVar32;
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
          pbVar7 = pbVar22;
          if (iVar17 < -0x9bee159) {
            if (iVar17 < -0x518999ef) {
              if (-0x5f3040b5 < iVar17) {
                if (iVar17 < -0x5a9bd81e) {
                  if (iVar17 == -0x5f3040b4) {
                    bVar45 = unaff_r9 == uVar28;
                    iVar32 = 0x7c573620;
LAB_0002a914:
                    local_70 = unaff_r5;
                    if (bVar45) {
                      iVar32 = -0x3e09fd03;
                    }
                  }
                  else {
                    if (iVar17 != -0x5cb3f715) goto LAB_0002a954;
                    uVar28 = (uint)*(byte *)(local_98 + local_7c);
                    pbVar22 = local_58;
                    if (((uint)(byte *)local_60 & 1) == 0) {
                      pbVar22 = (byte *)((uint)&local_60 | 1);
                    }
                    unaff_r9 = (uint)pbVar22[local_7c];
                    iVar32 = -0x5a9bd81e;
                  }
                }
                else if (iVar17 == -0x5a9bd81e) {
                  iVar32 = -0x44df787d;
                  if ((int)unaff_r9 < 100) {
                    iVar32 = 0x2a05eb3c;
                  }
                }
                else {
                  if (iVar17 != -0x5990a73e) {
                    if (iVar17 == -0x53ae9dff) {
                      bVar45 = unaff_r9 == 0x3f;
                      iVar32 = -0x5f3040b4;
                      goto LAB_0002a914;
                    }
                    goto LAB_0002a954;
                  }
                  iVar32 = -0x5f3040b4;
                  if (unaff_r9 == 0x78) {
                    iVar32 = -0x2d718e5c;
                  }
                }
                goto LAB_0002a258;
              }
              if (-0x6d6a28a7 < iVar17) {
                if (iVar17 != -0x6d6a28a6) {
                  if (iVar17 == -0x61161dc9) {
                    local_80 = 2;
                    goto LAB_0002a928;
                  }
                  goto LAB_0002a954;
                }
                iVar32 = -0x6da9e802;
                bVar45 = 0x19 < local_88 - 0x41;
LAB_0002a244:
                local_70 = unaff_r5;
                if (!bVar45) {
                  iVar32 = -0x3e09fd03;
                }
                goto LAB_0002a258;
              }
              if (iVar17 == -0x7454d935) {
                iVar32 = 0x4912be3a;
                uVar21 = local_84 - 0x41;
LAB_0002a74c:
                bVar45 = 5 < uVar21;
                goto LAB_0002a244;
              }
              if (iVar17 == -0x6da9e802) goto LAB_0002a508;
            }
            else if (iVar17 < -0x3e09fd03) {
              if (iVar17 < -0x44df787d) {
                if (iVar17 == -0x518999ef) {
                  iVar32 = -0x5f3040b4;
                  if (unaff_r9 == 100) {
                    iVar32 = 0x8bf9aff;
                  }
                  goto LAB_0002a258;
                }
                if (iVar17 == -0x47d1e267) {
                  iVar32 = 0x1fb0a78d;
                  bVar45 = 0x19 < local_90 - 0x41;
                  goto LAB_0002a244;
                }
                if (iVar17 == -0x4e5f332d) goto LAB_0002c114;
              }
              else {
                if (iVar17 == -0x44df787d) {
                  iVar32 = -0x8ea238a;
                  if ((int)unaff_r9 < 0x77) {
                    iVar32 = -0x518999ef;
                  }
                  goto LAB_0002a258;
                }
                if (iVar17 == -0x4117c602) {
                  *(undefined4 *)(*(int *)param_4 + param_3[3]) = 0;
LAB_0002a5ac:
                  iVar32 = 0x5b6cf29a;
                  goto LAB_0002a258;
                }
              }
            }
            else {
              if (-0x2d718e5d < iVar17) {
                if (iVar17 != -0x2d718e5c) {
                  if (iVar17 == -0x18a9a2df) {
                    iVar32 = -0x6d6a28a6;
                    bVar45 = 0x19 < local_88 - 0x61;
                    goto LAB_0002a244;
                  }
                  if (iVar17 == -0xaa85080) {
                    *(uint *)(*(int *)param_4 + param_3[3]) = (uint)pbVar22 & 1;
                    goto LAB_0002a5ac;
                  }
                  goto LAB_0002a954;
                }
                iVar32 = 0xdd3391c;
                local_84 = uVar28;
                local_70 = unaff_r5;
                if (uVar28 - 0x30 < 10) {
                  iVar32 = -0x3e09fd03;
                }
                goto LAB_0002a258;
              }
              if (iVar17 == -0x3e09fd03) {
                iVar32 = -0x61161dc9;
                if (((uint)local_70 & 1) != 0) {
                  iVar32 = 0x4d145ee6;
                }
                goto LAB_0002a258;
              }
              if (iVar17 == -0x2d825e80) {
                *(undefined4 *)(*(int *)param_4 + param_3[3]) = 0;
                iVar32 = -0x4e5f332d;
                goto LAB_0002a258;
              }
            }
          }
          else if (iVar17 < 0x2c36e272) {
            if (iVar17 < 0xa871ea2) {
              if (iVar17 < 0x51cc238) {
                if (iVar17 == -0x9bee159) {
LAB_0002a508:
                  local_70 = (byte *)0x0;
                  iVar32 = -0x3e09fd03;
                  goto LAB_0002a258;
                }
                if (iVar17 == -0x8ea238a) {
                  iVar32 = -0x5990a73e;
                  if ((int)unaff_r9 < 0x78) {
                    iVar32 = 0x51cc238;
                  }
                  goto LAB_0002a258;
                }
              }
              else {
                if (iVar17 == 0x51cc238) {
                  iVar32 = -0x18a9a2df;
                  local_88 = uVar28;
                  local_70 = unaff_r5;
                  if (uVar28 - 0x30 < 10) {
                    iVar32 = -0x3e09fd03;
                  }
                  goto LAB_0002a258;
                }
                if (iVar17 == 0x8bf9aff) {
                  bVar45 = 9 < uVar28 - 0x30;
                  iVar32 = -0x9bee159;
                  goto LAB_0002a244;
                }
              }
            }
            else if (iVar17 < 0xf09d583) {
              if (iVar17 == 0xa871ea2) {
                iVar32 = -0xaa85080;
                pbVar7 = local_70;
                if (local_80 == 0) {
                  iVar32 = 0x7d427fb8;
                }
                goto LAB_0002a258;
              }
              if (iVar17 == 0xdd3391c) {
                iVar32 = -0x7454d935;
                uVar21 = local_84 - 0x61;
                goto LAB_0002a74c;
              }
            }
            else {
              if (iVar17 == 0xf09d583) {
                iVar32 = -0x47d1e267;
                local_90 = uVar28;
                local_70 = unaff_r5;
                if (uVar28 - 0x61 < 0x1a) {
                  iVar32 = -0x3e09fd03;
                }
                goto LAB_0002a258;
              }
              if (iVar17 == 0x1fb0a78d) goto LAB_0002a508;
              if (iVar17 == 0x2a05eb3c) {
                iVar32 = 0x373adefd;
                if ((int)unaff_r9 < 0x61) {
                  iVar32 = -0x53ae9dff;
                }
                goto LAB_0002a258;
              }
            }
          }
          else if (iVar17 < 0x4d145ee6) {
            if (iVar17 < 0x373adefd) {
              iVar32 = -0xaa85080;
              pbVar7 = unaff_r5;
              if (iVar17 == 0x2c36e272) goto LAB_0002a258;
              if (iVar17 == 0x352c2d13) {
                uVar21 = local_60._4_4_;
                if (((uint)(byte *)local_60 & 1) == 0) {
                  uVar21 = (uint)((byte)local_60 >> 1);
                }
                iVar32 = 0x2c36e272;
                pbVar7 = pbVar22;
                if (local_7c < uVar21) {
                  iVar32 = -0x5cb3f715;
                }
                goto LAB_0002a258;
              }
            }
            else {
              if (iVar17 == 0x373adefd) {
                iVar32 = -0x5f3040b4;
                if (unaff_r9 == 0x61) {
                  iVar32 = 0xf09d583;
                }
                goto LAB_0002a258;
              }
              if (iVar17 == 0x439bb673) {
                if (local_8c <= unaff_r8) {
                  local_98 = local_9c + local_8c;
                  local_7c = 0;
                  unaff_r5 = (byte *)0x1;
LAB_0002a844:
                  iVar32 = 0x352c2d13;
                  goto LAB_0002a258;
                }
                goto LAB_0002c6cc;
              }
              if (iVar17 == 0x4912be3a) goto LAB_0002a508;
            }
          }
          else if (iVar17 < 0x7809a2bd) {
            if (iVar17 == 0x4d145ee6) {
              local_80 = 0;
LAB_0002a928:
              iVar32 = 0xa871ea2;
              goto LAB_0002a258;
            }
            iVar32 = -0x4e5f332d;
            if (iVar17 == 0x5b6cf29a) goto LAB_0002a258;
          }
          else {
            if (iVar17 == 0x7809a2bd) {
              pcVar26 = (char *)(in_r12 - 1);
              do {
                pcVar26 = pcVar26 + 1;
              } while (*pcVar26 != '\0');
              unaff_r8 = (int)pcVar26 - in_r12;
              uVar21 = local_60._4_4_;
              if (((uint)(byte *)local_60 & 1) == 0) {
                uVar21 = (uint)((byte)local_60 >> 1);
              }
              iVar32 = 0x439bb673;
              local_9c = in_r12;
              if (unaff_r8 < uVar21 + local_8c) {
                iVar32 = -0x4117c602;
              }
              goto LAB_0002a258;
            }
            if (iVar17 == 0x7d427fb8) {
              local_7c = local_7c + 1;
              unaff_r5 = local_70;
              goto LAB_0002a844;
            }
            if (iVar17 == 0x7c573620) goto LAB_0002a508;
          }
LAB_0002a954:
          FUN_000732f8(&local_60,*(undefined4 *)param_4,*(undefined4 *)(param_4 + 4),param_3[2]);
          in_r12 = *(uint *)(*(int *)param_4 + *param_3);
          local_8c = *(uint *)(*(int *)param_4 + param_3[1]);
          if ((in_r12 == 0) || ((int)local_8c < 0)) {
            iVar32 = -0x45678ec9;
          }
          else {
            iVar32 = 0x60247274;
          }
          iVar32 = iVar17 + iVar32;
          pbVar7 = pbVar22;
          goto LAB_0002a258;
        }
      }
      else if (param_1 == (byte *)0xe419a907 && param_2 == 0x647105bf) {
        iVar32 = *(int *)(*(int *)param_4 + param_3[1]);
        if (iVar32 < 0) {
LAB_0002c6dc:
          local_58 = (byte *)((uint)local_58._1_3_ << 8);
          local_60._0_4_ = (byte *)0x5;
          local_60._4_4_ = local_60._4_4_ & 0xffffff00;
          FUN_000289c4();
LAB_0002c6f4:
          iVar32 = FUN_0001b094(unaff_r5 + 8);
          if (iVar32 != 0) {
            uVar29 = FUN_0002c748();
            *(undefined4 *)(unaff_r5 + 0x10) = uVar29;
            FUN_0001b14c(unaff_r5 + 8);
          }
LAB_00029edc:
          piVar41 = *(int **)(unaff_r5 + 0x10);
          iVar32 = *(int *)param_4;
          uVar28 = piVar41[1];
          if (uVar28 != 0) {
            puVar20 = (undefined4 *)(iVar32 + *param_3);
            piVar36 = (int *)*puVar20;
            iVar17 = puVar20[1];
            uVar21 = (((int)piVar36 * 0x5bd1e995 ^ (uint)((int)piVar36 * 0x5bd1e995) >> 0x18) *
                      0x5bd1e995 ^ 0xde8f4ca8) * 0x5bd1e995 ^
                     (iVar17 * 0x5bd1e995 ^ (uint)(iVar17 * 0x5bd1e995) >> 0x18) * 0x5bd1e995;
            uVar23 = (uVar21 ^ uVar21 >> 0xd) * 0x5bd1e995;
            uVar23 = uVar23 ^ uVar23 >> 0xf;
            uVar21 = uVar28 - (uVar28 >> 1 & 0x55555555);
            uVar21 = (uVar21 & 0x33333333) + (uVar21 >> 2 & 0x33333333);
            uVar21 = (uVar21 + (uVar21 >> 4) & 0xf0f0f0f) * 0x1010101 >> 0x18;
            if (uVar21 < 2) {
              uVar24 = uVar23 & uVar28 - 1;
            }
            else {
              uVar24 = uVar23;
              if (uVar28 <= uVar23) {
                FUN_000264a4(uVar23,uVar28);
                uVar24 = extraout_r1_02;
              }
            }
            piVar14 = *(int **)(*piVar41 + uVar24 * 4);
            if (piVar14 != (int *)0x0) {
              piVar41 = (int *)*piVar14;
            }
            if (piVar14 != (int *)0x0 && piVar41 != (int *)0x0) {
              if (uVar21 < 2) {
                do {
                  if (uVar23 == piVar41[1]) {
                    if ((int *)piVar41[2] == piVar36 && piVar41[3] == iVar17) goto LAB_0002c2f4;
                  }
                  else if ((piVar41[1] & uVar28 - 1) != uVar24) break;
                  piVar41 = (int *)*piVar41;
                } while (piVar41 != (int *)0x0);
              }
              else {
                do {
                  uVar21 = piVar41[1];
                  if (uVar23 == uVar21) {
                    if ((int *)piVar41[2] == piVar36 && piVar41[3] == iVar17) goto LAB_0002c2f4;
                  }
                  else {
                    if (uVar28 <= uVar21) {
                      FUN_000264a4(uVar21,uVar28);
                      uVar21 = extraout_r1_03;
                    }
                    if (uVar21 != uVar24) break;
                  }
                  piVar41 = (int *)*piVar41;
                } while (piVar41 != (int *)0x0);
              }
            }
          }
          iVar17 = 0;
          piVar36 = param_3;
LAB_0002c2f4:
          puVar20 = (undefined4 *)(iVar32 + param_3[1]);
          *puVar20 = piVar36;
          puVar20[1] = iVar17;
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        }
        else {
          iVar17 = *(int *)(*(int *)param_4 + *param_3);
          local_58 = (byte *)CONCAT31(local_58._1_3_,1);
          piVar41 = *(int **)(iVar17 + 0xc);
          local_60._0_4_ = (byte *)0x0;
          if (piVar41 < *(int **)(iVar17 + 0x10)) {
            *piVar41 = iVar32;
            *(int **)(iVar17 + 0xc) = piVar41 + 1;
LAB_0002aff0:
            local_60._4_4_ = -1;
          }
          else {
            local_60._4_4_ = iVar32;
            uVar29 = FUN_0002d128(iVar17 + 8,(int)&local_60 + 4);
            uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
            *(undefined4 *)(iVar17 + 0xc) = uVar29;
            if (((uint)local_58 & 1) == 0) goto LAB_0002c680;
          }
          FUN_00026c9c((int)&local_60 + 4);
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        }
      }
      else if (param_1 == (byte *)0xecc6d57 && param_2 == 0x658a1e18) {
        piVar41 = *(int **)(*(int *)param_4 + *param_3);
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (piVar41 != (int *)0x0) {
          piVar36 = (int *)piVar41[2];
          if (piVar36 != (int *)0x0) {
            piVar39 = (int *)piVar41[3];
            piVar14 = piVar36;
            if (piVar36 != piVar39) {
              piVar14 = (int *)FUN_00025e6c(DAT_0002be14 + 0x2ae28);
              do {
                piVar39 = piVar39 + -1;
                if (-1 < *piVar39) {
                  do {
                    uVar28 = FUN_00019718(6,*piVar39);
                    if (0xfffff000 < uVar28) {
                      iVar32 = -uVar28;
                      bVar45 = uVar28 != 0xfffffffc;
                      uVar28 = 0;
                      if (bVar45) {
                        uVar28 = 0xffffffff;
                      }
                      *piVar14 = iVar32;
                    }
                  } while ((0x7fffffff < uVar28) && (*piVar14 == 4));
                }
              } while (piVar36 != piVar39);
              piVar14 = (int *)piVar41[2];
            }
            piVar41[3] = (int)piVar36;
            FUN_00023f68(piVar14,piVar41[4] - (int)piVar14);
          }
          if ((char)piVar41[1] == '\x01') {
            FUN_00026c9c(piVar41);
          }
          if (**(int **)(DAT_0002c740 + 0x2c43c) != local_28) goto LAB_0002c6a0;
          iVar32 = 0x14;
          goto LAB_000a0320;
        }
      }
      else {
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (param_1 == (byte *)0xc7836c6d && param_2 == 0x67ed5382) {
          iVar32 = -0x21b41cef;
          uVar28 = 0;
          pbVar7 = (byte *)0x0;
          do {
            if (iVar32 == -0x3d313323) {
              uVar23 = uVar28 & 1;
              if (uVar23 == 0) {
                unaff_r4 = uVar28 >> 1;
              }
              uVar29 = 1;
              if (unaff_r4 == 0) goto LAB_0002c018;
              pbVar22 = local_58;
              if (uVar23 == 0) {
                pbVar22 = (byte *)((uint)&local_60 | 1);
              }
              goto LAB_0002bff0;
            }
            FUN_000732f8(&local_60,*(undefined4 *)param_4,*(undefined4 *)(param_4 + 4),param_3[1]);
            pbVar7 = *(byte **)(*(int *)param_4 + *param_3);
            pbVar22 = pbVar7 + -1;
            do {
              pbVar22 = pbVar22 + 1;
            } while (*pbVar22 != 0);
            uVar28 = (uint)(byte *)local_60 & 0xff;
            uVar21 = local_60._4_4_;
            if (((uint)(byte *)local_60 & 1) == 0) {
              uVar21 = (uint)(byte *)local_60 >> 1 & 0x7f;
            }
            iVar17 = -0x1b7d1634;
            if ((uint)((int)pbVar22 - (int)pbVar7) < uVar21) {
              iVar17 = 0x349e0113;
            }
            iVar32 = iVar32 + iVar17;
            unaff_r4 = local_60._4_4_;
          } while (iVar32 != 0x12e9e424);
          uVar23 = (uint)(byte *)local_60 & 1;
          uVar29 = 0;
          goto LAB_0002c018;
        }
      }
    }
    else {
      piVar41 = (int *)(0x72ba81d5 - (param_2 + ((byte *)0x54170cff < param_1)));
      if ((int)piVar41 < 0 ==
          (SBORROW4(0x72ba81d5,param_2) !=
          SBORROW4(0x72ba81d5 - param_2,(uint)((byte *)0x54170cff < param_1)))) {
        if (param_1 == (byte *)0x2ddd9631 && param_2 == 0x6e257681) {
          iVar32 = -0xf0bb04c;
          pbVar7 = param_4;
LAB_0002b2bc:
          uVar28 = 0;
          iVar17 = 0;
          do {
            if (iVar32 == 0x3b1ce026) {
              if (local_70 <= pbVar7) goto LAB_0002bed0;
            }
            else if (iVar32 != 0x461fa18f) goto code_r0x0002b31c;
            FUN_00026034(uVar28,iVar17,unaff_r6,unaff_r8);
            bVar45 = 0xfffffffe < uVar28;
            uVar28 = uVar28 + 1;
            iVar17 = iVar17 + (uint)bVar45;
            *pbVar7 = *pbVar7 ^ *(byte *)((int)piVar41 + extraout_r2);
            iVar32 = 0x3b1ce026;
            pbVar7 = pbVar7 + 1;
          } while( true );
        }
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if ((param_1 == (byte *)0x3821ca72 && param_2 == 0x707dad52) &&
           (uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60),
           *(int *)(DAT_0002ba04 + 0x2aa38) != 0)) {
          if (**(int **)(DAT_0002ba08 + 0x2aa44) == local_28) {
            FUN_0005eb30();
            return;
          }
          goto LAB_0002c6a0;
        }
      }
      else if (param_1 == (byte *)0x54170d00 && param_2 == 0x72ba81d5) {
        iVar32 = *(int *)(DAT_0002bfc8 + 0x2b024);
        FUN_0001ae24(iVar32);
        uVar29 = *(undefined4 *)(iVar32 + 4);
        uVar28 = *(uint *)(iVar32 + 8);
        FUN_0001ae3c(iVar32);
        if ((uVar28 & 1) == 0) {
          uVar29 = 0xffffffff;
        }
        *(undefined4 *)(*(int *)param_4 + *param_3) = uVar29;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      }
      else {
        if (param_1 == (byte *)0x866daae4 && param_2 == 0x738fa5df) {
          iVar32 = param_3[1];
          iVar17 = *(int *)param_4;
          uVar28 = *(uint *)(iVar17 + *param_3);
          goto LAB_0002b060;
        }
        uVar28 = (uint)param_1 ^ 0x4225870d | param_2 ^ 0x7ba4bb95;
        uVar49 = CONCAT44(param_2,uVar28) ^ 0x7ba4bb9500000000;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (uVar28 == 0) {
          uVar28 = 0;
          for (iVar32 = 0x407f638b; iVar32 != 0x38381788; iVar32 = iVar32 + iVar17) {
            if (iVar32 == 0x260ead73) goto LAB_0002c09c;
            pcVar37 = *(char **)(*(int *)param_4 + *param_3);
            pcVar26 = pcVar37 + -1;
            iVar17 = 0;
            do {
              iVar10 = iVar17;
              pcVar26 = pcVar26 + 1;
              iVar17 = iVar10 + 1;
            } while (*pcVar26 != '\0');
            iVar17 = -0x8474c03;
            if (pcVar26 != pcVar37) {
              iVar44 = 0;
              do {
                if (pcVar37[iVar44] == '-') {
                  if (iVar44 != -1) {
                    local_6c = (byte *)0x0;
                    local_60._0_4_ = (byte *)0x0;
                    uVar48 = strtoull(pcVar37,(char **)&local_6c,0x10);
                    uVar49 = strtoull(pcVar37 + iVar44 + 1,(char **)&local_60,0x10);
                    uVar28 = (uint)local_6c ^ (uint)(pcVar37 + iVar44);
                    if (uVar28 == 0 && ((uint)(byte *)local_60 ^ (uint)pcVar26) == 0) {
                      iVar17 = -0x1a70b618;
                    }
                    uVar28 = (uint)(uVar28 == 0 && ((uint)(byte *)local_60 ^ (uint)pcVar26) == 0);
                    goto LAB_00029620;
                  }
                  break;
                }
                iVar10 = iVar10 + -1;
                iVar44 = iVar44 + 1;
              } while (iVar10 != 0);
            }
            uVar49 = 0;
            uVar48 = 0;
            uVar28 = 0;
LAB_00029620:
          }
          uVar49 = 0;
          uVar48 = 0;
LAB_0002c09c:
          *(uint *)(*(int *)param_4 + param_3[1]) = uVar28;
          *(ulonglong *)(*(int *)param_4 + param_3[2]) = uVar48;
          *(ulonglong *)(*(int *)param_4 + param_3[3]) = uVar49;
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        }
      }
    }
    goto LAB_0002c680;
  }
  if ((int)(0xc3edde7 - (param_2 + ((byte *)0xd7d2babd < param_1))) < 0 ==
      (SBORROW4(0xc3edde7,param_2) !=
      SBORROW4(0xc3edde7 - param_2,(uint)((byte *)0xd7d2babd < param_1)))) {
    if ((int)(-0x4113d03 - (param_2 + ((byte *)0x17af4a5d < param_1))) < 0 ==
        (SBORROW4(-0x4113d03,param_2) !=
        SBORROW4(-0x4113d03 - param_2,(uint)((byte *)0x17af4a5d < param_1)))) {
      if (param_1 == (byte *)0xdf4f6f29 && param_2 == 0xec34b780) {
        iVar32 = param_3[1];
        FUN_0002d2f0(&local_60,*(undefined4 *)(*(int *)param_4 + *param_3),100);
        uVar28 = local_60._4_4_;
        pbVar7 = (byte *)local_60;
        if ((byte *)local_60 != (byte *)0x0) {
          FUN_00023f68((byte *)local_60,(int)local_58 - (int)(byte *)local_60);
        }
        *(int *)(*(int *)param_4 + iVar32) = (int)(uVar28 - (int)pbVar7) >> 3;
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      }
      else {
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        if (param_1 == (byte *)0xb73ce2be && param_2 == 0xf512c1a9) {
          pcVar26 = *(char **)(*(int *)param_4 + *param_3);
          pcVar37 = pcVar26;
          do {
            pcVar35 = pcVar37;
            pcVar37 = pcVar35 + 1;
          } while (*pcVar35 != '\0');
          puVar20 = (undefined4 *)FUN_000a0398(5);
          bVar45 = false;
          *puVar20 = 0;
          *(undefined1 *)puVar20 = 0x2e;
          *(undefined1 *)((int)puVar20 + 1) = 0x61;
          *(undefined1 *)(puVar20 + 1) = 0;
          *(undefined1 *)((int)puVar20 + 2) = 0x70;
          *(undefined1 *)((int)puVar20 + 3) = 0x6b;
          *(undefined1 *)(puVar20 + 1) = 0;
          local_60._0_2_ = CONCAT11(*(undefined1 *)puVar20,8);
          local_60._0_3_ = CONCAT12(*(undefined1 *)((int)puVar20 + 1),(undefined2)local_60);
          local_60._0_4_ = (byte *)CONCAT13(*(undefined1 *)((int)puVar20 + 2),(undefined3)local_60);
          local_60._4_4_ =
               CONCAT31((int3)(local_60._4_4_ >> 8),*(undefined1 *)((int)puVar20 + 3)) & 0xffff00ff;
          FUN_00023f74();
          pbVar22 = local_58;
          pbVar7 = (byte *)local_60;
          pbVar19 = local_58;
          if (((uint)(byte *)local_60 & 1) == 0) {
            pbVar19 = (byte *)((uint)&local_60 | 1);
          }
          pcVar13 = (char *)strlen((char *)pbVar19);
          pcVar35 = pcVar35 + -(int)pcVar26;
          if (pcVar13 <= pcVar35) {
            iVar32 = 2;
            do {
              if (pcVar13 == (char *)0x0) {
                bVar45 = true;
                break;
              }
              iVar17 = -iVar32;
              iVar32 = iVar32 + 1;
              pbVar31 = pbVar19 + -1 + (int)pcVar13;
              pcVar13 = pcVar13 + -1;
            } while (*pbVar31 == pcVar37[iVar17]);
          }
          if (((uint)pbVar7 & 1) != 0) {
            FUN_00023f68(pbVar22,(uint)(byte *)local_60 & 0xfffffffe);
          }
          local_70 = (byte *)pcVar26;
          if (bVar45) {
            FUN_0002d030(&local_60,pcVar26,pcVar35,1);
            if ((byte *)local_60 == (byte *)0x0) {
              if (((uint)local_58 & 0xff) == 0) goto LAB_0002c6c8;
              iVar17 = 0;
              pcVar26 = (char *)(local_60._4_4_ + 1);
              if (pcVar35 < (char *)(local_60._4_4_ + 1)) {
                pcVar26 = pcVar35;
              }
            }
            else {
LAB_0002c5e4:
              local_70 = (byte *)0x0;
              iVar17 = 5;
            }
LAB_0002c5f4:
            uVar28 = (uint)(iVar17 == 0);
            iVar32 = 0;
            if (iVar17 == 0) {
              if ((byte *)local_60 != (byte *)0x0) {
LAB_0002c6c8:
                FUN_000289c4();
                uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
LAB_0002c6cc:
                local_60 = uVar50;
                    /* WARNING: Subroutine does not return */
                FUN_00026994(DAT_0002c730 + 0x2c6d8);
              }
              pvVar16 = malloc((size_t)(pcVar26 + 1));
              iVar32 = FUN_0009fa08(pvVar16,local_70,pcVar26);
              pcVar26[iVar32] = '\0';
            }
          }
          else {
            local_38 = *(undefined8 *)(DAT_0002c738 + 0x2c384);
            local_30[0] = 0x6c2c9291;
            local_64 = 4;
            local_6c = (byte *)&local_38;
            local_68 = local_30;
            FUN_0005d100(&local_60,&local_6c);
            pbVar22 = local_58;
            pbVar7 = (byte *)local_60;
            pbVar19 = (byte *)((uint)&local_60 | 1);
            if (((uint)(byte *)local_60 & 1) != 0) {
              pbVar19 = local_58;
            }
            pcVar13 = (char *)strlen((char *)pbVar19);
            bVar45 = false;
            if (pcVar13 <= pcVar35) {
              iVar32 = 2;
              do {
                if (pcVar13 == (char *)0x0) {
                  bVar45 = true;
                  break;
                }
                iVar17 = -iVar32;
                iVar32 = iVar32 + 1;
                pbVar31 = pbVar19 + -1 + (int)pcVar13;
                pcVar13 = pcVar13 + -1;
              } while (*pbVar31 == pcVar37[iVar17]);
            }
            if (((uint)pbVar7 & 1) != 0) {
              FUN_00023f68(pbVar22,(uint)(byte *)local_60 & 0xfffffffe);
            }
            uVar28 = 0;
            iVar32 = 0;
            if (bVar45) {
              FUN_0002d030(&local_60,pcVar26,pcVar35,3);
              if ((byte *)local_60 != (byte *)0x0) goto LAB_0002c5e4;
              if (((uint)local_58 & 0xff) == 0) goto LAB_0002c6c8;
              iVar17 = 0;
              pcVar26 = (char *)(local_60._4_4_ + 1);
              if (pcVar35 < (char *)(local_60._4_4_ + 1)) {
                pcVar26 = pcVar35;
              }
              goto LAB_0002c5f4;
            }
          }
          *(uint *)(*(int *)param_4 + param_3[1]) = uVar28;
          iVar17 = *(int *)param_4;
          iVar10 = param_3[2];
          *(int *)(iVar17 + iVar10) = iVar32;
          ((int *)(iVar17 + iVar10))[1] = 0;
          uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
        }
      }
    }
    else if (param_1 == (byte *)0x17af4a5e && param_2 == 0xfbeec2fd) {
      iVar17 = *(int *)param_4;
      uVar21 = 0x84222325;
      iVar32 = *(int *)(iVar17 + param_3[1]);
      uVar28 = 0xcbf29ce4;
      if (iVar32 != 0) {
        pcVar26 = *(char **)(iVar17 + *param_3);
        do {
          uVar48 = (ulonglong)uVar21;
          iVar32 = iVar32 + -1;
          iVar10 = uVar21 * 0x100;
          uVar21 = (uint)(uVar48 * 0x1b3) ^ (int)*pcVar26;
          uVar28 = uVar28 * 0x1b3 + iVar10 + (int)(uVar48 * 0x1b3 >> 0x20) ^ (int)*pcVar26 >> 0x1f;
          pcVar26 = pcVar26 + 1;
        } while (iVar32 != 0);
      }
      iVar32 = param_3[2];
      *(uint *)(iVar17 + iVar32) = uVar21;
      ((uint *)(iVar17 + iVar32))[1] = uVar28;
      uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
    }
    else {
      uVar28 = (uint)param_1 ^ 0x9cb77227 | param_2 ^ 0x3b8b443;
      bVar45 = uVar28 == 0;
      if (bVar45) {
        unaff_r4 = DAT_0002b004 + 0x2a048;
        uVar28 = *(uint *)(DAT_0002b004 + 0x2a054);
      }
      uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      if (bVar45 && uVar28 == 0) {
        uVar28 = *(uint *)(*(int *)param_4 + *param_3);
        puVar20 = (undefined4 *)FUN_000a0370(0xc);
        *puVar20 = 0;
        *(undefined4 **)(unaff_r4 + 0xc) = puVar20;
        puVar20[1] = uVar28 & ~((int)uVar28 >> 0x1f);
        puVar20[2] = (uint)(0 < (int)uVar28);
        uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      }
    }
  }
  else if ((int)(0x46c2541e - (param_2 + ((byte *)0x8e14c714 < param_1))) < 0 ==
           (SBORROW4(0x46c2541e,param_2) !=
           SBORROW4(0x46c2541e - param_2,(uint)((byte *)0x8e14c714 < param_1)))) {
    if (param_1 == (byte *)0xd7d2babe && param_2 == 0xc3edde7) {
      uVar43 = *(undefined4 *)(*(int *)param_4 + *param_3);
      uVar29 = ((undefined4 *)(*(int *)param_4 + *param_3))[1];
      puVar20 = (undefined4 *)FUN_000a0398(0xf);
      *puVar20 = 0;
      *(undefined1 *)puVar20 = 0x2f;
      *(undefined1 *)((int)puVar20 + 1) = 0x70;
      *(undefined1 *)((int)puVar20 + 2) = 0x72;
      puVar20[1] = 0;
      *(undefined1 *)((int)puVar20 + 3) = 0x6f;
      *(undefined1 *)(puVar20 + 1) = 99;
      *(undefined1 *)((int)puVar20 + 5) = 0x2f;
      *(undefined4 *)((int)puVar20 + 7) = 0;
      *(undefined1 *)((int)puVar20 + 6) = 0x73;
      *(undefined1 *)((int)puVar20 + 7) = 0x65;
      *(undefined1 *)(puVar20 + 2) = 0x6c;
      *(undefined1 *)((int)puVar20 + 9) = 0x66;
      *(undefined4 *)((int)puVar20 + 0xb) = 0;
      *(undefined1 *)((int)puVar20 + 10) = 0x2f;
      *(undefined1 *)((int)puVar20 + 0xb) = 0x66;
      *(undefined1 *)(puVar20 + 3) = 100;
      *(undefined1 *)((int)puVar20 + 0xd) = 0x2f;
      *(undefined1 *)((int)puVar20 + 0xe) = 0;
      puVar15 = (undefined1 *)FUN_000a0370(0x10);
      uVar2 = *(undefined1 *)((int)puVar20 + 1);
      uVar3 = *(undefined1 *)((int)puVar20 + 2);
      *puVar15 = *(undefined1 *)puVar20;
      uVar4 = *(undefined1 *)((int)puVar20 + 3);
      puVar15[1] = uVar2;
      uVar2 = *(undefined1 *)(puVar20 + 1);
      puVar15[2] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar20 + 5);
      puVar15[3] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar20 + 6);
      puVar15[4] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar20 + 7);
      puVar15[5] = uVar3;
      uVar3 = *(undefined1 *)(puVar20 + 2);
      puVar15[6] = uVar4;
      uVar4 = *(undefined1 *)((int)puVar20 + 9);
      puVar15[7] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar20 + 10);
      puVar15[8] = uVar3;
      uVar3 = *(undefined1 *)((int)puVar20 + 0xb);
      puVar15[9] = uVar4;
      uVar4 = *(undefined1 *)(puVar20 + 3);
      puVar15[10] = uVar2;
      uVar2 = *(undefined1 *)((int)puVar20 + 0xd);
      puVar15[0xc] = uVar4;
      puVar15[0xb] = uVar3;
      puVar15[0xe] = 0;
      puVar15[0xd] = uVar2;
      FUN_00023f74(puVar20);
      FUN_0001a55c(&local_60,extraout_r1_01,uVar43,uVar29);
      pbVar7 = local_58;
      if (((uint)(byte *)local_60 & 1) == 0) {
        pbVar7 = (byte *)((uint)&local_60 | 1);
      }
      uVar29 = FUN_0009fa74(puVar15,pbVar7);
      if (((uint)(byte *)local_60 & 1) != 0) {
        FUN_00023f68(local_58,(uint)(byte *)local_60 & 0xfffffffe);
      }
      FUN_00023f68(puVar15,0x10);
      iVar32 = *(int *)param_4;
      iVar17 = param_3[1];
      *(undefined4 *)(iVar32 + iVar17) = uVar29;
      ((undefined4 *)(iVar32 + iVar17))[1] = 0;
      uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
    }
    else {
      uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
      if (param_1 == (byte *)0x34aa7454 && param_2 == 0x182cae23) {
        if (**(int **)(DAT_0002b0a0 + 0x2a1b4) == local_28) {
          FUN_0001ae3c(DAT_0002b0a4 + 0x2a1e0);
          return;
        }
        goto LAB_0002c6a0;
      }
    }
  }
  else if (param_1 == (byte *)0x8e14c715 && param_2 == 0x46c2541e) {
    iVar17 = param_3[2];
    iVar32 = *(int *)(*(int *)param_4 + param_3[1]);
    FUN_0002d2f0(&local_60,*(undefined4 *)(*(int *)param_4 + *param_3),100);
    uVar29 = *(undefined4 *)((byte *)local_60 + iVar32 * 8);
    uVar43 = *(undefined4 *)((byte *)local_60 + iVar32 * 8 + 4);
    FUN_00023f68((byte *)local_60,(int)local_58 - (int)(byte *)local_60);
    iVar32 = *(int *)param_4;
    *(undefined4 *)(iVar32 + iVar17) = uVar29;
    ((undefined4 *)(iVar32 + iVar17))[1] = uVar43;
    uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
  }
  else if (param_1 == (byte *)0x9718681c && param_2 == 0x482aae7a) {
    iVar10 = *(int *)param_4;
    uVar21 = *(uint *)(param_4 + 4);
    iVar17 = param_3[2];
    iVar32 = *param_3;
    FUN_000264a4(~(*(uint *)(iVar10 + param_3[1]) ^ uVar21),uVar21);
    uVar29 = *(undefined4 *)(iVar10 + iVar17);
    uVar43 = *(undefined4 *)(iVar10 + iVar32);
    uVar28 = *(ushort *)(iVar10 + extraout_r1) ^ extraout_r1;
    if ((uVar28 & 0xffff) == 0xffff) {
      piVar41 = (int *)0x0;
      piVar36 = (int *)0x0;
    }
    else {
      if (-1 < (short)uVar28) {
                    /* WARNING: Subroutine does not return */
        FUN_00026950();
      }
      iVar17 = (int)(short)~uVar28;
      iVar32 = iVar17 << 2;
      piVar41 = (int *)FUN_000a0370(iVar32);
      __aeabi_memclr4(piVar41,iVar32);
      uVar23 = 0;
      do {
        FUN_000264a4(*(uint *)((ushort *)(iVar10 + extraout_r1) + uVar23 * 2 + 1) ^ ~uVar21,uVar21);
        piVar41[uVar23] = extraout_r1_00;
        uVar23 = uVar23 + 1;
      } while ((~uVar28 & 0xffff) != uVar23);
      piVar36 = piVar41 + iVar17;
    }
    FUN_0002d2f0(&local_60,uVar43,uVar29);
    uVar28 = (int)(local_60._4_4_ - (int)(byte *)local_60) >> 3;
    if (local_60._4_4_ - (int)(byte *)local_60 == 0) {
      *(undefined4 *)(*(int *)param_4 + param_3[3]) = 0;
      if (local_60._4_4_ != 0) goto LAB_0002c210;
    }
    else {
      uVar21 = uVar28;
      piVar14 = piVar41;
      pbVar7 = (byte *)local_60;
      if (uVar28 < 2) {
        uVar21 = 1;
      }
      do {
        iVar32 = *(int *)param_4;
        uVar21 = uVar21 - 1;
        iVar17 = *piVar14;
        uVar29 = *(undefined4 *)(pbVar7 + 4);
        *(undefined4 *)(iVar32 + iVar17) = *(undefined4 *)pbVar7;
        ((undefined4 *)(iVar32 + iVar17))[1] = uVar29;
        piVar14 = piVar14 + 1;
        pbVar7 = pbVar7 + 8;
      } while (uVar21 != 0);
      *(uint *)(*(int *)param_4 + param_3[3]) = uVar28;
LAB_0002c210:
      FUN_00023f68((byte *)local_60,(int)local_58 - (int)(byte *)local_60);
    }
    uVar50 = local_60;
    if (piVar41 != (int *)0x0) {
      if (**(int **)(DAT_0002c73c + 0x2c234) == local_28) {
        iVar32 = (int)piVar36 - (int)piVar41;
LAB_000a0320:
        FUN_00023f68(piVar41,iVar32);
        return;
      }
      goto LAB_0002c6a0;
    }
  }
  else {
    uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
    if (param_1 != (byte *)0x51af22bf || param_2 != 0x4f4ebb3b) goto LAB_0002c680;
    iVar32 = *(int *)param_4;
    pcVar26 = *(char **)(iVar32 + *param_3);
    sVar8 = strlen(pcVar26);
    uVar24 = *(uint *)(iVar32 + param_3[3]);
    uVar23 = *(uint *)(iVar32 + param_3[2]);
    uVar33 = *(uint *)(iVar32 + param_3[1]);
    uVar28 = ((uint *)(iVar32 + param_3[2]))[1];
    uVar21 = ((uint *)(iVar32 + param_3[3]))[1];
    local_3c = (int *)FUN_000a0370(0x30);
    uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
    pbStack_54 = *(byte **)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    local_50 = *(byte **)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    local_4c = *(byte **)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    iVar17 = 0;
    iVar32 = DAT_0002a400 + 0x2943c;
    *local_3c = 0;
    local_3c[1] = (int)pbStack_54;
    local_3c[2] = (int)local_50;
    local_3c[3] = (int)local_4c;
    *local_3c = iVar32;
    local_3c[4] = 0;
    local_3c[5] = (int)pbStack_54;
    local_3c[6] = (int)local_50;
    local_3c[7] = (int)local_4c;
    local_3c[5] = 1;
    local_3c[6] = 1;
    uVar47 = DAT_00029868;
    local_58 = (byte *)0x0;
    local_48 = 0;
    *(undefined8 *)(local_3c + 8) = DAT_00029860;
    *(undefined8 *)(local_3c + 10) = uVar47;
    local_44 = 0;
    local_40 = uVar33;
    if (sVar8 == 0) {
LAB_0002c510:
      local_60 = uVar50;
      (**(code **)(*local_3c + 4))();
    }
    else {
      uVar9 = sVar8 + uVar33;
      pcVar37 = pcVar26;
      do {
        piVar41 = local_3c;
        uVar40 = local_44;
        uVar18 = local_48;
        pbVar7 = pbStack_54;
        uVar9 = uVar9 - 1;
        uVar34 = uVar9;
        if (uVar33 < uVar9) {
          uVar34 = uVar33;
        }
        cVar1 = *pcVar37;
        local_60 = uVar50;
        if (local_44 == local_40) {
          (**(code **)(*local_3c + 0xc))
                    (local_3c,*(undefined1 *)
                               (*(int *)(pbStack_54 + (local_48 >> 0xc) * 4) + (local_48 & 0xfff)));
          local_48 = uVar18 + 1;
          uVar40 = uVar40 - 1;
          local_44 = uVar40;
          if (0x1fff < local_48) {
            pbVar22 = pbVar7 + 4;
            FUN_00023f68(*(undefined4 *)pbVar7,0x1000);
            local_48 = uVar18 - 0xfff;
            pbVar7 = pbVar22;
            pbStack_54 = pbVar22;
          }
        }
        uVar25 = local_48;
        uVar50 = (**(code **)(*piVar41 + 8))(piVar41,cVar1);
        pbVar31 = local_4c;
        pbVar19 = local_50;
        pbVar22 = local_58;
        uVar42 = (int)local_50 - (int)pbVar7;
        uVar18 = 0;
        if (local_50 != pbVar7) {
          uVar18 = uVar42 * 0x400 - 1;
        }
        uVar40 = uVar40 + uVar25;
        if (uVar18 == uVar40) {
          local_60 = uVar50;
          if (uVar25 < 0x1000) {
            if (uVar42 < (uint)((int)local_4c - (int)local_58)) {
              uVar29 = FUN_000a0370(0x1000);
              if (pbVar31 == pbVar19) {
                if (pbVar7 == pbVar22) {
                  iVar32 = (int)pbVar31 - (int)pbVar7;
                  uVar18 = iVar32 >> 1;
                  if (pbVar19 == pbVar7) {
                    uVar18 = 1;
                  }
                  if (0x3fffffff < uVar18) goto LAB_0002c6d8;
                  local_58 = (byte *)FUN_000a0370(uVar18 << 2);
                  local_4c = local_58 + uVar18 * 4;
                  pbVar31 = local_58 + (uVar18 + 3 & 0xfffffffc);
                  local_50 = pbVar31;
                  pbStack_54 = pbVar31;
                  if (pbVar19 == pbVar7) {
LAB_00029ce0:
                    bVar45 = pbVar7 == (byte *)0x0;
                    pbVar7 = pbVar31;
                    if (bVar45) goto LAB_00029d0c;
                  }
                  else {
                    local_50 = pbVar31 + uVar42;
                    pbVar19 = pbVar31;
                    pbVar38 = pbVar7;
                    if ((uVar42 - 4 < 0x1c) ||
                       (local_58 + ((uVar18 + 3 & 0x7ffffffc) - (int)pbVar7) < (byte *)0x10)) {
LAB_00029cd0:
                      do {
                        pbVar30 = pbVar19 + 4;
                        *(undefined4 *)pbVar19 = *(undefined4 *)pbVar38;
                        pbVar19 = pbVar30;
                        pbVar38 = pbVar38 + 4;
                      } while (pbVar30 != local_50);
                      goto LAB_00029ce0;
                    }
                    uVar25 = (uVar42 - 4 >> 2) + 1;
                    uVar40 = uVar25 & 0xfffffffc;
                    uVar18 = uVar40;
                    do {
                      uVar50 = *(undefined8 *)pbVar38;
                      uVar47 = *(undefined8 *)(pbVar38 + 8);
                      pbVar38 = pbVar38 + 0x10;
                      uVar18 = uVar18 - 4;
                      *(undefined8 *)pbVar19 = uVar50;
                      *(undefined8 *)(pbVar19 + 8) = uVar47;
                      pbVar19 = pbVar19 + 0x10;
                    } while (uVar18 != 0);
                    if (uVar25 != uVar40) {
                      pbVar19 = pbVar31 + uVar40 * 4;
                      pbVar38 = pbVar7 + uVar40 * 4;
                      goto LAB_00029cd0;
                    }
                  }
                  FUN_00023f68(pbVar22,iVar32);
                  pbVar7 = pbVar31;
                }
LAB_00029d0c:
                *(undefined4 *)(pbVar7 + -4) = uVar29;
                FUN_00026b18(&local_58,*(undefined4 *)(pbStack_54 + -4));
              }
              else {
                *(undefined4 *)pbVar19 = uVar29;
                local_50 = local_50 + 4;
              }
            }
            else {
              uVar18 = (int)local_4c - (int)local_58 >> 1;
              if (local_4c == local_58) {
                uVar18 = 1;
              }
              local_b0 = local_58;
              local_b4 = local_4c;
              if (0x3fffffff < uVar18) {
LAB_0002c6d8:
                    /* WARNING: Subroutine does not return */
                FUN_00026984();
              }
              pbVar31 = (byte *)FUN_000a0370(uVar18 << 2);
              pbVar38 = pbVar31 + uVar18 * 4;
              pbVar22 = pbVar31 + uVar42;
              uVar29 = FUN_000a0370(0x1000);
              if (uVar42 == uVar18 * 4) {
                if (pbVar31 < pbVar22) {
                  iVar32 = ((int)uVar42 >> 2) + 1;
                  pbVar22 = pbVar22 + -((iVar32 - (iVar32 >> 0x1f)) * 2 & 0xfffffffdU);
                }
                else {
                  uVar18 = (int)uVar42 >> 1;
                  if (pbVar19 == pbVar7) {
                    uVar18 = 1;
                  }
                  if (0x3fffffff < uVar18) goto LAB_0002c6d8;
                  pbVar30 = (byte *)FUN_000a0370(uVar18 << 2);
                  FUN_00023f68(pbVar31,uVar42);
                  pbVar22 = pbVar30 + (uVar18 & 0xfffffffc);
                  pbVar38 = pbVar30 + uVar18 * 4;
                  pbVar31 = pbVar30;
                }
              }
              pbVar30 = pbVar22 + 4;
              *(undefined4 *)pbVar22 = uVar29;
              if (pbVar19 != pbVar7) {
                do {
                  pbVar7 = pbVar22;
                  if (pbVar22 == pbVar31) {
                    if (pbVar30 < pbVar38) {
                      iVar10 = (int)pbVar30 - (int)pbVar22;
                      iVar32 = ((int)pbVar38 - (int)pbVar30 >> 2) + 1;
                      pbVar30 = pbVar30 + ((iVar32 - (iVar32 >> 0x1f)) * 2 & 0xfffffffd);
                      pbVar7 = pbVar30 + -iVar10;
                      if (iVar10 != 0) {
                        __aeabi_memmove4(pbVar7,pbVar22);
                      }
                    }
                    else {
                      iVar32 = (int)pbVar38 - (int)pbVar22;
                      uVar18 = iVar32 >> 1;
                      if (iVar32 == 0) {
                        uVar18 = 1;
                      }
                      if (0x3fffffff < uVar18) goto LAB_0002c6d8;
                      pbVar11 = (byte *)FUN_000a0370(uVar18 << 2);
                      pbVar7 = pbVar11 + (uVar18 + 3 & 0xfffffffc);
                      pbVar38 = pbVar7;
                      if (pbVar30 != pbVar22) {
                        pbVar38 = pbVar7 + ((int)pbVar30 - (int)pbVar22);
                        uVar40 = ((int)pbVar30 - (int)pbVar22) - 4;
                        pbVar30 = pbVar7;
                        if ((0xb < uVar40) &&
                           ((byte *)0xf < pbVar11 + ((uVar18 + 3 & 0x7ffffffc) - (int)pbVar22))) {
                          uVar42 = (uVar40 >> 2) + 1;
                          uVar25 = uVar42 & 0xfffffffc;
                          pbVar30 = pbVar22;
                          uVar40 = uVar25;
                          pbVar12 = pbVar7;
                          do {
                            uVar50 = *(undefined8 *)pbVar30;
                            uVar47 = *(undefined8 *)(pbVar30 + 8);
                            pbVar30 = pbVar30 + 0x10;
                            uVar40 = uVar40 - 4;
                            *(undefined8 *)pbVar12 = uVar50;
                            *(undefined8 *)(pbVar12 + 8) = uVar47;
                            pbVar12 = pbVar12 + 0x10;
                          } while (uVar40 != 0);
                          if (uVar42 == uVar25) goto LAB_00029a58;
                          pbVar22 = pbVar22 + uVar25 * 4;
                          pbVar30 = pbVar7 + uVar25 * 4;
                        }
                        do {
                          pbVar12 = pbVar30 + 4;
                          *(undefined4 *)pbVar30 = *(undefined4 *)pbVar22;
                          pbVar30 = pbVar12;
                          pbVar22 = pbVar22 + 4;
                        } while (pbVar12 != pbVar38);
                      }
LAB_00029a58:
                      pbVar30 = pbVar38;
                      pbVar38 = pbVar11 + uVar18 * 4;
                      FUN_00023f68(pbVar31,iVar32);
                      pbVar31 = pbVar11;
                    }
                  }
                  pbVar19 = pbVar19 + -4;
                  pbVar22 = pbVar7 + -4;
                  *(undefined4 *)pbVar22 = *(undefined4 *)pbVar19;
                } while (pbVar19 != pbStack_54);
                local_b0 = local_58;
                local_b4 = local_4c;
              }
              local_58 = pbVar31;
              pbStack_54 = pbVar22;
              local_50 = pbVar30;
              local_4c = pbVar38;
              if (local_b0 != (byte *)0x0) {
                FUN_00023f68(local_b0,(int)local_b4 - (int)local_b0);
              }
            }
          }
          else {
            local_48 = uVar25 - 0x1000;
            pbStack_54 = pbVar7 + 4;
            FUN_00026b18(&local_58,*(undefined4 *)pbVar7);
          }
          uVar40 = local_48 + local_44;
          pbVar7 = pbStack_54;
          uVar50 = local_60;
        }
        local_60._4_4_ = (uint)((ulonglong)uVar50 >> 0x20);
        local_60._0_4_ = (byte *)uVar50;
        uVar18 = uVar40 & 0xfff;
        local_44 = local_44 + 1;
        *(char *)(*(int *)(pbVar7 + (uVar40 >> 0xc) * 4) + uVar18) = cVar1;
        if (local_44 == uVar33) {
          uVar18 = (uint)(byte *)local_60 ^ uVar23;
          local_60._0_4_ = (byte *)(local_60._4_4_ ^ uVar28);
        }
        if (local_44 == uVar33 && (uVar18 == 0 && (byte *)local_60 == (byte *)0x0)) {
          uVar18 = (iVar17 - uVar33) + 1;
          if (sVar8 < uVar18) goto LAB_0002c6cc;
          uVar25 = 0xcbf29ce4;
          uVar40 = sVar8 - uVar18;
          if (uVar33 <= sVar8 - uVar18) {
            uVar40 = uVar33;
          }
          uVar42 = 0x84222325;
          if (uVar40 != 0) {
            uVar42 = 0x84222325;
            pcVar35 = pcVar26 + uVar18;
            do {
              uVar48 = (ulonglong)uVar42;
              uVar34 = uVar34 - 1;
              iVar32 = uVar42 * 0x100;
              uVar42 = (uint)(uVar48 * 0x1b3) ^ (int)*pcVar35;
              uVar25 = uVar25 * 0x1b3 + iVar32 + (int)(uVar48 * 0x1b3 >> 0x20) ^
                       (int)*pcVar35 >> 0x1f;
              pcVar35 = pcVar35 + 1;
            } while (uVar34 != 0);
          }
          if (uVar42 == uVar24 && uVar25 == uVar21) {
            iVar17 = 1;
            goto LAB_0002c504;
          }
        }
        iVar17 = iVar17 + 1;
        pcVar37 = pcVar37 + 1;
      } while (pcVar37 != pcVar26 + sVar8);
      iVar17 = 0;
LAB_0002c504:
      local_60 = uVar50;
      if (local_3c != (int *)0x0) goto LAB_0002c510;
    }
    pbVar22 = local_50;
    pbVar7 = pbStack_54;
    for (uVar28 = (int)local_50 - (int)pbStack_54; 8 < uVar28; uVar28 = uVar28 - 4) {
      FUN_00023f68(*(undefined4 *)pbVar7,0x1000);
      pbVar7 = pbVar7 + 4;
    }
    for (; pbVar7 != pbVar22; pbVar7 = pbVar7 + 4) {
      FUN_00023f68(*(undefined4 *)pbVar7,0x1000);
    }
    if (local_58 != (byte *)0x0) {
      FUN_00023f68(local_58,(int)local_4c - (int)local_58);
    }
    *(int *)(*(int *)param_4 + param_3[4]) = iVar17;
    uVar50 = local_60;
  }
  goto LAB_0002c680;
code_r0x0002b738:
  uVar28 = 1;
  uVar21 = *(uint *)(*(int *)param_4 + *param_3);
  local_8c = uVar21 + local_88;
  local_90 = ((uint *)(*(int *)param_4 + *param_3))[1] + ((int)local_88 >> 0x1f) +
             (uint)CARRY4(uVar21,local_88);
  uVar21 = 0xd3515b13;
  goto LAB_0002b458;
  while( true ) {
    if (bVar46) {
      bVar46 = true;
    }
    else {
      uVar50 = FUN_00026020(bVar45 + uVar23,CARRY4((uint)bVar45,uVar23) + 0x80000000,10,0);
      iVar32 = (int)((ulonglong)uVar50 >> 0x20);
      bVar46 = local_a0 < (uint)uVar50;
      uVar33 = (uint)((ulonglong)local_a0 * 10);
      bVar46 = (int)(local_a4 - (iVar32 + (uint)bVar46)) < 0 !=
               (SBORROW4(local_a4,iVar32) != SBORROW4(local_a4 - iVar32,(uint)bVar46));
      if (!bVar46) {
        local_a4 = ((int)((ulonglong)local_a0 * 10 >> 0x20) + local_a4 * 10) -
                   (uint)(uVar33 < uVar23);
        local_a0 = uVar33 - uVar23;
      }
    }
    uVar23 = uVar24 + 1;
    uVar24 = uVar21;
    if (uVar21 == uVar23) break;
LAB_0002bde8:
    uVar24 = uVar23;
    uVar23 = pbVar7[uVar24] - 0x30;
    if (9 < uVar23) break;
  }
LAB_0002beb0:
  uVar33 = 0;
  uVar23 = 0x80000000;
  bVar6 = uVar24 == uVar28;
  uVar21 = uVar24;
  if (bVar45) {
LAB_0002bb20:
    bVar45 = local_a0 != 0;
    local_a0 = -local_a0;
    uVar23 = 0x7fffffff;
    local_a4 = -(local_a4 + bVar45);
    uVar33 = 0xffffffff;
    uVar24 = uVar21;
  }
  uVar28 = 1;
  if (!bVar46) {
    uVar33 = local_a0;
    uVar23 = local_a4;
  }
  unaff_r9 = 0;
  uVar21 = 0x7946bc42;
  local_a4 = uVar23;
  local_a0 = uVar33;
  if ((!bVar6) && (uVar21 = 0x7946bc42, uVar24 != 0)) {
    uVar21 = 0x2322e1d0;
    if (uVar24 + local_94 < unaff_r6) {
      uVar21 = 0x2322e1d0;
      if ((4 < local_70[uVar24 + local_94] - 9) && (local_70[uVar24 + local_94] != 0x20)) {
        uVar21 = 0x7946bc42;
      }
    }
  }
  goto LAB_0002b458;
  while (pbVar19 = pbVar19 + 1, pbVar22 = pbVar7, pbVar31 = pbVar7, pbVar19 != pbVar7) {
LAB_0002bc00:
    pbVar22 = pbVar19;
    pbVar31 = pbVar19;
    if ((*pbVar19 == 0x20) || (0xfffffffa < *pbVar19 - 0xe)) break;
  }
  for (; (pbVar31 != pbVar7 &&
         ((*pbVar31 == 0x20 || (pbVar22 = pbVar31, 0xfffffffa < *pbVar31 - 0xe))));
      pbVar31 = pbVar31 + 1) {
    pbVar22 = pbVar7;
  }
  if (pbVar22 != pbVar7) {
    do {
      pbVar19 = pbVar22;
      pbVar31 = pbVar22;
      if ((*pbVar22 == 0x20) || (0xfffffffa < *pbVar22 - 0xe)) break;
      pbVar22 = pbVar22 + 1;
      pbVar19 = pbVar7;
      pbVar31 = pbVar7;
    } while (pbVar22 != pbVar7);
    for (; (pbVar31 != pbVar7 &&
           ((*pbVar31 == 0x20 || (pbVar19 = pbVar31, 0xfffffffa < *pbVar31 - 0xe))));
        pbVar31 = pbVar31 + 1) {
      pbVar19 = pbVar7;
    }
    if (pbVar19 != pbVar7) {
      do {
        pbVar22 = pbVar19;
        pbVar31 = pbVar19;
        if ((*pbVar19 == 0x20) || (0xfffffffa < *pbVar19 - 0xe)) break;
        pbVar19 = pbVar19 + 1;
        pbVar22 = pbVar7;
        pbVar31 = pbVar7;
      } while (pbVar19 != pbVar7);
      for (; (pbVar31 != pbVar7 &&
             ((*pbVar31 == 0x20 || (pbVar22 = pbVar31, 0xfffffffa < *pbVar31 - 0xe))));
          pbVar31 = pbVar31 + 1) {
        pbVar22 = pbVar7;
      }
      if (pbVar22 != pbVar7) {
        local_94 = (int)pbVar22 - (int)local_70;
        do {
          pbVar19 = pbVar22;
          if ((*pbVar22 == 0x20) || (0xfffffffa < *pbVar22 - 0xe)) break;
          pbVar22 = pbVar22 + 1;
          pbVar19 = pbVar7;
        } while (pbVar22 != pbVar7);
        for (; (pbVar22 = pbVar7, pbVar19 != pbVar7 &&
               ((*pbVar19 == 0x20 || (pbVar22 = pbVar19, 0xfffffffa < *pbVar19 - 0xe))));
            pbVar19 = pbVar19 + 1) {
        }
        uVar28 = 1;
        local_88 = (int)pbVar22 - (int)local_70;
        local_98 = iVar32;
      }
    }
  }
LAB_0002ba84:
  if (unaff_r6 != 0) {
    unaff_r8 = 0;
    do {
      if (local_70[unaff_r8] == 0x20) {
        if (unaff_r8 != 0xffffffff) {
          iVar32 = 0x7e93ade5;
          goto LAB_0002bad4;
        }
        break;
      }
      unaff_r8 = unaff_r8 + 1;
    } while (uVar23 != unaff_r8);
  }
  unaff_r8 = 0xffffffff;
  iVar32 = -0x6f8fa1f9;
LAB_0002bad4:
  local_a0 = 0;
  unaff_r10 = 0;
  local_a4 = 0;
  local_84 = 0;
  local_80 = 0;
  uVar49 = 0;
  uVar51 = 0;
  local_9c = 0;
  local_7c = 0;
  uVar21 = uVar21 + iVar32;
  goto LAB_0002b458;
  while( true ) {
    pbVar7 = pbVar7 + 1;
    unaff_r4 = unaff_r4 - 1;
    if (unaff_r4 == 0) break;
LAB_0002c054:
    if (*(byte *)((param_2 + uVar28) - unaff_r4) != *pbVar7) goto LAB_00029330;
  }
LAB_0002c070:
  uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
  *(undefined4 *)(*(int *)param_4 + param_3[2]) = uVar29;
  goto joined_r0x0002c084;
code_r0x0002b31c:
  if (iVar32 == 0x19b322c1) {
LAB_0002bed0:
    uVar50 = local_60;
    if (piVar41 == (int *)0x0) goto LAB_0002c680;
    if (**(int **)(DAT_0002c734 + 0x2bee8) != local_28) goto LAB_0002c6a0;
    iVar32 = local_7c - (int)piVar41;
    goto LAB_000a0320;
  }
  iVar17 = *(int *)param_4;
  pbVar7 = *(byte **)(iVar17 + *param_3);
  unaff_r6 = *(uint *)(iVar17 + param_3[3]);
  iVar10 = *(int *)(iVar17 + param_3[1]);
  unaff_r8 = ((uint *)(iVar17 + param_3[3]))[1];
  if (unaff_r6 == 0) {
    local_7c = 0;
    piVar41 = (int *)0x0;
  }
  else {
    if ((int)unaff_r6 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0002d020();
    }
    iVar44 = param_3[2];
    piVar41 = (int *)FUN_000a0370(unaff_r6);
    __aeabi_memclr(piVar41,unaff_r6);
    FUN_00073260(iVar17,iVar17 + iVar44,piVar41,unaff_r6);
    local_7c = (int)piVar41 + unaff_r6;
  }
  local_70 = pbVar7 + iVar10;
  iVar32 = iVar32 + 0x4a289072;
  goto LAB_0002b2bc;
code_r0x0002b278:
  param_2 = (uint)*(byte *)(*(int *)param_4 + param_3[1]);
  param_1 = *(byte **)(*(int *)param_4 + *param_3);
  iVar17 = 0x2186109a;
  if (param_1 == (byte *)0x0) {
    iVar17 = 0x2ee92b0f;
  }
  iVar32 = iVar32 + iVar17;
  uVar50 = local_60;
  if (iVar32 == 0x5d5290a0) goto LAB_0002c680;
  goto LAB_0002b268;
  while( true ) {
    pbVar22 = pbVar22 + 1;
    pbVar7 = pbVar7 + 1;
    unaff_r4 = unaff_r4 - 1;
    if (unaff_r4 == 0) break;
LAB_0002bff0:
    if (*pbVar7 != *pbVar22) {
      uVar29 = 0;
      break;
    }
  }
LAB_0002c018:
  uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
  *(undefined4 *)(*(int *)param_4 + param_3[2]) = uVar29;
joined_r0x0002c084:
  if (uVar23 != 0) {
LAB_0002c120:
    FUN_00023f68(local_58,(uint)(byte *)local_60 & 0xfffffffe);
    uVar50 = CONCAT44(local_60._4_4_,(byte *)local_60);
  }
LAB_0002c680:
  local_60 = uVar50;
  if (**(int **)(DAT_0002c744 + 0x2c690) == local_28) {
    return;
  }
LAB_0002c6a0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #553
// Name: FUN_0002c748
// Address: 0002c748
// JNI: NO
// ============================================================


void FUN_0002c748(void)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined4 *puVar5;
  undefined4 *puVar6;
  uint uVar7;
  int iVar8;
  undefined1 *puVar9;
  undefined4 *puVar10;
  undefined4 uVar11;
  undefined4 local_30;
  undefined4 *local_2c;
  uint local_28;
  int local_24;
  
  local_24 = **(int **)(DAT_0002caac + 0x2c75c);
  puVar5 = (undefined4 *)FUN_000a0370(0x14);
  *puVar5 = 0;
  puVar5[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  puVar5[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  puVar5[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  puVar5[4] = 0x3f800000;
  dlerror();
  puVar6 = (undefined4 *)FUN_000a0398(8);
  uVar11 = 0;
  *puVar6 = 0;
  *(undefined1 *)puVar6 = 0x6c;
  *(undefined1 *)((int)puVar6 + 1) = 0x69;
  *(undefined1 *)((int)puVar6 + 2) = 0x62;
  puVar6[1] = 0;
  *(undefined1 *)((int)puVar6 + 3) = 99;
  *(undefined1 *)(puVar6 + 1) = 0x2e;
  *(undefined1 *)((int)puVar6 + 5) = 0x73;
  *(undefined1 *)((int)puVar6 + 6) = 0x6f;
  *(undefined1 *)((int)puVar6 + 7) = 0;
  local_2c = *(undefined4 **)((int)puVar6 + 3);
  local_30 = CONCAT13(*(undefined1 *)((int)puVar6 + 2),
                      CONCAT12(*(undefined1 *)((int)puVar6 + 1),CONCAT11(*(undefined1 *)puVar6,0xe))
                     );
  local_28 = local_28 & 0xffffff00;
  FUN_00023f74();
  uVar7 = local_28;
  if ((local_30 & 1) == 0) {
    uVar7 = (uint)&local_30 | 1;
  }
  iVar8 = dlopen(uVar7,1);
  if ((local_30 & 1) != 0) {
    FUN_00023f68(local_28,local_30 & 0xfffffffe);
  }
  if (iVar8 != 0) {
    puVar6 = (undefined4 *)FUN_000a0398(0x20);
    *puVar6 = 0;
    puVar6[1] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar6[2] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar6[3] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    puVar10 = puVar6 + 4;
    *(undefined1 *)puVar6 = 0x5f;
    *(undefined1 *)((int)puVar6 + 1) = 0x5f;
    *(undefined1 *)((int)puVar6 + 2) = 0x73;
    *(undefined1 *)((int)puVar6 + 3) = 0x79;
    *(undefined1 *)(puVar6 + 1) = 0x73;
    *(undefined1 *)((int)puVar6 + 5) = 0x74;
    *(undefined1 *)((int)puVar6 + 6) = 0x65;
    *(undefined1 *)((int)puVar6 + 7) = 0x6d;
    *(undefined1 *)(puVar6 + 2) = 0x5f;
    *(undefined1 *)((int)puVar6 + 9) = 0x70;
    *(undefined1 *)((int)puVar6 + 10) = 0x72;
    *(undefined1 *)((int)puVar6 + 0xb) = 0x6f;
    *(undefined1 *)(puVar6 + 3) = 0x70;
    *(undefined1 *)((int)puVar6 + 0xd) = 0x65;
    *(undefined1 *)((int)puVar6 + 0xe) = 0x72;
    *(undefined1 *)((int)puVar6 + 0xf) = 0x74;
    *puVar10 = 0;
    puVar6[5] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    puVar6[6] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    puVar6[7] = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    *(undefined1 *)puVar10 = 0x79;
    *(undefined1 *)((int)puVar6 + 0x11) = 0x5f;
    *(undefined1 *)((int)puVar6 + 0x12) = 0x72;
    *(undefined1 *)((int)puVar6 + 0x13) = 0x65;
    *(undefined1 *)(puVar6 + 5) = 0x61;
    *(undefined1 *)((int)puVar6 + 0x15) = 100;
    *(undefined1 *)((int)puVar6 + 0x16) = 0x5f;
    *(undefined1 *)((int)puVar6 + 0x17) = 99;
    *(undefined1 *)(puVar6 + 6) = 0x61;
    *(undefined1 *)((int)puVar6 + 0x19) = 0x6c;
    *(undefined1 *)((int)puVar6 + 0x1a) = 0x6c;
    *(undefined1 *)((int)puVar6 + 0x1b) = 0x62;
    *(undefined1 *)(puVar6 + 7) = 0x61;
    *(undefined1 *)((int)puVar6 + 0x1d) = 99;
    *(undefined1 *)((int)puVar6 + 0x1e) = 0x6b;
    *(undefined1 *)((int)puVar6 + 0x1f) = 0;
    puVar9 = (undefined1 *)FUN_000a0370(0x20);
    uVar1 = *(undefined1 *)((int)puVar6 + 1);
    *puVar9 = *(undefined1 *)puVar6;
    uVar2 = *(undefined1 *)((int)puVar6 + 2);
    puVar9[1] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 3);
    puVar9[2] = uVar2;
    uVar2 = *(undefined1 *)(puVar6 + 1);
    puVar9[3] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 5);
    puVar9[4] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 6);
    puVar9[5] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 7);
    puVar9[6] = uVar2;
    uVar2 = *(undefined1 *)(puVar6 + 2);
    puVar9[7] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 9);
    puVar9[8] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 10);
    puVar9[9] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0xb);
    puVar9[10] = uVar2;
    uVar2 = *(undefined1 *)(puVar6 + 3);
    puVar9[0xb] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0xd);
    puVar9[0xc] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0xe);
    puVar9[0xd] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0xf);
    uVar3 = *(undefined1 *)puVar10;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x11);
    puVar9[0xe] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0x12);
    puVar9[0xf] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0x13);
    puVar9[0x10] = uVar3;
    uVar3 = *(undefined1 *)(puVar6 + 5);
    puVar9[0x11] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x15);
    puVar9[0x12] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0x16);
    puVar9[0x13] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0x17);
    puVar9[0x14] = uVar3;
    uVar3 = *(undefined1 *)(puVar6 + 6);
    puVar9[0x15] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x19);
    puVar9[0x16] = uVar2;
    uVar2 = *(undefined1 *)((int)puVar6 + 0x1a);
    puVar9[0x17] = uVar1;
    uVar1 = *(undefined1 *)((int)puVar6 + 0x1b);
    puVar9[0x18] = uVar3;
    uVar3 = *(undefined1 *)(puVar6 + 7);
    puVar9[0x19] = uVar4;
    uVar4 = *(undefined1 *)((int)puVar6 + 0x1d);
    puVar9[0x1a] = uVar2;
    puVar9[0x1e] = *(undefined1 *)((int)puVar6 + 0x1e);
    puVar9[0x1b] = uVar1;
    puVar9[0x1c] = uVar3;
    puVar9[0x1d] = uVar4;
    puVar9[0x1f] = 0;
    FUN_00023f74(puVar6);
    uVar11 = dlsym(iVar8,puVar9);
    FUN_00023f68(puVar9,0x20);
  }
  local_30 = uVar11;
  local_2c = puVar5;
  __system_property_foreach(DAT_0002cab0 + 0x2ca84,&local_30);
  if (**(int **)(DAT_0002cab4 + 0x2ca94) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_24);
  }
  return;
}




// ============================================================
// Function #554
// Name: FUN_0002cab8
// Address: 0002cab8
// JNI: NO
// ============================================================


void FUN_0002cab8(byte *param_1)

{
  byte bVar1;
  int iVar2;
  DIR *__dirp;
  short *psVar3;
  dirent *pdVar4;
  size_t sVar5;
  short *psVar6;
  int iVar7;
  uint uVar8;
  uint *puVar9;
  byte *pbVar10;
  byte *pbVar11;
  uint uVar12;
  uint uVar13;
  int iVar14;
  uint *puVar15;
  uint *puVar16;
  int iVar17;
  uint uVar18;
  uint *puVar19;
  uint *local_b4;
  uint local_b0;
  uint local_ac;
  uint local_a8;
  uint local_a0;
  uint uStack_9c;
  short *local_98;
  stat local_90;
  __uid_t _Stack_38;
  __ino_t _Stack_34;
  undefined4 local_30;
  undefined4 local_2c;
  int local_28;
  
  local_90.st_dev._4_4_ = *(__nlink_t *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  local_90._8_4_ = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  local_90.st_ino = *(__ino_t *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  pbVar11 = param_1 + 1;
  local_28 = **(int **)(DAT_0002d018 + 0x2cad8);
  local_90.st_dev._0_4_ = 0;
  local_90.st_mode = 0;
  local_90.st_rdev._0_4_ = 0;
  local_90.st_blksize = 0;
  local_90.st_mtim.tv_sec = 0;
  local_90.__unused4 = 0;
  pbVar10 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar10 = pbVar11;
  }
  local_30 = 0;
  local_2c = 0;
  local_90.st_nlink = local_90.st_dev._4_4_;
  local_90.st_uid = local_90._8_4_;
  local_90.st_gid = local_90.st_ino;
  local_90.st_rdev._4_4_ = local_90.st_dev._4_4_;
  local_90._40_4_ = local_90._8_4_;
  local_90.st_size = local_90.st_ino;
  local_90.st_blocks = local_90.st_dev._4_4_;
  local_90.st_atim.tv_sec = local_90._8_4_;
  local_90.st_atim.tv_nsec = local_90.st_ino;
  local_90.st_mtim.tv_nsec = local_90.st_dev._4_4_;
  local_90.st_ctim.tv_sec = local_90._8_4_;
  local_90.st_ctim.tv_nsec = local_90.st_ino;
  local_90.__unused5 = local_90.st_dev._4_4_;
  _Stack_38 = local_90._8_4_;
  _Stack_34 = local_90.st_ino;
  iVar2 = stat((char *)pbVar10,&local_90);
  if (iVar2 != 0) goto LAB_0002cfe4;
  if ((local_90.st_mode & 0x4000) == 0) goto LAB_0002cfc4;
  pbVar10 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar10 = pbVar11;
  }
  __dirp = opendir((char *)pbVar10);
  if (__dirp == (DIR *)0x0) goto LAB_0002cfe4;
  puVar19 = (uint *)0x0;
  psVar3 = (short *)((uint)&local_a0 | 1);
  local_b4 = (uint *)0x0;
  puVar15 = (uint *)0x0;
  while (pdVar4 = readdir(__dirp), pdVar4 != (dirent *)0x0) {
    sVar5 = strlen(pdVar4->d_name + 8);
    if (0xfffffff7 < sVar5) goto LAB_0002d00c;
    if (sVar5 < 0xb) {
      local_a0 = CONCAT31(local_a0._1_3_,(char)(sVar5 << 1));
      psVar6 = psVar3;
      if (sVar5 != 0) goto LAB_0002cbe4;
    }
    else {
      psVar6 = (short *)FUN_000a0370((sVar5 | 7) + 1);
      local_a0 = (sVar5 | 7) + 2;
      uStack_9c = sVar5;
      local_98 = psVar6;
LAB_0002cbe4:
      __aeabi_memmove(psVar6,pdVar4->d_name + 8,sVar5);
    }
    uVar8 = uStack_9c;
    uVar18 = local_a0;
    *(char *)((int)psVar6 + sVar5) = '\0';
    uVar13 = local_a0 & 1;
    uVar12 = uStack_9c;
    if ((local_a0 & 1) == 0) {
      uVar12 = local_a0 >> 1 & 0x7f;
    }
    puVar16 = puVar15;
    if (uVar12 == 2) {
      psVar6 = local_98;
      if ((local_a0 & 1) == 0) {
        psVar6 = psVar3;
      }
      if (*psVar6 != 0x2e2e) goto LAB_0002cc64;
    }
    else {
      if (uVar12 == 1) {
        psVar6 = local_98;
        if ((local_a0 & 1) == 0) {
          psVar6 = psVar3;
        }
        if ((char)*psVar6 == '.') goto LAB_0002cdb0;
      }
LAB_0002cc64:
      if (puVar19 < local_b4) {
        if ((local_a0 & 1) == 0) {
          puVar19[2] = (uint)local_98;
          *puVar19 = local_a0;
          puVar19[1] = uStack_9c;
          puVar19 = puVar19 + 3;
        }
        else {
          FUN_000289d4(puVar19,local_98,uStack_9c);
          puVar19 = puVar19 + 3;
        }
      }
      else {
        iVar14 = (int)puVar19 - (int)puVar15;
        iVar2 = iVar14 >> 2;
        uVar12 = iVar2 * -0x55555555 + 1;
        if (0x15555555 < uVar12) {
          FUN_0002d47c();
LAB_0002d014:
                    /* WARNING: Subroutine does not return */
          FUN_00026984();
        }
        iVar17 = (int)local_b4 - (int)puVar15;
        iVar7 = iVar17 >> 2;
        if (uVar12 < (uint)(iVar7 * 0x55555556)) {
          uVar12 = iVar7 * 0x55555556;
        }
        if (0xaaaaaa9 < (uint)(iVar7 * -0x55555555)) {
          uVar12 = 0x15555555;
        }
        if (uVar12 == 0) {
          iVar7 = 0;
          puVar19 = (uint *)(iVar2 * 4);
          if ((local_a0 & 1) == 0) goto LAB_0002cd1c;
LAB_0002cd60:
          FUN_000289d4(puVar19,local_98,uVar8);
        }
        else {
          if (0x15555555 < uVar12) goto LAB_0002d014;
          iVar7 = FUN_000a0370(uVar12 * 0xc);
          puVar19 = (uint *)(iVar7 + iVar2 * 4);
          if (uVar13 != 0) goto LAB_0002cd60;
LAB_0002cd1c:
          puVar19[2] = (uint)local_98;
          *puVar19 = local_a0;
          puVar19[1] = uStack_9c;
        }
        local_b4 = (uint *)(iVar7 + uVar12 * 0xc);
        puVar16 = (uint *)((int)puVar19 - iVar14);
        __aeabi_memcpy(puVar16,puVar15,iVar14);
        puVar19 = puVar19 + 3;
        if (puVar15 != (uint *)0x0) {
          FUN_00023f68(puVar15,iVar17);
        }
      }
    }
LAB_0002cdb0:
    puVar15 = puVar16;
    if ((uVar18 & 1) != 0) {
      FUN_00023f68(local_98,local_a0 & 0xfffffffe);
    }
  }
  closedir(__dirp);
  if (puVar15 == puVar19) {
    if (puVar19 != (uint *)0x0) goto LAB_0002cfac;
  }
  else {
    uVar12 = (uint)&local_b0 | 1;
    puVar16 = puVar15;
    do {
      bVar1 = *param_1;
      uVar13 = *(uint *)(param_1 + 4);
      if ((bVar1 & 1) == 0) {
        uVar13 = (uint)(bVar1 >> 1);
      }
      uVar18 = uVar13 + 1;
      if (0xfffffff7 < uVar18) {
LAB_0002d00c:
                    /* WARNING: Subroutine does not return */
        FUN_00026b08();
      }
      if (uVar18 < 0xb) {
        local_ac = 0;
        local_a8 = 0;
        local_b0 = (uint)(byte)((char)uVar18 * '\x02');
        uVar8 = uVar12;
        if (uVar13 != 0) goto LAB_0002ce90;
      }
      else {
        uVar8 = FUN_000a0370((uVar18 | 7) + 1);
        local_b0 = (uVar18 | 7) + 2;
        local_ac = uVar18;
        local_a8 = uVar8;
LAB_0002ce90:
        pbVar10 = *(byte **)(param_1 + 8);
        if ((bVar1 & 1) == 0) {
          pbVar10 = pbVar11;
        }
        __aeabi_memmove(uVar8,pbVar10,uVar13);
      }
      *(undefined2 *)(uVar8 + uVar13) = 0x2f;
      uVar13 = puVar16[1];
      pbVar10 = (byte *)puVar16[2];
      if (((byte)*puVar16 & 1) == 0) {
        uVar13 = (uint)(byte)((byte)*puVar16 >> 1);
        pbVar10 = (byte *)((int)puVar16 + 1);
      }
      puVar9 = (uint *)FUN_0001a178(&local_b0,pbVar10,uVar13);
      local_a0 = *puVar9;
      uStack_9c = puVar9[1];
      local_98 = (short *)puVar9[2];
      *puVar9 = 0;
      puVar9[1] = 0;
      puVar9[2] = 0;
      FUN_0002cab8(&local_a0);
      if ((local_a0 & 1) != 0) {
        FUN_00023f68(local_98,local_a0 & 0xfffffffe);
      }
      if ((local_b0 & 1) != 0) {
        FUN_00023f68(local_a8,local_b0 & 0xfffffffe);
      }
      puVar16 = puVar16 + 3;
    } while (puVar16 != puVar19);
    if (puVar15 != (uint *)0x0) {
      do {
        puVar16 = puVar19 + -3;
        if ((*puVar16 & 1) != 0) {
          FUN_00023f68(puVar19[-1],puVar19[-3] & 0xfffffffe);
        }
        puVar19 = puVar16;
      } while (puVar16 != puVar15);
LAB_0002cfac:
      FUN_00023f68(puVar15,(int)local_b4 - (int)puVar15);
    }
  }
LAB_0002cfc4:
  pbVar10 = *(byte **)(param_1 + 8);
  if ((*param_1 & 1) == 0) {
    pbVar10 = pbVar11;
  }
  remove((char *)pbVar10);
LAB_0002cfe4:
  if (**(int **)(DAT_0002d01c + 0x2cff4) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(local_28);
}




// ============================================================
// Function #555
// Name: FUN_0002d020
// Address: 0002d020
// JNI: NO
// ============================================================


void FUN_0002d020(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0002d02c + DAT_0002d02c);
}




// ============================================================
// Function #556
// Name: FUN_0002d030
// Address: 0002d030
// JNI: NO
// ============================================================


void FUN_0002d030(undefined4 *param_1,int param_2,uint param_3,int param_4)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  
  uVar3 = param_3;
  if (param_3 != 0) {
    do {
      uVar2 = uVar3;
      if (uVar2 == 0) goto LAB_0002d110;
      uVar3 = uVar2 - 1;
    } while (*(char *)(param_2 + uVar2 + -1) != '/');
    if (uVar3 != 0xffffffff) {
      if (param_4 == 1) goto LAB_0002d074;
      if (uVar3 != 0) {
        if (param_3 <= uVar2 - 2) {
          uVar3 = param_3;
        }
        do {
          uVar2 = uVar3;
          if (uVar2 == 0) goto LAB_0002d110;
          uVar4 = uVar2 - 1;
          uVar3 = uVar4;
        } while (*(char *)(param_2 + uVar2 + -1) != '/');
        if (uVar4 != 0xffffffff) {
          if (param_4 == 2) {
LAB_0002d074:
            *param_1 = 0;
            param_1[1] = uVar3;
            *(undefined1 *)(param_1 + 2) = 1;
            return;
          }
          if (uVar4 != 0) {
            uVar3 = param_3;
            if (uVar2 - 2 < param_3) {
              uVar3 = uVar4;
            }
            do {
              if (uVar3 == 0) goto LAB_0002d110;
              iVar1 = param_2 + uVar3;
              uVar3 = uVar3 - 1;
            } while (*(char *)(iVar1 + -1) != '/');
            if (uVar3 != 0xffffffff) goto LAB_0002d074;
          }
        }
      }
    }
  }
LAB_0002d110:
  *(undefined1 *)(param_1 + 1) = 0;
  *param_1 = 2;
  *(undefined1 *)(param_1 + 2) = 0;
  return;
}




// ============================================================
// Function #557
// Name: FUN_0002d128
// Address: 0002d128
// JNI: NO
// ============================================================


int * FUN_0002d128(undefined4 *param_1,int *param_2)

{
  undefined1 auVar1 [16];
  int *piVar2;
  int iVar3;
  int *piVar4;
  int iVar5;
  int *piVar6;
  int *piVar7;
  uint uVar8;
  int *piVar9;
  int *piVar10;
  uint uVar11;
  uint uVar12;
  int *piVar13;
  int *piVar14;
  uint uVar15;
  bool bVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  piVar13 = (int *)*param_1;
  piVar14 = (int *)param_1[1];
  iVar3 = (int)piVar14 - (int)piVar13 >> 2;
  uVar11 = iVar3 + 1;
  if (0x3fffffff < uVar11) {
    FUN_0002901c();
LAB_0002d2e8:
                    /* WARNING: Subroutine does not return */
    FUN_00026984();
  }
  uVar8 = param_1[2] - (int)piVar13 >> 1;
  if (uVar11 < uVar8) {
    uVar11 = uVar8;
  }
  if (0x7ffffffb < (uint)(param_1[2] - (int)piVar13)) {
    uVar11 = 0x3fffffff;
  }
  if (uVar11 == 0) {
    piVar2 = (int *)0x0;
  }
  else {
    if (0x3fffffff < uVar11) goto LAB_0002d2e8;
    piVar2 = (int *)FUN_000a0370(uVar11 << 2);
  }
  iVar5 = *param_2;
  *param_2 = -1;
  piVar7 = piVar2 + iVar3;
  *piVar7 = iVar5;
  if (piVar13 == piVar14) goto LAB_0002d2b8;
  uVar8 = ((int)piVar14 - (int)piVar13) - 4;
  piVar4 = piVar13;
  piVar6 = piVar2;
  if ((uVar8 < 0x2c) ||
     ((iVar3 = (uVar8 & 0xfffffffc) + 4, piVar2 < (int *)((int)piVar13 + iVar3) &&
      (piVar13 < (int *)((int)piVar2 + iVar3))))) {
LAB_0002d234:
    do {
      *piVar6 = *piVar4;
      piVar9 = piVar4 + 1;
      *piVar4 = -1;
      piVar4 = piVar9;
      piVar6 = piVar6 + 1;
    } while (piVar9 != piVar14);
  }
  else {
    uVar15 = (uVar8 >> 2) + 1;
    uVar12 = uVar15 & 0xfffffffc;
    auVar1._8_8_ = SUB158(SUB1615((undefined1  [16])0x0,1),7);
    auVar1._0_8_ = 0xffffffffffffffff;
    auVar1 = auVar1 << 0x40 | auVar1;
    piVar6 = piVar2 + uVar12;
    piVar4 = piVar13 + uVar12;
    piVar9 = piVar2;
    uVar8 = uVar12;
    piVar10 = piVar13;
    do {
      uVar17 = *(undefined8 *)piVar10;
      uVar18 = *(undefined8 *)(piVar10 + 2);
      uVar8 = uVar8 - 4;
      *piVar10 = *(int *)auVar1;
      piVar10[1] = *(int *)(auVar1 + (undefined1  [16])0x4);
      piVar10[2] = *(int *)(auVar1 + (undefined1  [16])0x8);
      piVar10[3] = *(int *)(auVar1 + (undefined1  [16])0xc);
      piVar10 = piVar10 + 4;
      *(undefined8 *)piVar9 = uVar17;
      *(undefined8 *)(piVar9 + 2) = uVar18;
      piVar9 = piVar9 + 4;
    } while (uVar8 != 0);
    if (uVar15 != uVar12) goto LAB_0002d234;
  }
  piVar4 = (int *)FUN_00025e6c(DAT_0002d2ec + 0x2d254);
  do {
    if (-1 < *piVar13) {
      do {
        uVar8 = FUN_00019718(6,*piVar13);
        if (0xfffff000 < uVar8) {
          iVar3 = -uVar8;
          bVar16 = uVar8 != 0xfffffffc;
          uVar8 = 0;
          if (bVar16) {
            uVar8 = 0xffffffff;
          }
          *piVar4 = iVar3;
        }
      } while ((0x7fffffff < uVar8) && (*piVar4 == 4));
    }
    piVar13 = piVar13 + 1;
  } while (piVar13 != piVar14);
  piVar13 = (int *)*param_1;
LAB_0002d2b8:
  iVar3 = param_1[2];
  *param_1 = piVar2;
  param_1[1] = piVar7 + 1;
  param_1[2] = piVar2 + uVar11;
  if (piVar13 != (int *)0x0) {
    FUN_00023f68(piVar13,iVar3 - (int)piVar13);
  }
  return piVar7 + 1;
}




// ============================================================
// Function #558
// Name: FUN_0002d2f0
// Address: 0002d2f0
// JNI: NO
// ============================================================


void FUN_0002d2f0(int *param_1,int *param_2,uint param_3)

{
  uint uVar1;
  int *piVar2;
  int *piVar3;
  int *piVar4;
  uint uVar5;
  int *piVar6;
  int *piVar7;
  int iVar8;
  int *piVar9;
  uint uVar10;
  
  iVar8 = param_2[1];
  piVar3 = (int *)0x0;
  piVar7 = (int *)0x0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  if ((char)iVar8 == '\x01') {
    iVar8 = *param_2;
    piVar3 = (int *)FUN_000a0370(8);
    piVar7 = piVar3 + 2;
    *piVar3 = iVar8;
    *param_1 = (int)piVar3;
    param_1[1] = (int)piVar7;
    param_1[2] = (int)piVar7;
    piVar3[1] = iVar8 >> 0x1f;
  }
  piVar9 = (int *)param_2[2];
  piVar4 = (int *)param_2[3];
  do {
    if (piVar9 == piVar4) {
      return;
    }
    while( true ) {
      uVar1 = (int)piVar7 - (int)piVar3 >> 3;
      if (param_3 <= uVar1) {
        return;
      }
      iVar8 = *piVar9;
      if (piVar7 < (int *)param_1[2]) break;
      uVar5 = uVar1 + 1;
      if (0x1fffffff < uVar5) {
        FUN_0002d46c();
LAB_0002d468:
                    /* WARNING: Subroutine does not return */
        FUN_00026984();
      }
      uVar10 = param_1[2] - (int)piVar3;
      if (uVar5 < (uint)((int)uVar10 >> 2)) {
        uVar5 = (int)uVar10 >> 2;
      }
      if (0x7ffffff7 < uVar10) {
        uVar5 = 0x1fffffff;
      }
      if (uVar5 == 0) {
        piVar2 = (int *)0x0;
      }
      else {
        if (0x1fffffff < uVar5) goto LAB_0002d468;
        piVar2 = (int *)FUN_000a0370(uVar5 << 3);
      }
      piVar6 = piVar2 + uVar1 * 2;
      *piVar6 = iVar8;
      piVar6[1] = iVar8 >> 0x1f;
      __aeabi_memcpy(piVar2,piVar3,(int)piVar7 - (int)piVar3);
      piVar7 = piVar6 + 2;
      *param_1 = (int)piVar2;
      param_1[1] = (int)piVar7;
      param_1[2] = (int)(piVar2 + uVar5 * 2);
      if (piVar3 != (int *)0x0) {
        FUN_00023f68(piVar3,uVar10);
      }
      piVar9 = piVar9 + 1;
      param_1[1] = (int)piVar7;
      piVar3 = piVar2;
      if (piVar9 == piVar4) {
        return;
      }
    }
    *piVar7 = iVar8;
    piVar7[1] = iVar8 >> 0x1f;
    piVar7 = piVar7 + 2;
    piVar9 = piVar9 + 1;
    param_1[1] = (int)piVar7;
  } while( true );
}




// ============================================================
// Function #559
// Name: FUN_0002d46c
// Address: 0002d46c
// JNI: NO
// ============================================================


void FUN_0002d46c(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0002d478 + DAT_0002d478);
}




// ============================================================
// Function #560
// Name: FUN_0002d47c
// Address: 0002d47c
// JNI: NO
// ============================================================


void FUN_0002d47c(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0002d488 + DAT_0002d488);
}




