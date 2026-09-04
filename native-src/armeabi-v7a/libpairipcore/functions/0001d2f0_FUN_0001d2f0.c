/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d2f0
 * Address  : 0001d2f0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001d2f0(int *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  int iVar4;
  int *piVar5;
  int *piVar6;
  
  piVar5 = param_1 + 4;
  iVar4 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  iVar1 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  iVar2 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  piVar3 = param_1 + 0xb;
  *param_1 = param_2;
  param_1[9] = (int)piVar3;
  *piVar5 = 0;
  param_1[5] = iVar4;
  param_1[6] = iVar1;
  param_1[7] = iVar2;
  piVar6 = param_1 + 8;
  *piVar6 = (int)piVar3;
  *piVar3 = 0;
  param_1[0xc] = iVar4;
  param_1[0xd] = iVar1;
  param_1[0xe] = iVar2;
  param_1[0xf] = 0;
  param_1[0x10] = iVar4;
  param_1[0x11] = iVar1;
  param_1[0x12] = iVar2;
  param_1[10] = (int)(param_1 + 0x13);
  param_1[1] = (int)piVar5;
  param_1[2] = (int)piVar5;
  param_1[3] = (int)piVar6;
  FUN_0001d928(param_1 + 1,param_2 + 0x14c);
  FUN_0001d9b6(piVar6,*param_1 + 0x120);
  iVar4 = *param_1;
  *(undefined4 *)(iVar4 + 0x150) = *(undefined4 *)(iVar4 + 0x14c);
  *(undefined4 *)(iVar4 + 0x124) = *(undefined4 *)(iVar4 + 0x120);
  return param_1;
}


