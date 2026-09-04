/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002236c
 * Address  : 0002236c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int FUN_0002236c(int *param_1,uint param_2)

{
  if ((uint)(param_1[1] - *param_1 >> 2) <= param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_00022394 + 0x2238e,DAT_00022398 + 0x22390,0x94,DAT_0002239c + 0x22392);
  }
  return *param_1 + param_2 * 4;
}


