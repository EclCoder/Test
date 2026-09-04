/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a7ac
 * Address  : 0001a7ac
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001a7ac(char *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  
  iVar1 = DAT_0001a7dc;
  iVar2 = FUN_00026070(param_2,DAT_0001a7dc);
  param_2 = param_2 - iVar2 * iVar1;
  *param_1 = (char)iVar2 + '0';
  iVar1 = FUN_00026070(param_2,10000);
  *(undefined2 *)(param_1 + 1) = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar1 * 2);
  FUN_0001a700(param_1 + 3,param_2 + iVar1 * -10000);
  return;
}


