/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d7c0
 * Address  : 0001d7c0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001d7c0(undefined4 *param_1,undefined4 *param_2)

{
  void *pvVar1;
  undefined4 *puVar2;
  int iVar3;
  undefined4 *__ptr;
  
  puVar2 = (undefined4 *)param_1[1];
  if (puVar2 == (undefined4 *)param_1[2]) {
    __ptr = (undefined4 *)*param_1;
    iVar3 = (int)puVar2 - (int)__ptr;
    if (__ptr == param_1 + 3) {
      pvVar1 = malloc(iVar3 * 2);
      if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (puVar2 != __ptr) {
        __aeabi_memmove4(pvVar1,__ptr,iVar3);
      }
      *param_1 = pvVar1;
    }
    else {
      pvVar1 = realloc(__ptr,iVar3 * 2);
      *param_1 = pvVar1;
      if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    puVar2 = (undefined4 *)((int)pvVar1 + iVar3);
    param_1[2] = (void *)((int)pvVar1 + (iVar3 >> 1) * 4);
  }
  *puVar2 = *param_2;
  param_1[1] = puVar2 + 1;
  return;
}


