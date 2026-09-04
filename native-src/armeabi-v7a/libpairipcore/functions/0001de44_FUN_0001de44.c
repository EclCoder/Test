/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001de44
 * Address  : 0001de44
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001de44(int param_1,int *param_2)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_0001de7c + 0x1de66;
  iVar2 = param_2[1];
  piVar1[2] = *param_2;
  piVar1[3] = iVar2;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return;
}


