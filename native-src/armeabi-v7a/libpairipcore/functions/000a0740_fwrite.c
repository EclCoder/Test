/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : fwrite
 * Address  : 000a0740
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t fwrite(void *__ptr,size_t __size,size_t __n,FILE *__s)

{
  size_t sVar1;
  
  sVar1 = (*(code *)PTR_fwrite_000a5f60)(__ptr);
  return sVar1;
}


