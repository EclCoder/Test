/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001fb28
 * Address  : 0001fb28
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001fb28(int param_1,int param_2,int param_3,ushort param_4)

{
  int iVar1;
  int *piVar2;
  
  iVar1 = FUN_0001eb18();
  if (iVar1 == 0) {
    piVar2 = (int *)0x0;
  }
  else {
    piVar2 = (int *)FUN_0001dbc0(param_1 + 0x198,0x14);
    piVar2[2] = param_2;
    piVar2[3] = param_3;
    *(undefined1 *)(piVar2 + 1) = 0x42;
    piVar2[4] = iVar1;
    *piVar2 = DAT_0001fb7c + 0x1fb66;
    *(ushort *)((int)piVar2 + 5) =
         (*(ushort *)((int)piVar2 + 5) & 0xf000) + (param_4 & 0x3f) + 0x540;
  }
  return piVar2;
}


