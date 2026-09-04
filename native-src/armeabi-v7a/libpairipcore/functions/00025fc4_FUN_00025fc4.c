/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025fc4
 * Address  : 00025fc4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00025fc4(int *param_1)

{
  uint uVar1;
  
  if (*param_1 == 0) {
    for (uVar1 = 0; uVar1 < (uint)param_1[1]; uVar1 = uVar1 + 1) {
      if (param_1[uVar1 + 2] != 0) {
        free(*(void **)(param_1[uVar1 + 2] + -4));
      }
    }
    (*(code *)PTR_free_000a5f80)(param_1);
    return;
  }
  *param_1 = *param_1 + -1;
  (*(code *)PTR_pthread_setspecific_000a5f24)
            (*(undefined4 *)((int)&DAT_0002600c + DAT_0002600c),param_1);
  return;
}


