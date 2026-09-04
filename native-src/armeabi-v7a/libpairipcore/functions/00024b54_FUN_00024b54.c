/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024b54
 * Address  : 00024b54
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_00024b54(int *param_1,undefined4 param_2)

{
  int iVar1;
  
  *(undefined1 *)((int)param_1 + 0x4e) = 0;
  *(undefined2 *)(param_1 + 0x13) = 0;
  iVar1 = DAT_00024b94 + 0x24b6a;
  *param_1 = DAT_00024b98 + 0x24b74;
  param_1[1] = iVar1;
  __aeabi_memcpy(param_1 + 2,param_2,0x40);
  param_1[0x12] = 0;
  __aeabi_memclr8(param_1 + 0x14,0x132);
  FUN_00024d8c(param_1,0);
  return 0;
}


