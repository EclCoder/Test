/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_key_delete
 * Address  : 000a06c0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_key_delete(pthread_key_t __key)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_key_delete_000a5f40)(__key);
  return iVar1;
}


