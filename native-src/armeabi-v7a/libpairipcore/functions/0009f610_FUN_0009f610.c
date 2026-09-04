/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009f610
 * Address  : 0009f610
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009f610(undefined4 *param_1)

{
  int iVar1;
  char *pcVar2;
  undefined4 *puVar3;
  undefined4 uVar4;
  undefined1 *puVar5;
  int iVar6;
  undefined4 uVar7;
  
  iVar1 = DAT_0009f734;
  iVar6 = *(int *)(DAT_0009f734 + 0x9f634);
  if (iVar6 != 0) {
    pcVar2 = (char *)FUN_00025e6c(DAT_0009f738 + 0x9f638);
    if (*pcVar2 == '\x01') {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f73c + 0x9f650);
      uVar4 = *puVar3;
    }
    else {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f740 + 0x9f6cc);
      uVar4 = FUN_00076fc0();
      iVar6 = DAT_0009f744;
      *puVar3 = uVar4;
      puVar5 = (undefined1 *)FUN_00025e6c(iVar6 + 0x9f6e8);
      iVar6 = *(int *)(iVar1 + 0x9f634);
      *puVar5 = 1;
    }
    uVar4 = FUN_0009ba5c(uVar4,*(undefined4 *)(iVar1 + 0x9f630),iVar6);
    pcVar2 = (char *)FUN_00025e6c(DAT_0009f748 + 0x9f670);
    if (*pcVar2 == '\x01') {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f74c + 0x9f688);
      uVar7 = *puVar3;
    }
    else {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f750 + 0x9f70c);
      uVar7 = FUN_00076fc0();
      iVar1 = DAT_0009f754;
      *puVar3 = uVar7;
      puVar5 = (undefined1 *)FUN_00025e6c(iVar1 + 0x9f728);
      *puVar5 = 1;
    }
    iVar1 = DAT_0009f758;
    *param_1 = uVar4;
    param_1[3] = uVar7;
    param_1[2] = iVar1 + 0x9f6a8;
    param_1[6] = param_1 + 2;
    return;
  }
  param_1[6] = 0;
  *param_1 = 0;
  return;
}


