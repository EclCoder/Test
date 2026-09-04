/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : malloc
 * Address  : 000a0500
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * malloc(size_t __size)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_malloc_000a5ed0)(__size);
  return pvVar1;
}


