/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005eb30
 * Address  : 0005eb30
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005eb30(int param_1)

{
  FUN_0001ae24();
  if ((*(char *)(param_1 + 8) == '\x01') && (0 < *(int *)(param_1 + 4))) {
    *(int *)(param_1 + 4) = *(int *)(param_1 + 4) + -1;
  }
  FUN_0001ae3c(param_1);
  return;
}


