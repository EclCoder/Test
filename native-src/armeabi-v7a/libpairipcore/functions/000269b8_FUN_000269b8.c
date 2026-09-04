/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000269b8
 * Address  : 000269b8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000269b8(int param_1,uint param_2)

{
  uint uVar1;
  int iVar2;
  uint extraout_r2;
  uint extraout_r2_00;
  uint extraout_r2_01;
  int extraout_r3;
  int extraout_r3_00;
  undefined4 extraout_r3_01;
  int iVar3;
  uint uVar4;
  uint uVar5;
  bool bVar6;
  
  uVar4 = *(int *)(param_1 + 0x10) - 1;
  if (*(int *)(param_1 + 0x18) == 0x101) {
    uVar1 = *(uint *)(param_1 + 0x20) ^ uVar4 | *(uint *)(param_1 + 0x24) ^ (int)uVar4 >> 0x1f;
    bVar6 = uVar1 == 0;
    if (bVar6) {
      uVar1 = *(uint *)(param_1 + 0x14);
    }
    if (bVar6 && uVar1 == 0x7fffffff) {
      uVar1 = *(uint *)(param_1 + 0x28);
      iVar2 = *(int *)(param_1 + 0x2c);
      goto LAB_00026a5c;
    }
  }
  iVar2 = 0;
  uVar1 = 1;
  for (uVar5 = uVar4; uVar5 != 0; uVar5 = uVar5 - 1) {
    FUN_00026034((int)((ulonglong)uVar1 * 0x101),
                 (int)((ulonglong)uVar1 * 0x101 >> 0x20) + iVar2 * 0x101,0x7fffffff,0);
    iVar2 = extraout_r3;
    uVar1 = extraout_r2;
  }
  *(undefined4 *)(param_1 + 0x14) = 0x7fffffff;
  *(undefined4 *)(param_1 + 0x18) = 0x101;
  *(uint *)(param_1 + 0x20) = uVar4;
  *(int *)(param_1 + 0x24) = (int)uVar4 >> 0x1f;
  *(uint *)(param_1 + 0x28) = uVar1;
  *(int *)(param_1 + 0x2c) = iVar2;
LAB_00026a5c:
  iVar3 = *(int *)(param_1 + 0xc);
  *(uint *)(param_1 + 0x10) = uVar4;
  uVar5 = *(uint *)(param_1 + 8);
  FUN_00026034((int)((ulonglong)param_2 * (ulonglong)uVar1),
               iVar2 * param_2 + (int)((ulonglong)param_2 * (ulonglong)uVar1 >> 0x20),0x7fffffff,0);
  uVar4 = uVar5 - extraout_r2_00;
  FUN_00026034(uVar4 + 0x7fffffff,
               (iVar3 - (extraout_r3_00 + (uint)(uVar5 < extraout_r2_00))) +
               (uint)(0x80000000 < uVar4),0x7fffffff,0);
  *(uint *)(param_1 + 8) = extraout_r2_01;
  *(undefined4 *)(param_1 + 0xc) = extraout_r3_01;
  return;
}


