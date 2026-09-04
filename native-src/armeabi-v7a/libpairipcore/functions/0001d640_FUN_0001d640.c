/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d640
 * Address  : 0001d640
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_0001d640(undefined4 *param_1)

{
  char cVar1;
  char *pcVar2;
  
  pcVar2 = *(char **)*param_1;
  if ((char *)((undefined4 *)*param_1)[1] == pcVar2) {
    return true;
  }
  cVar1 = *pcVar2;
  if (cVar1 == '.' || cVar1 == 'E') {
    return true;
  }
  return cVar1 == '_';
}


