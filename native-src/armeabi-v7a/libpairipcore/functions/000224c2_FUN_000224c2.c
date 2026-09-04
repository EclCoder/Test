/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000224c2
 * Address  : 000224c2
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000224c2(int *param_1,int *param_2,undefined4 param_3,uint param_4)

{
  int iVar1;
  uint local_14;
  
  local_14 = param_4;
  iVar1 = FUN_0001ddac(param_2,&local_14,param_3,param_4,param_3);
  if (iVar1 == 0) {
    iVar1 = *param_2;
    if (local_14 <= (uint)(param_2[1] - iVar1)) {
      *param_1 = iVar1;
      param_1[1] = local_14;
      *param_2 = iVar1 + local_14;
      return;
    }
  }
  *param_1 = 0;
  param_1[1] = 0;
  return;
}


