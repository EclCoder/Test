/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009fa08
 * Address  : 0009fa08
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009fa08(undefined8 *param_1,undefined8 *param_2,uint param_3,uint param_4)

{
  undefined1 *puVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined1 *puVar4;
  uint uVar5;
  uint uVar6;
  undefined8 *puVar7;
  bool bVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  if (param_3 == 0) {
    return;
  }
  bVar8 = param_3 == 0x10;
  uVar6 = 0;
  if (0xf < param_3) {
    param_4 = (int)param_1 - (int)param_2;
    bVar8 = param_4 == 0xf;
  }
  if ((0xf < param_3 && 0xe < param_4) && !bVar8) {
    uVar6 = param_3 & 0xfffffff0;
    puVar3 = param_1;
    uVar5 = uVar6;
    puVar7 = param_2;
    do {
      uVar9 = *puVar7;
      uVar10 = puVar7[1];
      puVar7 = puVar7 + 2;
      uVar5 = uVar5 - 0x10;
      *puVar3 = uVar9;
      puVar3[1] = uVar10;
      puVar3 = puVar3 + 2;
    } while (uVar5 != 0);
    if (param_3 == uVar6) {
      return;
    }
  }
  iVar2 = param_3 - uVar6;
  puVar1 = (undefined1 *)((int)param_2 + uVar6);
  puVar4 = (undefined1 *)((int)param_1 + uVar6);
  do {
    iVar2 = iVar2 + -1;
    *puVar4 = *puVar1;
    puVar1 = puVar1 + 1;
    puVar4 = puVar4 + 1;
  } while (iVar2 != 0);
  return;
}


