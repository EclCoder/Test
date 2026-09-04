/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021e82
 * Address  : 00021e82
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00021e82(undefined4 *param_1,undefined4 param_2,int param_3,int param_4)

{
  char cVar1;
  int iVar2;
  int *piVar3;
  int local_18;
  int local_14;
  
  piVar3 = &local_14;
  local_18 = param_3;
  local_14 = param_4;
  if ((char *)param_1[1] != (char *)*param_1) {
    cVar1 = *(char *)*param_1;
    if (cVar1 == 'D') {
      iVar2 = FUN_0001e3d8(param_1);
      piVar3 = &local_18;
      local_18 = iVar2;
    }
    else {
      if (cVar1 != 'T') goto LAB_00021eae;
      iVar2 = FUN_0001e1e8(param_1);
      local_14 = iVar2;
    }
    if (iVar2 != 0) {
      FUN_0001d7c0(param_1 + 0x25,piVar3);
    }
    return iVar2;
  }
LAB_00021eae:
  iVar2 = FUN_0001e494(param_1,(char *)param_1[1],param_3,param_4);
  return iVar2;
}


