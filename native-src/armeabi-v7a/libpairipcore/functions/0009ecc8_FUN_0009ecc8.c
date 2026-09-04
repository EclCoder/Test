/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009ecc8
 * Address  : 0009ecc8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009ecc8(int *param_1,int *param_2)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  code *pcVar6;
  uint local_3c [2];
  uint local_34;
  uint local_30 [2];
  uint local_28;
  int local_24;
  
  local_24 = **(int **)(DAT_0009eea0 + 0x9ece0);
  iVar1 = *(int *)(*(int *)*param_1 + param_1[0x10]);
  if (iVar1 != 0) goto LAB_0009ee7c;
  iVar2 = FUN_0009eea8(param_1 + 2);
  if (iVar2 == 0) {
    iVar1 = 0;
    goto LAB_0009ee7c;
  }
  if (param_1[0x11] == 1) {
    FUN_000732f8(local_3c,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xe]);
    FUN_000732f8(local_30,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xf]);
    uVar3 = local_34;
    if ((local_3c[0] & 1) == 0) {
      uVar3 = (uint)local_3c | 1;
    }
    pcVar6 = *(code **)(*param_2 + 0x240);
LAB_0009ee04:
    uVar5 = local_28;
    if (((byte)local_30[0] & 1) == 0) {
      uVar5 = (uint)local_30 | 1;
    }
    iVar1 = (*pcVar6)(param_2,iVar2,uVar3,uVar5);
    if ((local_30[0] & 1) != 0) {
      FUN_00023f68(local_28,local_30[0] & 0xfffffffe);
    }
    if ((local_3c[0] & 1) != 0) {
      FUN_00023f68(local_34,local_3c[0] & 0xfffffffe);
    }
  }
  else {
    iVar1 = 0;
    if (param_1[0x11] == 0) {
      FUN_000732f8(local_3c,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xe]);
      FUN_000732f8(local_30,*(undefined4 *)*param_1,((undefined4 *)*param_1)[1],param_1[0xf]);
      uVar3 = local_34;
      if ((local_3c[0] & 1) == 0) {
        uVar3 = (uint)local_3c | 1;
      }
      pcVar6 = *(code **)(*param_2 + 0x178);
      goto LAB_0009ee04;
    }
  }
  iVar4 = param_1[0x10];
  iVar2 = *(int *)*param_1;
  *(int *)(iVar2 + iVar4) = iVar1;
  ((int *)(iVar2 + iVar4))[1] = 0;
LAB_0009ee7c:
  if (**(int **)(DAT_0009eea4 + 0x9ee8c) != local_24) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar1);
  }
  return;
}


