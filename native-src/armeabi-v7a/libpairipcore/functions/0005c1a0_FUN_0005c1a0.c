/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005c1a0
 * Address  : 0005c1a0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


