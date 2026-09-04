/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020f32
 * Address  : 00020f32
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00020f32(int *param_1,int param_2,undefined4 param_3)

{
  int *piVar1;
  int iVar2;
  int iVar3;
  int *local_14;
  
  iVar2 = *(int *)(param_2 + 0x14c);
  iVar3 = *(int *)(param_2 + 0x150);
  piVar1 = param_1 + 5;
  *param_1 = param_2;
  param_1[3] = (int)piVar1;
  *piVar1 = 0;
  param_1[6] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  param_1[7] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  param_1[8] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  param_1[1] = iVar3 - iVar2 >> 2;
  local_14 = param_1 + 2;
  *local_14 = (int)piVar1;
  param_1[9] = 0;
  param_1[10] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  param_1[0xb] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  param_1[0xc] = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  param_1[4] = (int)(param_1 + 0xd);
  FUN_0001e8dc(param_2 + 0x14c,&local_14,local_14,iVar3,param_3);
  return param_1;
}


