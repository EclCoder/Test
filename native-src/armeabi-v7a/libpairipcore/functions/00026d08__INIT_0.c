/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : _INIT_0
 * Address  : 00026d08
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void _INIT_0(void)

{
  undefined1 *local_128;
  undefined1 *local_124;
  undefined1 auStack_120 [8];
  undefined1 auStack_118 [260];
  int local_14;
  
  local_14 = **(int **)(DAT_00026d78 + 0x26d2c);
  __aeabi_memcpy8(auStack_120,DAT_00026d74 + 0x26d28,0x108);
  local_124 = auStack_118;
  local_128 = auStack_120;
  FUN_00026e50(&local_128);
  if (**(int **)(DAT_00026d7c + 0x26d60) != local_14) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


