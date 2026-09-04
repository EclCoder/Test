/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : remove
 * Address  : 000a0610
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int remove(char *__filename)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_remove_000a5f14)(__filename);
  return iVar1;
}


