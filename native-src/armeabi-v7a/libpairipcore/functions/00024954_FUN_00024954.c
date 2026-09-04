/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024954
 * Address  : 00024954
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00024954(undefined4 param_1,undefined4 param_2,int param_3,uint param_4)

{
  int iVar1;
  undefined4 *puVar2;
  int iVar3;
  undefined4 uVar4;
  undefined4 local_50;
  undefined4 local_4c [3];
  code *local_40;
  undefined4 local_38;
  undefined4 local_2c;
  int local_24;
  
  FUN_00024b54(param_2,param_1);
  iVar3 = 1;
  do {
    uVar4 = 1;
    if (((param_4 & 1) != 0) && (uVar4 = 2, iVar3 == 0)) {
      FUN_00024bc8(param_2,0xffffffff,*(undefined4 *)(param_3 + 0x10));
      param_4 = 0;
    }
    FUN_00024b9c(param_2,0xfffffffe,&local_24);
    iVar1 = FUN_00024ca8(param_2,local_4c);
    if (iVar1 != 0) {
      return;
    }
    if (local_40 != (code *)0x0) {
      *(undefined4 *)(param_3 + 0x48) = local_4c[0];
      *(undefined4 *)(param_3 + 0x4c) = local_2c;
      *(undefined4 *)(param_3 + 0x50) = local_38;
      iVar1 = (*local_40)(uVar4,param_3,param_2);
      if (iVar1 != 8) {
        if (iVar1 == 7) {
          FUN_00024b9c(param_2,0xffffffff,&local_50);
          *(undefined4 *)(param_3 + 0x10) = local_50;
          FUN_00024cc8(param_2);
          return;
        }
        if (iVar1 != 9) {
          return;
        }
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (local_24 == *(int *)(param_3 + 0x20)) {
        puVar2 = *(undefined4 **)(DAT_00024a18 + 0x249fc);
        fprintf((FILE *)*puVar2,(char *)(DAT_00024a1c + 0x24a08),DAT_00024a20 + 0x24a0a,
                DAT_00024a24 + 0x24a0c);
        fflush((FILE *)*puVar2);
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    iVar3 = iVar3 + -1;
  } while( true );
}


