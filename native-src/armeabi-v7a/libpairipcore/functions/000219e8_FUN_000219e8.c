/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000219e8
 * Address  : 000219e8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000219e8(int param_1,int *param_2,int *param_3,undefined1 *param_4)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
  *(undefined1 *)(piVar1 + 1) = 0x51;
  iVar2 = *param_3;
  *piVar1 = DAT_00021a30 + 0x21a14;
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(undefined1 *)(piVar1 + 4) = *param_4;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}


