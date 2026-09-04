/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002191c
 * Address  : 0002191c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_0002191c(undefined4 *param_1,int param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  int local_1c;
  undefined4 local_18;
  undefined4 local_14;
  
  iVar1 = param_1[1];
  local_1c = param_2;
  local_18 = param_3;
  local_14 = param_4;
  FUN_000203aa(*param_1,0x28);
  local_18 = CONCAT13(local_18._3_1_,0x54000);
  local_18 = CONCAT31(local_18._1_3_,0x2a);
  local_1c = DAT_00021958 + 0x2194a;
  local_14 = *(undefined4 *)(iVar1 + 8);
  FUN_0001bd9c(&local_1c,*param_1);
  FUN_000203fa(*param_1,0x29);
  return CONCAT44(local_1c,param_1);
}


