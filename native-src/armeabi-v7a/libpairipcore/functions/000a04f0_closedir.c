/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : closedir
 * Address  : 000a04f0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int closedir(DIR *__dirp)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_closedir_000a5ecc)(__dirp);
  return iVar1;
}


