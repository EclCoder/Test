/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : fmod
 * Address  : 000a0880
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Heritage AFTER dead removal. Example location: s1 : 0x000a0888 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* WARNING: Unknown calling convention -- yet parameter storage is locked */

double fmod(double __x,double __y)

{
  (*(code *)PTR_fmod_000a5fb0)(SUB84(__x,0),(int)((ulonglong)__x >> 0x20),SUB84(__y,0));
  return __x;
}


