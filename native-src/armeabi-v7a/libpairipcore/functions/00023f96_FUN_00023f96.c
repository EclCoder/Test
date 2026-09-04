/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023f96
 * Address  : 00023f96
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023f96(undefined4 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  int iVar1;
  undefined4 *puVar2;
  undefined1 auStack_2e0 [392];
  undefined1 auStack_158 [328];
  undefined4 uStack_10;
  undefined4 uStack_c;
  undefined4 uStack_8;
  
  uStack_10 = param_2;
  uStack_c = param_3;
  uStack_8 = param_4;
  iVar1 = FUN_0002418c();
  FUN_00025684(auStack_158,uStack_10,uStack_c,uStack_8);
  if (*(int *)(iVar1 + 0xc) == 0) {
    FUN_00024954(auStack_158,auStack_2e0,iVar1,1);
  }
  else {
    FUN_00024a88(auStack_158,auStack_2e0,iVar1,*(int *)(iVar1 + 0xc),*(undefined4 *)(iVar1 + 0x14));
  }
  puVar2 = *(undefined4 **)(DAT_00024a78 + 0x24a5c);
  fprintf((FILE *)*puVar2,(char *)(DAT_00024a7c + 0x24a68),DAT_00024a80 + 0x24a6a,
          DAT_00024a84 + 0x24a6c);
  fflush((FILE *)*puVar2);
                    /* WARNING: Subroutine does not return */
  abort();
}


