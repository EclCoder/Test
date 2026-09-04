/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001da44
 * Address  : 0001da44
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0001da44(undefined4 *param_1,int param_2,undefined4 param_3,int param_4)

{
  char *pcVar1;
  bool bVar2;
  undefined4 *puStack_20;
  int local_1c;
  undefined4 uStack_18;
  int local_14;
  
  pcVar1 = (char *)*param_1;
  if (pcVar1 == (char *)param_1[1]) {
LAB_0001dabc:
    bVar2 = true;
  }
  else {
    local_14 = param_4;
    puStack_20 = param_1;
    local_1c = param_2;
    uStack_18 = param_3;
    if (*pcVar1 == 'h') {
      *param_1 = pcVar1 + 1;
      FUN_0001c5c0(&uStack_18,param_1,1);
    }
    else {
      if (*pcVar1 != 'v') goto LAB_0001dabc;
      *param_1 = pcVar1 + 1;
      FUN_0001c5c0(&uStack_18,param_1,1);
      if (local_14 == 0) {
        return true;
      }
      pcVar1 = (char *)*param_1;
      if (pcVar1 == (char *)param_1[1]) {
        return true;
      }
      if (*pcVar1 != '_') {
        return true;
      }
      *param_1 = pcVar1 + 1;
      FUN_0001c5c0(&puStack_20,param_1,1);
      local_14 = local_1c;
    }
    bVar2 = true;
    if (((local_14 != 0) && (pcVar1 = (char *)*param_1, pcVar1 != (char *)param_1[1])) &&
       (bVar2 = *pcVar1 != '_', !bVar2)) {
      *param_1 = pcVar1 + 1;
    }
  }
  return bVar2;
}


