/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00073260
 * Address  : 00073260
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00073260(uint param_1,uint *param_2,uint *param_3,uint param_4,int param_5)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint *puVar9;
  uint *puVar10;
  uint uVar11;
  uint *puVar12;
  uint *puVar13;
  uint uVar14;
  bool bVar15;
  
  if (param_4 == 0) {
    return;
  }
  uVar14 = 0;
  puVar13 = (uint *)(param_1 + param_5);
  if (param_4 - 0x101 < 0xffffff0f) goto LAB_000732d0;
  bVar15 = (uint)((int)param_3 - (int)param_2) < 0x10;
  if (!bVar15) {
    param_1 = (int)param_3 - (param_1 + param_5);
  }
  if (bVar15 || param_1 < 0x10) goto LAB_000732d0;
  uVar14 = param_4 & 0x1f0;
  puVar9 = param_2;
  puVar10 = param_3;
  uVar11 = uVar14;
  puVar12 = puVar13;
  do {
    uVar1 = *puVar12;
    uVar2 = puVar12[1];
    uVar3 = puVar12[2];
    uVar4 = puVar12[3];
    puVar12 = puVar12 + 4;
    uVar11 = uVar11 - 0x10;
    uVar5 = *puVar9;
    uVar6 = puVar9[1];
    uVar7 = puVar9[2];
    uVar8 = puVar9[3];
    puVar9 = puVar9 + 4;
    *puVar10 = uVar5 ^ uVar1;
    puVar10[1] = uVar6 ^ uVar2;
    puVar10[2] = uVar7 ^ uVar3;
    puVar10[3] = uVar8 ^ uVar4;
    puVar10 = puVar10 + 4;
  } while (uVar11 != 0);
  for (; param_4 != uVar14; uVar14 = uVar14 + 1) {
LAB_000732d0:
    *(byte *)((int)param_3 + uVar14) =
         *(byte *)((int)param_2 + uVar14) ^ *(byte *)((int)puVar13 + (uVar14 & 0xff));
  }
  return;
}


