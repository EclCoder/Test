/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001defc
 * Address  : 0001defc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001defc(undefined4 *param_1,undefined4 param_2,undefined1 *param_3)

{
  int iVar1;
  int iVar2;
  
  iVar1 = FUN_0001bec0(param_1,DAT_0001df6c + 0x1df10,2);
  if (iVar1 == 0) {
    iVar1 = 0;
  }
  else {
    iVar1 = FUN_0001e454(param_1,DAT_0001df70 + 0x1df1e);
  }
  if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'S')) {
    iVar2 = FUN_0001e494(param_1);
    if (iVar2 != 0) {
      if (*(char *)(iVar2 + 4) == '\x1b') goto LAB_0001df52;
      if (iVar1 == 0) {
        *param_3 = 1;
        return iVar2;
      }
    }
    return 0;
  }
  iVar2 = 0;
LAB_0001df52:
  iVar1 = FUN_0001e5ac(param_1,param_2,iVar1,iVar2);
  return iVar1;
}


