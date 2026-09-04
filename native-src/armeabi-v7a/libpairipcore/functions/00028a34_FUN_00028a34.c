/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00028a34
 * Address  : 00028a34
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


