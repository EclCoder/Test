/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : vfprintf
 * Address  : 000a0670
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int vfprintf(FILE *__s,char *__format,__gnuc_va_list __arg)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_vfprintf_000a5f2c)(__s);
  return iVar1;
}


