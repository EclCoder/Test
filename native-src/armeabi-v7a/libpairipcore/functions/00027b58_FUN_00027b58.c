/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00027b58
 * Address  : 00027b58
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


