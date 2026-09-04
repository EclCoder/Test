/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00022934
 * Address  : 00022934
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00022934(int param_1,int param_2)

{
  undefined4 uVar1;
  
  uVar1 = *(undefined4 *)(param_2 + 0x14);
  *(undefined4 *)(param_2 + 0x14) = 0;
  FUN_0001dcd6(param_2,DAT_00022978 + 0x22950,1);
  FUN_000205b8(param_1 + 8,param_2);
  FUN_0001dcd6(param_2,DAT_0002297c + 0x22966,1);
  *(undefined4 *)(param_2 + 0x14) = uVar1;
  return;
}


