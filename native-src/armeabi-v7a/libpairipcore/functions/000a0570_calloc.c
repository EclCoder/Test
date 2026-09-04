/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : calloc
 * Address  : 000a0570
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * calloc(size_t __nmemb,size_t __size)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_calloc_000a5eec)(__nmemb);
  return pvVar1;
}


