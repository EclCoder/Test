/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025032
 * Address  : 00025032
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00025032(int param_1)

{
  if (*(char *)(param_1 + 0x45) == '\x01') {
    if (*(char *)(param_1 + 0x44) == '\x01') {
      FUN_000256d0();
    }
    else {
      FUN_000256c8(param_1 + 0x48);
    }
  }
  if (*(char *)(param_1 + 0x46) != '\x01') {
    return;
  }
  (*(code *)&LAB_000256d8)(param_1 + 0xd0);
  return;
}


