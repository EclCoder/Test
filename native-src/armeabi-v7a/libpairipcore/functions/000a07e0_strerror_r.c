/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : strerror_r
 * Address  : 000a07e0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * strerror_r(int __errnum,char *__buf,size_t __buflen)

{
  char *pcVar1;
  
  pcVar1 = (char *)(*(code *)PTR_strerror_r_000a5f88)(__errnum);
  return pcVar1;
}


