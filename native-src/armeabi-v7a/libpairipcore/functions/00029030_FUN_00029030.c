/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00029030
 * Address  : 00029030
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


