/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b204
 * Address  : 0001b204
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


long * FUN_0001b204(long *param_1)

{
  long lVar1;
  
  if ((char)param_1[1] == '\0') {
    lVar1 = syscall(0xe0);
    *param_1 = lVar1;
    *(undefined1 *)(param_1 + 1) = 1;
  }
  return param_1;
}


