/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009de6c
 * Address  : 0009de6c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009de6c(int param_1,int *param_2)

{
  if (*param_2 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0009de84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(int **)(param_1 + 4) + 0x5c))();
  return;
}


