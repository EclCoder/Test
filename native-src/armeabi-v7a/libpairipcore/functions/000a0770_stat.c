/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : stat
 * Address  : 000a0770
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int stat(char *__file,stat *__buf)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_stat_000a5f6c)(__file);
  return iVar1;
}


