/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b1dc
 * Address  : 0001b1dc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_0001b1dc(undefined4 *param_1,undefined4 param_2)

{
  int iVar1;
  
  *param_1 = param_2;
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)(DAT_0001b1fc + 0x1b1ea));
  if (iVar1 == 0) {
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b200 + 0x1b1fa,*param_1);
}


