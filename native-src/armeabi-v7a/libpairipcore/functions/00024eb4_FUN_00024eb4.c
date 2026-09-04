/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024eb4
 * Address  : 00024eb4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined8 FUN_00024eb4(int param_1,uint param_2)

{
  undefined4 *puVar1;
  int iVar2;
  
  iVar2 = DAT_00024f3c;
  if ((param_2 & 0xfffffff0) == 0x110) {
    iVar2 = DAT_00024f3c + 8;
    if (*(char *)(param_1 + 0x46) == '\0') {
      *(undefined1 *)(param_1 + 0x46) = 1;
      FUN_000256ac(param_1 + 0xd0);
    }
  }
  else {
    if ((param_2 & 0xfffffff0) != 0x100) {
      puVar1 = *(undefined4 **)(DAT_00024f40 + 0x24f1e);
      fprintf((FILE *)*puVar1,(char *)(DAT_00024f44 + 0x24f2a),DAT_00024f48 + 0x24f2c,
              DAT_00024f4c + 0x24f2e);
      fflush((FILE *)*puVar1);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if (*(char *)(param_1 + 0x45) == '\0') {
      *(undefined1 *)(param_1 + 0x45) = 1;
      if (*(char *)(param_1 + 0x44) == '\x01') {
        FUN_000256a4();
      }
      else {
        FUN_0002569c(param_1 + 0x48);
      }
    }
  }
  return CONCAT44(*(undefined4 *)(param_1 + iVar2 + param_2 * 8 + 4),
                  *(undefined4 *)(param_1 + iVar2 + param_2 * 8));
}


