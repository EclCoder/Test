/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00097470
 * Address  : 00097470
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00097470(undefined4 *param_1,byte *param_2)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  undefined4 *puVar4;
  undefined1 *puVar5;
  byte *pbVar6;
  undefined4 uVar7;
  int iVar8;
  int local_64 [3];
  int local_58;
  undefined4 local_54;
  int *local_48;
  int local_40;
  int local_38;
  undefined4 local_34;
  int *local_28;
  int local_1c;
  
  local_1c = **(int **)(DAT_000976a0 + 0x97488);
  pbVar6 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar6 = param_2 + 1;
  }
  iVar2 = (**(code **)(*(int *)*param_1 + 0x29c))((int *)*param_1,pbVar6);
  pcVar3 = (char *)FUN_00025e6c(DAT_000976a4 + 0x974c4);
  if (*pcVar3 == '\x01') {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976a8 + 0x974dc);
    uVar7 = *puVar4;
  }
  else {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976ac + 0x97640);
    uVar7 = FUN_00076fc0();
    iVar8 = DAT_000976b0;
    *puVar4 = uVar7;
    puVar5 = (undefined1 *)FUN_00025e6c(iVar8 + 0x9765c);
    *puVar5 = 1;
  }
  iVar8 = DAT_000976b4 + 0x97504;
  local_40 = iVar2;
  local_38 = iVar8;
  local_34 = uVar7;
  local_28 = &local_38;
  iVar2 = FUN_000765d8(*param_1,param_1[2],*(undefined4 *)(DAT_000976b8 + 0x97550),iVar2);
  pcVar3 = (char *)FUN_00025e6c(DAT_000976bc + 0x97530);
  if (*pcVar3 == '\x01') {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976c0 + 0x97548);
    uVar7 = *puVar4;
  }
  else {
    puVar4 = (undefined4 *)FUN_00025e6c(DAT_000976c4 + 0x97674);
    uVar7 = FUN_00076fc0();
    iVar1 = DAT_000976c8;
    *puVar4 = uVar7;
    puVar5 = (undefined1 *)FUN_00025e6c(iVar1 + 0x97690);
    *puVar5 = 1;
  }
  local_54 = uVar7;
  local_58 = iVar8;
  iVar8 = 0x10;
  local_48 = &local_58;
  local_64[1] = 0;
  if (((iVar2 == 0) ||
      (local_64[0] = iVar2, FUN_0009de6c(&local_58,local_64), local_48 == &local_58)) ||
     (iVar8 = 0x14, local_48 != (int *)0x0)) {
    (**(code **)(*local_48 + iVar8))();
  }
  iVar2 = local_40;
  local_40 = 0;
  if (iVar2 != 0) {
    local_64[0] = iVar2;
    if (local_28 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*local_28 + 0x18))(local_28,local_64);
  }
  if (local_28 == &local_38) {
    iVar2 = 0x10;
  }
  else {
    iVar2 = 0x14;
    if (local_28 == (int *)0x0) goto LAB_00097610;
  }
  (**(code **)(*local_28 + iVar2))();
LAB_00097610:
  if (**(int **)(DAT_000976cc + 0x97620) == local_1c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


