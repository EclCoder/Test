/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001fb80
 * Address  : 0001fb80
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001fb80(int param_1,int *param_2,int *param_3,undefined1 *param_4,ushort *param_5)

{
  ushort uVar1;
  int *piVar2;
  int iVar3;
  
  piVar2 = (int *)FUN_0001dbc0(param_1 + 0x198,0x18);
  iVar3 = *param_2;
  *piVar2 = DAT_0001fbd4 + 0x1fba8;
  uVar1 = *param_5;
  piVar2[2] = iVar3;
  iVar3 = param_3[1];
  piVar2[3] = *param_3;
  piVar2[4] = iVar3;
  *(undefined1 *)(piVar2 + 5) = *param_4;
  *(undefined1 *)(piVar2 + 1) = 0x3f;
  *(ushort *)((int)piVar2 + 5) = (uVar1 & 0x3f) + (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
  return;
}


