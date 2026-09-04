/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002eb4c
 * Address  : 0002eb4c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


