/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_cond_broadcast
 * Address  : 000a05b0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_broadcast(pthread_cond_t *__cond)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_cond_broadcast_000a5efc)(__cond);
  return iVar1;
}


