/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a5a8
 * Address  : 0001a5a8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001a5a8(undefined4 *param_1,void *param_2,uint param_3)

{
  int iVar1;
  uint __n;
  uint uVar2;
  
  uVar2 = param_1[1];
  __n = uVar2;
  if (param_3 < uVar2) {
    __n = param_3;
  }
  iVar1 = memcmp((void *)*param_1,param_2,__n);
  if (iVar1 != 0) {
    return iVar1;
  }
  if (uVar2 == param_3) {
    return 0;
  }
  iVar1 = 1;
  if (uVar2 < param_3) {
    iVar1 = -1;
  }
  return iVar1;
}


