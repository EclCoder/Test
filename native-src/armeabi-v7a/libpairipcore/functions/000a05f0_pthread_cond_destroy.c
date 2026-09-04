/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_cond_destroy
 * Address  : 000a05f0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_destroy(pthread_cond_t *__cond)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_cond_destroy_000a5f0c)(__cond);
  return iVar1;
}


