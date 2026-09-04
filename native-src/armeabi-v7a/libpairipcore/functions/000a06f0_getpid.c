/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : getpid
 * Address  : 000a06f0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

__pid_t getpid(void)

{
  __pid_t _Var1;
  
  _Var1 = (*(code *)PTR_getpid_000a5f4c)();
  return _Var1;
}


