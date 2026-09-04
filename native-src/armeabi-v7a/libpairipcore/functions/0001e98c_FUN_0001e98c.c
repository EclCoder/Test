/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e98c
 * Address  : 0001e98c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001e98c(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001e9b4 + 0x1e9ae,DAT_0001e9b8 + 0x1e9b0,0x94,DAT_0001e9bc + 0x1e9b2);
  }
  return *param_1 + param_2 * 4;
}


