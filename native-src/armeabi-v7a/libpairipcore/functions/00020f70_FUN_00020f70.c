/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020f70
 * Address  : 00020f70
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_00020f70(undefined4 *param_1)

{
  char *pcVar1;
  int iVar2;
  char cVar3;
  
  pcVar1 = (char *)*param_1;
  if (((char *)param_1[1] != pcVar1) && (*pcVar1 == 'T')) {
    if ((uint)((int)param_1[1] - (int)pcVar1) < 2) {
      cVar3 = '\0';
    }
    else {
      cVar3 = pcVar1[1];
    }
    iVar2 = FUN_000212f2(&stack0xfffffff0,cVar3,0);
    return iVar2 != -1;
  }
  return false;
}


