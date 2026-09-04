/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000229c8
 * Address  : 000229c8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_000229c8(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_000229f0 + 0x229ea,DAT_000229f4 + 0x229ec,0x94,DAT_000229f8 + 0x229ee);
  }
  return *param_1 + param_2 * 4;
}


