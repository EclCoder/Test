/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : syscall
 * Address  : 000a0510
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

long syscall(long __sysno,...)

{
  long lVar1;
  
  lVar1 = (*(code *)PTR_syscall_000a5ed4)(__sysno);
  return lVar1;
}


