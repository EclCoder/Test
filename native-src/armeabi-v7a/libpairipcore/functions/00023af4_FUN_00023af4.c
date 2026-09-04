/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023af4
 * Address  : 00023af4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023af4(int param_1,undefined4 param_2)

{
  int iVar1;
  
  iVar1 = FUN_0001ead4(*(undefined4 *)(param_1 + 0xc));
  if ((iVar1 != 0) || (iVar1 = FUN_0001eaf4(*(undefined4 *)(param_1 + 0xc),param_2), iVar1 != 0)) {
    FUN_0001dcd6(param_2,DAT_00023b28 + 0x23b18,1);
  }
                    /* WARNING: Could not recover jumptable at 0x00023b26. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 0xc) + 0x14))(*(int **)(param_1 + 0xc),param_2);
  return;
}


