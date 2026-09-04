/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b220
 * Address  : 0001b220
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_0001b220(undefined4 *param_1)

{
  int iVar1;
  
  iVar1 = pthread_mutex_unlock((pthread_mutex_t *)(DAT_0001b244 + 0x1b22c));
  if (iVar1 == 0) {
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b248 + 0x1b23c,*param_1);
}


