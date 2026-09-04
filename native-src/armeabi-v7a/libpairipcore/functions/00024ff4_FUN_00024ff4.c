/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024ff4
 * Address  : 00024ff4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


bool FUN_00024ff4(int param_1)

{
  undefined4 uVar1;
  int iVar2;
  undefined4 local_10;
  undefined4 uStack_c;
  
  local_10 = 0;
  uStack_c = 0;
  uVar1 = FUN_00024292(*(undefined4 *)(param_1 + 0x178),&local_10,&uStack_c);
  iVar2 = FUN_000242d8(param_1,uVar1,local_10,uStack_c);
  return iVar2 == 8;
}


