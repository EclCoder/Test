/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : snprintf
 * Address  : 000a0600
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int snprintf(char *__s,size_t __maxlen,char *__format,...)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_snprintf_000a5f10)(__s);
  return iVar1;
}


