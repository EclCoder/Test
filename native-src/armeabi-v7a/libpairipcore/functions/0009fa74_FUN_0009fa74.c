/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009fa74
 * Address  : 0009fa74
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009fa74(undefined8 *param_1,undefined8 *param_2)

{
  uint uVar1;
  undefined8 *puVar2;
  uint uVar3;
  undefined1 *puVar4;
  uint extraout_r2;
  uint uVar5;
  undefined1 *puVar6;
  undefined8 *puVar7;
  int iVar8;
  undefined8 *puVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  bool bVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  uVar5 = 0xffffffff;
  do {
    uVar10 = uVar5 + 1;
    iVar8 = uVar5 + 1;
    uVar5 = uVar10;
  } while (*(char *)((int)param_1 + iVar8) != '\0');
  uVar5 = 0xffffffff;
  do {
    uVar11 = uVar5 + 1;
    iVar8 = uVar5 + 1;
    uVar5 = uVar11;
  } while (*(char *)((int)param_2 + iVar8) != '\0');
  uVar12 = (int)((int)param_1 + uVar10) - (int)param_1;
  uVar1 = (int)((int)param_2 + uVar11) - (int)param_2;
  puVar2 = malloc(uVar1 + uVar12 + 1);
  uVar5 = extraout_r2;
  if ((undefined8 *)((int)param_1 + uVar10) != param_1) {
    uVar3 = 0;
    if (0xf < uVar12) {
      uVar5 = (int)puVar2 - (int)param_1;
    }
    if (0xf < uVar12 && 0xf < uVar5) {
      uVar5 = uVar10 & 0xfffffff0;
      uVar3 = uVar12 & 0xfffffff0;
      puVar9 = param_1;
      puVar7 = puVar2;
      do {
        uVar14 = *puVar9;
        uVar15 = puVar9[1];
        puVar9 = puVar9 + 2;
        uVar5 = uVar5 - 0x10;
        *puVar7 = uVar14;
        puVar7[1] = uVar15;
        puVar7 = puVar7 + 2;
      } while (uVar5 != 0);
      if (uVar12 == uVar3) {
        uVar5 = 0;
        goto LAB_0009fb04;
      }
    }
    do {
      uVar5 = (uint)*(byte *)((int)param_1 + uVar3);
      *(byte *)((int)puVar2 + uVar3) = *(byte *)((int)param_1 + uVar3);
      uVar3 = uVar3 + 1;
    } while (uVar10 != uVar3);
  }
LAB_0009fb04:
  if ((undefined8 *)((int)param_2 + uVar11) != param_2) {
    uVar3 = 0;
    if (0xf < uVar1) {
      uVar5 = (int)puVar2 + (uVar12 - (int)param_2);
    }
    if (0xf < uVar1 && 0xf < uVar5) {
      puVar7 = (undefined8 *)((int)puVar2 + uVar10);
      uVar5 = uVar11 & 0xfffffff0;
      uVar3 = uVar1 & 0xfffffff0;
      puVar9 = param_2;
      do {
        uVar14 = *puVar9;
        uVar15 = puVar9[1];
        puVar9 = puVar9 + 2;
        uVar5 = uVar5 - 0x10;
        *puVar7 = uVar14;
        puVar7[1] = uVar15;
        puVar7 = puVar7 + 2;
      } while (uVar5 != 0);
      if (uVar1 == uVar3) goto LAB_0009fb48;
    }
    iVar8 = uVar3 - uVar11;
    puVar4 = (undefined1 *)((int)puVar2 + uVar10 + uVar3);
    puVar6 = (undefined1 *)((int)param_2 + uVar3);
    do {
      bVar13 = iVar8 != -1;
      iVar8 = iVar8 + 1;
      *puVar4 = *puVar6;
      puVar4 = puVar4 + 1;
      puVar6 = puVar6 + 1;
    } while (bVar13);
  }
LAB_0009fb48:
  *(undefined1 *)((int)puVar2 + uVar1 + uVar12) = 0;
  return;
}


