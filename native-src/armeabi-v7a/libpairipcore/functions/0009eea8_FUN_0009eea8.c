/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009eea8
 * Address  : 0009eea8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009eea8(int *param_1,int *param_2)

{
  int iVar1;
  int *piVar2;
  uint uVar3;
  int iVar4;
  int *piVar5;
  uint local_50 [2];
  uint local_48;
  int local_44;
  int local_40;
  int local_38;
  int *local_34;
  int *local_28;
  int local_1c;
  
  local_1c = **(int **)(DAT_0009f0a4 + 0x9eec0);
  iVar1 = param_1[4];
  if (iVar1 != 0) goto LAB_0009f05c;
  FUN_000732f8(local_50,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[2]);
  uVar3 = local_48;
  if ((local_50[0] & 1) == 0) {
    uVar3 = (uint)local_50 | 1;
  }
  iVar1 = (**(code **)(*param_2 + 0x18))(param_2,uVar3);
  local_38 = DAT_0009f0a8;
  iVar4 = param_1[4];
  param_1[4] = iVar1;
  local_38 = local_38 + 0x9ef30;
  local_40 = 0;
  local_34 = param_2;
  local_28 = &local_38;
  if (iVar4 != 0) {
    piVar2 = (int *)param_1[10];
    local_44 = iVar4;
    if (piVar2 == (int *)0x0) goto LAB_0009f0a0;
    (**(code **)(*piVar2 + 0x18))(piVar2,&local_44);
  }
  piVar2 = (int *)param_1[10];
  param_1[10] = 0;
  piVar5 = param_1 + 6;
  if (piVar2 == piVar5) {
    iVar1 = 0x10;
LAB_0009efb8:
    (**(code **)(*piVar2 + iVar1))();
    if (local_28 != (int *)0x0) goto LAB_0009ef9c;
LAB_0009efd0:
    piVar2 = (int *)0x0;
    param_1[10] = 0;
  }
  else {
    iVar1 = 0x14;
    if (piVar2 != (int *)0x0) goto LAB_0009efb8;
    if (local_28 == (int *)0x0) goto LAB_0009efd0;
LAB_0009ef9c:
    if (local_28 == &local_38) {
      iVar1 = *local_28;
      param_1[10] = (int)piVar5;
      (**(code **)(iVar1 + 0xc))(local_28,piVar5);
      piVar2 = local_28;
    }
    else {
      param_1[10] = (int)local_28;
      local_28 = (int *)0x0;
      piVar2 = (int *)0x0;
    }
  }
  iVar1 = local_40;
  local_40 = 0;
  if (iVar1 != 0) {
    local_44 = iVar1;
    if (piVar2 == (int *)0x0) {
LAB_0009f0a0:
      local_40 = 0;
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*piVar2 + 0x18))(piVar2,&local_44);
    piVar2 = local_28;
  }
  if (piVar2 == &local_38) {
    iVar1 = 0x10;
LAB_0009f084:
    (**(code **)(*piVar2 + iVar1))();
  }
  else {
    iVar1 = 0x14;
    if (piVar2 != (int *)0x0) goto LAB_0009f084;
  }
  if ((local_50[0] & 1) != 0) {
    FUN_00023f68(local_48,local_50[0] & 0xfffffffe);
  }
  iVar1 = param_1[4];
LAB_0009f05c:
  if (**(int **)(DAT_0009f0ac + 0x9f06c) == local_1c) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(iVar1);
}


