/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025fa0
 * Address  : 00025fa0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00025fa0(void)

{
  int iVar1;
  undefined1 *puVar2;
  
  puVar2 = (undefined1 *)(DAT_00025fbc + 0x25faa);
  iVar1 = pthread_key_create((pthread_key_t *)(DAT_00025fbc + 0x25fae),
                             (__destr_function *)(DAT_00025fc0 + 0x25fae));
  if (iVar1 == 0) {
    *puVar2 = 1;
    return;
  }
                    /* WARNING: Subroutine does not return */
  abort();
}


