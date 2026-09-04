/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021308
 * Address  : 00021308
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00021308(int *param_1,int param_2)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  int *local_1c;
  
  iVar1 = *param_1;
  iVar3 = iVar1 + param_2 * 4;
  iVar4 = *(int *)(iVar3 + 0x18c);
  *(int *)(iVar3 + 0x18c) = iVar4 + 1;
  piVar2 = (int *)FUN_0001dbc0(iVar1 + 0x198,0x10);
  piVar2[2] = param_2;
  piVar2[3] = iVar4;
  *(ushort *)((int)piVar2 + 5) = (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
  *(undefined1 *)(piVar2 + 1) = 0x21;
  *piVar2 = DAT_0002136c + 0x2135a;
  if (*(int *)param_1[1] != 0) {
    local_1c = piVar2;
    FUN_00021370(*(int *)param_1[1],&local_1c);
  }
  return piVar2;
}


