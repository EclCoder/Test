/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002d128
 * Address  : 0002d128
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


