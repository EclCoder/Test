/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023d70
 * Address  : 00023d70
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023d70(int param_1,undefined4 param_2)

{
  int iVar1;
  undefined1 auStack_20 [4];
  int *local_1c;
  
  if (*(char *)(param_1 + 0x10) == '\0') {
    *(undefined1 *)(param_1 + 0x10) = 1;
    FUN_00023df0(auStack_20,param_1,param_2);
    if (local_1c != (int *)0x0) {
      iVar1 = FUN_0001ead4(local_1c,param_2);
      if ((iVar1 != 0) || (iVar1 = FUN_0001eaf4(local_1c,param_2), iVar1 != 0)) {
        FUN_0001dcd6(param_2,DAT_00023dd8 + 0x23db8,1);
      }
      (**(code **)(*local_1c + 0x14))(local_1c,param_2);
    }
    *(undefined1 *)(param_1 + 0x10) = 0;
  }
  return;
}


