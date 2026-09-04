/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_cond_wait
 * Address  : 000a05e0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_wait(pthread_cond_t *__cond,pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_cond_wait_000a5f08)(__cond);
  return iVar1;
}


