/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024d16
 * Address  : 00024d16
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_00024d16(int *param_1)

{
  int iVar1;
  
  if (((char)param_1[0x60] != '\0') ||
     ((iVar1 = FUN_00024ff4(param_1), iVar1 == 1 &&
      ((**(code **)(*param_1 + 0x34))(param_1,1), (char)param_1[0x60] != '\0')))) {
    iVar1 = 0;
  }
  return iVar1;
}


