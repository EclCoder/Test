/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ae24
 * Address  : 0001ae24
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001ae24(pthread_mutex_t *param_1)

{
  int iVar1;
  
  iVar1 = pthread_mutex_lock(param_1);
  if (iVar1 == 0) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,DAT_0001ae38 + 0x1ae36);
}


