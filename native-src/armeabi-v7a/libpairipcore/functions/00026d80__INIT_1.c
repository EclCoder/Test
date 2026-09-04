/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : _INIT_1
 * Address  : 00026d80
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void _INIT_1(void)

{
  undefined1 *local_128;
  undefined1 *local_124;
  undefined1 auStack_120 [8];
  undefined1 auStack_118 [260];
  int local_14;
  
  local_14 = **(int **)(DAT_00026df0 + 0x26da4);
  __aeabi_memcpy8(auStack_120,DAT_00026dec + 0x26da0,0x108);
  local_124 = auStack_118;
  local_128 = auStack_120;
  FUN_00028408(&local_128);
  if (**(int **)(DAT_00026df4 + 0x26dd8) != local_14) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


