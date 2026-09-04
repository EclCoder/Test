/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00060368
 * Address  : 00060368
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00060368(undefined4 *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  int *piVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  undefined1 uStack_89;
  uint local_88;
  uint uStack_84;
  uint local_80;
  uint local_78;
  uint local_74;
  uint local_70;
  uint uStack_6c;
  uint local_68;
  int local_60;
  ulonglong local_58;
  uint local_50;
  uint local_48;
  uint local_44;
  ulonglong local_40;
  uint local_38;
  int local_2c;
  
  local_2c = **(int **)(DAT_0006058c + 0x60384);
  piVar3 = (int *)*param_1;
  uVar7 = *param_2;
  uVar4 = param_2[1];
  uVar6 = param_2[2];
  uVar11 = param_2[6];
  uVar5 = param_2[7];
  uVar10 = param_2[8];
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  param_2[6] = 0;
  param_2[7] = 0;
  param_2[8] = 0;
  uVar9 = param_2[4];
  uVar8 = param_2[5];
  piVar3 = *(int **)(*piVar3 + 0x20);
  uVar1 = uVar7;
  uVar2 = uVar6;
  if ((uVar7 & 1) != 0) {
    FUN_000289d4(&local_88,uVar6);
    uVar1 = local_88;
    uVar4 = uStack_84;
    uVar2 = local_80;
  }
  local_80 = uVar2;
  uStack_84 = uVar4;
  local_88 = uVar1;
  local_78 = uVar9;
  local_74 = uVar8;
  uVar1 = uVar11;
  uVar4 = uVar10;
  if ((uVar11 & 1) != 0) {
    FUN_000289d4(&local_70,uVar10,uVar5);
    uVar1 = local_70;
    uVar5 = uStack_6c;
    uVar4 = local_68;
  }
  local_68 = uVar4;
  uStack_6c = uVar5;
  local_70 = uVar1;
  local_60 = 0;
  if ((local_88 & 1) == 0) {
    local_58 = CONCAT44(uStack_84,local_88);
    local_50 = local_80;
  }
  else {
    FUN_000289d4(&local_58,local_80,uStack_84);
  }
  local_48 = local_78;
  local_44 = local_74;
  if ((local_70 & 1) == 0) {
    local_40 = CONCAT44(uStack_6c,local_70);
    local_38 = local_68;
  }
  else {
    FUN_000289d4(&local_40,local_68,uStack_6c);
  }
  (**(code **)(*piVar3 + 8))(piVar3,&local_58);
  if ((local_40 & 1) != 0) {
    FUN_00023f68(local_38,(uint)local_40 & 0xfffffffe);
  }
  if ((local_58 & 1) != 0) {
    FUN_00023f68(local_50,(uint)local_58 & 0xfffffffe);
  }
  if (local_60 != -1) {
    (**(code **)(DAT_00060590 + 0x604f0 + local_60 * 4))(&uStack_89,&local_88);
  }
  if ((uVar11 & 1) != 0) {
    FUN_00023f68(uVar10,uVar11 & 0xfffffffe);
  }
  if ((uVar7 & 1) != 0) {
    FUN_00023f68(uVar6,uVar7 & 0xfffffffe);
  }
  if (**(int **)(DAT_00060594 + 0x60538) != local_2c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_2c);
  }
  return;
}


