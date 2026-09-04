/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009de88
 * Address  : 0009de88
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


