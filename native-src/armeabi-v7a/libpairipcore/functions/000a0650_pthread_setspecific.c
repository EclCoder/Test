/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_setspecific
 * Address  : 000a0650
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_setspecific(pthread_key_t __key,void *__pointer)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_setspecific_000a5f24)(__key);
  return iVar1;
}


