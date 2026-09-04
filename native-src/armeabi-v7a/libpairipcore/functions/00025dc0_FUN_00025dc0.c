/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025dc0
 * Address  : 00025dc0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_00025dc0(uint param_1,undefined4 param_2,int param_3,undefined4 param_4,undefined1 *param_5
                 ,undefined4 param_6)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  int *piVar4;
  undefined1 *local_24;
  
  local_24 = &stack0xfffffff8;
  if (param_3 == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_00025c9e(0,param_6);
  }
  piVar3 = (int *)(param_3 + ~param_1 * 4);
  piVar4 = piVar3;
  do {
    iVar2 = *piVar4;
    if (iVar2 == 0) break;
    local_24 = param_5;
    iVar1 = (**(code **)(**(int **)((int)piVar3 + iVar2) + 0x10))
                      (*(int **)((int)piVar3 + iVar2),param_4,&local_24);
    piVar3 = piVar3 + 1;
    piVar4 = piVar4 + 1;
  } while (iVar1 == 0);
  return iVar2 == 0;
}


