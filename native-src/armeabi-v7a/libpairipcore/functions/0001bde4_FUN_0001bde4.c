/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001bde4
 * Address  : 0001bde4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001bde4(int param_1)

{
  undefined4 *__ptr;
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)(param_1 + 0x1198);
  while (__ptr = (undefined4 *)*puVar1, __ptr != (undefined4 *)0x0) {
    *puVar1 = *__ptr;
    if (__ptr != (undefined4 *)(param_1 + 0x198)) {
      free(__ptr);
    }
  }
  *(undefined4 *)(param_1 + 0x198) = 0;
  *(undefined4 *)(param_1 + 0x19c) = 0;
  *puVar1 = (undefined4 *)(param_1 + 0x198);
  if (*(void **)(param_1 + 0x168) != (void *)(param_1 + 0x174)) {
    free(*(void **)(param_1 + 0x168));
  }
  FUN_0001be4a(param_1 + 0x14c);
  FUN_0001be62(param_1 + 0x120);
  FUN_0001be7a(param_1 + 0x94);
  FUN_0001be7a(param_1 + 8);
  return param_1;
}


