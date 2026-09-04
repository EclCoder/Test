/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001fabc
 * Address  : 0001fabc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001fabc(int *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  
  FUN_0001bee0(param_1,*(undefined4 *)(param_2 + 4));
  if (*(byte *)(param_2 + 2) < 0xb) {
    iVar1 = FUN_0001d2b8(*param_1,param_1[1],DAT_0001fb18 + 0x1fadc,8);
    if (iVar1 == 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_0001fb1c + 0x1fb10,DAT_0001fb20 + 0x1fb12,0xbc1,DAT_0001fb24 + 0x1fb14);
    }
    iVar1 = *param_1;
    iVar2 = param_1[1];
    iVar4 = iVar2 + -8;
    pcVar3 = (char *)(iVar1 + 8);
    *param_1 = (int)pcVar3;
    param_1[1] = iVar4;
    if ((iVar4 != 0) && (*pcVar3 == ' ')) {
      *param_1 = iVar1 + 9;
      param_1[1] = iVar2 + -9;
    }
  }
  return;
}


