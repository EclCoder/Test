/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023a94
 * Address  : 00023a94
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023a94(int param_1,undefined4 param_2)

{
  int iVar1;
  
  (**(code **)(**(int **)(param_1 + 0xc) + 0x10))(*(int **)(param_1 + 0xc),param_2);
  iVar1 = FUN_0001ead4(*(undefined4 *)(param_1 + 0xc),param_2);
  if ((iVar1 == 0) && (iVar1 = FUN_0001eaf4(*(undefined4 *)(param_1 + 0xc),param_2), iVar1 == 0)) {
    iVar1 = DAT_00023aec + 0x23aca;
  }
  else {
    iVar1 = DAT_00023ae8 + 0x23ac2;
  }
  FUN_0001dcd6(param_2,iVar1,1);
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8),param_2);
  FUN_0001dcd6(param_2,DAT_00023af0 + 0x23ae0,3);
  return;
}


