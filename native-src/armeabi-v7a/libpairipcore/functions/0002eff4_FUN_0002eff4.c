/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002eff4
 * Address  : 0002eff4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


