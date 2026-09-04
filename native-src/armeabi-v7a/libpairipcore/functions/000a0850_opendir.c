/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : opendir
 * Address  : 000a0850
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DIR * opendir(char *__name)

{
  DIR *pDVar1;
  
  pDVar1 = (DIR *)(*(code *)PTR_opendir_000a5fa4)(__name);
  return pDVar1;
}


