/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026010
 * Address  : 00026010
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00026010(int param_1,undefined4 param_2)

{
  if (param_1 == 0) {
                    /* WARNING: Subroutine does not return */
    abort();
  }
  *(undefined4 *)(param_1 + 4) = param_2;
  (*(code *)PTR_pthread_setspecific_000a5f24)
            (*(undefined4 *)((int)&DAT_0002600c + DAT_0002600c),param_1);
  return;
}


