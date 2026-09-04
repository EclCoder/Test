/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_create
 * Address  : 000a07d0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_create(pthread_t *__newthread,pthread_attr_t *__attr,__start_routine *__start_routine,
                  void *__arg)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_create_000a5f84)(__newthread);
  return iVar1;
}


