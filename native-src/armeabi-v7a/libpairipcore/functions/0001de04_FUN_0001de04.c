/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001de04
 * Address  : 0001de04
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001de04(int param_1,char *param_2)

{
  int *piVar1;
  size_t sVar2;
  
  piVar1 = (int *)FUN_0001dbc0(param_1 + 0x198,0x10);
  sVar2 = strlen(param_2);
  piVar1[2] = (int)param_2;
  piVar1[3] = sVar2;
  *(undefined1 *)(piVar1 + 1) = 8;
  *piVar1 = DAT_0001de40 + 0x1de32;
  *(ushort *)((int)piVar1 + 5) = (*(ushort *)((int)piVar1 + 5) & 0xf000) + 0x540;
  return piVar1;
}


