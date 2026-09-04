/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002152c
 * Address  : 0002152c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0002152c(int param_1,undefined4 param_2)

{
  FUN_0001bd9c(*(undefined4 *)(param_1 + 8));
                    /* WARNING: Could not recover jumptable at 0x00021546. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 0xc) + 0x14))(*(int **)(param_1 + 0xc),param_2);
  return;
}


