/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ddbc
 * Address  : 0001ddbc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001ddbc(undefined4 *param_1,int *param_2,byte *param_3,byte *param_4)

{
  undefined4 uVar1;
  int iVar2;
  
  if ((*param_4 < 0x30) || (0x39 < *param_4)) {
    uVar1 = 1;
  }
  else {
    iVar2 = 0;
    while ((param_4 != param_3 && (*param_4 - 0x30 < 10))) {
      *param_1 = param_4 + 1;
      *param_2 = iVar2 * 10;
      iVar2 = (uint)*param_4 + iVar2 * 10 + -0x30;
      *param_2 = iVar2;
      param_4 = param_4 + 1;
    }
    uVar1 = 0;
  }
  return uVar1;
}


