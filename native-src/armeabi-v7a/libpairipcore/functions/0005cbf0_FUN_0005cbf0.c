/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005cbf0
 * Address  : 0005cbf0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0005cbf0(int param_1,undefined4 param_2,undefined4 *param_3)

{
  char *pcVar1;
  undefined8 *puVar2;
  uint uVar3;
  int iVar4;
  char *pcVar5;
  int iVar6;
  uint extraout_r1;
  uint uVar7;
  int extraout_r1_00;
  char *pcVar8;
  undefined8 *puVar9;
  int *piVar10;
  char *pcVar11;
  ushort *puVar12;
  uint __size;
  bool bVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  pcVar11 = *(char **)(param_1 + 4);
  if (pcVar11 == (char *)0x0) {
    return 0;
  }
  pcVar1 = (char *)*param_3;
  pcVar5 = pcVar1 + -1;
  do {
    pcVar5 = pcVar5 + 1;
  } while (*pcVar5 != '\0');
  pcVar8 = pcVar11 + -1;
  do {
    pcVar8 = pcVar8 + 1;
  } while (*pcVar8 != '\0');
  if ((uint)((int)pcVar8 - (int)pcVar11) < (uint)((int)pcVar5 - (int)pcVar1)) {
    return 0;
  }
  pcVar5 = pcVar1 + -1;
  iVar6 = 1;
  do {
    pcVar5 = pcVar5 + 1;
    iVar6 = iVar6 + -1;
  } while (*pcVar5 != '\0');
  pcVar8 = pcVar11;
  if (pcVar5 != pcVar1) {
    do {
      if (*pcVar8 != *pcVar1) {
        return 0;
      }
      bVar13 = iVar6 != -1;
      iVar6 = iVar6 + 1;
      pcVar1 = pcVar1 + 1;
      pcVar8 = pcVar8 + 1;
    } while (bVar13);
  }
  piVar10 = (int *)param_3[2];
  iVar6 = param_3[1];
  puVar12 = (ushort *)(*piVar10 + param_3[3]);
  if ((short)~(*puVar12 ^ (ushort)param_3[3]) <= iVar6) {
    return 0;
  }
  __size = 0;
  do {
    uVar7 = __size;
    __size = uVar7 + 1;
  } while (pcVar11[uVar7] != '\0');
  puVar2 = malloc(__size);
  if ((puVar2 != (undefined8 *)0x0) && (uVar7 != 0xffffffff)) {
    uVar3 = 0;
    uVar7 = extraout_r1;
    if (0xf < __size) {
      uVar7 = (int)puVar2 - (int)pcVar11;
    }
    if (0xf < __size && 0xf < uVar7) {
      uVar7 = __size & 0xfffffff0;
      uVar3 = __size & 0xfffffff0;
      pcVar1 = pcVar11;
      puVar9 = puVar2;
      do {
        uVar14 = *(undefined8 *)pcVar1;
        uVar15 = *(undefined8 *)(pcVar1 + 8);
        pcVar1 = pcVar1 + 0x10;
        uVar7 = uVar7 - 0x10;
        *puVar9 = uVar14;
        puVar9[1] = uVar15;
        puVar9 = puVar9 + 2;
      } while (uVar7 != 0);
      if (__size == uVar3) goto LAB_0005cd20;
    }
    iVar4 = uVar3 - __size;
    pcVar11 = pcVar11 + uVar3;
    pcVar1 = (char *)((int)puVar2 + uVar3);
    do {
      bVar13 = iVar4 != -1;
      iVar4 = iVar4 + 1;
      *pcVar1 = *pcVar11;
      pcVar11 = pcVar11 + 1;
      pcVar1 = pcVar1 + 1;
    } while (bVar13);
  }
LAB_0005cd20:
  FUN_000264a4(~(*(uint *)((int)puVar12 + ((iVar6 << 0x10) >> 0xe) + 2) ^ piVar10[1]));
  iVar6 = *(int *)param_3[4];
  *(undefined4 *)(iVar6 + extraout_r1_00) = puVar2;
  ((undefined4 *)(iVar6 + extraout_r1_00))[1] = 0;
  param_3[1] = param_3[1] + 1;
  return 0;
}


