/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_mutex_lock
 * Address  : 000a0780
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_mutex_lock(pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_mutex_lock_000a5f70)(__mutex);
  return iVar1;
}


