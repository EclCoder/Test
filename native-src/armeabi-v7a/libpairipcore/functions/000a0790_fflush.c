/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : fflush
 * Address  : 000a0790
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int fflush(FILE *__stream)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_fflush_000a5f74)(__stream);
  return iVar1;
}


