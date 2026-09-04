/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001be92
 * Address  : 0001be92
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001be92(undefined4 *param_1,int param_2)

{
  uint uVar1;
  void *pvVar2;
  size_t __size;
  
  uVar1 = param_1[2];
  if (uVar1 < (uint)(param_2 + param_1[1])) {
    __size = param_2 + param_1[1] + 0x3e0;
    if (__size < uVar1 << 1) {
      __size = uVar1 << 1;
    }
    param_1[2] = __size;
    pvVar2 = realloc((void *)*param_1,__size);
    *param_1 = pvVar2;
    if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
  }
  return;
}


