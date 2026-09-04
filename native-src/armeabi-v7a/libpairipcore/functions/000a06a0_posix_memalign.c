/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : posix_memalign
 * Address  : 000a06a0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int posix_memalign(void **__memptr,size_t __alignment,size_t __size)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_posix_memalign_000a5f38)(__memptr);
  return iVar1;
}


