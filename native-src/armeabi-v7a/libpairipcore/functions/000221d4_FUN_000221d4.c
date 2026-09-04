/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000221d4
 * Address  : 000221d4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000221d4(int param_1,undefined4 param_2)

{
  FUN_0001dcd6(param_2,DAT_000221f8 + 0x221e4,1);
                    /* WARNING: Could not recover jumptable at 0x000221f4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 8) + 0x10))(*(int **)(param_1 + 8),param_2);
  return;
}


