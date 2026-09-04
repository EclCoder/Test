/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_key_create
 * Address  : 000a0720
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_key_create(pthread_key_t *__key,__destr_function *__destr_function)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_key_create_000a5f58)(__key);
  return iVar1;
}


