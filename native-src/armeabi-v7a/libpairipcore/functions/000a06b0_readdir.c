/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : readdir
 * Address  : 000a06b0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

dirent * readdir(DIR *__dirp)

{
  dirent *pdVar1;
  
  pdVar1 = (dirent *)(*(code *)PTR_readdir_000a5f3c)(__dirp);
  return pdVar1;
}


