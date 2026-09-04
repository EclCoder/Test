/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : realloc
 * Address  : 000a0590
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * realloc(void *__ptr,size_t __size)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_realloc_000a5ef4)(__ptr);
  return pvVar1;
}


