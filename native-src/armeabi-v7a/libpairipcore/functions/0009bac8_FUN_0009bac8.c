/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009bac8
 * Address  : 0009bac8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009bac8(undefined4 *param_1,byte *param_2,undefined4 param_3)

{
  int iVar1;
  char *pcVar2;
  undefined4 *puVar3;
  undefined1 *puVar4;
  byte *pbVar5;
  int iVar6;
  undefined4 uVar7;
  int iVar8;
  int local_6c;
  int local_68;
  int local_60;
  undefined4 local_5c;
  int *local_50;
  undefined4 local_48;
  int local_40;
  undefined4 local_3c;
  int *local_30;
  int local_24;
  
  local_24 = **(int **)(DAT_0009bd00 + 0x9bae4);
  pbVar5 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar5 = param_2 + 1;
  }
  iVar1 = (**(code **)(*(int *)*param_1 + 0x29c))((int *)*param_1,pbVar5);
  pcVar2 = (char *)FUN_00025e6c(DAT_0009bd04 + 0x9bb20);
  if (*pcVar2 == '\x01') {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd08 + 0x9bb38);
    uVar7 = *puVar3;
  }
  else {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd0c + 0x9bca0);
    uVar7 = FUN_00076fc0();
    iVar8 = DAT_0009bd10;
    *puVar3 = uVar7;
    puVar4 = (undefined1 *)FUN_00025e6c(iVar8 + 0x9bcbc);
    *puVar4 = 1;
  }
  iVar8 = DAT_0009bd14 + 0x9bb60;
  local_68 = iVar1;
  local_60 = iVar8;
  local_5c = uVar7;
  local_50 = &local_60;
  iVar1 = FUN_000765d8(*param_1,param_1[2],*(undefined4 *)(DAT_0009bd18 + 0x9bb8c),iVar1,param_3);
  pcVar2 = (char *)FUN_00025e6c(DAT_0009bd1c + 0x9bb90);
  if (*pcVar2 == '\x01') {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd20 + 0x9bba8);
    uVar7 = *puVar3;
  }
  else {
    puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009bd24 + 0x9bcd4);
    uVar7 = FUN_00076fc0();
    iVar6 = DAT_0009bd28;
    *puVar3 = uVar7;
    puVar4 = (undefined1 *)FUN_00025e6c(iVar6 + 0x9bcf0);
    *puVar4 = 1;
  }
  local_3c = uVar7;
  iVar6 = 0x10;
  local_30 = &local_40;
  local_48 = 0;
  local_40 = iVar8;
  if (((iVar1 == 0) || (local_6c = iVar1, FUN_0009de6c(&local_40,&local_6c), local_30 == &local_40))
     || (iVar6 = 0x14, local_30 != (int *)0x0)) {
    (**(code **)(*local_30 + iVar6))();
  }
  iVar1 = local_68;
  local_68 = 0;
  if (iVar1 != 0) {
    local_6c = iVar1;
    if (local_50 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_50 + 0x18))(local_50,&local_6c);
  }
  if (local_50 == &local_60) {
    iVar1 = 0x10;
  }
  else {
    iVar1 = 0x14;
    if (local_50 == (int *)0x0) goto LAB_0009bc70;
  }
  (**(code **)(*local_50 + iVar1))();
LAB_0009bc70:
  if (**(int **)(DAT_0009bd2c + 0x9bc80) == local_24) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


