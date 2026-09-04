/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001af2c
 * Address  : 0001af2c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


pthread_key_t * FUN_0001af2c(pthread_key_t *param_1)

{
  int iVar1;
  
  iVar1 = pthread_key_create(param_1,(__destr_function *)(DAT_0001af48 + 0x1af38));
  if (iVar1 == 0) {
    return param_1;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,DAT_0001af4c + 0x1af46);
}


