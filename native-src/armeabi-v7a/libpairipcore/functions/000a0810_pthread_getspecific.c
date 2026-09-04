/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_getspecific
 * Address  : 000a0810
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * pthread_getspecific(pthread_key_t __key)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_pthread_getspecific_000a5f94)(__key);
  return pvVar1;
}


