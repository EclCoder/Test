/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001af50
 * Address  : 0001af50
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_0001af50(undefined4 *param_1)

{
  bool bVar1;
  int *piVar2;
  int *piVar3;
  int iVar4;
  undefined4 *puVar5;
  int *piVar6;
  undefined4 *puVar7;
  int *piVar8;
  
  puVar7 = (undefined4 *)param_1[4];
  for (puVar5 = (undefined4 *)param_1[3]; puVar5 != puVar7; puVar5 = puVar5 + 2) {
    FUN_0001add0(*puVar5);
    FUN_0001ae3c(puVar5[1]);
  }
  piVar8 = (int *)param_1[1];
  for (piVar6 = (int *)*param_1; piVar6 != piVar8; piVar6 = piVar6 + 1) {
    FUN_0001b066(*piVar6);
    piVar2 = (int *)*piVar6;
    DataMemoryBarrier(0x1b);
    piVar3 = piVar2 + 1;
    do {
      ExclusiveAccess(piVar3);
      iVar4 = *piVar3;
      bVar1 = (bool)hasExclusiveAccess(piVar3);
    } while (!bVar1);
    *piVar3 = iVar4 + -1;
    DataMemoryBarrier(0x1b);
    if (iVar4 == 0) {
      (**(code **)(*piVar2 + 8))();
    }
  }
  FUN_0001afc4(param_1 + 3);
  FUN_0001b036(&stack0xffffffec);
  return param_1;
}


