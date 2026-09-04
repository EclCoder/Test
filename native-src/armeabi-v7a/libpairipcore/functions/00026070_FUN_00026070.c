/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026070
 * Address  : 00026070
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00026070(uint param_1,uint param_2)

{
  if (param_2 == 0) {
    FUN_00026270(0);
    return;
  }
  if (param_2 != 1) {
    if (param_2 <= param_1) {
                    /* WARNING: Could not recover jumptable at 0x000260a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_0002625f + (LZCOUNT(param_2) - LZCOUNT(param_1)) * -0xe))();
      return;
    }
    return;
  }
  return;
}


