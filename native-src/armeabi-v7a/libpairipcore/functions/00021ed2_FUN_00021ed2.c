/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021ed2
 * Address  : 00021ed2
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00021ed2(undefined4 *param_1,undefined4 param_2,int param_3,int param_4)

{
  int iVar1;
  int local_18;
  int local_14;
  
  local_18 = param_3;
  local_14 = param_4;
  local_14 = FUN_0001dd58();
  if (local_14 == 0) {
    iVar1 = 0;
  }
  else {
    iVar1 = local_14;
    if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'I')) {
      iVar1 = 0;
      local_18 = FUN_0001df74(param_1,0);
      if (local_18 != 0) {
        iVar1 = FUN_0001e168(param_1,&local_14,&local_18);
      }
    }
  }
  return iVar1;
}


