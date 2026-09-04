/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002506a
 * Address  : 0002506a
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0002506a(undefined4 param_1,undefined4 *param_2,int *param_3,undefined4 param_4)

{
  int iVar1;
  int local_c;
  
  local_c = 0;
  iVar1 = dl_unwind_find_exidx(*param_2,&local_c,param_3,param_4,param_3);
  *param_3 = iVar1;
  param_3[1] = local_c << 3;
  if ((iVar1 != 0) && (local_c << 3 != 0)) {
    return 1;
  }
  return 0;
}


