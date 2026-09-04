/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001a700
 * Address  : 0001a700
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined2 * FUN_0001a700(undefined2 *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  
  iVar1 = FUN_00026070(param_2,100);
  iVar2 = DAT_0001a738 + 0x1a71c;
  *param_1 = *(undefined2 *)(iVar2 + iVar1 * 2);
  param_1[1] = *(undefined2 *)(iVar2 + (param_2 + iVar1 * -100) * 2);
  return param_1 + 2;
}


