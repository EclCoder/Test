/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026b18
 * Address  : 00026b18
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00026b18(int *param_1,undefined4 param_2)

{
  undefined8 *puVar1;
  uint uVar2;
  uint uVar3;
  undefined8 *puVar4;
  int iVar5;
  uint uVar6;
  undefined4 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  int iVar11;
  undefined8 *puVar12;
  uint uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  puVar10 = (undefined8 *)param_1[2];
  if (puVar10 != (undefined8 *)param_1[3]) goto LAB_00026c80;
  puVar8 = (undefined8 *)*param_1;
  puVar9 = (undefined8 *)param_1[1];
  if (puVar8 < puVar9) {
    iVar5 = (int)puVar10 - (int)puVar9;
    iVar11 = (((int)puVar9 - (int)puVar8 >> 2) + 1) / 2;
    puVar7 = (undefined4 *)((int)puVar9 + iVar11 * -4);
    if (iVar5 != 0) {
      __aeabi_memmove4(puVar7,puVar9,iVar5);
      puVar9 = (undefined8 *)param_1[1];
    }
    puVar10 = (undefined8 *)((int)puVar7 + iVar5);
    param_1[1] = (int)((int)puVar9 + iVar11 * -4);
    param_1[2] = (int)puVar10;
    goto LAB_00026c80;
  }
  iVar11 = (int)puVar10 - (int)puVar8;
  uVar6 = iVar11 >> 1;
  if (iVar11 == 0) {
    uVar6 = 1;
  }
  if (0x3fffffff < uVar6) {
                    /* WARNING: Subroutine does not return */
    FUN_00026984();
  }
  iVar5 = FUN_000a0370(uVar6 << 2);
  puVar12 = (undefined8 *)(iVar5 + (uVar6 & 0xfffffffc));
  puVar1 = puVar12;
  if (puVar10 != puVar9) {
    puVar1 = (undefined8 *)((int)puVar12 + ((int)puVar10 - (int)puVar9));
    uVar2 = ((int)puVar10 - (int)puVar9) - 4;
    puVar10 = puVar12;
    if ((0x1b < uVar2) && (0xf < ((uVar6 & 0x3ffffffc) + iVar5) - (int)puVar9)) {
      uVar3 = (uVar2 >> 2) + 1;
      uVar13 = uVar3 & 0xfffffffc;
      uVar2 = uVar13;
      puVar4 = puVar9;
      do {
        uVar14 = *puVar4;
        uVar15 = puVar4[1];
        puVar4 = puVar4 + 2;
        uVar2 = uVar2 - 4;
        *puVar10 = uVar14;
        puVar10[1] = uVar15;
        puVar10 = puVar10 + 2;
      } while (uVar2 != 0);
      if (uVar3 == uVar13) goto LAB_00026c5c;
      puVar9 = (undefined8 *)((int)puVar9 + uVar13 * 4);
      puVar10 = (undefined8 *)((int)puVar12 + uVar13 * 4);
    }
    do {
      puVar4 = (undefined8 *)((int)puVar10 + 4);
      *(undefined4 *)puVar10 = *(undefined4 *)puVar9;
      puVar10 = puVar4;
      puVar9 = (undefined8 *)((int)puVar9 + 4);
    } while (puVar4 != puVar1);
  }
LAB_00026c5c:
  puVar10 = puVar1;
  *param_1 = iVar5;
  param_1[1] = (int)puVar12;
  param_1[2] = (int)puVar10;
  param_1[3] = iVar5 + uVar6 * 4;
  if (puVar8 != (undefined8 *)0x0) {
    FUN_00023f68(puVar8,iVar11);
    puVar10 = (undefined8 *)param_1[2];
  }
LAB_00026c80:
  *(undefined4 *)puVar10 = param_2;
  param_1[2] = param_1[2] + 4;
  return;
}


