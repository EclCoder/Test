/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009f75c
 * Address  : 0009f75c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_0009f75c(int *param_1,undefined4 *param_2,undefined4 *param_3,undefined8 *param_4)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  uint uVar4;
  void *pvVar5;
  undefined1 *puVar6;
  int *piVar7;
  undefined1 *puVar8;
  undefined4 uVar9;
  uint uVar10;
  undefined8 *extraout_r3;
  undefined8 *extraout_r3_00;
  int iVar11;
  uint uVar12;
  uint uVar13;
  undefined4 *puVar14;
  undefined8 *puVar15;
  uint uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  if (param_3 == (undefined4 *)0x0) {
    puVar14 = (undefined4 *)FUN_00025e6c(DAT_0009f9f8 + 0x9f968);
    uVar9 = 0x16;
LAB_0009f994:
    *puVar14 = uVar9;
    return 0xffffffff;
  }
  puVar15 = (undefined8 *)param_3[0x101];
  if (*param_1 == 0) {
    *param_2 = 0;
  }
  puVar2 = (undefined8 *)(param_3 + 1);
  uVar13 = 0;
  do {
    puVar3 = (undefined8 *)param_3[0x102];
    if (puVar15 == puVar3) {
      uVar16 = FUN_00019718(3,*param_3,puVar2,0x400);
      if (0xfffff000 < uVar16) {
        piVar7 = (int *)FUN_00025e6c(DAT_0009f9fc + 0x9f9b8);
        *piVar7 = -uVar16;
        break;
      }
      if ((int)uVar16 < 1) break;
      param_3[0x101] = puVar2;
      puVar3 = (undefined8 *)((int)puVar2 + uVar16);
      param_3[0x102] = puVar3;
      uVar16 = (int)puVar3 - (int)puVar2;
      bVar1 = true;
      param_4 = extraout_r3;
      puVar15 = puVar2;
      if (puVar3 != puVar2) goto LAB_0009f828;
    }
    else {
      uVar16 = (int)puVar3 - (int)puVar15;
      bVar1 = true;
      if (puVar3 != puVar15) {
LAB_0009f828:
        bVar1 = true;
        uVar12 = 0;
        do {
          if (*(char *)((int)puVar15 + uVar12) == '\n') {
            bVar1 = false;
            uVar16 = uVar12 + 1;
            break;
          }
          uVar12 = uVar12 + 1;
        } while (uVar16 != uVar12);
      }
    }
    uVar12 = uVar16 + uVar13;
    if ((uVar12 ^ 0x7fffffff) <= uVar12 >> 1) {
      puVar14 = (undefined4 *)FUN_00025e6c(DAT_0009fa00 + 0x9f97c);
      uVar9 = 0x4b;
      goto LAB_0009f994;
    }
    puVar14 = (undefined4 *)(uVar12 + (uVar12 >> 1) + 1);
    if (puVar14 < (undefined4 *)0x81) {
      puVar14 = (undefined4 *)0x80;
    }
    if ((undefined4 *)*param_2 < puVar14) {
      uVar4 = (int)puVar14 - 1;
      if (((uint)puVar14 & uVar4) != 0) {
        uVar4 = uVar4 | uVar4 >> 1;
        uVar4 = uVar4 | uVar4 >> 2;
        uVar4 = uVar4 | uVar4 >> 4;
        uVar4 = uVar4 | uVar4 >> 8;
        puVar14 = (undefined4 *)((uVar4 | uVar4 >> 0x10) + 1);
      }
      pvVar5 = realloc((void *)*param_1,(size_t)puVar14);
      if (pvVar5 == (void *)0x0) {
        puVar14 = (undefined4 *)FUN_00025e6c(DAT_0009fa04 + 0x9f990);
        uVar9 = 0xc;
        goto LAB_0009f994;
      }
      *param_1 = (int)pvVar5;
      puVar15 = (undefined8 *)param_3[0x101];
      *param_2 = puVar14;
      puVar14 = param_2;
      param_4 = extraout_r3_00;
    }
    else {
      pvVar5 = (void *)*param_1;
      puVar14 = (undefined4 *)*param_2;
    }
    if (uVar16 != 0) {
      uVar4 = 0;
      if (0xf < uVar16) {
        param_4 = (undefined8 *)((int)pvVar5 + uVar13);
        puVar14 = (undefined4 *)((int)param_4 - (int)puVar15);
      }
      if (0xf < uVar16 && (undefined4 *)0xf < puVar14) {
        uVar4 = uVar16 & 0xfffffff0;
        puVar3 = puVar15;
        uVar10 = uVar4;
        do {
          uVar17 = *puVar3;
          uVar18 = puVar3[1];
          puVar3 = puVar3 + 2;
          uVar10 = uVar10 - 0x10;
          *param_4 = uVar17;
          param_4[1] = uVar18;
          param_4 = param_4 + 2;
        } while (uVar10 != 0);
        if (uVar16 == uVar4) goto LAB_0009f7a4;
      }
      iVar11 = uVar16 - uVar4;
      puVar6 = (undefined1 *)((int)pvVar5 + uVar4 + uVar13);
      puVar8 = (undefined1 *)((int)puVar15 + uVar4);
      do {
        iVar11 = iVar11 + -1;
        *puVar6 = *puVar8;
        puVar6 = puVar6 + 1;
        puVar8 = puVar8 + 1;
      } while (iVar11 != 0);
      param_4 = (undefined8 *)0x0;
    }
LAB_0009f7a4:
    puVar15 = (undefined8 *)(param_3[0x101] + uVar16);
    param_3[0x101] = puVar15;
    uVar13 = uVar12;
  } while (bVar1);
  if (uVar13 == 0) {
    return 0xffffffff;
  }
  *(undefined1 *)(*param_1 + uVar13) = 0;
  return uVar13;
}


