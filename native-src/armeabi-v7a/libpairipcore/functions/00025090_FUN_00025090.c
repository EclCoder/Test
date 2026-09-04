/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025090
 * Address  : 00025090
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_00025090(int param_1,uint param_2,int *param_3)

{
  uint uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  uint *puVar4;
  uint *puVar5;
  int iVar6;
  int *piVar7;
  uint uVar8;
  uint uVar9;
  undefined4 *puVar10;
  uint uVar11;
  uint uVar12;
  int local_40;
  undefined4 uStack_3c;
  int *local_38;
  uint local_30;
  undefined4 uStack_2c;
  int *local_28;
  
  uVar12 = (uint)param_3[1] >> 3;
  if (uVar12 == 0) {
    return 0;
  }
  uVar8 = 0;
  uVar9 = uVar12;
  uVar2 = *(undefined4 *)(param_1 + 4);
  while (uVar11 = uVar9, uStack_2c = uVar2, local_28 = param_3, uVar11 != 0) {
    local_30 = uVar8 + (uVar11 >> 1);
    uVar1 = FUN_00025224(&local_30);
    uVar9 = uVar11 >> 1;
    if (uVar1 <= param_2) {
      uVar8 = local_30 + 1;
      uVar9 = uVar11 + ~(uVar11 >> 1);
      param_3 = local_28;
      uVar2 = uStack_2c;
    }
  }
  if (uVar8 == 0) {
    return 0;
  }
  _local_40 = CONCAT44(uVar2,uVar8 - 1);
  local_38 = param_3;
  local_30 = uVar8;
  uVar2 = FUN_00025224(&local_40);
  if (uVar8 == uVar12) {
    uVar3 = 0xffffffff;
  }
  else {
    uVar3 = FUN_00025224();
  }
  uVar12 = *local_38 + local_40 * 8;
  puVar5 = (uint *)(uVar12 + 4);
  if (puVar5 != (uint *)0x0) {
    uVar12 = *puVar5;
  }
  if (puVar5 == (uint *)0x0 || uVar12 == 1) {
    return 0;
  }
  uVar9 = uVar12;
  if ((int)uVar12 < 0) {
LAB_00025158:
    uVar8 = (uVar9 & 0xfffffff) >> 0x18;
    if (uVar8 == 2) {
      uVar8 = 2;
      piVar7 = (int *)(DAT_00025210 + 0x25188);
    }
    else {
      if (uVar8 != 1) {
        if (uVar8 != 0) {
          puVar10 = *(undefined4 **)(DAT_00025200 + 0x251dc);
          fprintf((FILE *)*puVar10,(char *)(DAT_00025204 + 0x251e8),DAT_00025208 + 0x251ea,
                  DAT_0002520c + 0x251ec);
          fflush((FILE *)*puVar10);
                    /* WARNING: Subroutine does not return */
          abort();
        }
        puVar4 = puVar5 + 1;
        if ((int)uVar12 < 0) {
          puVar4 = (uint *)0x0;
        }
        iVar6 = *(int *)(DAT_000251fc + 0x25174);
        goto LAB_00025174;
      }
      uVar8 = 0;
      piVar7 = (int *)(DAT_000251f8 + 0x25180);
    }
    iVar6 = *piVar7;
    uVar9 = (uVar9 & 0xffffff) >> 0x10;
    puVar4 = puVar5 + uVar9 + 1;
    if ((0x7fffffff < uVar12) && (uVar9 != 0)) {
      puVar10 = *(undefined4 **)(DAT_00025214 + 0x251ba);
      fprintf((FILE *)*puVar10,(char *)(DAT_00025218 + 0x251c6),DAT_0002521c + 0x251c8,
              DAT_00025220 + 0x251ca);
      fflush((FILE *)*puVar10);
                    /* WARNING: Subroutine does not return */
      abort();
    }
  }
  else {
    uVar9 = uVar12 | (uVar12 & 0x40000000) << 1;
    puVar4 = (uint *)(uVar9 + (int)puVar5);
    uVar9 = *(uint *)(uVar9 + (int)puVar5);
    puVar5 = puVar4;
    if ((int)uVar9 < 0) goto LAB_00025158;
    iVar6 = (int)puVar4 + (uVar9 & 0x40000000) * 2 + uVar9;
    puVar4 = puVar4 + *(byte *)((int)puVar4 + 7) + 2;
LAB_00025174:
    uVar8 = 0;
  }
  *(undefined4 *)(param_1 + 0x158) = uVar2;
  *(undefined4 *)(param_1 + 0x15c) = uVar3;
  *(uint *)(param_1 + 0x16c) = uVar8 | uVar12 >> 0x1f;
  *(uint **)(param_1 + 0x178) = puVar5;
  *(uint **)(param_1 + 0x160) = puVar4;
  *(int *)(param_1 + 0x164) = iVar6;
  return 1;
}


