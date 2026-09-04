/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e8a8
 * Address  : 0001e8a8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0001e8a8(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001e8d0 + 0x1e8ca,DAT_0001e8d4 + 0x1e8cc,0x94,DAT_0001e8d8 + 0x1e8ce);
  }
  return *param_1 + param_2 * 4;
}


