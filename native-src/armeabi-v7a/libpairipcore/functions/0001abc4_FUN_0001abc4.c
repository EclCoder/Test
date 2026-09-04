/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001abc4
 * Address  : 0001abc4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001abc4(int *param_1,int param_2,int param_3,undefined4 param_4)

{
  undefined1 auStack_30 [12];
  undefined1 auStack_24 [12];
  int local_18;
  int iStack_14;
  
  local_18 = param_2;
  iStack_14 = param_3;
  FUN_0001a540(auStack_30,param_4);
  FUN_0001ab58(auStack_24,&local_18,auStack_30);
  FUN_00019ea0(param_1,auStack_24);
  FUN_00019fe0(auStack_24);
  FUN_00019fe0(auStack_30);
  param_1[2] = local_18;
  param_1[3] = iStack_14;
  *param_1 = *(int *)(DAT_0001ac24 + 0x1ac06) + 8;
  return param_1;
}


