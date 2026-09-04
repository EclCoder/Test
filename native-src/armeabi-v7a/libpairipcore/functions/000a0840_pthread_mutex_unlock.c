/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_mutex_unlock
 * Address  : 000a0840
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_mutex_unlock(pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_mutex_unlock_000a5fa0)(__mutex);
  return iVar1;
}


