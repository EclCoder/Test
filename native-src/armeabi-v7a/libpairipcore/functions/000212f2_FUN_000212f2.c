/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000212f2
 * Address  : 000212f2
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_000212f2(int *param_1,undefined4 param_2,uint param_3)

{
  int iVar1;
  int iVar2;
  
  iVar2 = *param_1;
  if (param_3 < (uint)param_1[1]) {
    iVar1 = FUN_0001a584(iVar2 + param_3,param_1[1] - param_3,&stack0xffffffef,param_3,param_2,
                         CONCAT13((char)param_2,(int3)param_3));
    iVar2 = iVar1 - iVar2;
    if (iVar1 == 0) {
      iVar2 = -1;
    }
    return iVar2;
  }
  return -1;
}


