/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a02e
 * Address  : 0001a02e
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a02e(int *param_1,undefined4 param_2,uint param_3)

{
  undefined1 *puVar1;
  
  if (0xfffffff7 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00019fd0();
  }
  if (param_3 < 0xb) {
    puVar1 = (undefined1 *)((int)param_1 + 1);
    *(char *)param_1 = (char)(param_3 << 1);
    if (param_3 == 0) goto LAB_0001a06e;
  }
  else {
    puVar1 = (undefined1 *)FUN_000a0370((param_3 | 7) + 1);
    *param_1 = (param_3 | 7) + 2;
    param_1[1] = param_3;
    param_1[2] = (int)puVar1;
  }
  __aeabi_memmove(puVar1,param_2,param_3);
LAB_0001a06e:
  puVar1[param_3] = 0;
  return;
}


