/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : pthread_once
 * Address  : 000a0580
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_once(pthread_once_t *__once_control,__init_routine *__init_routine)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_once_000a5ef0)(__once_control);
  return iVar1;
}


