/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024b30
 * Address  : 00024b30
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00024b30(int param_1)

{
  if (*(code **)(param_1 + 8) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00024b38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(param_1 + 8))(1,param_1);
    return;
  }
  return;
}


