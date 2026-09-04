/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d928
 * Address  : 0001d928
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_0001d928(undefined4 *param_1,undefined4 *param_2)

{
  undefined4 *__ptr;
  undefined4 uVar1;
  undefined4 *puVar2;
  undefined4 *puVar3;
  undefined4 *puVar4;
  
  puVar3 = param_2 + 3;
  puVar2 = (undefined4 *)*param_2;
  puVar4 = param_1 + 3;
  __ptr = (undefined4 *)*param_1;
  if (puVar2 == puVar3) {
    if (__ptr != puVar4) {
      free(__ptr);
      *param_1 = puVar4;
      param_1[1] = puVar4;
      puVar2 = (undefined4 *)*param_2;
      param_1[2] = param_1 + 7;
      __ptr = puVar4;
    }
    puVar3 = puVar2;
    if ((undefined4 *)param_2[1] != puVar2) {
      __aeabi_memmove4(__ptr,puVar2,(int)param_2[1] - (int)puVar2);
      puVar2 = (undefined4 *)param_2[1];
      __ptr = (undefined4 *)*param_1;
      puVar3 = (undefined4 *)*param_2;
    }
    param_1[1] = ((int)puVar2 - (int)puVar3) + (int)__ptr;
    param_2[1] = puVar3;
  }
  else {
    *param_1 = puVar2;
    if (__ptr == puVar4) {
      uVar1 = param_2[2];
      param_1[1] = param_2[1];
      param_1[2] = uVar1;
      *param_2 = puVar3;
      param_2[1] = puVar3;
      param_2[2] = param_2 + 7;
    }
    else {
      *param_2 = __ptr;
      uVar1 = param_1[1];
      param_1[1] = param_2[1];
      param_2[1] = uVar1;
      uVar1 = param_1[2];
      param_1[2] = param_2[2];
      param_2[2] = uVar1;
      param_2[1] = *param_2;
    }
  }
  return param_1;
}


